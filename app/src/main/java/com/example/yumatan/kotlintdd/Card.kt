package com.example.yumatan.kotlintdd

class Card(suit: Suit, rank: Rank) {

    val suit = suit
    val rank = rank
}

enum class Suit {
    Heart
}

enum class Rank {
    Three
}