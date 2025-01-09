# 사진 (Sajin)

![](./sajin.png)

[![](https://jitpack.io/v/memburg/sajin.svg)](https://jitpack.io/#memburg/sajin)
![Weekly download statistics](https://jitpack.io/v/memburg/sajin/week.svg)
![Monthly download statistics](https://jitpack.io/v/memburg/sajin/month.svg)

Sajin is an easy to use library (specially designed for Selenium) aimed at comparing images and their similarity (as a double data type; representing percentage).

## Add Sajin to your project

Step 1: Add the JitPack repository to your build file

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

Step 2: Add the dependency

```xml
<dependency>
    <groupId>com.github.memburg</groupId>
    <artifactId>sajin</artifactId>
    <version>1.0.5</version>
</dependency>
```

## How to use

```java
// Take screenshot #1
String expected = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);

// Some other logic in between (e.g. clicks and/or scrolls)

// Take screenshot #2
String actual = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);

// Make the comparison!
double similarity = Sajin.hardCompare(expected, actual);

// Print the results
System.out.println("Similarity is " + similarity + "%");
// Expected output: Similarity is 96.60064%
```

## Methods

Sajin is a small library, it only has FOUR methods:

- `softCompare(expected: String, actual: String, standardDeviation: Int): Float`
- `midCompare(expected: String, actual: String, standardDeviation: Int): Float`
- `hardCompare(expected: String, actual: String): Float`
- `detectMovement(i1: String, 12: String, r: Int, g: Int, b: Int): String`

The first three methods compare images, simple as that, without going too deep into the algorithms, `softCompare` and `midCompare` take a standard deviation as a parameter to avoid evaluation as strict as `hardCompare`.

`hardCompare` uses a pixel-by-pixel comparison.

`detectMovement` uses a pixel-by-pixel matching algorithm which returns a BASE64 image with the pixels that were detected as different marked with the color given by the user in the method call.

## Important

In version 1.0.2 it is necessary to use Sajin like in the following example:

```java
// Preferably use version 1.0.5
double similarity = Sajin.INSTANCE.hardCompare(expected, actual);
```

## Contributions

This is an open source project, feel free to contribute to it!
