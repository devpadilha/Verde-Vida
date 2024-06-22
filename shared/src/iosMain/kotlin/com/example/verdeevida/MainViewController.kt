package com.example.verdeevida

import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIScreen

fun MainViewController() = ComposeUIViewController {
    val isDarkTheme =
        UIScreen.mainScreen.traitCollection.userInterfaceStyle ==
                UIUserInterfaceStyleDark
    val dynamicColor =
        UIScreen.mainScreen.traitCollection.isDynamicColorAvailable
    App(
        darkTheme = false,
        dynamicColor = false
    )
}

// TODO: APP IOS IN A MAC
// https://www.youtube.com/watch?v=XWSzbMnpAgI
// 1:01:50 ~ 1:05:00