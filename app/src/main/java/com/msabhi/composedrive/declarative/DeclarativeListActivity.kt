package com.msabhi.composedrive.declarative

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.content.res.AppCompatResources
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.drawablepainter.rememberDrawablePainter
import com.msabhi.composedrive.R
import com.msabhi.composedrive.ui.theme.ComposeTestDriveTheme

class DeclarativeListActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestDriveTheme {
                Scaffold {
                    LazyColumn(
                        modifier = Modifier.padding(it),
                        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 16.dp),
                        verticalArrangement = Arrangement.spacedBy(24.dp)
                    ) {

                        items(50) { index ->
                            DeclarativeItem(title = "Title $index", subTitle = "Subtitle $index")
                        }
                    }
                }
            }
        }
    }
}


@Composable
fun DeclarativeItem(modifier: Modifier = Modifier, title: String, subTitle: String) {

    Row(
        modifier = Modifier
            .height(IntrinsicSize.Min)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {

        val drawable = AppCompatResources.getDrawable(LocalContext.current, R.drawable.bg_circle)

        Image(
            modifier = Modifier
                .aspectRatio(1f),
            painter = rememberDrawablePainter(drawable = drawable),
            contentDescription = "place holder image"
        )
        Column {
            Text(
                text = title,
                style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(16.dp, 0.dp, 0.dp, 0.dp)
            )
            Text(
                text = subTitle,
                style = MaterialTheme.typography.body2,
                modifier = Modifier.padding(16.dp, 0.dp, 0.dp, 0.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DeclarativeItemPreview() {
    ComposeTestDriveTheme {
        DeclarativeItem(title = "Title", subTitle = "subTitle")
    }
}