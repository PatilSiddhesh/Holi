package com.siddheshpatil.holi

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Button(
                    onClick = {
                        val intent = Intent(this@MainActivity,MaterialColorsActivity::class.java)
                        startActivity(intent)
                    }) {
                    Text(text = "Material Colors", fontSize = 16.sp, color = Color.White)
                }
                Button(
                    onClick = {
                        val intent = Intent(this@MainActivity,GradientMixerActivity::class.java)
                        startActivity(intent)
                    }) {
                    Text(text = "Gradient Utils", fontSize = 16.sp, color = Color.White)
                }
            }

        }
    }
}



