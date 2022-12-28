# 사진 (Sajin)

![](./sajin.png)

[![](https://jitpack.io/v/memburg/sajin.svg)](https://jitpack.io/#memburg/sajin)

Sajin is an easy to use library (specially designed for Selenium) aimed at comparing images and their similarity (as a double data type; representing percentage).

## How to use

```java
// Get your screenshots as a string (BASE64)
String expected = ((TakeScreenshot) driver).getScreenshotAs(OutputType.BASE64);
String actual = ((TakeScreenshot) driver).getScreenshotAs(OutputType.BASE64);

// Make the comparison!
double similarity = hardCompare(expected, actual);

// Print the results
System.out.println("Similarity is " + similarity + "%");
```

## Contributions

This is an open source project, feel free to contribute to it!
