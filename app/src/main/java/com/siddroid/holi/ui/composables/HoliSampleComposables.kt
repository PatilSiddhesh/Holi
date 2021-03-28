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

package com.siddroid.holi.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 *
 * @author Siddhesh Patil
 * Siddroid.com
 * @since 28-03-2021
 *
 * A collection of composables used by the sample app
 *
 */


// ***************************** COLOR SAMPLES ********************************* //
/**
 * Builds a lazy column of scrollable lazy rows containing color swatches
 * @param content list of lists containing pair of color and their names
 */
@Composable
fun HoliLazyColorColumn(content: List<List<Pair<String, Color>>>) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        itemsIndexed(content) { index, item ->
            HoliLazyColorRow(colorList = item)
        }

    }
}

/**
 * Builds a lazy color row for demo
 * @param colorList list of pairs of color and their names
 */
@Composable
fun HoliLazyColorRow(colorList: List<Pair<String, Color>>) {
    LazyRow(
        modifier = Modifier
            .fillMaxSize()
    ) {

        itemsIndexed(colorList) { index, item ->
            ColorSwatch(color = item)
        }

    }
}

/**
 * A color swatch for demo
 * @param color a pair of color and its title
 */
@Composable
fun ColorSwatch(color: Pair<String, Color>) {
    BoxWithConstraints(
        modifier = Modifier
            .height(80.dp)
            .width(120.dp)
            .background(color = color.second),
        contentAlignment = Alignment.Center
    ) {
        Text(text = color.first, style = TextStyle(fontSize = 10.sp), color = Color.White)
    }
}

// ***************************** BRUSH SAMPLES ********************************* //

/**
 * Builds a lazy column of scrollable lazy rows containing brush swatches
 * @param content list of lists containing pair of gradient and their names
 */
@Composable
fun HoliLazyBrushColumn(content: List<List<Pair<String, Brush>>>) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        itemsIndexed(content) { index, item ->
            HoliLazyBrushRow(brushList = item)
        }

    }
}

/**
 * Builds a lazy brush row for demo
 * @param brushList list of pairs of gradients and their names
 */
@Composable
fun HoliLazyBrushRow(brushList: List<Pair<String, Brush>>) {
    LazyRow(
        modifier = Modifier
            .fillMaxSize()
    ) {

        itemsIndexed(brushList) { index, item ->
            BrushSwatch(color = item)
        }

    }
}

/**
 * A brush swatch for demo
 * @param color a pair of gradient and its title
 */
@Composable
fun BrushSwatch(color: Pair<String, Brush>) {
    BoxWithConstraints(
        modifier = Modifier
            .height(130.dp)
            .width(129.dp)
            .padding(5.dp)
            .background(brush = color.second),
        contentAlignment = Alignment.Center
    ) {
        Text(text = color.first, style = TextStyle(fontSize = 10.sp), color = Color.Black)
    }
}



