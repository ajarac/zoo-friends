package com.testing.animals.application

import com.testing.animals.domain.animal.Animal
import com.testing.animals.domain.animal.Chicken
import com.testing.animals.domain.animal.Dog
import com.testing.animals.domain.animal.Parrot
import org.springframework.stereotype.Repository

@Repository
class RepositoryAnimals() {
    private val listAnimals: ArrayList<Animal> = ArrayList<Animal>();

    final fun addAnimal(animal: Animal) {
        listAnimals.add(animal)
    }

    fun getAnimals(): List<Animal> {
        return listAnimals
    }
}