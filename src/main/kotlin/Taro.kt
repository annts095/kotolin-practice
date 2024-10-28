class Taro(private val name: String) : Human(name) {
    override fun showName() {
        if (name == "Taro") {
            println("Yes, Iam Taro");
        } else {
            println("No, Iam Taro");
        }
    }
}