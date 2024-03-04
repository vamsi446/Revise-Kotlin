package com.example.kotlin_learning

//definition

//class Employee{
//    // data members
//    var firstName = ""
//    var lastName = ""
//    val salary = 1000 // read-only
//
//    // methods
//    fun displayInfo(){
//        println("Name: $firstName $lastName")
//        println("Salary: $salary")
//    }
//
//}

class Employee(var firstName:String, var lastName: String, var salary:Int = 1000){

    var bonus = 100

    private var city = ""

    // secondary constructor
    constructor(fName: String, lName: String, salary: Int, bonus:Int) :
            this(fName, lName, salary) {
        println("Secondary construction done")
        this.bonus = bonus
    }

    constructor(fName: String, lName: String, salary: Int, bonus: Int, city:String) :
            this(fName, lName, salary, bonus){
        this.city = city
        //this.bonus = bonus
    }

    companion object Test{
        var empCount = 0
    }

    init {
        println("Init executed")
        ++empCount
    }

    fun displayInfo(){
        println("Name: $firstName $lastName")
        println("Salary: $salary")
        println("Bonus: $bonus")
    }
}

// extension function to add method applyBonus
// cannot access private properties

fun Employee.applyBonus(){
    this.salary += this.bonus
}

// via extension static method
fun Employee.Test.displayCount(){
    println("Total Employees: $empCount")
}


fun main() {
    val emp1 = Employee("Merry", "Rose", 2000)
    emp1.displayInfo()
//    emp1.firstName = "John"
//    emp1.lastName = "Smith"

    val emp2 = Employee("John", "Smith")
    emp2.displayInfo()

    val emp3 = Employee("Mike", "Tyson", 2000, 200)
    emp3.displayInfo()

    val emp4 = Employee("Robert", "Laidlaw", 1500, 1500,"New York")

    emp4.applyBonus()
    emp4.displayInfo()

    Employee.displayCount()
    //println("Count: ${Employee.empCount}")


}

/*

Single
        A -> B
Hierarchical
        A -> B
        A -> C
multilevel
        A -> B -> C
multiple (Not in JAVa and Kotlin)
        A, C -> B

*/