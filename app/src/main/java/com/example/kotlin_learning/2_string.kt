package com.example.kotlin_learning

import java.util.Locale

fun main() {
    var name = "Vamsi"
    var address = """
        Texas, USA
    """.trimIndent()

    println("Name: $name")
    println("Address: $address")

    val zip = 79415
    val msg = "$name resides at address $address with zip $zip"
    println(msg)

    val data = "Hi! Hello! How are you?"
    println("Length: ${data.length}")
    println("First char: ${data.first()}")
    println("Last Char : ${data.last()}")
    println("Char at index 2: ${data[2]}")
    println("Is String empty?: ${data.isEmpty()}")
    println("Is it a question ? ${data.endsWith('?')}")
    println("First 5 chars: ${data.substring(0, 5)}")

    println("Is '!' available? : ${data.contains('!')}")
    println("'!' present at index: ${data.indexOf('!')}")
    var str1 = "Hello"
    var str2 = "World!"
    println("${str1 + " " + str2}")
    println("$str1 $str2")


    println(data[0]);
    val splits = data.split('!')
    println("splits: $splits")
    val lowered = data.lowercase()
    println("Original String: $data")
    println("Lower case: $lowered")
    println("Capitalized: ${lowered.capitalize()}")

    // replace '!' with '*'
    val replaced = data.replace('!', '*')
    println("Replaced : $replaced")
    val addressUpdated = """
        Texas, 
        USA
    """.trimIndent()

    // no of lines

    val lines = addressUpdated.lines()
    println("No of lines: ${lines.size}")
    println("Lines: $lines")

    str1 = "Hello"
    str2 = "Hello"
    println("Comparision: ${str1.compareTo(str2)}")

    if (str1 == str2) {
        println("Same")
    } else {
        println("different")
    }


    var logdata = """
        This is error log #2 abc
        This is debug log #10 
        This is error log #12
        This is error log #30 xyz
        This is debug log #15
    """.trimIndent()

    /*
    Total number of logs
    Total error logs
    Total debug logs

    for error logs, print log error no

     */

    var lineCount = logdata.lines()
    var errCount = 0
    var debugCount = 0;

    println("Total : ${lines.size}")

    for(line in lines){
        when{
            line.contains("error")->{

                errCount++

                val hashPos = line.indexOf("#")
                val spacePos = line.indexOf(' ',hashPos)
                var errNo = ""
//                if (spacePos != -1)
//                    errNo = line.substring(hashPos+1, spacePos)
//                else
//                    errNo = line.substring(hashPos+1)
                errNo = if (spacePos != -1)
                    line.substring(hashPos+1, spacePos)
                else
                    line.substring(hashPos+1)
                println("Error log number: $errNo")

            }
            line.contains("debug") -> debugCount++
        }
    }

    println("Error Count: $errCount")
    println("Debug Count: $debugCount")

    /////////

    var sentence = "Kotlin is a general purpose language with latest version 1.4"
    var vowels = 0
    var consonants = 0
    var digits = 0
    var spaces = 0
    var extra = 0

    sentence = sentence.toLowerCase()
    for (ch in sentence) {

        when(ch){
            'a','e','i','o','u' -> ++vowels
            in 'a'..'z' -> ++consonants
            in '0'..'9' -> ++digits
            ' ' -> ++spaces
            else -> extra++
        }
//        if (ch == 'a' || ch == 'e' || ch == 'i'
//            || ch == 'o' || ch == 'u') {
//            ++vowels
//        } else if (ch in 'a'..'z') {
//            ++consonants
//        } else if (ch in '0'..'9') {
//            ++digits
//        } else if (ch == ' ') {
//            ++spaces
//        }
    }

    println("Vowels: $vowels")
    println("Consonants: $consonants")
    println("Digits: $digits")
    println("White spaces: $spaces")

    println("Total: ${sentence.length}, ${vowels + consonants + digits + spaces + extra}")

}