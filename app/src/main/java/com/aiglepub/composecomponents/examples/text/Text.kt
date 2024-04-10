package com.aiglepub.composecomponents.examples.text

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

/**
 * TEXT
 * Símil con TextView
 * Para representar cadenas de texto
 */
@Composable
fun MyCustomText() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Prueba",
            color = Color.Red,
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Light,
            fontFamily = FontFamily.Serif,
            letterSpacing = 5.sp,
            textDecoration = TextDecoration.LineThrough,
            textAlign = TextAlign.Justify,
            lineHeight = 2.em,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            style = MaterialTheme.typography.titleLarge.copy(
                shadow = Shadow(
                    offset = Offset(10f,10f),
                    blurRadius = 10f,
                    color = Color.Blue.copy(alpha = 0.5f)
                )
            )
        )
    }
}

@Preview(showBackground = true, widthDp = 200, heightDp = 100)
@Composable
private fun MyCustomText_Preview() {
    MyCustomText()
}