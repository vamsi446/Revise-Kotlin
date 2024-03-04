package com.example.kotlin_learning

fun main(){
    println("Hello World");
    println("kotlin is multiplatform language.")

    var username = "shridevi"
    var address: String
    address = "Bangalore"
    username = "Vamsi Revuri"

    println("Username : $username")
    println("Address: $address")
    val pi = 3.142
    println("PI: $pi")
    val p: Float = 12.3456F
    println("p: $p")
    val pChar = '-'
    var number = 1_000
    println(number)

    val division = number/pi
    println("Division: $division")
    val remainder = (number%pi).toInt()
    println("Remainder: $remainder")


    number +=10
    number++
    ++number

    println("updated: $number")
    println("${number %3}")

    val delimiter = 'A'
    println("${delimiter.toInt()}")
    println("ASCII of '-': ${104.toChar()}")

    val isEven = true
    println("Inverted value: ${!isEven}")
}