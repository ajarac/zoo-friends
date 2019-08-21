package com.testing.animals.domain.animal

data class Chicken(
        override val name: String,
        override val favoriteFood: String,
        override val wingsLength: Float,
        override var friends: ArrayList<String>,
        val broiler: Boolean
) : Bird(name, favoriteFood, friends, wingsLength) {
}
