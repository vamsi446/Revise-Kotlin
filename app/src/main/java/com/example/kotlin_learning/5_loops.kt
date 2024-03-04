package com.example.kotlin_learning

fun main(){
    val data = arrayOf(1,2,3,4,5,6,7,8,9)

    for (i in data){
        println("Element: $i")
    }

    // while - based on condition
    var counter = 0

    while (counter < 5){
        println("Counter: $counter")
        counter++
    }

    do {
        println("Counter: $counter")
        counter--
    }while (counter > 0)

    // square of all even numbers between 1 to 20

    for (i in (0..20).step(2)){
        println("SQuare of $i : ${i * i}")
    }

    // generate tables of numbers between 23 to 27
    // nested loops
    for (num in 23..27){

        println("Table of $num:")
        for (i in 1..10){
            println(num * i)
        }
        println("------")
    }

    // loop control statements - break, continue

    val msg = "Hi! Hello! how are you?"
    for (ch in msg){

        if (ch == '!')
        {
            println("continue loop")
            //break
            continue
        }
        println("Char: $ch")
    }

    println("DONE")
}