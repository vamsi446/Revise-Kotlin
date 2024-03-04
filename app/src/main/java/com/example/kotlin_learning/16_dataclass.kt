package com.example.kotlin_learning

data class KotlinVehicle(val speed: Int, val make: String)
//internal class Vehicle1 {
//    var speed = 0
//    var make: String? = null
//
//    override fun toString(): String {
//        return "Vehicle1{" +
//                "speed=" + speed +
//                ", make='" + make + '\'' +
//                '}'
//    }
//}

fun main() {

    val v1 = KotlinVehicle(100, "Hundai Sonata")
    val v2 = KotlinVehicle(100, "Hundai Sonata")
    //val v2 = KotlinVehicle(80, "Maruti")

    println(v1)

    if(v1 === v2){
        println("Same")
    }
    else println("Different")
}