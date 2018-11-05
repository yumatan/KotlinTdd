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
        var card: Card?
        card = Card(Suit.Heart, Rank.Three)
        assertEquals(Suit.Heart, card.suit)
        assertEquals(Rank.Three, card.rank)

        card = Card(Suit.Spade, Rank.Jack)
        assertEquals(Suit.Spade, card.suit)
        assertEquals(Rank.Jack, card.rank)
    }
}
