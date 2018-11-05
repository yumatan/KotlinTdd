package com.example.yumatan.kotlintdd

class Card(suit: Suit, rank: Rank) {

    val suit = suit
    val rank = rank
}

enum class Suit {
    Spade,
    Heart,
    Club,
    Diamond
}

enum class Rank {
    One,
    Two,
    Three,
    Four,
    Five,
    Six,
    Seven,
    Eight,
    Nine,
    Ten,
    Jack,
    Queen,
    King
}