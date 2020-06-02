class ModelDuck : Duck() {
    init {
        flyBehavior = FlyNoWay()
        quackBehavior = MuteQuack()
    }
}