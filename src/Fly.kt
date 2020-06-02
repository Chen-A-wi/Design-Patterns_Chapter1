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

class FlyRocketPowered : FlyBehavior {
    override fun fly() {
        println("I'm flying with a rocket! To Infinity and Beyond~")
    }
}