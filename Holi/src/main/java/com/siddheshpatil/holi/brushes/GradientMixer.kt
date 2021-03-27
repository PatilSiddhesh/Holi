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

package com.siddheshpatil.holi.brushes

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

/**
 *
 * @author Siddhesh Patil
 * Siddroid.com
 * @since 28-03-2021
 *
 * A utility class for mixing colors together to form gradients
 */
object GradientMixer {

    /**
     * Mix two colors together horizontally
     * @param from the first color
     * @param to the second color
     * @return a new [Brush] for use in composables
     */
    fun mixHorizontal(from: Color, to: Color): Brush {
        return Brush.horizontalGradient(listOf(from, to))
    }

    /**
     * Mix two colors together vertically
     * @param from the first color
     * @param to the second color
     * @return a new [Brush] for use in composables
     */
    fun mixVertical(from: Color, to: Color): Brush {
        return Brush.verticalGradient(listOf(from, to))
    }

    /**
     * Mix a list of colors horizontally
     * @param colors list of colors
     * @return a new [Brush] for use in composables
     */
    fun mixHorizontal(colors: List<Color>): Brush {
        return Brush.horizontalGradient(colors)
    }

    /**
     * Mix a list of colors vertically
     * @param colors list of colors
     * @return a new [Brush] for use in composables
     */
    fun mixVertical(colors: List<Color>): Brush {
        return Brush.verticalGradient(colors)
    }

    /**
     * Mix a list of colors radially
     * @param inner the inner color
     * @param outer the outer color
     * @return a new [Brush] for use in composables
     */
    fun mixRadial(inner: Color,outer: Color): Brush {
        return Brush.radialGradient(listOf(inner,outer))
    }

    /**
     * Mix a list of colors vertically
     * @param colors list of colors
     * @return a new [Brush] for use in composables
     */
    fun mixRadial(colors: List<Color>): Brush {
        return Brush.radialGradient(colors)
    }

    /**
     * A complete blend mix sweep between two colors, ends in the started color for a clean blended sweep
     * @param start the starting color color
     * @param end the ending color
     * @return a new [Brush] for use in composables
     */
    fun mixSweepBlend(start: Color, end: Color): Brush {
        return Brush.sweepGradient(listOf(start,end,end,start))
    }

    /**
     * Mix two colors from top left to bottom right
     * @param from the first color
     * @param to the second color
     * @return a new [Brush] for use in composables
     */
    fun mixTopLeftToBottomRight(from: Color, to: Color): Brush {
        return Brush.linearGradient(listOf(from, to),start = Offset(0f,0f))
    }

    /**
     * Mix colors from top left to bottom right
     * @param colors list of colors
     * @return a new [Brush] for use in composables
     */
    fun mixTopLeftToBottomRight(colors: List<Color>): Brush {
        return Brush.linearGradient(colors,start = Offset(0f,0f))
    }

    /**
     * Mix two colors from top to bottom
     * @param from the first color
     * @param to the second color
     * @return a new [Brush] for use in composables
     */
    fun mixTopToBottom(from: Color, to: Color): Brush {
        return Brush.linearGradient(listOf(from, to),start = Offset(0f,0f),end = Offset(0f, Float.POSITIVE_INFINITY))
    }

    /**
     * Mix colors from top to bottom
     * @param colors list of colors
     * @return a new [Brush] for use in composables
     */
    fun mixTopToBottom(colors: List<Color>): Brush {
        return Brush.linearGradient(colors,start = Offset(0f,0f),end = Offset(0f, Float.POSITIVE_INFINITY))
    }

    /**
     * Mix two colors from bottom to top
     * @param from the first color
     * @param to the second color
     * @return a new [Brush] for use in composables
     */
    fun mixBottomToTop(from: Color, to: Color): Brush {
        return Brush.linearGradient(listOf(from, to),end = Offset(0f,0f),start = Offset(0f, Float.POSITIVE_INFINITY))
    }

    /**
     * Mix colors from bottom to top
     * @param colors list of colors
     * @return a new [Brush] for use in composables
     */
    fun mixBottomToTop(colors: List<Color>): Brush {
        return Brush.linearGradient(colors,end = Offset(0f,0f),start = Offset(0f, Float.POSITIVE_INFINITY))
    }

    /**
     * Mix two colors from left to right
     * @param from the first color
     * @param to the second color
     * @return a new [Brush] for use in composables
     */
    fun mixLeftToRight(from: Color, to: Color): Brush {
        return Brush.linearGradient(listOf(from, to),start = Offset(0f,0f),end = Offset(Float.POSITIVE_INFINITY, 0f))
    }

    /**
     * Mix colors from left to right
     * @param colors list of colors
     * @return a new [Brush] for use in composables
     */
    fun mixLeftToRight(colors: List<Color>): Brush {
        return Brush.linearGradient(colors,start = Offset(0f,0f),end = Offset(Float.POSITIVE_INFINITY, 0f))
    }

    /**
     * Mix two colors from right to left
     * @param from the first color
     * @param to the second color
     * @return a new [Brush] for use in composables
     */
    fun mixRightToLeft(from: Color, to: Color): Brush {
        return Brush.linearGradient(listOf(from, to),end = Offset(0f,0f),start = Offset(Float.POSITIVE_INFINITY, 0f))
    }

    /**
     * Mix colors from right to left
     * @param colors the list of colors
     * @return a new [Brush] for use in composables
     */
    fun mixRightToLeft(colors: List<Color>): Brush {
        return Brush.linearGradient(colors,end = Offset(0f,0f),start = Offset(Float.POSITIVE_INFINITY, 0f))
    }

    /**
     * Mix two colors  from bottom left to top right corner
     * @param from the first color
     * @param to the second color
     * @return a new [Brush] for use in composables
     */
    fun mixBottomLeftToTopRight(from: Color, to: Color): Brush {
        return Brush.linearGradient(listOf(from, to),start = Offset(0f,Float.POSITIVE_INFINITY),end = Offset(Float.POSITIVE_INFINITY, 0f))
    }

    /**
     * Mix colors from bottom left to top right corner
     * @param colors list of colors
     * @return a new [Brush] for use in composables
     */
    fun mixBottomLeftToTopRight(colors: List<Color>): Brush {
        return Brush.linearGradient(colors,start = Offset(0f,Float.POSITIVE_INFINITY),end = Offset(Float.POSITIVE_INFINITY, 0f))
    }

    /**
     * Mix two colors from top right to bottom left corner
     * @param from the first color
     * @param to the second color
     * @return a new [Brush] for use in composables
     */
    fun mixTopRightToBottomLeft(from: Color, to: Color): Brush {
        return Brush.linearGradient(listOf(from, to),start = Offset(Float.POSITIVE_INFINITY,0f),end = Offset(0f,Float.POSITIVE_INFINITY))
    }

    /**
     * Mix colors from top right to bottom left corner
     * @param colors the list of colors
     * @return a new [Brush] for use in composables
     */
    fun mixTopRightToBottomLeft(colors: List<Color>): Brush {
        return Brush.linearGradient(colors,start = Offset(Float.POSITIVE_INFINITY,0f),end = Offset(0f,Float.POSITIVE_INFINITY))
    }

    /**
     * Mix two colors from bottom right corner to top left corner
     * @param from the first color
     * @param to the second color
     * @return a new [Brush] for use in composables
     */
    fun mixBottomRightToTopLeft(from: Color, to: Color): Brush {
        return Brush.linearGradient(listOf(from, to),start = Offset(Float.POSITIVE_INFINITY,Float.POSITIVE_INFINITY),end = Offset(0f,0f))
    }

    /**
     * Mix colors from bottom right corner to top left corner
     * @param colors list of colors
     * @return a new [Brush] for use in composables
     */
    fun mixBottomRightToTopLeft(colors: List<Color>): Brush {
        return Brush.linearGradient(colors,start = Offset(Float.POSITIVE_INFINITY,Float.POSITIVE_INFINITY),end = Offset(0f,0f))
    }







}