package com.example.kotlin_learning

// function type (Int, Int) -> Int
fun doAdd(a: Int, b: Int): Int {
    return a + b
}

// (Int, Int) - > Int
// named function
fun doSubtract(a: Int, b: Int) = a - b

fun main() {

    var f: (Int, Int) -> Int
    f = ::doAdd
    var res = f(10, 20)
    println("Addition: $res")

    f = ::doSubtract
    res = f(10, 5)
    println("Subtraction: $res")

    // higher order function - input or return type is a function
    doCalculation(100, 200, ::doAdd)
    doCalculation(200, 100, ::doSubtract)
// lambda expression - annonymous function - without name
    // faster execution
    // scope limited to where it is defined/referenced.
    // short-lived functions
    var doMultiply = { a: Int, b: Int ->
        println("Multiplication of $a and $b")
        a * b
    }

    doMultiply = {a:Int, b: Int ->
        println("-----")
        a * b * 100
    }

    doCalculation(10, 20, doMultiply)
    doCalculation(10, 2, {x  , y -> x / y})
    doCalculation(300, 100) {x  , y -> x / y} // trailing lambda

    // type- (String) -> Int
    var x = { a:String ->
        println("Input: $a")
        a.toInt()
    }

    x = {
        println("Input: $it")
        it.toInt()
    }

    // square of number
    val square: (Int)->Int = { it * it }


    res = x("12") + 100
    println("Converted:  $res")

    println("SQuare of 12: ${square(12)}")
    // extension function

    val arr = arrayOf<Any>(1,2,3,4,5)

    arr.printArray()

    // nested/local function
    printArea(100, 30)

    var num = -5
    while (num != 0){
        val op = makeZero(num)
        num = op(num)
        // num = makeZero(num)(num)
    }
    println("final num: $num")
}
fun doCalculation(a: Int, b: Int, operation: (Int, Int) -> Int ){
    val result = operation(a,b)
    println("doCalculation Result: $result")
}

// extension function
fun Array<Any>.printArray(){
    print("[")
    for (e in this){
        print("$e, ")

    }
    print("]")
}

// nested function

fun printArea(height: Int, width: Int){
    val pi = 22/7
    fun calcArea() : Int {
        return height * width * pi
    }

    val area = calcArea()
    println("Area: $area")
}

fun incrementByOne(n : Int) = n + 1

fun decrementByOne(n: Int) = n - 1

// higher order function
fun makeZero(num: Int) : (Int) -> Int {
    return if (num > 0)
        ::decrementByOne
    else
        ::incrementByOne
}