package com.example.kotlin_learning

fun main(){
    val numRange = 1..10
    println(numRange)

    val chRange = 'a'.rangeTo('z')
    println("Char range: $chRange")
    val i = 10
    println("is 10 available? ${10 in numRange}")

    val oddRange = numRange.step(2)
    println("Odd : $oddRange")

    val reversed = numRange.reversed()
    println("Reversed: $reversed")

    val tenToone = 10.downTo(1)
    println("$tenToone")

    // even numbers between 0 to 10
    val evenRange = 0.rangeTo(10).step(2).reversed()
    println("Even: $evenRange")
    println("Even numbers: ${evenRange.toList()}")
}
