package com.example.kotlin_learning

fun main(){
    var name: String
    name = "vamsi"
    var uname: String?


    //1. explicit null check
    uname = null
    var len: Int
    if(uname != null){
        len = uname.length
    }
    else{
        println("String is null")
        len=0
    }

    println("Length after explicit check: $len")


    //2. safe call operator
    //returns null if nullable reference is null
    var length = uname?.length

    println("with Safe-call operator length: $length")


    //3. Elvis/null-coalescing operator - default value if nullable reference is null
    len = uname?.length?:0
    var x:String = uname?: ""
    println("X: $x")

    uname ="xyz"

    //4. non-null assertion operator
    var y: String = uname!!
    println("Y: $y")

}