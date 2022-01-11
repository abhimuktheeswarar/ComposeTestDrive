package com.msabhi.composedrive.imperative

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.msabhi.composedrive.R

class ImperativeListActivity : AppCompatActivity() {

    private val recyclerView by lazy { findViewById<RecyclerView>(R.id.recyclerView_imperative) }
    private val layoutManager by lazy { LinearLayoutManager(this) }
    private val adapter by lazy { ItemListAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imperative_list)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter

        val items = mutableListOf<ImperativeItem>()

        repeat(50) { i ->
            items.add(ImperativeItem(i, "Title $i", "Subtitle $i"))
        }

        adapter.submitList(items)
    }
}

data class ImperativeItem(val id: Any, val title: String, val subTitle: String)

class ImperativeItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val image by lazy { itemView.findViewById<ImageView>(R.id.image_avatar) }
    val title by lazy { itemView.findViewById<TextView>(R.id.text_item_title) }
    val subTitle by lazy { itemView.findViewById<TextView>(R.id.text_item_subTitle) }
}

object ItemDiffCallback : DiffUtil.ItemCallback<ImperativeItem>() {

    override fun areItemsTheSame(oldItem: ImperativeItem, newItem: ImperativeItem): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ImperativeItem, newItem: ImperativeItem): Boolean {
        return oldItem == newItem
    }
}

class ItemListAdapter : ListAdapter<ImperativeItem, ImperativeItemViewHolder>(ItemDiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImperativeItemViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_imperative_sample, parent, false)
        return ImperativeItemViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ImperativeItemViewHolder, position: Int) {
        holder.title.text = getItem(position).title
        holder.subTitle.text = getItem(position).subTitle
    }
}