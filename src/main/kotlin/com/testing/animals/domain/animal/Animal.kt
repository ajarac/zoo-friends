package com.testing.animals.domain.animal

import com.testing.animals.infrastructure.utils.RandomGenerator

abstract class Animal(
        open val name: String,
        open val favoriteFood: String,
        open var friends: ArrayList<String>
) {

    fun makeNewFriend(animals: List<Animal>) {
        val newFriends: List<Animal> = animals.filter { animal -> !friends.contains(animal.name) }.filter { animal -> animal.name != name }
        if (newFriends.isNotEmpty()) {
            val newFriend: Animal = RandomGenerator.getRandomItem(newFriends)
            friends.add(newFriend.name)
            newFriend.friends.add(name)
        }
    }

    fun unMakeFriend(animals: List<Animal>) {
        val list: List<Animal> = animals.filter { animal -> friends.contains(animal.name) }
        if (list.isNotEmpty()) {
            val newUnfriendly: Animal = RandomGenerator.getRandomItem(list)
            friends.remove(newUnfriendly.name)
            newUnfriendly.friends.remove(name)
        }
    }
}
