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
import androidx.compose.material.icons.filled.Language
import androidx.compose.material.icons.filled.LocationOn
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.draw.blur

@Composable
fun AHFrontPage(modifier: Modifier = Modifier) {

    Box(modifier = modifier.fillMaxSize()) {
        // Background image
        Image(
            painter = painterResource(id = R.drawable.jewel),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .matchParentSize()
                .blur(20.dp)
        )

        Column(
            modifier = modifier.fillMaxSize()
        ) {
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
                Spacer(Modifier.height(60.dp))
            }
        }
    }

}

@Composable
private fun ProfileCard() {
    val image = painterResource(R.drawable.ahlogo)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier
            .background(color = Color(0xFF093243))
            .height(100.dp)
            .width(100.dp)
    )
    Spacer(Modifier.height(15.dp))
    Text(
        text = "AH Jewellers",
        fontSize = 45.sp,
        fontWeight = FontWeight.W300,
        color = Color(0xFFF2F3F5)
    )
    Spacer(Modifier.height(12.dp))
    Text(
        text = "Shine. Sparkle. Dazzle",
        color = Color(0xFFF2F3F5),
        fontSize = 20.sp,
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
                tint = Color(0xFFF2F3F5)
            )
            Text(
                text = "7010899270, 9942440230",
                color = Color(0xFFF2F3F5),
                fontSize = 14.sp,
                modifier = Modifier
                    .padding(start = 10.dp)
            )
        }
        Spacer(Modifier.height(12.dp))
        Row(
        ) {
            Icon(
                imageVector = Icons.Filled.Language,
                contentDescription = "Website",
                tint = Color(0xFFF2F3F5)
            )
            Text(
                text = "www.ahjewellers.in",
                color = Color(0xFFF2F3F5),
                fontSize = 14.sp,
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
                tint = Color(0xFFF2F3F5)
            )
            Text(
                text = "info@ahjewellers.in",
                color = Color(0xFFF2F3F5),
                fontSize = 14.sp,
                modifier = Modifier
                    .padding(start = 10.dp)
            )
        }
        Spacer(Modifier.height(12.dp))
        Row(
        ) {
            Image(
                painter = painterResource(R.drawable.instagram_logo),
                contentDescription = null,
                modifier = Modifier
                    .background(color = Color(0xFFF2F3F5))
            )
            Text(
                text = "@AHJEWELLERS_VLY",
                color = Color(0xFFF2F3F5),
                fontSize = 14.sp,
                modifier = Modifier
                    .padding(start = 10.dp)
            )
        }
        Spacer(Modifier.height(12.dp))
        Row(
        ) {
            Icon(
                imageVector = Icons.Filled.LocationOn,
                contentDescription = "Mail",
                tint = Color(0xFFF2F3F5)
            )
            Text(
                text = "Main Road, Near BusStand, Valliyur",
                color = Color(0xFFF2F3F5),
                fontSize = 14.sp,
                modifier = Modifier
                    .padding(start = 10.dp)
            )
        }
    }
}

@Preview
@Composable
private fun AHFrontPagePreview() {
    AHFrontPage(modifier = Modifier.fillMaxSize())
}