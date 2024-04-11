package com.aiglepub.composecomponents.ui.screens.share

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable

@Composable
fun IconBackButton(onUpClick: () -> Unit) {
    IconButton(onClick = onUpClick) {
        Icon(
            imageVector= Icons.Default.ArrowBackIosNew,
            contentDescription = "Back"
        )
    }
}