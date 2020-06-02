class YellowDuck : Duck() {
    init {
        quackBehavior = Squeak()
        flyBehavior = FlyNoWay()
    }
}