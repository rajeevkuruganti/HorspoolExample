package com.fourcircles.horspool

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


class HorspoolTest() {
    private var horspool: Horspool = Horspool()

    @Test
    fun `no pattern`() {
        val source = "Test Tooth String. Molar teeth are growing."
        val pattern = ""
        val returnValue = horspool.boyerMooreHorspoolSearch(source, pattern)
        assert(returnValue == 0)
    }

    @Test
    fun `happy path`() {
        val source = "Test Tooth String. Molar teeth are growing."
        val pattern = "Tooth"
        val returnValue = horspool.boyerMooreHorspoolSearch(source, pattern)
        assert(returnValue == 5)
    }

    @Test
    fun `Multiple words happy path`() {
        var source = "Test tooth String. Molar tooth are growing."
        val pattern = "tooth"
        val resultArray = mutableListOf<Int>()
        var start: Int = 0
        var partialSource = source
        while (start <= source.length) {
            val returnValue = horspool.boyerMooreHorspoolSearch(partialSource, pattern)
            if (returnValue != -1){
                resultArray.add(returnValue+start)
                start = start + returnValue + pattern.length
                partialSource = source.substring(start,source.length)
            } else {
                break
            }
        }
        assert(resultArray.size == 2)
    }




// Test not hpapy path
    @Test
    fun `not happy path`(){
        val source ="Test Tooth String"
        val pattern = "Molar Teeth"
        var returnValue = horspool.boyerMooreHorspoolSearch(source, pattern)
        assert(returnValue == -1)
    }

}