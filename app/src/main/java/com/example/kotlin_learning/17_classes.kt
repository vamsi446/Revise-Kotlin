package com.example.kotlin_learning

class Math(){
    var result: Int = 0
        get() {
            return field
        }
        set(value) {

            field = value + 10
        }


    infix fun square(a: Int): Int{
        return a * a
    }

}

data class Pointer(var x: Int, var y: Int){

    // operator ovreloading
    operator fun plus(another: Pointer): Pointer{
        val resultX = this.x + another.x
        val resultY = this.y + another.y
        return Pointer(resultX, resultY)
    }



}

enum class CardType {
    SILVER, GOLD, PLATINUM
}

fun displayCard(type: CardType){
    when(type){
        CardType.GOLD -> println("Gold")
        CardType.PLATINUM -> println("Platinum")
        CardType.SILVER -> println("Silver")
    }
}

fun main() {
    val m1 = Math()
    m1.result = 20
    println("${m1.result}")

    m1.square(4)

    println("${m1 square 10}")

    val p1 = Pointer(10, 20)
    val p2 = Pointer(10, 20)

    val p3 = p1 + p2 // p1.plus(p2)
    println(p3)

    displayCard(CardType.GOLD)
}