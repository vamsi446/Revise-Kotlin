package com.example.kotlin_learning

import java.util.Arrays

fun main(){
    var data = arrayOf(1,2,3,4,5,6)
    println("No of elements: ${data.size}")
    println("First element: ${data.first()}")
    println("Last element: ${data[data.lastIndex]}") // data.last()
    println("element at index 2: ${data[2]}")
    println("element: ${data[0]}")

    data[0] = 10
    println("Array: ${Arrays.toString(data)}")

    var numberArray = Array(4){0}
    numberArray[0] = 12

    println("Array: ${numberArray.contentToString()}") // Array<Int> => Integer[]

    var arr = IntArray(4) // IntArray -> int[]

    println("Int arr: ${arr.contentToString()}")

    numberArray = arr.toTypedArray()
    arr = numberArray.toIntArray()

}
