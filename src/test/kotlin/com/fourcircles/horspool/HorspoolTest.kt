package com.fourcircles.horspool

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


class HorspoolTest() {
    private var horspool: Horspool = Horspool()

    @Test
    fun `happy path`() {
        val source = "Test Tooth String. Molar teeth are growing."
        val pattern = "Tooth"
        val returnValue = horspool.boyerMooreHorspoolSearch(source, pattern)
        println("haoopy " + returnValue)
        assert(returnValue == 5)

    }
// Test not hpapy path
    @Test
    fun `not happy path`(){
        val source ="Test Tooth String"
        val pattern = "Molar Teeth"
        var returnValue = horspool.boyerMooreHorspoolSearch(source, pattern)
        println("Not happy Path = $returnValue")

    }

}