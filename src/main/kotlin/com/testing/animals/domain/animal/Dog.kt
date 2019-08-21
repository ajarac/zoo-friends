package com.testing.animals.domain.animal

data class Dog(
        override val name: String,
        override val favoriteFood: String,
        override var friends: ArrayList<String>,
        val dogType: String
) : Animal(name, favoriteFood, friends) {
}
