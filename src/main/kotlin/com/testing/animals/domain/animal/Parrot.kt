package com.testing.animals.domain.animal

data class Parrot(
        override val name: String,
        override val favoriteFood: String,
        override val wingsLength: Float,
        override var friends: ArrayList<String>,
        val canSpeak: Boolean
) : Bird(name, favoriteFood, friends, wingsLength) {
}