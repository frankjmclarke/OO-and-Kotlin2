package academy.learnprogramming.oochallenge

import java.math.BigDecimal
import java.util.*


enum class Season {
    SPRING, SUMMER, FALL, WINTER
}

fun main(args: Array<String>) {
    /*
    val kb = KotlinBicycle(3, 3, 11)
    kb.printDescription()
    val kmb = KotlinMountainBike(2, 4, 11, 15)
    kmb.printDescription()
    val krb = KotlinRoadBike(2, 5, 21, 55)
    krb.printDescription()
    val krb2 = KotlinRoadBike(cadence = 2, speed = 21, tireWidth = 55)
    krb2.printDescription()
    val kmb3 = KotlinMountainBike(2, 4, 11, 15, "red")
    kmb3.printDescription()
    kmb.printList()
    KotlinMountainBike.list.forEach { println(it) }

    val range = 1..5
    val rangeRev = 5.downTo(0)
    val rangeStep = range.step(2).reversed()
    val stringRange = "AB".."XY"
    println(3 in range)
    println("Z" in stringRange)

    for (i in rangeStep) {
        println(i)
    }

    for (i in range step 3) {
        println(i)
    }

    for (c in "Hello") println(c)

    for (i in 60 downTo 15 step 5) {
        println(i)
    }

    for (i in 1 until 10) {
        println(i)
    }
    val seasons = arrayOf("spring", "summer", "winter", "fall")
    for (indexY in seasons.indices) {
        println("${seasons[indexY]} is season number $indexY")
    }

    seasons.forEach { println(it) }
    seasons.forEachIndexed { index, value -> println("$value is season number $index")}

    val notASeason = "whatever" !in seasons
    println(notASeason)
//////////////////
    for (i in 1..3) {
        println("i = $i")
        jloop@ for (j in 1..4) {
            println("j = $j")
            for (k in 5..10) {
                println("k = $k")
                if (k == 7) {
                    continue@jloop
                }
            }
        }
    }
   */

    val myCondition = true
    val numx = if (myCondition) 50 else 44
    val num2 = 77

    when {
        numx < num2 -> println("num is less than num2")
        numx > num2 -> println("num is greater than num2")
        else -> println("num = num2")
    }
    when (numx) {
        in 10..111 -> println("num is less than num2")
        200, 77, 50 -> println("num is greater than num2")
        else -> println("num = num2")
    }

    val obj2: Any = BigDecimal(25.2)
    val something: Any = obj2
    val z = when (something) {
        is String -> {
            println(something.toUpperCase())
            1
        }
        is BigDecimal -> {
            println(something.remainder(BigDecimal(10.5)))
            2
        }
        is Int -> {
            println("${something - 22}")
            3
        }
        else -> {
            println("I have no idea what type this is")
            -1
        }
    }
    println(z)

    println(getNumber("22.5") ?: "I can't print the result")

    //for (i in 5..1000 step 5) println(i)
    //for (i in -500..0) println(i)
/*
    var total1 = 0
    var total2 = 1
    var total = 0
    println(total1)
    println(total2)
    for (i in 1..13) {
        total = total1 + total2
        println(total)
        total1 = total2
        total2 = total
    }*/


    // Declare a variable called num (int) and assign it whatever you want

    // Declare a variable called dnum (double) and assign it as follows:
    // if num > 100, assign dnum -234.567
    // if num < 100, assign dnum 4444.555
    // if num == 100, assign dnum 0.0
    // do all of the above (declaring dnum and assigning
    // it) in one statement/expression

    // Then print the value of dnum - separate statement

    var num = 444

    var dnum: Double = 0.0

    when {
        num < 100 -> dnum = 4444.555
        num > 100 -> dnum = -234.567
    }

    var dnum2: Double = when {
        num < 100 -> {
            4444.555
        }
        num > 100 -> {
            -234.567
        }
        else -> {
            0.0
        }
    }
    println(dnum2)
    val employees = listOf(Employee("John", "Smith", 2012),
            Employee("Jane", "Xavier", 2015),
            Employee("Mary", "Johnson", 2020),
            Employee("Zaphod", "Jones", 2002))

    println(employees.maxByOrNull(Employee::lastName)) //member reference
    println(employees.maxByOrNull { e -> e.startYear })
    println(employees.maxByOrNull { it.firstName })

    var numm = 10
    run {
        numm += 15
        println(numm)
    }

    run(::topLevel)
    useParameter(employees, num)

    fun countTo100() =
            StringBuilder().apply() {
                for (i in 1..99) {
                    append(i)
                    append(", ")
                }
                append(100)
            }.toString()


    fun countTo100b(): String {
        val numbers = StringBuilder()
        for (i in 1..99) {
            numbers.append(i)
            numbers.append(", ")
        }
        numbers.append(100)
        return numbers.toString()
    }
    /////////////
    val emptyList = emptyList<String>()
    val notNullList = listOfNotNull("hello", null, "goodbye")
    println(notNullList)

    val array = arrayOf("black", "white", "green")
    val colorList = array.toList()
    val colorList2 = listOf(*array)
    println(colorList)
    println(colorList2)

    val stringList = listOf("spring", "summer", "fall", "summer", "winter")
    val colorList3 = listOf("black", "white", "red", "black", "red", "white")
    val combinedList = colorList3 + stringList
    println(combinedList)

    val noDupsList = colorList3.union(stringList)
    println(noDupsList)

    val noDupColors = colorList3.distinct()
    println(noDupColors)
    ////////Maps//////
    val mutableMap = hashMapOf<String, Car>("John's car" to Car("red", "Range Rover", 2010),
            "Jane's car" to Car("blue", "Hyundai", 2012))
    println(mutableMap.javaClass)
    println(mutableMap)
    mutableMap.put("Mary's car", Car("red", "Corvette", 1965))

    for ((k, v) in mutableMap) { //destructuring declaration
        println(k)
        println(v)
    }
    val pair = Pair(10, "ten")
    val (firstValue, secondValue) = pair

    val car = Car("blue", "Corvette", 1959)//because component1
    val (color, model, year) = car
    ///////sets/////////
    val setInts = setOf(10, 15, 19, 5, 3, -22)
    println(setInts.plus(20).minus(5))//set does not change
    ///////////////sequences////
    val immutableMap = mapOf<Int, Car>(1 to Car("green", "Toyota", 2015),
            2 to Car("red", "Ford", 2016),
            3 to Car("silver", "Honda", 2013),
            17 to Car("red", "BMW", 2015),
            8 to Car("green", "Ford", 2010))
    println("######")
    println(immutableMap.filter { it.value.model == "Ford" }
            .map { it.value.color })
    println(immutableMap.count { it.value.year > 2014 })//any, all, groupby sortedBy{it.year}
    println(immutableMap.toSortedMap())

            val ints = arrayOf(1, 2, 3)
    val addList = ints.map { it + 10 }
    println(addList)
    ////////sequences////////
    println(immutableMap.asSequence().filter { it.value.model == "Ford" }//does not copy entire map
            .map { it.value.color }.toList())//toList is terminal operation
    println("#####")
    listOf("Joe", "Mary", "Jane").asSequence()
            .filter { println("filtering $it"); it[0] == 'J'}
            .map { println("mapping $it"); it.toUpperCase() }
            .toList()
            //.find { it.endsWith('E') }//1st instance
    //////////generics////
    val list: MutableList<String> = ArrayList()
    list.add("Hello")
    printCollection(list)
    val list2= mutableListOf<BigDecimal>(BigDecimal(0.003))
    list2.add(BigDecimal(440.033))
    printCollection(list2)
    list2.printCollection2()

    ///////////functions and erasure/////////////
    val shorts: List<Short?> = listOf(10, 20, 30, 40)
    val floats: List<Float?> = listOf(100.3f, -459.43f)
    convertToInt(shorts)
    append(StringBuilder("String 1"), StringBuilder("String 2"))
    //////reified/////
    val mixedList: List<Any> = listOf("string", 1, BigDecimal(22.5), "fall",
            BigDecimal(-5938.393849))
    val bigDecimalsOnly = getElementsOfType<String>(mixedList)
    for (item in bigDecimalsOnly) {
        println(item)
    }
}
inline fun <reified T> getElementsOfType(list: List<Any>): List<T> {

    var newList: MutableList<T> = mutableListOf()
    for (element in list) {//we know what T is
            if (element is T) {// inline reified means check type inside function
            newList.add(element)//only type T
        }
    }

    return newList

}

fun <T> append(item1: T, item2: T)
        where T: CharSequence, T: Appendable {
    println("Result is ${item1.append(item2)}")
}

fun <T: Number?> convertToInt(collection: List<T>) {
    for (num in collection) {
        println("${num?.toInt()}")
    }
}
fun <T> printCollection(collection: List<T>){
    for (item in collection){
        println(item)
    }
}

fun <T>List<T>.printCollection2(){
    for (item in this){
        println(item)
    }
}



data class Car(val color: String, val model: String, val year: Int) {
/* see component1 above
    operator fun component1() = color
    operator fun component2() = model
    operator fun component3() = year
*/
}

fun topLevel() = println("I'm in a function!")
data class Employee(val firstName: String, val lastName: String, val startYear: Int) {

}

fun findByLastName(employees: List<Employee>, lastName: String) {
    employees.forEach returnBlock@{
        if (it.lastName == lastName) {
            println("Yes, there's an employee with the last name $lastName")
            return@returnBlock
        }
    }

    println("Nope, there's no employee with the last name $lastName")
}

fun useParameter(employees: List<Employee>, num: Int) {
    employees.forEach {
        print(it.firstName)
        print(num)
    }
    println()
    for (emp in employees) {
        print(emp.firstName)
        print(num)
    }
}

fun countTo100() =
        with(StringBuilder()) {
            for (i in 1..99) {
                append(i)
                append(", ")
            }
            append(100)
            toString()
        }

fun getNumber(str: String): Int? {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        null
    } finally {
        println("I'm in the finally block")
    }
}


