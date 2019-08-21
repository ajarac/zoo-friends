package com.testing.animals.infrastructure.dto

import com.testing.animals.domain.animal.Parrot

class ParrotDTO(
        val name: String,
        val favoriteFood: String,
        val wingsLength: Float,
        var friends: ArrayList<String>?,
        val canSpeak: Boolean
) {
    companion object {
        fun toEntity(parrot: ParrotDTO): Parrot {
            return Parrot(
                    name = parrot.name,
                    favoriteFood = parrot.favoriteFood,
                    wingsLength = parrot.wingsLength,
                    canSpeak = parrot.canSpeak,
                    friends = parrot.friends ?: arrayListOf()
            )
        }
    }
}