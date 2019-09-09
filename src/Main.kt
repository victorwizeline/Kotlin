import java.lang.Math.random

fun main() {

//////////////////
//    BASICS    //
//////////////////

//    Null safety
//    val message: String = "Hello World!"

//    Not valid
//    var message: String = "Hello World!"
//    message = null

//    Nullable
//    var message: String? = "Hello World!"

//    Valid
//    var message: String? = "Hello World!"
//    message = null

//    Null at start
//    var message: String? = null

//    Not valid
//    var message: String? = null
//    message.length

//    Valid
//    var message: String? = null
//    message?.length

//    Valid but not recommended
//    var message: String? = null
//    message!!.length

//    Validation with IF
//    var message: String? = null
//    if (message != null) {
//        message.length
//    }

//    Not strongly typed
//    val value = 1

//    Strongly typed
//    val value: Int = 1

//    Not strongly typed
//    val value = "Hello World"

//    Strongly typed
//    val value: String = "Hello World"


///////////////////
//    CLASSES    //
///////////////////

//    Class
//    class MyClass {
//    }

//    Without brackets
//    class MyClass

//    New instance
//    class MyClass
//    val myClass = MyClass()

//    With params
//    class MyClass(type: String)
//    class MyClass(var type: String)
//    class MyClass(val type: String)
//    class MyClass(private val type: String)
//    class MyClass(private val type: String = "Class Type")

//    Params "constructor scope"
//    class MyClass(type: String) {
//        private val name = "Class $type"
//    }

//    Params "init scope"
//    class MyClass(type: String) {
//        private val name: String
//        init {
//            name = "Class $type"
//        }
//    }

//    Params "constructor scope"
//    class MyClass {
//        private val name: String
//        constructor(type: String) {
//            name = "Class $type"
//        }
//    }

//    Data class
//    data class MyClass(val type: String)

//    New instance
//    val myClass = MyClass(
//        "Class Type"
//    )

//    With name field
//    val myClass = MyClass(
//        type = "Class Type"
//    )

//    Default value
//    data class MyClass(
//        val type: String = "Class Type"
//    )

/////////////////////
//    FUNCTIONS    //
/////////////////////

//    Functions
//    fun sayHelloWorld() {
//        println("Hello World")
//    }

//    Inline
//    fun sayHelloWorld() = println("Hello World")

//    Params
//    fun say(message: String) {
//        println(message)
//    }

//    Params and default value
//    fun say(message: String = "Hello World") {
//        println(message)
//    }

//    Return
//    fun sum(a: Int, b: Int): Int {
//        return a + b
//    }

//    Inline return
//    fun sum(a: Int, b: Int): Int = a + b
//    fun sum(a: Int, b: Int) = a + b

//    Inside functions
//    fun outside() {
//        fun inside() {
//        }
//        inside()
//    }

//////////////////////
//    INTERFACES    //
//////////////////////

//    Interface
//    interface Drinkable

//    Implementation
//    class Coffee : Drinkable

//    With methods
//    interface Drinkable {
//        fun drink()
//    }
//    class Coffee : Drinkable {
//        override fun drink() {
//            println("So tasty")
//        }
//    }

//    Executed inside interface
//    interface Drinkable {
//        fun drink() {
//            println("So tasty")
//        }
//    }
//    class Coffee : Drinkable

//    Override variable
//    interface Drinkable {
//        val type: String
//    }
//    class Coffee : Drinkable {
//        override val type = "Coffee"
//    }

//    Interface and open class
//    open class Coffee
//    interface Drinkable {
//        fun drink()
//    }
//    class Cappuccino : Coffee(), Drinkable {
//        override fun drink() {
//            println("So tasty")
//        }
//    }

//    Interface and open class with same functions
//    open class Coffee {
//        open fun drink() = println("So coffee")
//    }
//    interface Drinkable {
//        fun drink() = println("So tasty")
//    }
//    class Cappuccino : Coffee(), Drinkable {
//        override fun drink() {
//            super<Coffee>.drink()
//            super<Drinkable>.drink()
//        }
//    }

//////////////////////////////
//    CONTROL STRUCTURES    //
//////////////////////////////

//    IF
//    val a = random()
//    val b = random()
//    if (a > b) {
//        println("A is greater than b.")
//    }

//    IF - ELSE
//    val a = random()
//    val b = random()
//    if (a > b) {
//        println("A is greater than b.")
//    } else {
//        println("A is not greater than b.")
//    }

//    IF - ELSE IF - ELSE
//    val a = random()
//    val b = random()
//    if (a > b) {
//        println("A is greater than b.")
//    } else if (a == b) {
//        println("A is equal to b.")
//    } else {
//        println("A is less than b.")
//    }

//    For
//    val message = "Hello World!"
//    for (character in message) {
//        println(character)
//    }

//    With range
//    for (number in 0..10) {
//        println(number)
//    }

//    Iterating array
//    val array = arrayOf("Hello", "World!")
//    for (item in array) {
//        println(item)
//    }

//    When
//    val sugarCubes = 0
//    when (sugarCubes) {
//        0 -> println("The right way to drink coffee")
//        1 -> println("It is a sin, but I can ignore")
//        else -> println("It is an unforgivable sin!")
//    }

//    val sugarCubes = 0
//    when (sugarCubes) {
//        0 -> println("The right way to drink coffee")
//        1, 2 -> println("It is a sin, but I can ignore")
//        else -> println("It is an unforgivable sin!")
//    }

//    With range
//    val sugarCubes = 0
//    when (sugarCubes) {
//        0 -> println("The right way to drink coffee")
//        1, 2 -> println("It is a sin, but I can ignore")
//        in 3..5 -> println("Is it a kind of candy???")
//        else -> println("It is an unforgivable sin!")
//    }

//    While
//    var sugarCubes = 10
//    while (sugarCubes > 0) {
//        sugarCubes--
//    }
//    println(sugarCubes)

//    Do while
//    var sugarCubes = 10
//    do {
//        sugarCubes--
//    } while (sugarCubes > 0)
//    println(sugarCubes)

/////////////////////////////
//    KOTLIN EXTENSIONS    //
/////////////////////////////

//    Let
//    var message: String? = null
//    message?.let {
//        it.length
//    }

//    For until
//    for (number in 0 until 10) {
//        println(number)
//    }

//    For step
//    for (number in 0..10 step 3) {
//        println(number)
//    }

//    For downTo
//    for (number in 10 downTo 0) {
//        println(number)
//    }

//    For withIndex
//    val array = arrayOf("Hello", "World!")
//    for ((index, item) in array.withIndex()) {
//        println("$index $item")
//    }

//    ForEach
//    val array = arrayOf("Hello", "World!")
//    array.forEach {
//        println(it)
//    }

//    Create a new extension
//    fun String.log() {
//        print(this)
//    }
//    val array = arrayOf("Hello", "World!")
//    array.forEach {
//        it.log()
//    }

}
