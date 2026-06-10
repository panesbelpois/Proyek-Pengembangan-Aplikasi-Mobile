package com.example.fitgen

import androidx.compose.runtime.Composable
import coil3.ImageLoader
import coil3.compose.setSingletonImageLoaderFactory
import coil3.network.ktor3.KtorNetworkFetcherFactory
import coil3.request.crossfade
import com.example.fitgen.presentation.navigation.AppNavHost
import com.example.fitgen.presentation.theme.FitGenTheme
import org.koin.compose.KoinContext

@Composable
fun App() {
    KoinContext {
        FitGenTheme {
            AppNavHost()
        }
    }
}
