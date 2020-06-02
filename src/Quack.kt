interface QuackBehavior {
    fun quack()
}

class Quack : QuackBehavior {
    override fun quack() {
        println("呱呱")
    }
}

class Squeak : QuackBehavior {
    override fun quack() {
        println("把餔把餔")
    }
}

class MuteQuack : QuackBehavior {
    override fun quack() {
        println("不會叫")
    }
}