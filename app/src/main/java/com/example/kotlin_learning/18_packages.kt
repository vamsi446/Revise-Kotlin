package com.example.kotlin_learning

import com.example.kotlin_learning.demo.Student
import com.example.kotlin_learning.demo.counter
import com.example.kotlin_learning.demo.calculate as cal
import com.example.kotlin_learning.xyz.calculate as cal2
import com.example.kotlin_learning.demo.calculate as squareMe
import java.math.BigInteger
import kotlin.math.PI

val area = 10 * PI
val myCounter = counter + 10

fun main() {
    println("Area: $area")
    println("Counter: $myCounter")
    cal()
    val std = Student()
    cal2()

    println("SQuare: ${squareMe(10)}")
    println("Factorial: ${factorial(123)}")
}

// define factorial function using BigInteger
fun factorial(num: Int): BigInteger {

    var fact = BigInteger("1")
    for (i in 1..num){
        fact = fact * i.toBigInteger()
    }
    return fact
}