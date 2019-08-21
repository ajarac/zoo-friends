package com.testing.animals.infrastructure.controllers

import com.testing.animals.application.RepositoryAnimals
import com.testing.animals.application.TimeInZooService
import com.testing.animals.domain.animal.Animal
import com.testing.animals.domain.animal.Chicken
import com.testing.animals.domain.animal.Dog
import com.testing.animals.domain.animal.Parrot
import com.testing.animals.infrastructure.dto.ChickenDTO
import com.testing.animals.infrastructure.dto.DogDTO
import com.testing.animals.infrastructure.dto.ParrotDTO
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/animals")
class AnimalController(
        @Autowired private val repositoryAnimals: RepositoryAnimals,
        @Autowired private val timeInZooService: TimeInZooService
) {

    @GetMapping("")
    fun getAllAnimals(): List<Animal> {
        return repositoryAnimals.getAnimals()
    }

    @GetMapping("/day")
    fun passOneDay(): List<Animal> {
        timeInZooService.passOneDay()
        return repositoryAnimals.getAnimals()
    }

    @PostMapping("/chicken")
    fun createAnimal(@RequestBody chickenDTO: ChickenDTO): Chicken {
        val animal: Chicken = ChickenDTO.toEntity(chickenDTO)
        return saveAnimal<Chicken>(animal)
    }

    @PostMapping("/dog")
    fun createAnimal(@RequestBody dog: DogDTO): Dog {
        val animal: Dog = DogDTO.toEntity(dog)
        return saveAnimal<Dog>(animal)
    }

    @PostMapping("/parrot")
    fun createAnimal(@RequestBody parrot: ParrotDTO): Parrot {
        val animal: Parrot = ParrotDTO.toEntity(parrot)
        return saveAnimal<Parrot>(animal)
    }

    private fun <T: Animal> saveAnimal(animal: T): T {
        repositoryAnimals.addAnimal(animal)
        return animal
    }
}