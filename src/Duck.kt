import kotlin.properties.Delegates

abstract class Duck {
    open var flyBehavior by Delegates.notNull<FlyBehavior>()
    open var quackBehavior by Delegates.notNull<QuackBehavior>()

    init {
        performSwim()
    }

    fun performQuack() {
        quackBehavior.quack()
    }

    fun performFly() {
        flyBehavior.fly()
    }

    private fun performSwim() {
        print("What? I'm swimming~~\n")
    }
}
