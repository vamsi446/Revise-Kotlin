package com.example.kotlin_learning

open class EmployeeBase(var name: String, var salary: Int){

    open val bonus = 100

    companion object{
        var empCount = 0
    }

    init {
        println("Init of Employee")
        empCount++
    }

    open fun displayInfo(){
        println("Name: $name")
        println("Salary: $salary")
    }

    fun applyBonus() {
        salary += bonus
    }
}

class Developer(name:String, salary: Int,val skills: String) :
    EmployeeBase(name, salary) {

    override var bonus = 200 // property overriding

    companion object{
        var devCount = 0
    }

    init {
        println("Init of Developer")
        devCount++
    }

    //method overriding
    override fun displayInfo() {
        println("---Developer ---")
        super.displayInfo()
        println("Skills: $skills")
        println("---------")
    }

}

/*
class Tester: EmployeeBase

bonus = 150
property - TestingTool
displayInfo- ovrride

Count of Testers

 */
class Tester(name:String, sal:Int,val testingTool:String):EmployeeBase(name,sal){
    override var bonus= 1500

    companion object{
        var testerCount=0
    }
    init {
        ++testerCount

    }

    override fun displayInfo(){
        println("===Tester Info===")
        super.displayInfo()
        println("Tools: $testingTool")
        println("--------------------")
    }
}


fun main() {

    val emp1 = EmployeeBase("John Smith", 10000)
    val emp2 = Developer("Merry Rose", 20000, "Kotlin")
    val emp3 = Tester("Mike Tyson", 3000, "Selenium")

    val empList = listOf( emp1, emp2, emp3)

    // runtime polymorphism - method overriding
    for (emp in empList){
        emp.applyBonus()
        emp.displayInfo()
    }

    println("Total employees: ${EmployeeBase.empCount}")
    println("Total developer: ${Developer.devCount}")
}