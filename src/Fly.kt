interface FlyBehavior {
    fun fly()
}

class FlyWithWings : FlyBehavior {
    override fun fly() {
        println("I believe i can fly")
    }
}

class FlyNoWay : FlyBehavior {
    override fun fly() {
        println("I can't fly")
    }
}