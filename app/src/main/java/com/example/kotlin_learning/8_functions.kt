package com.example.kotlin_learning

fun main(){
    val c =add(10, 20)
    customPrint("main", "Addition: $c")

    val joined = add("Good", "Morning")
    println("Joined: $joined")

    val sum = add(1.23, 10.23)
    println("Sum : $sum")

    displayName("Shridevi")
    displayName(null)

}
fun add(a: String, b: String) : String {
    return a + b
}
fun add(a:Int, b:Int):Int{
    val res = a + b
    //println("$a + $b = $res")
    customPrint("add", "$a + $b = $res")
    return res

}
fun customPrint(methodName: String, msg: String){
    println("[$methodName]: $msg")
}
fun add(a: Double, b:Double) = a + b

fun displayName(name: String?){
    // println("Name: ${name?.toUpperCase()}")
    println("NAme: ${ name?.toUpperCase() ?: ' ' }")
}