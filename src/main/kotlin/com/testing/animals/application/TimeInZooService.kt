package com.testing.animals.application

import com.testing.animals.domain.animal.Animal
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TimeInZooService(@Autowired val repositoryAnimals: RepositoryAnimals) {

    fun passOneDay() {
        val animals: List<Animal> = repositoryAnimals.getAnimals()
        makeFriends(animals)
        makeUnFriends(animals)
    }

    private fun makeFriends(animals: List<Animal>) {
        animals.forEach { animal-> animal.makeNewFriend(animals) }
    }

    private fun makeUnFriends(animals: List<Animal>) {
        animals.forEach { animal -> animal.unMakeFriend(animals) }
    }

}