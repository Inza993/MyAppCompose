package com.example.tech.myappcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {

    Column (modifier = modifier.background(Color(0xFFD2E8D4))) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.weight(0.7f).fillMaxWidth()
        ) {
            ProfileCard()
        }
        Column(
            modifier = Modifier.weight(0.3f).fillMaxWidth(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            FooterInfo()
            Spacer(Modifier.height(32.dp))
        }
    }

}

@Composable
private fun ProfileCard() {
    val image = painterResource(R.drawable.android_logo)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier
            .background(color = Color(0xFF093243))
            .height(100.dp)
            .width(100.dp)
    )
    Spacer(Modifier.height(8.dp))
    Text(
        text = "Jennifer Doe",
        fontSize = 50.sp,
        fontWeight = FontWeight.W300
    )
    Spacer(Modifier.height(12.dp))
    Text(
        text = "Android Developer Extraordinaire",
        color = Color(0xFF026E3D),
        fontWeight = FontWeight.Bold
    )
}

@Composable
private fun FooterInfo() {
    Column {
        Row {
            Icon(
                imageVector = Icons.Filled.Call,
                contentDescription = "Call",
                tint = Color(0xFF026E3D)
            )
            Text(
                text = "+11(123) 444 555 666",
                modifier = Modifier
                    .padding(start = 10.dp)
            )
        }
        Spacer(Modifier.height(12.dp))
        Row(
        ) {
            Icon(
                imageVector = Icons.Filled.Share,
                contentDescription = "Share",
                tint = Color(0xFF026E3D)
            )
            Text(
                text = "@AndroidDev",
                modifier = Modifier
                    .padding(start = 10.dp)
            )
        }
        Spacer(Modifier.height(12.dp))
        Row(
        ) {
            Icon(
                imageVector = Icons.Filled.Mail,
                contentDescription = "Mail",
                tint = Color(0xFF026E3D)
            )
            Text(
                text = "jen.doe@android.com",
                modifier = Modifier
                    .padding(start = 10.dp)
            )
        }
    }
}

@Preview
@Composable
private fun BusinessCardComposable() {
    BusinessCard(modifier = Modifier.fillMaxSize())
}