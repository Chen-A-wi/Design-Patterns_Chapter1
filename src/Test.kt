fun main() {
    print("I'm MallardDuck\n")
    val mallardDuck = MallardDuck()
    mallardDuck.performQuack()
    mallardDuck.performFly()

    println("-------------------------------")

    print("I'm yellowDuck\n")
    val yellowDuck = YellowDuck()
    yellowDuck.performQuack()
    yellowDuck.performFly()

    println("-------------------------------")

    print("I'm modelDuck\n")
    val modelDuck = ModelDuck()
    modelDuck.performFly()
    modelDuck.flyBehavior = FlyRocketPowered()
    modelDuck.performFly()
}