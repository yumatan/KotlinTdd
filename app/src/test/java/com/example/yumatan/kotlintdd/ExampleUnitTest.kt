package com.example.yumatan.kotlintdd

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testInitializeCard() {
        val card1 = Card(Suit.Heart, Rank.Three)
        assertEquals(card1.suit, Suit.Heart)
        assertEquals(card1.rank, Rank.Three)

        val card2 = Card(Suit.Spade, Rank.Jack)
        assertEquals(card2.suit, Suit.Spade)
        assertEquals(card2.rank, Rank.Jack)
    }
}
