package com.testing.animals.domain.animal

abstract class Bird(
        override val name: String,
        override val favoriteFood: String,
        override var friends: ArrayList<String>,
        open val wingsLength: Float
) : Animal(name, favoriteFood, friends) {
}