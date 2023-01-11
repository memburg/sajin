/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package sajin

import java.awt.image.BufferedImage
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.util.Base64
import javax.imageio.ImageIO

object Sajin {
    /**
     * Gets the average value of each pixel, and if the result is inside
     * the range given by the standard deviation then the pixel will be
     * considered as a matched pixel.
     */
    @JvmStatic
    fun softCompare(expected: String, actual: String, std: Int): Float {
        // Create buffered image for both images
        val eb = createBufferedImage(expected)
        val ab = createBufferedImage(actual)

        beforeValidations(eb, ab)

        var matched = 0

        for (i in 0 until eb.height) {
            for (j in 0 until eb.width) {
                // Expected image pixel data
                val ep: Int = eb.getRGB(j, i)
                val epr = ep shr 16 and 0xff
                val epg = ep shr 8 and 0xff
                val epb = ep and 0xff
                val eavg = (epr + epg + epb) / 3

                // Actual image pixel data
                val ap: Int = ab.getRGB(j, i)
                val apr = ap shr 16 and 0xff
                val apg = ap shr 8 and 0xff
                val apb = ap and 0xff
                val aavg = (apr + apg + apb) / 3

                if (((eavg - std)..(eavg + std)).contains(aavg)) matched++
            }
        }

        return matched.toFloat() / (eb.width * eb.height).toFloat() * 100
    }

    /**
     * Compares pixel by pixel, each pixel must be in a range of the
     * standard deviation.
     */
    @JvmStatic
    fun midCompare(expected: String, actual: String, std: Int): Float {
        // Create buffered image for both images
        val eb = createBufferedImage(expected)
        val ab = createBufferedImage(actual)

        beforeValidations(eb, ab)

        var matched = 0

        for (i in 0 until eb.height) {
            for (j in 0 until eb.width) {
                // Expected image pixel data
                val ep: Int = eb.getRGB(j, i)
                val epr = ep shr 16 and 0xff
                val epg = ep shr 8 and 0xff
                val epb = ep and 0xff

                // Actual image pixel data
                val ap: Int = ab.getRGB(j, i)
                val apr = ap shr 16 and 0xff
                val apg = ap shr 8 and 0xff
                val apb = ap and 0xff

                // Matching flags
                var rm = false
                var gm = false
                var bm = false

                if (((epr - std)..(epr + std)).contains(apr)) {
                    rm = true
                }

                if (((epg - std)..(epg + std)).contains(apg)) {
                    gm = true
                }

                if (((epb - std)..(epb + std)).contains(apb)) {
                    bm = true
                }

                if (rm && gm && bm) matched++
            }
        }

        return matched.toFloat() / (eb.width * eb.height).toFloat() * 100
    }

    /**
     * Compares pixel by pixel, each pixel must be equal to be counted
     * as a matched pixel.
     */
    @JvmStatic
    fun hardCompare(expected: String, actual: String): Float {
        // Create buffered image for both images
        val eb = createBufferedImage(expected)
        val ab = createBufferedImage(actual)

        beforeValidations(eb, ab)

        var matched = 0

        for (i in 0 until eb.height) {
            for (j in 0 until eb.width) {
                val ep: Int = eb.getRGB(j, i)
                val ap: Int = ab.getRGB(j, i)

                if (ep == ap) matched++
            }
        }

        return matched.toFloat() / (eb.width * eb.height).toFloat() * 100
    }

    /**
     * Returns an empty string in case there's a failure
     */
    @JvmStatic
    fun detectMovement(im1: String, im2: String, r: Int, g: Int, b: Int): String {
        val eb = createBufferedImage(im1)
        val ab = createBufferedImage(im2)
        var difference = ""

        beforeValidations(eb, ab)

        for (i in 0 until eb.height) {
            for (j in 0 until eb.width) {
                val ep: Int = eb.getRGB(j, i)
                val ap: Int = ab.getRGB(j, i)

                if (ep != ap) {
                    // don't allow transparency
                    val newPixel = (255 shl 24) or (r shl 16) or (g shl 8) or b
                    eb.setRGB(j, i, newPixel)
                }
            }
        }

        try {
            val out = ByteArrayOutputStream(8192)
            ImageIO.write(eb, "png", out)
            difference = Base64.getEncoder().encodeToString(out.toByteArray())
        } catch (e: IOException) {
            throw Exception("Image processing exception")
        }

        return difference
    }
    
    private fun createBufferedImage(im: String): BufferedImage {
        val imageData: ByteArray = Base64.getDecoder().decode(im)
        val bais = ByteArrayInputStream(imageData)

        try {
            return ImageIO.read(bais)
        } catch (e: IOException) {
            throw RuntimeException(e)
        }
    }

    private fun beforeValidations(eb: BufferedImage, ab: BufferedImage) {
        // Validate widths are the same
        if (eb.width != ab.width) {
            throw Exception("No matching widths exception")
        }

        // Validate heights are the same
        if (eb.height != ab.height) {
            throw Exception("No matching heights exception")
        }
    }
}
