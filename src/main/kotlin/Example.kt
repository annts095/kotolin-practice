fun main() {
    val str = "Hello Kotlin."
    displayMessage(str)
    println(countLength(str))
    whenExample(countLength(str))
    printNumber(10)

    // class
    val human = Human("human");
    human.showName()

    val taro = Taro("Taro");
    taro.showName()

    val jiro = Taro("Jiro");
    jiro.showName()

    val greeter = GreeterImpl();
    greeter.hello()

    // List
    val intList = listOf(1, 2, 3)
    println(intList)
    println(intList[1])

    val stringList = listOf<String>("one", "two", "three")
    println(stringList)
    println(stringList[1])

    val mutableList: MutableList<Int> = mutableListOf(1, 2, 3)
    mutableList.add(4)
    println(mutableList)

    // Map
    val map: Map<Int, String> = mapOf(1 to "one", 2 to "two", 3 to "three")
    println(map)
    println(map[2])
    println(map.containsKey(3))
    println(map.containsKey(4))
    val mutableMap: MutableMap<Int, String> = mutableMapOf(1 to "one", 2 to "two", 3 to "three")
    mutableMap[4] = "four"
    println(mutableMap)


    // Set
    val set = setOf("one", "two", "three")
    println(set)
    println(set.contains("three"))
    println(set.contains("four"))
    val mutableSet = mutableSetOf("one", "two", "three")
    mutableSet.add("four")
}

fun countLength(str: String): Int  {
    return str.length
}

fun displayMessage(str: String): Unit {
    println(str)
}

fun whenExample (num: Int): Unit {
    when {
        num < 100 -> {
            println("Less than 100")
        }
        num == 100 -> {
            println("Equal to 100")
        }
        else -> {
            println("Greater to 100")
        }
    }
}

fun printNumber(num: Int) {
    for (i in 1..num) {
        println("number is $i")
    }
}