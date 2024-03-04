package com.example.kotlin_learning

import kotlin.concurrent.thread

private fun add2(a: Int, b:Int): Int{
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
    println("Hello from ${Thread.currentThread().name}")

    val t1 = thread (start = false, name = "First Thread") {
        // long running task to perform in this thread
        // download data from server
        Thread.sleep(2000) //blocking thread
        val res = add2(10,20)
        println("Addition: $res")
    }

    val t2 = thread(name = "Subtraction") {
        // uploading to server
        Thread.sleep(1000)
        val res = subtract(20, 10)
        println("Subtraction: $res")
    }

    println("Starting t1")
    t1.start()

    // wait for secondary threads
    //is t1 Done
    t1.join(10000) // wait download to finish

    println("T1 finished")
    t2.join()
    println("T2 done")

    for (i in 1..10_000){
        thread {
            Thread.sleep(1000)
            print("*")
        }
    }

}