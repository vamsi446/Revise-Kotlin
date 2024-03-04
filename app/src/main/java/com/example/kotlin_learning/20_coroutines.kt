package com.example.kotlin_learning

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.cancel
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.lang.Math

private fun add1(a: Int, b:Int): Int{
    println("Add executed by: ${Thread.currentThread().name}")
    println("$a + $b: ${a+b}")
    return a + b
}

private fun subtract(a: Int, b: Int): Int {
    println("Subtract executed by: ${Thread.currentThread().name}")
    println("$a - $b: ${a-b}")
    return a - b
}
fun main() {

    // launch, async, - coroutine builder
    // runBlocking - to create main coroutine, which waits for child coroutines

    runBlocking {
        // parent/main coroutine
//        val res = add(10 ,20)
//        println("Add: $res")
//        val sub = subtract(20,10)
//        println("Sub: $sub")
//        println("runBlocking: executed by ${Thread.currentThread().name}")

        tryDiffDispatchers()

        // launch child coroutine
        val j1 = launch(){
            // child coroutine
            delay(2000) // suspending
            val res = add1(10 ,20)
            println("Add: $res")
        }

        val j2 = launch {
            delay(1000) // suspending
            val sub = subtract(20,10)
            println("Sub: $sub")
        }

        println("Jobs are executing..")

        // start new job after j1 and j2 finished
        j1.join() // suspended
        println("J1 job finished")
        j2.join()
        println("J2 job done")

//        launch {
//            println("Started new job")
//            val num = getRandom()
//            println("Random NO: $num")
//        }

        val num = async {
            getRandom()
        }

        println("do somthing")
        val randomNo = num.await() // suspends until result is available
        println("Random NO: $randomNo")
        // start next job taking number
        println("Starting job with $randomNo ")

        // nested coroutines
        val job = launch {

            //create child coroutine
            val num1 = async { getRandom() }
            // child coroutine
            launch {
                delay(2000)
                println("SEcond child coroutine")
            }
            println("NO: ${num1.await()}")
        }

        if(true) {
            job.cancel("trial") // cancellation for child coroutine
        }
        job.join()
        println("Parent coroutine done")
        for (i in 1..10_000){
            launch {
                print("*")
            }
        }
    }




    println("--DONE --")


}

// co-routine
suspend fun getRandom(): Int {
    println("Calcualting..")
    delay(3000)
    val num = (Math.random() * 100).toInt()
    return num
}

suspend fun tryDiffDispatchers() {

    coroutineScope {
        launch {
            println("Main runblocking : ${Thread.currentThread().name}")
            delay(2000)
            println("After delay Main runblocking : ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Default) {
            println("Default : ${Thread.currentThread().name}")
            delay(2000)
            println("After delay Default : ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Unconfined) {
            println("UnConfined : ${Thread.currentThread().name}")
            delay(2000)
            println("After delay Unconfined : ${Thread.currentThread().name}")
        }

        launch(Dispatchers.IO) {
            println("IO : ${Thread.currentThread().name}")
            delay(2000)
            println("After delay IO : ${Thread.currentThread().name}")
        }
    }
}

