package com.testing.animals.infrastructure.dto

import com.testing.animals.domain.animal.Chicken

class ChickenDTO(
        val name: String,
        val favoriteFood: String,
        val wingsLength: Float,
        var friends: ArrayList<String>?,
        val broiler: Boolean
) {

    companion object {
        fun toEntity(chicken: ChickenDTO): Chicken {
            return Chicken(
                    name = chicken.name,
                    favoriteFood = chicken.favoriteFood,
                    wingsLength = chicken.wingsLength,
                    broiler = chicken.broiler,
                    friends = chicken.friends ?: arrayListOf()
            )
        }
    }
}