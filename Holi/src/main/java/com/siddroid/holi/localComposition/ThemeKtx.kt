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

package com.siddroid.holi.localComposition

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import com.siddroid.holi.brushes.GradientMixer
import com.siddroid.holi.colors.CoolColor
import com.siddroid.holi.colors.DraculaColor
import com.siddroid.holi.colors.FlatColor
import com.siddroid.holi.colors.MaterialColor

val LocalGradientMixer = compositionLocalOf { GradientMixer }
val LocalColorCool = compositionLocalOf { CoolColor }
val LocalColorFlat = compositionLocalOf { FlatColor }
val LocalColorMaterial = compositionLocalOf { MaterialColor }
val LocalColorDracula = compositionLocalOf { DraculaColor }

/**
 * Wrap your Material Theme Composable with `HoliPaletteComposition`
 * composable to provide local composition
 */
@Composable
fun HoliPaletteComposition(content: @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalGradientMixer provides GradientMixer,
        LocalColorCool provides CoolColor,
        LocalColorFlat provides FlatColor,
        LocalColorMaterial provides MaterialColor,
        LocalColorDracula provides DraculaColor,
    ) {
        content.invoke()
    }
}

/**
 * Make sure to wrap your Theme object with `HoliPaletteComposition` composable
 */
val MaterialTheme.coolColors
    @Composable
    @ReadOnlyComposable
    get() = LocalColorCool.current

/**
 * Make sure to wrap your Theme object with `HoliPaletteComposition` composable
 */
val MaterialTheme.flatColors
    @Composable
    @ReadOnlyComposable
    get() = LocalColorFlat.current

/**
 * Make sure to wrap your Theme object with `HoliPaletteComposition` composable
 */
val MaterialTheme.materialColors
    @Composable
    @ReadOnlyComposable
    get() = LocalColorMaterial.current

/**
 * Make sure to wrap your Theme object with `HoliPaletteComposition` composable
 */
val MaterialTheme.draculaColors
    @Composable
    @ReadOnlyComposable
    get() = LocalColorDracula.current

/**
 * Make sure to wrap your Theme object with `HoliPaletteComposition` composable
 */
val MaterialTheme.gradientMixer
    @Composable
    @ReadOnlyComposable
    get() = LocalGradientMixer.current

