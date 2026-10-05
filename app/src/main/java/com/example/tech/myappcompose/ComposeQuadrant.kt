package com.example.tech.myappcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.text.font.FontWeight

@Composable
fun ComposeQuadrant(modifier: Modifier = Modifier){
    Column(modifier = Modifier.fillMaxSize())
    {
        Row(modifier = Modifier.weight(0.5f)) {
            Quadrant1st(modifier = Modifier
                .weight(0.5f))
            Quadrant2nd(modifier = Modifier
                .weight(0.5f))
        }

        Row(modifier = Modifier.weight(0.5f)) {
            Quadrant3rd(modifier = Modifier
                .weight(0.5f))
            Quadrant4th(modifier = Modifier
                .weight(0.5f))
        }
    }
}

@Composable
fun Quadrant1st(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .background(Color(0xFFEADDFF))
            .fillMaxHeight().padding(16.dp)) {
        Text(
            text = "Text composable",
            Modifier.padding(16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Displays text and follows the recommended Material Design guidelines.",
            textAlign = TextAlign.Justify
        )
    }
}
@Composable
fun Quadrant2nd(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .background(Color(0xFFD0BCFF))
            .fillMaxHeight().padding(16.dp)) {
        Text(
            text = "Image composable",
            Modifier.padding(16.dp)
        )
        Text(
            text = "Creates a composable that lays out and draws a given Painter class object.",
            textAlign = TextAlign.Justify
        )
    }
}
@Composable
fun Quadrant3rd(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .background(Color(0xFFB69DF8))
            .fillMaxHeight().padding(16.dp)) {
        Text(
            text = "Row composable",
            Modifier.padding(16.dp)
        )
        Text(
            text = "A layout composable that places its children in a horizontal sequence.",
            textAlign = TextAlign.Justify
        )
    }
}
@Composable
fun Quadrant4th(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .background(Color(0xFFF6EDFF))
            .fillMaxHeight().padding(16.dp)) {
        Text(
            text = "Column composable",
            Modifier.padding(16.dp)
        )
        Text(
            text = "A layout composable that places its children in a vertical sequence.",
            textAlign = TextAlign.Justify
        )
    }
}
@Preview(showBackground = true)
@Composable
private fun ComposeQuadrantPreview() {
    ComposeQuadrant(modifier = Modifier.fillMaxSize())
}