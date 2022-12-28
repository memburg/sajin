/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package sajin

import kotlin.test.Test
import kotlin.test.assertEquals

class LibraryTest {
    @Test fun softCompareMethodWorks() {
        val value = Sajin.softCompare("", "", 20)
        assertEquals(value, 10f)
    }

    @Test fun midCompareMethodWorks() {
        val value = Sajin.softCompare("", "", 20)
        assertEquals(value, 10f)
    }

    @Test fun hardCompareMethodWorks() {
        val i1 = "iVBORw0KGgoAAAANSUhEUgAAABQAAAAUCAIAAAAC64paAAAAAXNSR0IB2cksfwAAAAlwSFlzAAALEwAACxMBAJqcGAAABApJREFUeJwVVFtPXFUU3rdzm3ObOTNDkYEOzBSmFnmhSKBGE2OM0T41Jv4Mn333N5jofzDGmKYPbYxBa1VipUiYIpByKQNluAxnzv2cfXGTrOyHnf1lrf1dFjn8+kuiw62/z8JhWnE1s6RghACATAgIAeeyhJ+I1jtVDAuGkBhx937Z1zDaPAwIUQBgDLBCvoKMg4ILBAGCzDDkCcMEMQ4LXsQAlRBIWYkAa9xZfdpbe3VFwvPQMBVKOaWCMwGYSCHONVtvjpo3PT5M/D+7Re7DLM8pQDyLtvpDpL945QsISHf9fH55jAvAgewBUsqTPNf0AgeBgke12xN6c/L4m+8VAjdfnk83ratB9sPjHYDQB/daJEy4nFciAaeAoBxAhWCFIFJxkEIEpYplTH3xMd9YPU5FfWZ25eEa5WButjE/f4OYKsQEECww4IqOaMohAoquaprC/YAWnBu6W3NBp/3+0j1zxMufdF1bX353HANAOAAIQ4gQFwKo0HPUMNYEE3FvSPUckiEyNHuiDJuTOiTHf/x79N/RR4tty1E4YEQjEioAFBLLqNDqznCv8C+Lf9ZPBxkmFvz0wQw0tNfdHt3dWd14YyDUvu1xjGkhCBWAcqnJdfGIpQnwQ/777sWQonqVfHh/ydW4i5TVlY1+WOxt9+8uTCEdCSjk7whjggMMEUEYyxl6B9GzfXrqB/V6+ZPPZkT/RIlVXHcIpFGUY0VpT3tSmTQDNOMkyakQXMFSLBF4I0/XgkJ3uThbem8sP7no9zPNECdDur31BriubWtlRxVpIRgUGiEXklEqZFPgNH7rSieyqp7Va7qaxI2SNnV3Its/qTUqN111n9JW05UKJzkrVdFYxyZxLmlGQuCzECLD0ZNLmA5a0/Xt1Z3OwiQcalkY4oG/PyyIhVutCpN2x2J8xkbeCJEWIYYOFTXKsiQf1uqjcx3lyaPnt2yFponoX5ZGqodHg7Mob3tGxdNzDogG1EqFEZ34VDLH5FU/Ss23GuWKtbH5Ik1pT7DNo8vZjkU4/HXtQMfCNFWuqgWFUFWQYWaX50R1rChIuWEMwoHtDwLHSqEk7DgowJDha7d6+vLnCys/PscI+qeRH+UTd7zL3d7D7/4ijYW343wgKcuynJ32IMSN9sTrl1s1E5cNIv2KinR2ujb51YPH3/6kWaqNYXOqtP6oawNEQpkMSxS5JIIVeRIFfnBl2CW1VcFVR0OC8TAu/Ni7M9VZvJUkseNCxFh4eJUInZgGxioBkDLGVILlChmcnNA4sLRy2Vak7XmW8oFfRLFV8Vafbc0t1tZ+PnsTwRhyCYOGa57vnckclZyK3EBZnMzWlWbN0LFM2LX3RJjkFxfl8RtWxUoOwu39CJrmVd//HzNONmGg9TqwAAAAAElFTkSuQmCC"
        val i2 = "iVBORw0KGgoAAAANSUhEUgAAABQAAAAUCAIAAAAC64paAAAAAXNSR0IB2cksfwAAAAlwSFlzAAALEwAACxMBAJqcGAAABA5JREFUeJwVVFtvVFUU3mvvfW5zbjOnMwWZlmmntEVqX6ASwGhijDHKEzHxZ/jsu7/BRP+DMcYQHiDGVBG1EUttOtRCaCmdlk4v0zPnfs6+uElW9sPO/rLW/i6L7n79JTVh8++jeJQ3fMOuaQRjhIBLCYCEUCXDTHbfGSNQcYzluL/9y45B8MZuRKmG4H4P+XX1CrhAlZAYEAZuWeqEOMNcQCWqFOEaRjmvUeRMeCsP+6svzmh8HFu3umztmDEpuERc5kBKwzU75+2LgRhl4Z+9qgyhKEuGsCiSzcEIm09ehBIQ7a0dX715QUgkkOqBciaysjTMikSRRs4blyfNztT+N99rFDaeHs92nLNh8cP9ZwjjD251aZwJNa9CIsEQxSUCjRKNYtrwsEYlY5pjTX/xsVhf2c9la25h+e4qE2hxoX316jlq60AookQSJDQTs1wARpqpG4YmwohVQlim3/TR/Mz7N27Z40H5oOe75s13JwhCVCCECQDGQkqkQ+DpcWpILtP+iJkl0BG2DHeyDp0pE+j+H//u/bf30fUZx9ME4tSgCioRSIXlTBotb7RdhafVP2uHw4JQBz69MweW8arXZ8+fray/tjCeuRwIQlglKZOICaXJmxIJzzMUxuL35ycjhltj9MPbN3xD+FhbWV4fxNX21uDa0jQ2sQSpfkc5lwIRwBQTombov0we7bDDMGq16p98NicHB1qqk5ZHgSVJSTRtZjZQyuQFYoWgWcmkFBpRYskoGH+4GlWmL+TRjfculAcng0FhWPJgxLY2XyPfd12j7ukyryQHaVB6ohhlUjVFXvu3nnIiHzOLVtPUs7RdM6avTRY7B81246Kv7zDW7fhK4azktTF8Yd6laaloxlKSoxiw5ZnZKeTD7mxra+XZ/NIUjIwijskw3BlV1CHdboMruxM5MefiYJwqi1DLBE1PiiIrR83W+cV57cG9x5dcjeWZHJzWxsd294ZHSTkTWI3ALAWiBtIbDU5NGjLFHFdXgyS332rXG876xpM8Z33JN/ZOF+YdKuDX1ZcmkbatC12vGICuYcsuTo+p7jlJlAvLGsZDNxxGnpODImw/qtCIkzduDcybny8t//iYYAgPkzApJ68Ep8/7d7/7i7aX3k7LoaKsKEp+2Acg7ZnJV083mzapW1T5FVf5wmxz6qs797/9yXB0l0BnurZ2r+ciTGOVDEdWpSKCV2WWRGF0Zrk1vdsgY56BJRdxWoVpcGV6/vqlLEs9HzDn8e5ZJk1qW4ToFAHjnOuUqBUyPDhgaeQY9bqrKduLIhfDsEpSpxGsPNpcvN5c/fnodQIpCAUDy7ePt49UjmpeQ22gIs0WWlqnaZlEJeyN92SclScn9YlzTsPJXsZbOwnY9tkg/B9MiTQuYO262wAAAABJRU5ErkJggg=="
        val value = Sajin.hardCompare(i1, i2)
        assertEquals(100.0f, value)
    }
}
