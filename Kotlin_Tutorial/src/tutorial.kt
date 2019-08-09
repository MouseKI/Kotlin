
/*******************************************
 * Kotlin Tutorial Note
 * @author: Runquan Ye
 * @date: August / 2019
 *******************************************/

fun main(args : Array<String>){
    println("Kotlin Tutorial")

    /*
     * Kotlin variable could declare without notice its type,
     * it will automatically assign the type with its relative value
     *
     * Kotlin has the type of Int, String, Float, Double, Long, Short, Char, Boolean
     * Note: Double could only function properly up to 15 digits(小数位15位)
     */
    //unchangeable variable declare with "val"
    val name = "Runquan"
    val nickName = "Jerry"

    //changeable variable declare with "var"
    var age = 23

    //you can also define the variable's type
    // var/val variable_name : variable_type = value
    val nationality : String = "China"
    var num:Int = 10
    val pi : Double = 3.14

    //Kotlin print statment could print out multiple line at once within """ """
    // trimIndent() could get ride of the empty space in the front
    //print statement has similar functionability as JS

    println("""
        ----------------------------------------------------------------
        - @Author: $name
        - @Date: August / 2019
        ----------------------------------------------------------------
    """.trimIndent())


    println("""
        ----------------------------Type Convert----------------------------
    """.trimIndent())

    //Kotline type convert is very simple
    println("num: $num")
    println("num to String: " + num.toString())
    println("num to Double: " + num.toDouble())

    //convert Char into Integer
    println("A to Int: ${'A'.toInt()}")

    println("pi to Int: ${pi.toInt()}")


    println("""
        ----------------------------Logic----------------------------
    """.trimIndent())


    /*
     * Kotlin logics: ==, !=, >, >=, <, <= ,||, &&
     */

    //Kotlin Char type, value should surround by single quote mark
    var letter1 : Char = 'y'

    // Kotlin logic statement could write similar with java and python
    if("Jerry" is String){
        println("Jerry is String with length of ${"Jerry".length}")
    }

    if("Jerry".contains("e")){
        print("Jerry has 1 'e'\n")
    }

    if(letter1 in "Jerry"){
        println("Jerry has 2 'y's")
    }

    //Kotlin print statement can run function or logic similar with JS
    print("Does 'Jerry' contains 'J': ${'J' in "Jerry"}\n")
    println("1 + 2 = ${1 + 2}")



    println("""
        ----------------------------String----------------------------
    """.trimIndent())

    var txt : String = "This is a good time!"
    println("String: $txt")
    println("Length: ${txt.length}")

    //substring in Kotlin is subSequence(begin, end+1)
    println("SubString: ${txt.subSequence(10, 14)}")

    println("Element at index of 10: ${txt[8]}")
    println("Index of is: ${txt.indexOf("is")}")

    println("""
        *************************String Compare*************************
        Compare: 0 is equal, > 0 or 1 is greater, < 0 or -1 is less than
    """.trimIndent())
    println("Is 'Jerry' equals 'jerry': ${"Jerry".equals("jerry")}")
    println("'Jerry' compare to 'jerry': ${"Jerry".compareTo("jerry")}")
    println("\t-'j' compare to 'J': ${'j'.compareTo('J')}")
    println("\t-'J' compare to 'j': ${'J'.compareTo('j')}")


    println("""
        ----------------------------Array----------------------------
    """.trimIndent())

    //the array with declear specific type could use as Python's list,
    //you can put any type of data in it.
    var arr = arrayOf(1 ,2, 3.0, 'J', "Test")
    println("Array1: $arr")
    println("Size: ${arr.size}")
    println("First Element: ${arr.first()}")
    println("Last Element: ${arr.last()}")
    println("Index 4: ${arr[4]}")
    println("Is 'Test' in the Array1: ${"Test" in arr}")

    //subarry could create in this way array.copyOfRange(start, end+1)
    var arr2 = arr.copyOfRange(2,4)
    println("Array2: ")
    println("Size:${arr2.size}")
    println("First Element: ${arr2.first()}")
    println("Last Element: ${arr2.last()}")

}


