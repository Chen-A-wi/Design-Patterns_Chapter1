class MallardDuck : Duck() {
    override fun quack() {
        print("呱呱")
    }

    override fun swim() {
        print("What?!I'm swimming~~")
    }

    override fun display() {
        print("我是綠頭鴨")
    }

    override fun fly() {
        print("I believe i can fly")
    }
}

fun main() {
    val mallardDuck = MallardDuck()
    mallardDuck.display()
}