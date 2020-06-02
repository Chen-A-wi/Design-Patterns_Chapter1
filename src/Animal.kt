class Dog : Animal() {
  override fun makeSound() {
    bark()
  }

  private fun bark() {
    println("汪汪")
  }
}

class Cat : Animal() {
  override fun makeSound() {
    meow()
  }

  private fun meow() {
    println("喵喵")
  }
}

abstract class Animal {
  abstract fun makeSound()
}

fun main() {
  val animalD: Animal = Dog()
  animalD.makeSound()

  val animalC: Animal = Cat()
  animalC.makeSound()
}
