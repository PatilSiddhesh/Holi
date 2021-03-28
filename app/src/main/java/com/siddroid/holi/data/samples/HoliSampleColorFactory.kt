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

package com.siddroid.holi.data.samples

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.siddroid.holi.brushes.GradientMixer
import com.siddroid.holi.colors.CoolColor
import com.siddroid.holi.colors.DraculaColor
import com.siddroid.holi.colors.FlatColor
import com.siddroid.holi.colors.MaterialColor

/**
 *
 * @author Siddhesh Patil
 * Siddroid.com
 * @since 27-03-2021
 *
 */
object HoliSampleColorFactory {

    /**
     * Provides a list of colors for sample showcase
     * @return List of list of pairs of colors and their names
     */
    fun getColorPaletteList(): List<List<Pair<String, Color>>> {
        val finalList = mutableListOf<List<Pair<String, Color>>>()

        val redList = mutableListOf<Pair<String, Color>>()
        redList.add(Pair("RED", MaterialColor.RED))
        //redList.add(Pair("RED 50", Material.RED_50))
        redList.add(Pair("RED 100", MaterialColor.RED_100))
        redList.add(Pair("RED 200", MaterialColor.RED_200))
        redList.add(Pair("RED 300", MaterialColor.RED_300))
        redList.add(Pair("RED 400", MaterialColor.RED_400))
        redList.add(Pair("RED 500", MaterialColor.RED_500))
        redList.add(Pair("RED 600", MaterialColor.RED_600))
        redList.add(Pair("RED 700", MaterialColor.RED_700))
        redList.add(Pair("RED 800", MaterialColor.RED_800))
        redList.add(Pair("RED 900", MaterialColor.RED_900))
        redList.add(Pair("RED A100", MaterialColor.RED_A100))
        redList.add(Pair("RED A200", MaterialColor.RED_A200))
        redList.add(Pair("RED A400", MaterialColor.RED_A400))
        redList.add(Pair("RED A700", MaterialColor.RED_A700))
        finalList.add(redList)

        val pinkList = mutableListOf<Pair<String, Color>>()
        pinkList.add(Pair("PINK", MaterialColor.PINK))
        //pinkList.add(Pair("PINK 50", Material.PINK_50))
        pinkList.add(Pair("PINK 100", MaterialColor.PINK_100))
        pinkList.add(Pair("PINK 200", MaterialColor.PINK_200))
        pinkList.add(Pair("PINK 300", MaterialColor.PINK_300))
        pinkList.add(Pair("PINK 400", MaterialColor.PINK_400))
        pinkList.add(Pair("PINK 500", MaterialColor.PINK_500))
        pinkList.add(Pair("PINK 600", MaterialColor.PINK_600))
        pinkList.add(Pair("PINK 700", MaterialColor.PINK_700))
        pinkList.add(Pair("PINK 800", MaterialColor.PINK_800))
        pinkList.add(Pair("PINK 900", MaterialColor.PINK_900))
        pinkList.add(Pair("PINK A100", MaterialColor.PINK_A100))
        pinkList.add(Pair("PINK A200", MaterialColor.PINK_A200))
        pinkList.add(Pair("PINK A400", MaterialColor.PINK_A400))
        pinkList.add(Pair("PINK A700", MaterialColor.PINK_A700))
        finalList.add(pinkList)

        val purpleList = mutableListOf<Pair<String, Color>>()
        purpleList.add(Pair("PURPLE", MaterialColor.PURPLE))
        //purpleList.add(Pair("PURPLE 50", Material.PURPLE_50))
        purpleList.add(Pair("PURPLE 100", MaterialColor.PURPLE_100))
        purpleList.add(Pair("PURPLE 200", MaterialColor.PURPLE_200))
        purpleList.add(Pair("PURPLE 300", MaterialColor.PURPLE_300))
        purpleList.add(Pair("PURPLE 400", MaterialColor.PURPLE_400))
        purpleList.add(Pair("PURPLE 500", MaterialColor.PURPLE_500))
        purpleList.add(Pair("PURPLE 600", MaterialColor.PURPLE_600))
        purpleList.add(Pair("PURPLE 700", MaterialColor.PURPLE_700))
        purpleList.add(Pair("PURPLE 800", MaterialColor.PURPLE_800))
        purpleList.add(Pair("PURPLE 900", MaterialColor.PURPLE_900))
        purpleList.add(Pair("PURPLE A100", MaterialColor.PURPLE_A100))
        purpleList.add(Pair("PURPLE A200", MaterialColor.PURPLE_A200))
        purpleList.add(Pair("PURPLE A400", MaterialColor.PURPLE_A400))
        purpleList.add(Pair("PURPLE A700", MaterialColor.PURPLE_A700))
        finalList.add(purpleList)

        val deepPurpleList = mutableListOf<Pair<String, Color>>()
        deepPurpleList.add(Pair("DEEP PURPLE", MaterialColor.DEEP_PURPLE))
        //deepPurpleList.add(Pair("DEEP PURPLE 50", Material.DEEP_PURPLE_50))
        deepPurpleList.add(Pair("DEEP PURPLE 100", MaterialColor.DEEP_PURPLE_100))
        deepPurpleList.add(Pair("DEEP PURPLE 200", MaterialColor.DEEP_PURPLE_200))
        deepPurpleList.add(Pair("DEEP PURPLE 300", MaterialColor.DEEP_PURPLE_300))
        deepPurpleList.add(Pair("DEEP PURPLE 400", MaterialColor.DEEP_PURPLE_400))
        deepPurpleList.add(Pair("DEEP PURPLE 500", MaterialColor.DEEP_PURPLE_500))
        deepPurpleList.add(Pair("DEEP PURPLE 600", MaterialColor.DEEP_PURPLE_600))
        deepPurpleList.add(Pair("DEEP PURPLE 700", MaterialColor.DEEP_PURPLE_700))
        deepPurpleList.add(Pair("DEEP PURPLE 800", MaterialColor.DEEP_PURPLE_800))
        deepPurpleList.add(Pair("DEEP PURPLE 900", MaterialColor.DEEP_PURPLE_900))
        deepPurpleList.add(Pair("DEEP PURPLE A100", MaterialColor.DEEP_PURPLE_A100))
        deepPurpleList.add(Pair("DEEP PURPLE A200", MaterialColor.DEEP_PURPLE_A200))
        deepPurpleList.add(Pair("DEEP PURPLE A400", MaterialColor.DEEP_PURPLE_A400))
        deepPurpleList.add(Pair("DEEP PURPLE A700", MaterialColor.DEEP_PURPLE_A700))
        finalList.add(deepPurpleList)

        val indigoList = mutableListOf<Pair<String, Color>>()
        indigoList.add(Pair("INDIGO", MaterialColor.INDIGO))
        //indigoList.add(Pair("INDIGO 50", Material.INDIGO_50))
        indigoList.add(Pair("INDIGO 100", MaterialColor.INDIGO_100))
        indigoList.add(Pair("INDIGO 200", MaterialColor.INDIGO_200))
        indigoList.add(Pair("INDIGO 300", MaterialColor.INDIGO_300))
        indigoList.add(Pair("INDIGO 400", MaterialColor.INDIGO_400))
        indigoList.add(Pair("INDIGO 500", MaterialColor.INDIGO_500))
        indigoList.add(Pair("INDIGO 600", MaterialColor.INDIGO_600))
        indigoList.add(Pair("INDIGO 700", MaterialColor.INDIGO_700))
        indigoList.add(Pair("INDIGO 800", MaterialColor.INDIGO_800))
        indigoList.add(Pair("INDIGO 900", MaterialColor.INDIGO_900))
        indigoList.add(Pair("INDIGO A100", MaterialColor.INDIGO_A100))
        indigoList.add(Pair("INDIGO A200", MaterialColor.INDIGO_A200))
        indigoList.add(Pair("INDIGO A400", MaterialColor.INDIGO_A400))
        indigoList.add(Pair("INDIGO A700", MaterialColor.INDIGO_A700))
        finalList.add(indigoList)

        val blueList = mutableListOf<Pair<String, Color>>()
        blueList.add(Pair("BLUE", MaterialColor.BLUE))
        //blueList.add(Pair("BLUE 50", Material.BLUE_50))
        blueList.add(Pair("BLUE 100", MaterialColor.BLUE_100))
        blueList.add(Pair("BLUE 200", MaterialColor.BLUE_200))
        blueList.add(Pair("BLUE 300", MaterialColor.BLUE_300))
        blueList.add(Pair("BLUE 400", MaterialColor.BLUE_400))
        blueList.add(Pair("BLUE 500", MaterialColor.BLUE_500))
        blueList.add(Pair("BLUE 600", MaterialColor.BLUE_600))
        blueList.add(Pair("BLUE 700", MaterialColor.BLUE_700))
        blueList.add(Pair("BLUE 800", MaterialColor.BLUE_800))
        blueList.add(Pair("BLUE 900", MaterialColor.BLUE_900))
        blueList.add(Pair("BLUE A100", MaterialColor.BLUE_A100))
        blueList.add(Pair("BLUE A200", MaterialColor.BLUE_A200))
        blueList.add(Pair("BLUE A400", MaterialColor.BLUE_A400))
        blueList.add(Pair("BLUE A700", MaterialColor.BLUE_A700))
        finalList.add(blueList)

        val lightBlueList = mutableListOf<Pair<String, Color>>()
        lightBlueList.add(Pair("LIGHT BLUE", MaterialColor.LIGHT_BLUE))
        //lightBlueList.add(Pair("LIGHT BLUE 50", Material.LIGHT_BLUE_50))
        lightBlueList.add(Pair("LIGHT BLUE 100", MaterialColor.LIGHT_BLUE_100))
        lightBlueList.add(Pair("LIGHT BLUE 200", MaterialColor.LIGHT_BLUE_200))
        lightBlueList.add(Pair("LIGHT BLUE 300", MaterialColor.LIGHT_BLUE_300))
        lightBlueList.add(Pair("LIGHT BLUE 400", MaterialColor.LIGHT_BLUE_400))
        lightBlueList.add(Pair("LIGHT BLUE 500", MaterialColor.LIGHT_BLUE_500))
        lightBlueList.add(Pair("LIGHT BLUE 600", MaterialColor.LIGHT_BLUE_600))
        lightBlueList.add(Pair("LIGHT BLUE 700", MaterialColor.LIGHT_BLUE_700))
        lightBlueList.add(Pair("LIGHT BLUE 800", MaterialColor.LIGHT_BLUE_800))
        lightBlueList.add(Pair("LIGHT BLUE 900", MaterialColor.LIGHT_BLUE_900))
        lightBlueList.add(Pair("LIGHT BLUE A100", MaterialColor.LIGHT_BLUE_A100))
        lightBlueList.add(Pair("LIGHT BLUE A200", MaterialColor.LIGHT_BLUE_A200))
        lightBlueList.add(Pair("LIGHT BLUE A400", MaterialColor.LIGHT_BLUE_A400))
        lightBlueList.add(Pair("LIGHT BLUE A700", MaterialColor.LIGHT_BLUE_A700))
        finalList.add(lightBlueList)

        val cyanList = mutableListOf<Pair<String, Color>>()
        cyanList.add(Pair("CYAN", MaterialColor.CYAN))
        //cyanList.add(Pair("CYAN 50", Material.CYAN_50))
        cyanList.add(Pair("CYAN 100", MaterialColor.CYAN_100))
        cyanList.add(Pair("CYAN 200", MaterialColor.CYAN_200))
        cyanList.add(Pair("CYAN 300", MaterialColor.CYAN_300))
        cyanList.add(Pair("CYAN 400", MaterialColor.CYAN_400))
        cyanList.add(Pair("CYAN 500", MaterialColor.CYAN_500))
        cyanList.add(Pair("CYAN 600", MaterialColor.CYAN_600))
        cyanList.add(Pair("CYAN 700", MaterialColor.CYAN_700))
        cyanList.add(Pair("CYAN 800", MaterialColor.CYAN_800))
        cyanList.add(Pair("CYAN 900", MaterialColor.CYAN_900))
        cyanList.add(Pair("CYAN A100", MaterialColor.CYAN_A100))
        cyanList.add(Pair("CYAN A200", MaterialColor.CYAN_A200))
        cyanList.add(Pair("CYAN A400", MaterialColor.CYAN_A400))
        cyanList.add(Pair("CYAN A700", MaterialColor.CYAN_A700))
        finalList.add(cyanList)

        val tealList = mutableListOf<Pair<String, Color>>()
        tealList.add(Pair("TEAL", MaterialColor.TEAL))
        //tealList.add(Pair("TEAL 50", Material.TEAL_50))
        tealList.add(Pair("TEAL 100", MaterialColor.TEAL_100))
        tealList.add(Pair("TEAL 200", MaterialColor.TEAL_200))
        tealList.add(Pair("TEAL 300", MaterialColor.TEAL_300))
        tealList.add(Pair("TEAL 400", MaterialColor.TEAL_400))
        tealList.add(Pair("TEAL 500", MaterialColor.TEAL_500))
        tealList.add(Pair("TEAL 600", MaterialColor.TEAL_600))
        tealList.add(Pair("TEAL 700", MaterialColor.TEAL_700))
        tealList.add(Pair("TEAL 800", MaterialColor.TEAL_800))
        tealList.add(Pair("TEAL 900", MaterialColor.TEAL_900))
        tealList.add(Pair("TEAL A100", MaterialColor.TEAL_A100))
        tealList.add(Pair("TEAL A200", MaterialColor.TEAL_A200))
        tealList.add(Pair("TEAL A400", MaterialColor.TEAL_A400))
        tealList.add(Pair("TEAL A700", MaterialColor.TEAL_A700))
        finalList.add(tealList)


        val greenList = mutableListOf<Pair<String, Color>>()
        greenList.add(Pair("GREEN", MaterialColor.GREEN))
        //greenList.add(Pair("GREEN 50", Material.GREEN_50))
        greenList.add(Pair("GREEN 100", MaterialColor.GREEN_100))
        greenList.add(Pair("GREEN 200", MaterialColor.GREEN_200))
        greenList.add(Pair("GREEN 300", MaterialColor.GREEN_300))
        greenList.add(Pair("GREEN 400", MaterialColor.GREEN_400))
        greenList.add(Pair("GREEN 500", MaterialColor.GREEN_500))
        greenList.add(Pair("GREEN 600", MaterialColor.GREEN_600))
        greenList.add(Pair("GREEN 700", MaterialColor.GREEN_700))
        greenList.add(Pair("GREEN 800", MaterialColor.GREEN_800))
        greenList.add(Pair("GREEN 900", MaterialColor.GREEN_900))
        greenList.add(Pair("GREEN A100", MaterialColor.GREEN_A100))
        greenList.add(Pair("GREEN A200", MaterialColor.GREEN_A200))
        greenList.add(Pair("GREEN A400", MaterialColor.GREEN_A400))
        greenList.add(Pair("GREEN A700", MaterialColor.GREEN_A700))
        finalList.add(greenList)

        val lightGreenList = mutableListOf<Pair<String, Color>>()
        lightGreenList.add(Pair("LIGHT GREEN", MaterialColor.LIGHT_GREEN))
        //lightGreenList.add(Pair("LIGHT GREEN 50", Material.LIGHT_GREEN_50))
        lightGreenList.add(Pair("LIGHT GREEN 100", MaterialColor.LIGHT_GREEN_100))
        lightGreenList.add(Pair("LIGHT GREEN 200", MaterialColor.LIGHT_GREEN_200))
        lightGreenList.add(Pair("LIGHT GREEN 300", MaterialColor.LIGHT_GREEN_300))
        lightGreenList.add(Pair("LIGHT GREEN 400", MaterialColor.LIGHT_GREEN_400))
        lightGreenList.add(Pair("LIGHT GREEN 500", MaterialColor.LIGHT_GREEN_500))
        lightGreenList.add(Pair("LIGHT GREEN 600", MaterialColor.LIGHT_GREEN_600))
        lightGreenList.add(Pair("LIGHT GREEN 700", MaterialColor.LIGHT_GREEN_700))
        lightGreenList.add(Pair("LIGHT GREEN 800", MaterialColor.LIGHT_GREEN_800))
        lightGreenList.add(Pair("LIGHT GREEN 900", MaterialColor.LIGHT_GREEN_900))
        lightGreenList.add(Pair("LIGHT GREEN A100", MaterialColor.LIGHT_GREEN_A100))
        lightGreenList.add(Pair("LIGHT GREEN A200", MaterialColor.LIGHT_GREEN_A200))
        lightGreenList.add(Pair("LIGHT GREEN A400", MaterialColor.LIGHT_GREEN_A400))
        lightGreenList.add(Pair("LIGHT GREEN A700", MaterialColor.LIGHT_GREEN_A700))
        finalList.add(lightGreenList)

        val limeList = mutableListOf<Pair<String, Color>>()
        limeList.add(Pair("LIME", MaterialColor.LIME))
        //limeList.add(Pair("LIME 50", Material.LIME_50))
        limeList.add(Pair("LIME 100", MaterialColor.LIME_100))
        limeList.add(Pair("LIME 200", MaterialColor.LIME_200))
        limeList.add(Pair("LIME 300", MaterialColor.LIME_300))
        limeList.add(Pair("LIME 400", MaterialColor.LIME_400))
        limeList.add(Pair("LIME 500", MaterialColor.LIME_500))
        limeList.add(Pair("LIME 600", MaterialColor.LIME_600))
        limeList.add(Pair("LIME 700", MaterialColor.LIME_700))
        limeList.add(Pair("LIME 800", MaterialColor.LIME_800))
        limeList.add(Pair("LIME 900", MaterialColor.LIME_900))
        limeList.add(Pair("LIME A100", MaterialColor.LIME_A100))
        limeList.add(Pair("LIME A200", MaterialColor.LIME_A200))
        limeList.add(Pair("LIME A400", MaterialColor.LIME_A400))
        limeList.add(Pair("LIME A700", MaterialColor.LIME_A700))
        finalList.add(limeList)

        val yellowList = mutableListOf<Pair<String, Color>>()
        yellowList.add(Pair("YELLOW", MaterialColor.YELLOW))
        //yellowList.add(Pair("YELLOW 50", Material.YELLOW_50))
        yellowList.add(Pair("YELLOW 100", MaterialColor.YELLOW_100))
        yellowList.add(Pair("YELLOW 200", MaterialColor.YELLOW_200))
        yellowList.add(Pair("YELLOW 300", MaterialColor.YELLOW_300))
        yellowList.add(Pair("YELLOW 400", MaterialColor.YELLOW_400))
        yellowList.add(Pair("YELLOW 500", MaterialColor.YELLOW_500))
        yellowList.add(Pair("YELLOW 600", MaterialColor.YELLOW_600))
        yellowList.add(Pair("YELLOW 700", MaterialColor.YELLOW_700))
        yellowList.add(Pair("YELLOW 800", MaterialColor.YELLOW_800))
        yellowList.add(Pair("YELLOW 900", MaterialColor.YELLOW_900))
        yellowList.add(Pair("YELLOW A100", MaterialColor.YELLOW_A100))
        yellowList.add(Pair("YELLOW A200", MaterialColor.YELLOW_A200))
        yellowList.add(Pair("YELLOW A400", MaterialColor.YELLOW_A400))
        yellowList.add(Pair("YELLOW A700", MaterialColor.YELLOW_A700))
        finalList.add(yellowList)

        val amberList = mutableListOf<Pair<String, Color>>()
        amberList.add(Pair("AMBER", MaterialColor.AMBER))
        //amberList.add(Pair("AMBER 50", Material.AMBER_50))
        amberList.add(Pair("AMBER 100", MaterialColor.AMBER_100))
        amberList.add(Pair("AMBER 200", MaterialColor.AMBER_200))
        amberList.add(Pair("AMBER 300", MaterialColor.AMBER_300))
        amberList.add(Pair("AMBER 400", MaterialColor.AMBER_400))
        amberList.add(Pair("AMBER 500", MaterialColor.AMBER_500))
        amberList.add(Pair("AMBER 600", MaterialColor.AMBER_600))
        amberList.add(Pair("AMBER 700", MaterialColor.AMBER_700))
        amberList.add(Pair("AMBER 800", MaterialColor.AMBER_800))
        amberList.add(Pair("AMBER 900", MaterialColor.AMBER_900))
        amberList.add(Pair("AMBER A100", MaterialColor.AMBER_A100))
        amberList.add(Pair("AMBER A200", MaterialColor.AMBER_A200))
        amberList.add(Pair("AMBER A400", MaterialColor.AMBER_A400))
        amberList.add(Pair("AMBER A700", MaterialColor.AMBER_A700))
        finalList.add(amberList)


        val orangeList = mutableListOf<Pair<String, Color>>()
        orangeList.add(Pair("ORANGE", MaterialColor.ORANGE))
        //orangeList.add(Pair("ORANGE 50", Material.ORANGE_50))
        orangeList.add(Pair("ORANGE 100", MaterialColor.ORANGE_100))
        orangeList.add(Pair("ORANGE 200", MaterialColor.ORANGE_200))
        orangeList.add(Pair("ORANGE 300", MaterialColor.ORANGE_300))
        orangeList.add(Pair("ORANGE 400", MaterialColor.ORANGE_400))
        orangeList.add(Pair("ORANGE 500", MaterialColor.ORANGE_500))
        orangeList.add(Pair("ORANGE 600", MaterialColor.ORANGE_600))
        orangeList.add(Pair("ORANGE 700", MaterialColor.ORANGE_700))
        orangeList.add(Pair("ORANGE 800", MaterialColor.ORANGE_800))
        orangeList.add(Pair("ORANGE 900", MaterialColor.ORANGE_900))
        orangeList.add(Pair("ORANGE A100", MaterialColor.ORANGE_A100))
        orangeList.add(Pair("ORANGE A200", MaterialColor.ORANGE_A200))
        orangeList.add(Pair("ORANGE A400", MaterialColor.ORANGE_A400))
        orangeList.add(Pair("ORANGE A700", MaterialColor.ORANGE_A700))
        finalList.add(orangeList)

        val deepOrangeList = mutableListOf<Pair<String, Color>>()
        deepOrangeList.add(Pair("DEEP ORANGE", MaterialColor.DEEP_ORANGE))
        //deepOrangeList.add(Pair("DEEP ORANGE 50", Material.DEEP_ORANGE_50))
        deepOrangeList.add(Pair("DEEP ORANGE 100", MaterialColor.DEEP_ORANGE_100))
        deepOrangeList.add(Pair("DEEP ORANGE 200", MaterialColor.DEEP_ORANGE_200))
        deepOrangeList.add(Pair("DEEP ORANGE 300", MaterialColor.DEEP_ORANGE_300))
        deepOrangeList.add(Pair("DEEP ORANGE 400", MaterialColor.DEEP_ORANGE_400))
        deepOrangeList.add(Pair("DEEP ORANGE 500", MaterialColor.DEEP_ORANGE_500))
        deepOrangeList.add(Pair("DEEP ORANGE 600", MaterialColor.DEEP_ORANGE_600))
        deepOrangeList.add(Pair("DEEP ORANGE 700", MaterialColor.DEEP_ORANGE_700))
        deepOrangeList.add(Pair("DEEP ORANGE 800", MaterialColor.DEEP_ORANGE_800))
        deepOrangeList.add(Pair("DEEP ORANGE 900", MaterialColor.DEEP_ORANGE_900))
        deepOrangeList.add(Pair("DEEP ORANGE A100", MaterialColor.DEEP_ORANGE_A100))
        deepOrangeList.add(Pair("DEEP ORANGE A200", MaterialColor.DEEP_ORANGE_A200))
        deepOrangeList.add(Pair("DEEP ORANGE A400", MaterialColor.DEEP_ORANGE_A400))
        deepOrangeList.add(Pair("DEEP ORANGE A700", MaterialColor.DEEP_ORANGE_A700))
        finalList.add(deepOrangeList)

        val brownList = mutableListOf<Pair<String, Color>>()
        brownList.add(Pair("BROWN", MaterialColor.BROWN))
        //brownList.add(Pair("BROWN 50", Material.BROWN_50))
        brownList.add(Pair("BROWN 100", MaterialColor.BROWN_100))
        brownList.add(Pair("BROWN 200", MaterialColor.BROWN_200))
        brownList.add(Pair("BROWN 300", MaterialColor.BROWN_300))
        brownList.add(Pair("BROWN 400", MaterialColor.BROWN_400))
        brownList.add(Pair("BROWN 500", MaterialColor.BROWN_500))
        brownList.add(Pair("BROWN 600", MaterialColor.BROWN_600))
        brownList.add(Pair("BROWN 700", MaterialColor.BROWN_700))
        brownList.add(Pair("BROWN 800", MaterialColor.BROWN_800))
        brownList.add(Pair("BROWN 900", MaterialColor.BROWN_900))
        finalList.add(brownList)

        val greyList = mutableListOf<Pair<String, Color>>()
        greyList.add(Pair("GREY", MaterialColor.GREY))
        //greyList.add(Pair("GREY 50", Material.GREY_50))
        greyList.add(Pair("GREY 100", MaterialColor.GREY_100))
        greyList.add(Pair("GREY 200", MaterialColor.GREY_200))
        greyList.add(Pair("GREY 300", MaterialColor.GREY_300))
        greyList.add(Pair("GREY 400", MaterialColor.GREY_400))
        greyList.add(Pair("GREY 500", MaterialColor.GREY_500))
        greyList.add(Pair("GREY 600", MaterialColor.GREY_600))
        greyList.add(Pair("GREY 700", MaterialColor.GREY_700))
        greyList.add(Pair("GREY 800", MaterialColor.GREY_800))
        greyList.add(Pair("GREY 900", MaterialColor.GREY_900))
        finalList.add(greyList)

        val blueGreyList = mutableListOf<Pair<String, Color>>()
        blueGreyList.add(Pair("BLUE GREY", MaterialColor.BLUE_GREY))
        //blueGreyList.add(Pair("BLUE GREY 50", Material.BLUE_GREY_50))
        blueGreyList.add(Pair("BLUE GREY 100", MaterialColor.BLUE_GREY_100))
        blueGreyList.add(Pair("BLUE GREY 200", MaterialColor.BLUE_GREY_200))
        blueGreyList.add(Pair("BLUE GREY 300", MaterialColor.BLUE_GREY_300))
        blueGreyList.add(Pair("BLUE GREY 400", MaterialColor.BLUE_GREY_400))
        blueGreyList.add(Pair("BLUE GREY 500", MaterialColor.BLUE_GREY_500))
        blueGreyList.add(Pair("BLUE GREY 600", MaterialColor.BLUE_GREY_600))
        blueGreyList.add(Pair("BLUE GREY 700", MaterialColor.BLUE_GREY_700))
        blueGreyList.add(Pair("BLUE GREY 800", MaterialColor.BLUE_GREY_800))
        blueGreyList.add(Pair("BLUE GREY 900", MaterialColor.BLUE_GREY_900))
        finalList.add(blueGreyList)

        return finalList
    }

    fun getSampleGradientList(): MutableList<List<Pair<String, Brush>>> {
        val finalList = mutableListOf<List<Pair<String, Brush>>>()

        val topList = mutableListOf<Pair<String, Brush>>()
        topList.add(
            Pair(
                "Top left to bottom right",
                GradientMixer.topLeftToBottomRight(MaterialColor.YELLOW, MaterialColor.PURPLE)
            )
        )
        topList.add(
            Pair(
                "Top to bottom",
                GradientMixer.topToBottom(MaterialColor.YELLOW, MaterialColor.PURPLE)
            )
        )
        topList.add(
            Pair(
                "Top right to bottom left",
                GradientMixer.topRightToBottomLeft(MaterialColor.YELLOW, MaterialColor.PURPLE)
            )
        )
        finalList.add(topList)

        val midList = mutableListOf<Pair<String, Brush>>()
        midList.add(
            Pair(
                "Left to right",
                GradientMixer.leftToRight(MaterialColor.YELLOW, MaterialColor.PURPLE)
            )
        )
        midList.add(
            Pair(
                "Radial",
                GradientMixer.radial(MaterialColor.YELLOW, MaterialColor.PURPLE)
            )
        )
        midList.add(
            Pair(
                "Right to Left",
                GradientMixer.rightToLeft(MaterialColor.YELLOW, MaterialColor.PURPLE)
            )
        )
        finalList.add(midList)

        val bottomList = mutableListOf<Pair<String, Brush>>()
        bottomList.add(
            Pair(
                "Bottom left to top right",
                GradientMixer.bottomLeftToTopRight(MaterialColor.YELLOW, MaterialColor.PURPLE)
            )
        )
        bottomList.add(
            Pair(
                "Bottom to top",
                GradientMixer.bottomToTop(MaterialColor.YELLOW, MaterialColor.PURPLE)
            )
        )
        bottomList.add(
            Pair(
                "Bottom right to top left",
                GradientMixer.bottomRightToTopLeft(MaterialColor.YELLOW, MaterialColor.PURPLE)
            )
        )
        finalList.add(bottomList)

        val miscList = mutableListOf<Pair<String, Brush>>()
        miscList.add(
            Pair(
                "Sweep Blend",
                GradientMixer.sweepBlend(MaterialColor.YELLOW, MaterialColor.PURPLE)
            )
        )
        miscList.add(
            Pair(
                "Just vertical",
                GradientMixer.vertical(MaterialColor.YELLOW, MaterialColor.PURPLE)
            )
        )
        miscList.add(
            Pair(
                "Just Horizontal",
                GradientMixer.horizontal(MaterialColor.YELLOW, MaterialColor.PURPLE)
            )
        )
        finalList.add(miscList)

        return finalList
    }


    fun getSampleGradientMultiColorList(): MutableList<List<Pair<String, Brush>>> {
        val finalList = mutableListOf<List<Pair<String, Brush>>>()

        val colorConfig = listOf(
            MaterialColor.INDIGO,
            MaterialColor.PINK,
            MaterialColor.ORANGE,
            MaterialColor.YELLOW
        )
        val topList = mutableListOf<Pair<String, Brush>>()
        topList.add(
            Pair(
                "Top left to bottom right",
                GradientMixer.topLeftToBottomRight(colorConfig)
            )
        )
        topList.add(
            Pair(
                "Top to bottom",
                GradientMixer.topToBottom(colorConfig)
            )
        )
        topList.add(
            Pair(
                "Top right to bottom left",
                GradientMixer.topRightToBottomLeft(colorConfig)
            )
        )
        finalList.add(topList)

        val midList = mutableListOf<Pair<String, Brush>>()
        midList.add(
            Pair(
                "Left to right",
                GradientMixer.leftToRight(colorConfig)
            )
        )
        midList.add(
            Pair(
                "Radial",
                GradientMixer.radial(colorConfig)
            )
        )
        midList.add(
            Pair(
                "Right to Left",
                GradientMixer.rightToLeft(colorConfig)
            )
        )
        finalList.add(midList)

        val bottomList = mutableListOf<Pair<String, Brush>>()
        bottomList.add(
            Pair(
                "Bottom left to top right",
                GradientMixer.bottomLeftToTopRight(colorConfig)
            )
        )
        bottomList.add(
            Pair(
                "Bottom to top",
                GradientMixer.bottomToTop(colorConfig)
            )
        )
        bottomList.add(
            Pair(
                "Bottom right to top left",
                GradientMixer.bottomRightToTopLeft(colorConfig)
            )
        )
        finalList.add(bottomList)

        val miscList = mutableListOf<Pair<String, Brush>>()
        miscList.add(
            Pair(
                "Sweep Blend",
                GradientMixer.sweepBlend(colorConfig)
            )
        )
        finalList.add(miscList)

        val topList2 = mutableListOf<Pair<String, Brush>>()
        topList2.add(
            Pair(
                "Reversed Top left to bottom right",
                GradientMixer.topLeftToBottomRight(colorConfig,true)
            )
        )
        topList2.add(
            Pair(
                "Reversed Top to bottom",
                GradientMixer.topToBottom(colorConfig,true)
            )
        )
        topList2.add(
            Pair(
                "Reversed Top right to bottom left",
                GradientMixer.topRightToBottomLeft(colorConfig,true)
            )
        )
        finalList.add(topList2)

        val midList2 = mutableListOf<Pair<String, Brush>>()
        midList2.add(
            Pair(
                "Reversed Left to right",
                GradientMixer.leftToRight(colorConfig,true)
            )
        )
        midList2.add(
            Pair(
                "Reversed Radial",
                GradientMixer.radial(colorConfig,true)
            )
        )
        midList2.add(
            Pair(
                "Reversed Right to Left",
                GradientMixer.rightToLeft(colorConfig,true)
            )
        )
        finalList.add(midList2)

        val bottomList2 = mutableListOf<Pair<String, Brush>>()
        bottomList2.add(
            Pair(
                "Reversed Bottom left to top right",
                GradientMixer.bottomLeftToTopRight(colorConfig,true)
            )
        )
        bottomList2.add(
            Pair(
                "Reversed Bottom to top",
                GradientMixer.bottomToTop(colorConfig,true)
            )
        )
        bottomList2.add(
            Pair(
                "Reversed Bottom right to top left",
                GradientMixer.bottomRightToTopLeft(colorConfig,true)
            )
        )
        finalList.add(bottomList2)


        return finalList
    }
    
    fun getSampleDraculaColors(): MutableList<List<Pair<String, Color>>> {
        val finalList = mutableListOf<List<Pair<String, Color>>>()

        val listFirst = mutableListOf<Pair<String, Color>>()
        listFirst.add(Pair("Dracula Pink", DraculaColor.PINK))
        listFirst.add(Pair("Dracula Purple", DraculaColor.PURPLE))
        listFirst.add(Pair("Dracula Orange", DraculaColor.ORANGE))
        finalList.add(listFirst)

        val listSecond = mutableListOf<Pair<String, Color>>()
        listSecond.add(Pair("Dracula Yellow", DraculaColor.YELLOW))
        listSecond.add(Pair("Dracula Green", DraculaColor.GREEN))
        listSecond.add(Pair("Dracula Red", DraculaColor.RED))
        finalList.add(listSecond)

        val listThird = mutableListOf<Pair<String, Color>>()
        listThird.add(Pair("Dracula Cyan", DraculaColor.CYAN))
        listThird.add(Pair("Dracula Subtext", DraculaColor.SUBTEXT))
        listThird.add(Pair("Dracula text", DraculaColor.TEXT))
        finalList.add(listThird)
        

        return finalList
    }

    fun getSampleFlatColors(): MutableList<List<Pair<String, Color>>> {
        val finalList = mutableListOf<List<Pair<String, Color>>>()

        val listFirst = mutableListOf<Pair<String, Color>>()
        listFirst.add(Pair("TURQUOISE", FlatColor.TURQUOISE))
        listFirst.add(Pair("EMERLAND", FlatColor.EMERLAND))
        listFirst.add(Pair("PETERRIVER", FlatColor.PETER_RIVER))
        listFirst.add(Pair("MIDNIGHT BLUE", FlatColor.MIDNIGHT_BLUE))
        listFirst.add(Pair("SUNFLOWER", FlatColor.SUNFLOWER))
        listFirst.add(Pair("CARROT", FlatColor.CARROT))
        finalList.add(listFirst)

        val listSecond = mutableListOf<Pair<String, Color>>()
        listSecond.add(Pair("AMETHYST", FlatColor.AMETHYST))
        listSecond.add(Pair("WETASPHALT", FlatColor.WET_ASPHALT))
        listSecond.add(Pair("GREENSEA", FlatColor.GREENSEA))
        listSecond.add(Pair("ALIZARIN", FlatColor.ALIZARIN))
        listSecond.add(Pair("CONCRETE", FlatColor.CONCRETE))
        listSecond.add(Pair("CLOUDS", FlatColor.CLOUDS))
        finalList.add(listSecond)

        val listThird = mutableListOf<Pair<String, Color>>()
        listThird.add(Pair("NEPHRITIS", FlatColor.NEPHRITIS))
        listThird.add(Pair("BELIZEHOLE", FlatColor.BELIZE_HOLE))
        listThird.add(Pair("WISTERIA", FlatColor.WISTERIA))
        listThird.add(Pair("ORANGE", FlatColor.ORANGE))
        listThird.add(Pair("PUMPKIN", FlatColor.PUMPKIN))
        listThird.add(Pair("POMEGRANATE", FlatColor.POMEGRANATE))
        listThird.add(Pair("SILVER", FlatColor.SILVER))
        listThird.add(Pair("ASBESTOS", FlatColor.ASBESTOS))
        finalList.add(listThird)


        return finalList
    }

    fun getSampleCoolColors(): MutableList<List<Pair<String, Color>>> {
        val finalList = mutableListOf<List<Pair<String, Color>>>()

        val listFirst = mutableListOf<Pair<String, Color>>()
        listFirst.add(Pair("GAINSBORO", CoolColor.GAINSBORO))
        listFirst.add(Pair("LIGHT GREY", CoolColor.LIGHT_GREY))
        listFirst.add(Pair("SILVER", CoolColor.SILVER))
        listFirst.add(Pair("LAWN GREEN", CoolColor.LAWN_GREEN))
        listFirst.add(Pair("LIME", CoolColor.LIME))
        listFirst.add(Pair("LIME GREEN", CoolColor.LIME_GREEN))
        finalList.add(listFirst)

        val listSecond = mutableListOf<Pair<String, Color>>()
        listSecond.add(Pair("DARK GREY", CoolColor.DARK_GREY))
        listSecond.add(Pair("GREY", CoolColor.GREY))
        listSecond.add(Pair("DIM GREY", CoolColor.DIM_GREY))
        listSecond.add(Pair("DARK OLIVE", CoolColor.DARK_OLIVE))
        listSecond.add(Pair("MEDIUM AQUAMARINE", CoolColor.MEDIUM_AQUAMARINE))
        listSecond.add(Pair("DARK SEAGREEEN", CoolColor.DARK_SEAGREEN))
        finalList.add(listSecond)

        val listThird = mutableListOf<Pair<String, Color>>()
        listThird.add(Pair("LIGHT SLATE GREY", CoolColor.LIGHT_SLATE_GREY))
        listThird.add(Pair("SLATE GREY", CoolColor.SLATE_GREY))
        listThird.add(Pair("DARK SLATE GREY", CoolColor.DARK_SLATE_GREY))
        listThird.add(Pair("LIGHT SEAGREEN", CoolColor.LIGHT_SEAGREEN))
        listThird.add(Pair("DARK CYAN", CoolColor.DARK_CYAN))
        listThird.add(Pair("TEAL", CoolColor.TEAL))
        finalList.add(listThird)

        val listFourth = mutableListOf<Pair<String, Color>>()
        listFourth.add(Pair("BLACK", CoolColor.BLACK))
        listFourth.add(Pair("CORN SILK", CoolColor.CORN_SILK))
        listFourth.add(Pair("BLANCHED ALMOND", CoolColor.BLANCHED_ALMOND))
        listFourth.add(Pair("LAVENDER", CoolColor.LAVENDER))
        listFourth.add(Pair("THISTLE", CoolColor.THISTLE))
        listFourth.add(Pair("PLUM", CoolColor.PLUM))
        finalList.add(listFourth)

        val listFifth = mutableListOf<Pair<String, Color>>()
        listFifth.add(Pair("BISQUE", CoolColor.BISQUE))
        listFifth.add(Pair("NAVAJO WHITE", CoolColor.NAVAJO_WHITE))
        listFifth.add(Pair("WHEAT", CoolColor.WHEAT))
        listFifth.add(Pair("VIOLET", CoolColor.VIOLET))
        listFifth.add(Pair("ORCHID", CoolColor.ORCHID))
        listFifth.add(Pair("FUCHSIA", CoolColor.FUCHSIA))
        finalList.add(listFifth)

        val listSixth = mutableListOf<Pair<String, Color>>()
        listSixth.add(Pair("BURLYWOOD", CoolColor.BURLYWOOD))
        listSixth.add(Pair("TAN", CoolColor.TAN))
        listSixth.add(Pair("ROSY BROWN", CoolColor.ROSY_BROWN))
        listSixth.add(Pair("MAGENTA", CoolColor.MAGENTA))
        listSixth.add(Pair("MEDIUM ORCHID", CoolColor.MEDIUM_ORCHID))
        listSixth.add(Pair("MEDIUM PURPLE", CoolColor.MEDIUM_PURPLE))
        finalList.add(listSixth)

        val listSeventh = mutableListOf<Pair<String, Color>>()
        listSeventh.add(Pair("SANDY BROWN", CoolColor.SANDY_BROWN))
        listSeventh.add(Pair("GOLDEN ROD", CoolColor.GOLDEN_ROD))
        listSeventh.add(Pair("DARK GOLDEN ROD", CoolColor.DARK_GOLDEN_ROD))
        listSeventh.add(Pair("REBECCA PURPLE", CoolColor.REBECCA_PURPLE))
        listSeventh.add(Pair("BLUE VIOLET", CoolColor.BLUE_VIOLET))
        listSeventh.add(Pair("DARK VIOLET", CoolColor.DARK_VIOLET))
        finalList.add(listSeventh)

        val listEighth = mutableListOf<Pair<String, Color>>()
        listEighth.add(Pair("PERU", CoolColor.PERU))
        listEighth.add(Pair("CHOCOLATE", CoolColor.CHOCOLATE))
        listEighth.add(Pair("SADDLE BROWN", CoolColor.SADDLE_BROWN))
        listEighth.add(Pair("DARK ORCHID", CoolColor.DARK_ORCHID))
        listEighth.add(Pair("DARK MAGENTA", CoolColor.DARK_MAGENTA))
        listEighth.add(Pair("PURPLE", CoolColor.PURPLE))
        finalList.add(listEighth)

        val listNineth = mutableListOf<Pair<String, Color>>()
        listNineth.add(Pair("SIENNA", CoolColor.SIENNA))
        listNineth.add(Pair("BROWN", CoolColor.BROWN))
        listNineth.add(Pair("MAROON", CoolColor.MAROON))
        listNineth.add(Pair("INDIGO", CoolColor.INDIGO))
        listNineth.add(Pair("SLATE BLUE", CoolColor.SLATE_BLUE))
        listNineth.add(Pair("DARK SLATE BLUE", CoolColor.DARK_SLATE_BLUE))
        finalList.add(listNineth)

        val listTenth = mutableListOf<Pair<String, Color>>()
        listTenth.add(Pair("INDIAN RED", CoolColor.INDIAN_RED))
        listTenth.add(Pair("LIGHT CORAL", CoolColor.LIGHT_CORAL))
        listTenth.add(Pair("SALMON", CoolColor.SALMON))
        listTenth.add(Pair("MEDIUM SLATE BLUE", CoolColor.MEDIUM_SLATE_BLUE))
        listTenth.add(Pair("AQUAL", CoolColor.AQUA))
        listTenth.add(Pair("CYAN", CoolColor.CYAN))
        finalList.add(listTenth)

        val listEleventh = mutableListOf<Pair<String, Color>>()
        listEleventh.add(Pair("DARK SALMON", CoolColor.DARK_SALMON))
        listEleventh.add(Pair("LIGHT SALMON", CoolColor.LIGHT_SALMON))
        listEleventh.add(Pair("CRIMSON", CoolColor.CRIMSON))
        listEleventh.add(Pair("LIGHT CYAN", CoolColor.LIGHT_CYAN))
        listEleventh.add(Pair("PALE TURQUOISE", CoolColor.PALE_TURQUOISE))
        listEleventh.add(Pair("AQUAMARINE", CoolColor.AQUAMARINE))
        finalList.add(listEleventh)

        val listTwelve = mutableListOf<Pair<String, Color>>()
        listTwelve.add(Pair("RED", CoolColor.RED))
        listTwelve.add(Pair("FIREBRICK", CoolColor.FIREBRICK))
        listTwelve.add(Pair("DARK RED", CoolColor.DARK_RED))
        listTwelve.add(Pair("TURQUOISE", CoolColor.TURQUOISE))
        listTwelve.add(Pair("MEDIUM TURQUOISE", CoolColor.MEDIUM_TURQUOISE))
        listTwelve.add(Pair("DARK TURQUOISE", CoolColor.DARK_TURQUOISE))
        finalList.add(listTwelve)

        val listThirteen = mutableListOf<Pair<String, Color>>()
        listThirteen.add(Pair("PINK", CoolColor.PINK))
        listThirteen.add(Pair("LIGHT PINK", CoolColor.LIGHT_PINK))
        listThirteen.add(Pair("HOT PINK", CoolColor.HOT_PINK))
        listThirteen.add(Pair("CADET BLUE", CoolColor.CADET_BLUE))
        listThirteen.add(Pair("STEEL BLUE", CoolColor.STEEL_BLUE))
        listThirteen.add(Pair("LIGHT STEEL", CoolColor.LIGHT_STEEL))
        finalList.add(listThirteen)

        val listFourteen = mutableListOf<Pair<String, Color>>()
        listFourteen.add(Pair("DEEP PINK", CoolColor.DEEP_PINK))
        listFourteen.add(Pair("MEDIUM VIOLET RED", CoolColor.MEDIUM_VIOLET_RED))
        listFourteen.add(Pair("PALE VIOLET RED", CoolColor.PALE_VIOLET_RED))
        listFourteen.add(Pair("POWDER BLUE", CoolColor.POWDER_BLUE))
        listFourteen.add(Pair("LIGHT BLUE", CoolColor.LIGHT_BLUE))
        listFourteen.add(Pair("SKY BLUE", CoolColor.SKY_BLUE))
        finalList.add(listFourteen)

        val listFifteen = mutableListOf<Pair<String, Color>>()
        listFifteen.add(Pair("CORAL", CoolColor.CORAL))
        listFifteen.add(Pair("TOMATO", CoolColor.TOMATO))
        listFifteen.add(Pair("ORANGE RED", CoolColor.ORANGE_RED))
        listFifteen.add(Pair("LIGHT SKY", CoolColor.LIGHT_SKY))
        listFifteen.add(Pair("DEEP SKY BLUE", CoolColor.DEEP_SKY_BLUE))
        listFifteen.add(Pair("DODGER BLUE", CoolColor.DODGER_BLUE))
        finalList.add(listFifteen)

        val listSixteen = mutableListOf<Pair<String, Color>>()
        listSixteen.add(Pair("DARK ORANGE", CoolColor.DARK_ORANGE))
        listSixteen.add(Pair("ORANGE", CoolColor.ORANGE))
        listSixteen.add(Pair("GOLD", CoolColor.GOLD))
        listSixteen.add(Pair("CORNFLOWER BLUE", CoolColor.CORNFLOWER_BLUE))
        listSixteen.add(Pair("ROYAL BLUE", CoolColor.ROYAL_BLUE))
        listSixteen.add(Pair("BLUE", CoolColor.BLUE))
        finalList.add(listSixteen)

        val listSeventeen = mutableListOf<Pair<String, Color>>()
        listSeventeen.add(Pair("YELLOW", CoolColor.YELLOW))
        listSeventeen.add(Pair("LIGHT YELLOW", CoolColor.LIGHT_YELLOW))
        listSeventeen.add(Pair("LEMON CHIFFON", CoolColor.LEMON_CHIFFON))
        listSeventeen.add(Pair("MEDIUM BLUE", CoolColor.MEDIUM_BLUE))
        listSeventeen.add(Pair("DARK BLUE", CoolColor.DARK_BLUE))
        listSeventeen.add(Pair("NAVY", CoolColor.NAVY))
        finalList.add(listSeventeen)

        val listEighteen = mutableListOf<Pair<String, Color>>()
        listEighteen.add(Pair("LIGHT GOLDEN ROD YELLOW", CoolColor.LIGHT_GOLDEN_ROD_YELLOW))
        listEighteen.add(Pair("PAPAYA WHIP", CoolColor.PAPAYA_WHIP))
        listEighteen.add(Pair("MOCCASIN", CoolColor.MOCCASIN))
        listEighteen.add(Pair("MIDNIGHT BLUE", CoolColor.MIDNIGHT_BLUE))
        listEighteen.add(Pair("SNOW", CoolColor.SNOW))
        listEighteen.add(Pair("HONEY DEW", CoolColor.HONEY_DEW))
        finalList.add(listEighteen)

        val listNineteen = mutableListOf<Pair<String, Color>>()
        listNineteen.add(Pair("PEACH PUFF", CoolColor.PEACH_PUFF))
        listNineteen.add(Pair("PALE GOLDEN ROD", CoolColor.PALE_GOLDEN_ROD))
        listNineteen.add(Pair("KHAKI", CoolColor.KHAKI))
        listNineteen.add(Pair("MINT CREAM", CoolColor.MINT_CREAM))
        listNineteen.add(Pair("AZURE", CoolColor.AZURE))
        listNineteen.add(Pair("ALICE BLUE", CoolColor.ALICE_BLUE))
        finalList.add(listNineteen)

        val listTwenty = mutableListOf<Pair<String, Color>>()
        listTwenty.add(Pair("DARK KHAKI", CoolColor.DARK_KHAKI))
        listTwenty.add(Pair("GREEN YELLOW", CoolColor.GREEN_YELLOW))
        listTwenty.add(Pair("CHARTREUSE", CoolColor.CHARTREUSE))
        listTwenty.add(Pair("GHOST WHITE", CoolColor.GHOST_WHITE))
        listTwenty.add(Pair("WHITE SMOKE", CoolColor.WHITE_SMOKE))
        listTwenty.add(Pair("SEASHELL", CoolColor.SEASHELL))
        finalList.add(listTwenty)

        val listTwentyOne = mutableListOf<Pair<String, Color>>()
        listTwentyOne.add(Pair("BEIGE", CoolColor.BEIGE))
        listTwentyOne.add(Pair("OLDLACE", CoolColor.OLDLACE))
        listTwentyOne.add(Pair("FLORAL WHITE", CoolColor.FLORAL_WHITE))
        listTwentyOne.add(Pair("IVORY", CoolColor.IVORY))
        listTwentyOne.add(Pair("ANTIQUE WHITE", CoolColor.ANTIQUE_WHITE))
        listTwentyOne.add(Pair("LINEN", CoolColor.LINEN))
        listTwentyOne.add(Pair("LAVENDER BRISH", CoolColor.LAVENDER_BRUSH))
        listTwentyOne.add(Pair("MISTY ROSE", CoolColor.MISTY_ROSE))
        finalList.add(listTwentyOne)
        
        


        return finalList
    }

}