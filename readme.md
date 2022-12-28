# 사진 (Sajin)

![](./sajin.png)

[![](https://jitpack.io/v/memburg/sajin.svg)](https://jitpack.io/#memburg/sajin)

Sajin is an easy to use library (specially designed for Selenium) aimed at comparing images and their similarity (as a double data type; representing percentage).

## How to use

```java
// Get your screenshots as a string (BASE64)
String expected = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
String actual = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);

// Make the comparison!
double similarity = Sajin.hardCompare(expected, actual);

// Print the results
System.out.println("Similarity is " + similarity + "%");
```

## Important

In version 1.0.2 it is necessary to use Sajin like the following example:

```java
// Preferably use version 1.0.3
double similarity = Sajin.INSTANCE.hardCompare(expected, actual);
```

## Contributions

This is an open source project, feel free to contribute to it!
