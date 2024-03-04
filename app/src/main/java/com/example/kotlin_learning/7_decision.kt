package com.example.kotlin_learning

fun main(){
    val num =10


    if(num%2==0){
        println("$num is even")
    }
    else{
        println("$num is odd")
    }
    val num2 = 100

    val max= if(num>num2) num else num2

    println("Max: $max")
    val max1 = if(num>num2){
        println("$num is max")
        num
    }else{
        println("$num2 is max")
        num2
    }
    println("MAX: $max1")

    val marks:Any =80

    when(marks){
        is String -> println("Invalid marks")
        100-> println("Excellent")
        in 75..100 ->{
            println("Distinction")
        }
        in 65..75 ->println("First Class")
        in 55..65 -> println("Second Class")
        in 35..55-> println("Third class")
        else-> println("Failed")
    }
    // chain of if-else-if
    /*if condition 1
      else if condition 2
            else if condition 3
    *
    * */


    val str1 = "Hello"
    var str2 = "Hello"
    var str3 = "HELLO"
    //str2 = str1
    str2 = str1.toUpperCase()

    if (str3 === str2)
        println("Same")
    else
        println("Different")

}
