package com.example.kotlin_learning

interface displayInterface{
    fun display() {
        println("From displayInterface")
    }
}
interface exampleInterface {

    fun demo()
    fun display() {
        println("From exampleInterface")
    }
}
abstract class Person(var name: String) : displayInterface, exampleInterface{

    override fun display() {
        println("Name: $name")
    }
}
class Teacher(name: String, val subject: String): Person(name){

    override fun demo() {
        println("$name teacher teaches $subject")
    }
}

class Player :  exampleInterface, displayInterface{


    override fun demo() {
        println("Demo")
    }

    override fun display() {
        TODO("Not yet implemented")
    }
}


fun main() {
    val p1 = Teacher("Shridevi", "Android Development")
    p1.display()
    p1.demo()
}