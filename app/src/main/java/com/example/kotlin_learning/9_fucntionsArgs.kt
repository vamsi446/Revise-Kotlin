package com.example.kotlin_learning

fun main(){
    var res = sum(10 ,20)
    println("addition: $res")

    displayInfo("Shridevi", 20, "Bangalore")
    displayInfo(city = "Pune", name = "John", age = 20)
    displayInfo("Merry", city = "Mumbai", age = 24)

    calculateEMI(1000, 20, 24,  0)
    calculateEMI(1000, xyz = 0)
    calculateEMI(1000, duration = 24, xyz = 0)

    joinNames()
    joinNames("john", "merry", "robert", "mike", delimiter = "-")
    joinNames("john", "merry")
}
fun sum(a: Int, b : Int) = a + b

//2. named argumnets
fun displayInfo(name: String, age: Int, city: String?) {
    println("Name: $name")
    println("Age: $age")
    println("City: ${city?.toUpperCase()}")
}

//3. default arguments/ optional args - can have multiple
// alternative for functional overloading
// good practice - place default args after required
fun calculateEMI(amount: Int, rate:Int = 10, duration:Int = 12, xyz: Int){
    println("Amount: $amount")
    println("Rate: $rate")
    println("Duration: $duration")

    val emi = amount * rate/100/duration
    println("EMI: $emi")
}

//4. variable length args; ONLY One
// good practice - place variable args after required
fun joinNames(vararg names: String, delimiter: String="*"){
    println("No. of args: ${names.size}")
    var result = ""
    for (s in names){
        result += s
        result += delimiter
    }
    println("Joined: $result")
}