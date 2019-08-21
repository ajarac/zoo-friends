package com.testing.animals.infrastructure.utils

class RandomGenerator {

    companion object {
        fun <T> getRandomItem(list: List<T>): T {
            val index: Int = getRandomIntWithSkip(max = list.size - 1)
            return list[index]
        }

        private fun getRandomIntWithSkip(max: Int): Int {
            return (0..max).shuffled().first()
        }
    }

}