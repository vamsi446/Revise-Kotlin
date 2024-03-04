package com.example.kotlin_learning

fun main(){


    // list - dynamic arrays

    // val langs = listOf("C", "C++", "Python", "Java")
    val langs = mutableListOf("C", "C++", "Python", "Java")

    println("List: $langs")
    println("Size: ${langs.size}")
    println("First element: ${langs[0]}")
    println("Last element: ${langs.last()}")

    for (e in langs)
        println("language: $e")

    langs.forEach {
        println("Lang: ${it.toUpperCase()}")
    }

    println("First three: ${langs.slice(0..2)}")

    langs[0] = "Java" // update
    langs.add("Java") // append
    langs.add(2, "Java") // insert

    println("Updated: $langs")

    // removal
    langs.remove("Java")

//    for (i in langs.indices){
//        if (langs[i] == "Java")
//            langs.removeAt(i)
//    }
    while (langs.contains("Java")){
        langs.remove("Java")
    }

    println("Removed: $langs")
    langs.reverse()
    println("Reversed: $langs")

    // set - unique

    val listOfNum = listOf(1,2,3,1,4,1,5)
    // remove duplicates
    val setOfNum = listOfNum.toSet()
    println("Original list: $listOfNum")
    println("Set: $setOfNum")

    setOfNum.forEach{
        println("Square of $it: ${it * it}")
    }

    // map - key is index - should be unique
    // dictionary

    val contacts1 = mutableMapOf("John" to 111, "Merry" to 222, Pair("Robert", 333))

    println("Map: $contacts1")

    println("Number of 'John': ${contacts1["John"]}")
    println("All contact names  ${contacts1.keys}")
    println("All numbers: ${contacts1.values}")

    if( "Robert" in contacts1){
        println("Robert's num: ${contacts1["Robert"]}")
    }
    else
        println("No contact info ")

    // add, update, delete

    contacts1["Robert"] = 444 // update
    contacts1["Mark"] = 555 // add
    contacts1.put("Mike", 111)

    contacts1.remove("Mike")

    println("Updated: $contacts1")

    // merging
    val officeContacts = mapOf("John" to 222, "vamsi" to 333)

    contacts1.putAll(officeContacts)

    println("Merged: $contacts1 ")
    contacts1.forEach { s, i ->
        println("$s Number: $i")
    }
    val data = listOf(1,2,3,4,5,6,7,8,9,10)
    var evenList = mutableListOf<Int>()
    for( i in data){
        if (i % 2 == 0)
            evenList.add(i)
    }

    println("Even List: $evenList")

    // filter

    val filteredList = data.filter { it % 2 == 0 }
    println("Even list with filter: $filteredList")

    val contacts = mapOf("John" to 111, "Merry" to 222, "Mark" to 333)

    // get all numbers of people for names starting with 'M'
    // using filter

    val mContacts =  contacts.filter {
        it.key.startsWith('M')
    }

    println("Number: ${mContacts}")

    // map

    // square of each number

    val squaredList =  data.map { it * it }
    println("Squared: $squaredList")

    // square of even numbers
//    val squareOfEvens = data.map {
//        if (it % 2 ==0)
//            it * it
//        else
//            " "
//
//
//    }

    val squareOfEvens = data.filter { it % 2 == 0 }.map { it * it }

    println("square of evens: $squareOfEvens")

    // reduce
    // cumulative product
    var product = 1
    data.forEach {
        product *= it
    }

    println("Cumulative Product: $product")

    val prod = data.reduce { prod, i -> prod * i }
    println("Cumulative Product with reduce: $prod")
}