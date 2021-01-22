package com.fourcircles.horspool

class Horspool {
    fun shifttable(pattern: String) {
        var i: Int
        var j: Int
        val m: Int
        val p = pattern.toCharArray()
        m = pattern.length
        i = 0
        while (i < SIZE) {
            table[i] = m
            i++
        }
        j = 0
        while (j < m) {
            table[p[j].toInt()] = m - 1 - j
            j++
        }
    }

 fun boyerMooreHorspoolSearch(source: String, pattern: String): Int
    {

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
    companion object {
        var SIZE = 500
        var table = IntArray(SIZE)
        @JvmStatic
        fun main(args: Array<String>) {
            val pos: Int
//            val source = "The cow jumped over the moon. The horse jumped over the fence."
            val source = "Thecowjumpedoverthemoon"
            val pattern = "jumledove"
            val horspoolInstance = Horspool()
            horspoolInstance.shifttable(pattern)
            pos = horspoolInstance.boyerMooreHorspoolSearch(source, pattern)
            if (pos == -1) println("PATTERN NOT FOUND") else println("PATTERN FOUND FROM POSITION: \t$pos\n")
        }
    }
}