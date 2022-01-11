package com.msabhi.buildsrc

object Versions {
    const val ktlint = "0.43.0"
}

object Libs {
    const val androidGradlePlugin = "com.android.tools.build:gradle:7.0.4"

    object Accompanist {
        const val version = "0.22.0-rc"
        const val insets = "com.google.accompanist:accompanist-insets:$version"
        const val systemUiController =
            "com.google.accompanist:accompanist-systemuicontroller:$version"
        const val drawablePainter = "com.google.accompanist:accompanist-drawablepainter:$version"
    }

    object Kotlin {
        private const val version = "1.6.10"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
        const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:$version"
    }

    object Coroutines {
        private const val version = "1.5.2"
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
        const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
    }

    object JUnit {
        private const val version = "4.13"
        const val junit = "junit:junit:$version"
    }

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:1.7.0"
        const val window = "androidx.window:window:1.0.0-rc01"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.1.2"
        const val materialDesign = "com.google.android.material:material:1.4.0"
        const val navigation = "androidx.navigation:navigation-compose:2.4.0-beta02"

        object Activity {
            const val activityCompose = "androidx.activity:activity-compose:1.4.0"
        }

        object Compose {
            const val snapshot = ""
            const val version = "1.1.0-rc01"
            const val compilerVersion = "1.1.0-rc02"

            const val compiler = "androidx.compose.compiler:compiler:$compilerVersion"
            const val animation = "androidx.compose.animation:animation:$version"
            const val foundation = "androidx.compose.foundation:foundation:$version"
            const val layout = "androidx.compose.foundation:foundation-layout:$version"
            const val iconsExtended = "androidx.compose.material:material-icons-extended:$version"
            const val material = "androidx.compose.material:material:$version"
            const val runtime = "androidx.compose.runtime:runtime:$version"
            const val tooling = "androidx.compose.ui:ui-tooling:$version"
            const val ui = "androidx.compose.ui:ui:$version"
            const val uiUtil = "androidx.compose.ui:ui-util:$version"
            const val uiTest = "androidx.compose.ui:ui-test-junit4:$version"
            const val preview = "androidx.compose.ui:ui-tooling-preview:$version"
            const val uiTestManifest = "androidx.compose.ui:ui-test-manifest:$version"
        }

        object ConstraintLayout {
            const val constraintLayoutCompose =
                "androidx.constraintlayout:constraintlayout-compose:1.0.0-rc01"
        }

        object Test {
            private const val version = "1.4.0"
            const val core = "androidx.test:core:$version"
            const val rules = "androidx.test:rules:$version"

            object Ext {
                private const val version = "1.1.2"
                const val junit = "androidx.test.ext:junit-ktx:$version"
            }

            const val espressoCore = "androidx.test.espresso:espresso-core:3.3.0"
        }
    }

    object Coil {
        const val coilCompose = "io.coil-kt:coil-compose:1.3.2"
    }

    object Lottie {
        const val lottieCompose = "com.airbnb.android:lottie-compose:4.2.1"
    }

    object Google {

        const val gradlePlugin = "com.google.gms:google-services:4.3.10"
    }

    object Firebase {

        const val gradlePluginCrashlytics = "com.google.firebase:firebase-crashlytics-gradle:2.8.1"
        const val gradlePluginPerformance = "com.google.firebase:perf-plugin:1.4.0"

        const val firebaseBoM = "com.google.firebase:firebase-bom:29.0.3"
        const val crashlytics = "com.google.firebase:firebase-crashlytics-ktx"
        const val performance = "com.google.firebase:firebase-perf-ktx"
        const val analytics = "com.google.firebase:firebase-analytics-ktx"
        const val auth = "com.google.firebase:firebase-auth-ktx"
        const val firestore = "com.google.firebase:firebase-firestore-ktx"
        const val realtimeDatabase = "com.google.firebase:firebase-database-ktx"
        const val functions = "com.google.firebase:firebase-functions-ktx"
        const val remoteConfig = "com.google.firebase:firebase-config-ktx"
        const val messaging = "com.google.firebase:firebase-messaging-ktx"
        const val storage = "com.google.firebase:firebase-storage-ktx"
        const val inAppMessaging = "com.google.firebase:firebase-inappmessaging-ktx"
        const val inAppMessagingDisplay = "com.google.firebase:firebase-inappmessaging-display-ktx"
        const val installations = "com.google.firebase:firebase-installations-ktx"

        const val appCheckDebugProvider =
            "com.google.firebase:firebase-appcheck-debug:16.0.0-beta04"
        const val appCheckSafetyNetProvider =
            "com.google.firebase:firebase-appcheck-safetynet:16.0.0-beta04"

    }
}