# Holi
### A library of colors, gradients and utils built using Jetpack Compose for Android

### Features

* A wide collection of colors from different palettes for easy access in your pet projects
* Provides easy gradient building functions that all your composable brushes need
* Just 28 KB in size! Over 450 predefined colors and endless gradients. 

### Color Palettes

* Material Colors
* Flat Colors
* Cool Colors
* Dracula Colors

## Color palette showcase
Cool Colors             |  Material colors | Flat colors | Dracula colors
:-------------------------:|:-------------------------: | :-------------------------: | :-------------------------:
![](https://media.giphy.com/media/S4uHXw9SoQaEl14b3c/giphy.gif)  |  ![](https://media.giphy.com/media/otyj84B8RncGPo6rxC/giphy.gif) | ![](https://media.giphy.com/media/NLnvrD57u5iJ2IbQGO/giphy.gif) | ![](https://media.giphy.com/media/CGbaGmKoym3rqsf7XQ/giphy.gif)

### Gradient mixer showcase
Directional Gradients      |  Directional multi color gradients
:-------------------------:|:-------------------------: 
![](https://media.giphy.com/media/d2ZAyZDFgFm5ZPX8v4/giphy.gif)  |  ![](https://media.giphy.com/media/80odY16jAXAuUCDyds/giphy.gif) 

### Using colors

You can simply pick colors by using the container objects for each palette and profit.

Eg.
```kotlin
   MaterialColor.RED
   CoolColor.FIREBRICK
   FlatColor.EMERLAND
   DraculaColor.YELLOW
```

![](https://media.giphy.com/media/CTRkESw2qqbuBLgR86/giphy.gif)



### Using Gradients

Using gradients is super easy with Holi, just use GradientMixer and choose from various gradient brush generating functions.

Eg.
```kotlin
   GradientMixer.sweepBlend(MaterialColor.RED,MaterialColor.GREEN)
```

Pass a list of colors for multi color mixing, every function can either take two colors or a list of colors
```kotlin
   GradientMixer.topRightToBottomLeft(
    listOf(MaterialColor.RED,
    MaterialColor.GREEN,
    MaterialColor.PURPLE)
    )
```

Set reversed to true in params to simply reverse any gradient
```kotlin
   GradientMixer.rightToLeft(FlatColor.CARROT,FlatColor.POMEGRANATE,reversed = true)
```

![](https://media.giphy.com/media/W5pC7NKZVsKcu7bEh8/giphy.gif)
