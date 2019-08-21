package com.testing.animals.infrastructure.dto

import com.testing.animals.domain.animal.Dog

class DogDTO(
        val name: String,
        val favoriteFood: String,
        var friends: ArrayList<String>?,
        val dogType: String
) {
    companion object {
        fun toEntity(dog: DogDTO): Dog {
            return Dog(
                    name = dog.name,
                    favoriteFood = dog.favoriteFood,
                    dogType = dog.dogType,
                    friends = dog.friends ?: arrayListOf()
            )
        }
    }
}