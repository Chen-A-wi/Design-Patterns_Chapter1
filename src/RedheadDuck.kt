class RedheadDuck : Duck() {
    override fun quack() {
        print("呱呱")
    }

    override fun swim() {
        print("What?!I'm swimming~~")
    }

    override fun display() {
        print("我是紅頭鴨")
    }
}

fun main() {
    val redheadDuck = RedheadDuck()
    redheadDuck.display()
}