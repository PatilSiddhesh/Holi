package com.siddheshpatil.holi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Box(modifier = Modifier
                .fillMaxSize()) {
                HoliLazyColorColumn(content = HoliSwatchSampleFactory.getColorPaletteList())
            }
        }
    }
}

@Composable
fun HoliLazyColorColumn(content : List<List<Pair<String,Color>>>) {
    LazyRow(modifier = Modifier.fillMaxSize()) {
        itemsIndexed(content) { index, item ->
            HoliLazyColorRow(colorList = item)
        }

    }
}

@Composable
fun HoliLazyColorRow(colorList: List<Pair<String,Color>>) {
    LazyColumn(modifier = Modifier
        .fillMaxSize()) {

        itemsIndexed(colorList) { index, item ->
           ColorSwatch(color = item)
        }

    }
}

@Composable
fun ColorSwatch(color: Pair<String,Color>) {
    BoxWithConstraints(
        modifier = Modifier
        .height(80.dp)
        .width(120.dp)
        .background(color = color.second),
        contentAlignment = Alignment.Center
    ) {
        Text(text = color.first,style = TextStyle(fontSize = 10.sp),color = Color.White)
    }
}


