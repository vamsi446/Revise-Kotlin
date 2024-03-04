package com.example.kotlin_learning

import java.util.Arrays

fun main(){
    val arr =arrayOf(1,2,3,4,5)
    //returning last expression result - let, run, with
    //let

    var arrSize = arr.let{
        println("Size: ${it.size}")
        it.size
    }

    val updatedFirst = arr.first().let{
        it+1
    }

    println("updated: $updatedFirst")

    //run

    arrSize = arr.run{
        println("Size: $size")
        println("First: ${first()}")
        size

    }

    val last = with(arr) {
        println("Size: $size")
        println("First: ${first()}")
        this[lastIndex] = 0
        this[lastIndex]
    }
    println("Last element: ${arr.last()}")

    // apply - returns same object
    val intArr = IntArray(4).apply {
        for (i in indices){
            this[i] = 10
        }
    }

    println("Array: ${intArr.contentToString()}")

    // also - returns same object
    val anotherArr = IntArray(5).also {
        println("${Arrays.toString(it)}")
    }
}
