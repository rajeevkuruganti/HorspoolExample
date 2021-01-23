package com.fourcircles.horspool

class Horspool {


    fun boyerMooreHorspoolSearch(source: String, pattern: String): Int {

        val patt = pattern.toCharArray()
        val patternLength: Int = patt.size
        if (patternLength == 0) {
            return 0
        }
        val src = source.toCharArray()
        val srcLength: Int = src.size

        var shift = IntArray(200) { patternLength }
        for (k in 0..(patternLength - 2)) {
            shift[patt[k].toInt()] = patternLength - 1 - k
        }

        var i = 0
        var j: Int
        while ((i + patternLength) <= srcLength) {
            j = patternLength - 1
            while (source[i + j] == patt[j]) {
                j -= 1
                if (j < 0) {
                    return i
                }
            }
            i += shift[src[i + patternLength - 1].toInt()]
        }
        return -1
    }
}