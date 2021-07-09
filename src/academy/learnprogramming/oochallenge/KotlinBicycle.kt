package academy.learnprogramming.oochallenge

open class KotlinBicycle(var cadence: Int, var gear: Int = 3, var speed: Int) {
    fun applyBrake(decrement: Int) {
        speed -= decrement;
    }

    fun speedUp(increment: Int) {
        speed += increment;
    }

    open fun printDescription() {
        println("Gear $gear, Cadence $cadence, Speed $speed")
    }
}

class KotlinMountainBike(var seatHeight: Int, cadence: Int, gear: Int, speed: Int) : KotlinBicycle(cadence, gear, speed) {
    constructor(seatHeight: Int, cadence: Int, gear: Int, speed: Int, color: String) :
            this(seatHeight, cadence, gear, speed) {
        println("Color: $color")
    }
    companion object {
        val list = listOf("yellow","green", "blue")
    }

    fun printList() {
        println("list $list")
    }

    override fun printDescription() {
        println("Seat height $seatHeight, Gear $gear, Cadence $cadence, Speed $speed")
    }
}

class KotlinRoadBike(cadence: Int, gear: Int = 3, speed: Int, val tireWidth: Int) : KotlinBicycle(cadence, gear, speed) {
    override fun printDescription() {
        super.printDescription()
        println("Tire width $tireWidth")
    }
}

fun test() {
    var kb = KotlinBicycle(2, 3, 11)
    kb.printDescription()
}




