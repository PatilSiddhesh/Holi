/*
 * MIT License
 *
 * Copyright (c) 2021 Siddhesh Patil, Siddroid.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package com.siddheshpatil.holi.ui.views

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.siddheshpatil.holi.brushes.GradientMixer
import com.siddheshpatil.holi.colors.CoolColor
import com.siddheshpatil.holi.colors.DraculaColor
import com.siddheshpatil.holi.colors.MaterialColor
import com.siddheshpatil.holi.ui.theme.HoliTheme

class HoliSamplesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HoliTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                )
                {
                    Button(
                        modifier = Modifier.padding(10.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialColor.TEAL),
                        onClick = {
                            val intent =
                                Intent(this@HoliSamplesActivity, MaterialColorsActivity::class.java)
                            startActivity(intent)
                        }) {
                        Text(text = "Material Colors", fontSize = 16.sp, color = Color.White)
                    }
                    Button(
                        modifier = Modifier.padding(10.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialColor.TEAL),
                        onClick = {
                            val intent =
                                Intent(this@HoliSamplesActivity, CoolColorActivity::class.java)
                            startActivity(intent)
                        }) {
                        Text(text = "Cool Colors", fontSize = 16.sp, color = Color.White)
                    }
                    Button(
                        modifier = Modifier.padding(10.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = DraculaColor.BG),
                        onClick = {
                            val intent =
                                Intent(this@HoliSamplesActivity, DraculaActivity::class.java)
                            startActivity(intent)
                        }) {
                        Text(text = "Dracula Colors", fontSize = 16.sp, color = DraculaColor.PINK)
                    }
                    Button(
                        modifier = Modifier.padding(10.dp),
                        onClick = {
                            val intent =
                                Intent(this@HoliSamplesActivity, GradientMixerActivity::class.java)
                            startActivity(intent)
                        }) {
                        Text(text = "Gradient Utils", fontSize = 16.sp, color = Color.White)
                    }

                    Button(
                        modifier = Modifier.padding(10.dp),
                        onClick = {
                            val intent =
                                Intent(this@HoliSamplesActivity, GradientMixerMultiColorActivity::class.java)
                            startActivity(intent)
                        }) {
                        Text(text = "Multi Color Gradient Utils", fontSize = 16.sp, color = Color.White)
                    }
                }
            }
        }
    }
}



