package com.testing.animals.infrastructure.data

import com.testing.animals.application.RepositoryAnimals
import com.testing.animals.domain.animal.Chicken
import com.testing.animals.domain.animal.Dog
import com.testing.animals.domain.animal.Parrot
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AnimalData(@Autowired private val repositoryAnimals: RepositoryAnimals) {
    init {
        repositoryAnimals.run {
            addAnimal(Dog(name = "Killian", favoriteFood = "Meat", dogType = "Hunting dog", friends = arrayListOf()))
            addAnimal(Parrot(name = "Parrot One", favoriteFood = "Grain", wingsLength = 0.25f, canSpeak = false, friends = arrayListOf()))
            addAnimal(Chicken(name = "Chicken one", favoriteFood = "Corn", wingsLength = 0.75f, broiler = true, friends = arrayListOf()))
            addAnimal(Dog(name = "Rocky", favoriteFood = "Fresh meat", dogType = "Working dog", friends = arrayListOf()))
            addAnimal(Parrot(name = "Parrot two", favoriteFood = "Corn", wingsLength = 0.5f, canSpeak = true, friends = arrayListOf()))
            addAnimal(Dog(name = "Peter", favoriteFood = "Pedigree", dogType = "Sport dog", friends = arrayListOf()))
            addAnimal(Chicken(name = "Rocky2", favoriteFood = "Corn", wingsLength = 0.75f, broiler = false, friends = arrayListOf()))
        }
    }
}