// Kotlin can import and use any exist java library
import java.util.Arrays

/*******************************************
 * Kotlin Tutorial Note
 * @author: Runquan Ye
 * @date: August / 2019
 *******************************************/

fun main(args : Array<String>){
    println("Kotlin Tutorial")

    //Kotlin print statment could print out multiple line at once within """ """
    // trimIndent() could get ride of the empty space in the front
    //print statement has similar functionability as JS

    println("""
        ----------------------------------------------------------------
        - @Author: Runquan Ye
        - @Date: August / 2019
        ----------------------------------------------------------------
    """.trimIndent())

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
        ----------------------------Conditionals----------------------------
    """.trimIndent())

    /*
     * Kotlin Conditional Operators: ==, !=, >, >=, <, <= ,||, &&
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
    var arr = arrayOf(1 ,2, 3.0, 'J', 2, "Kyle", 3.0, 2, 4, "Test")
    //after import java.util.Arrays
    //we can use Arrays.toString(array) to print out the array elements just like in java
    println("Array1: ${Arrays.toString(arr)}")
    println("Size: ${arr.size}")
    println("First Element: ${arr.first()}")
    println("Last Element: ${arr.last()}")
    println("Index 4: ${arr[4]}")
    println("Is 'Test' in the Array1: ${"Test" in arr}")

    //subarry could create in this way array.copyOfRange(start, end+1)
    var arr2 = arr.copyOfRange(1,5)
    println("Array2: ${Arrays.toString(arr2)}")
    println("Size:${arr2.size}")
    println("First Element: ${arr2.first()}")
    println("Last Element: ${arr2.last()}")
    println("Index of '3.0': ${arr2.indexOf(3.0)}")

    //you can declare array with specific type, and it can only accept specific value
    var arr3 : Array<Int> = arrayOf(1, 2, 3, 4, 5, 6)
    println("Array3: ${Arrays.toString(arr3)}")

    //or you can create specific type array in this way
    var arr4 = intArrayOf(1, 2, 3, 4, 5, 6)
    println("Array4: ${Arrays.toString(arr4)}")

    var arr5 = doubleArrayOf(1.2, 3.6, 5.8, 7.2, 10.6)
    println("Array5: ${Arrays.toString(arr5)}")

    //reverse an array
    var arr6 = arr3.reversed()
    print("Array6(reversed of Array3): ")
    for(i in arr6) {
        print(i)
        if(arr6.indexOf(i) != arr6.size - 1)
            print(",")
    }
    println()

    println("""
        ----------------------------Collection----------------------------
    """.trimIndent())
    //easiest way to create an array of squares
    var sqArray = Array(5, {x -> x * x})
    println("sqArray: " + Arrays.toString(sqArray))


    println("""
        ----------------------------Range----------------------------
    """.trimIndent())
    //Kotlin will create a range goes from start number go to end number
    // val/var variable_name = start..end
    val oneToTen = 1..10
    print("oneToTen: ")
    for(n in oneToTen){
        /*Kotlin ternary operator
         *if(Condition) True_Output else False_Output
         *Java ternary operator
         * if(Condition)? True_Output : False_Output
         */
        print("" + n + if(n != 10) "," else "")
    }
    println()
    println("Check 4 in oneToTen: ${4 in oneToTen}")

    //you can also  create oneToTen range like this, start.rangeTo(end)
    val oneToTen2 = 1.rangeTo(10)
    print("oneToTen2: ")
    for(n in oneToTen2){
        print("" + n + if(n != 10) "," else "")
    }
    println()

    println("Check 7 in oneToTen2: ${7 in oneToTen2}")

    //there has a downTo method, start.downTo(end)
    val hundredToOne = 100.downTo(1)
    print("hundredToOne: ")
    for(n in hundredToOne){
        print("" + n + if(n != 1) "," else "")
    }
    println()

    println("Check 89 in hundredToOne: ${89 in hundredToOne}")

    //you can use step iin range
    //create a range from 1 to 30, each step add 5
    var stepToThirty = (0..30).step(5)
    print("stepToThirty: ")
    for(n in stepToThirty){
        print("" + n + if(n != 30) "," else "")
    }
    println()
    println("Check 12 in stepToThirty: ${12 in stepToThirty}")
    println("Check 10 in stepToThirty: ${10 in stepToThirty}")


    // range works with letter to
    val alpha = 'A'..'Z'
    print("alpha: ")
    for(n in alpha){
        print("" + n + if(n != 'z') "," else "")
    }
    println()

    println("Check R in alpha: ${'R' in alpha}")


    println("""
        ----------------------------When----------------------------
    """.trimIndent())
    //Kotlin has a when condiction that kind like switch case in java, but it has some differents
    val splitLine = 10
    var even = arrayOf(0)
    when(splitLine){
        //the logicc here is simple
        //when splitLine = 0 or 1, 2, 3 print out the line
        0, 1, 2, 3 -> println("The splitLine is less than 4")

        5 -> println("The splitLine is 5")

        //you can use range, array in the when case operation
        in 6..10 -> println("The splitLine is between 6 and 10")

        in even -> println("The splitLine is even")

        //the when case allow you to have a defult value, else
        else -> println("The splitLine is greater then 10")
    }
    println()


    println("""
        ----------------------------For Loop----------------------------
    """.trimIndent())
    //Kotlin for loop has some similarities with python

    for(n in 1..10)
        print("" + n + " ")
    println()


    var array : Array<Int> = arrayOf(3, 6, 9, 12)
    println("Multiple of 3:")
    for(i in array.indices)
        println("$i : ${array[i]}")

    //or do it in this way
    for((i, x) in array.withIndex()){
        println("Index $i : \t Value: $x")
    }

    println()

    println("""
        ----------------------------Function----------------------------
    """.trimIndent())
    //in Kotlin ${} could run methods, if condictions, ranges, loop, and etc.
    println("Check is 4 even: ${checkEven(4)}")
    println("100 + 82 = ${add(100, 81)}")
    println("NullInput + NullInput = ${add()}")
    println(" 51 - 23 = ${subtract(52, 23)}")
    println("Where are you from?")

    //call a method just like this
    nation("China")

    println("Return 2 values function(check is 5 even): ${return2Value(5)}")
    println("Sum of range 1 to 5: ${sumOf(1,2,3,4,5)}")

    println("Recursion Function(Factorial 5): ${factorial(5)}")
    println("Tail Recursion Function(Factorial 15): ${factorial2(15)}")
}


//Kotlin Function
//declaring a function is similar with declaring a variable
//fun funcction_name(Para or not) : return_type
fun checkEven(input1:Int):Boolean{
    //if else statement could be in one line
    if(input1 % 2 == 0) return true else return false
}

//Here is an example of a single line function
//kotlin allows you give the parameter a default value
//if you dont provide input 1 or input 2 automatically consider as 0
fun add(input1:Int = 0, input2:Int = 0):Int = input1 + input2

//Kotlin allows you dont need the return type when you declaring a single line function
fun subtract(input1: Int, input2: Int) = input1 - input2

//if you dont want the function return anything, like the void type method in java.
//In Kotlin the return type is Unit.
fun nation(country:String):Unit{
    println("You are from $country")
}

//Kotlin allows function return 2 values
//fun funcction_name(Para or not) : Pair<return_type1, return_type2>
fun return2Value(input1:Int):Pair<Int, Boolean>{
    if(input1 % 2 == 0)
        //the return should in this form Pair(returnType1, returnType2)
        return Pair(input1, true)
    else
        return Pair(input1, false)
}

//Kotlin also allow you could sent a variable or element of the param into the function
//so the method treate the para input as an array or list, user could input as much same type para as you need
//when the method run the function will run through each of the element in the param list
fun sumOf(vararg nums:Int):Int{
    var sum = 0

    //Kotlin has the forEach method too
    nums.forEach { n -> sum += 0 }

    return sum
}

//Recursion function similar with java recursion function
fun factorial(input1: Int):Int{
    return if (input1 == 1) 1 else input1 * factorial(input1 - 1)
}


/*Kotlin also provide tail recursion function construct
 *Tail recursion is a generic concept rather than the feature of Kotlin language.
 *since some language like python does not support recursion
 *
 * Difference between  normal recursion and tail recursion
 *  Normal Recursion:
 *      it performs all recursive calls first, and calculate the result from return values at last,
 *      since it doesn't get result until all recursive calls are made.
 *
 *  Tail Recursion:
 *      calculations are performed first, then recursive calls are executed
 *      (the recursive call passes the result of your current step to the next recursive call).
 *      This makes the recursive call equivalent to looping, and avoids the risk of stack overflow.
 * */

//Tail recursion function has 'tailrec' keyword in front of 'fun'
tailrec fun factorial2(n: Int, run: Int = 1): Long {
    return if (n == 1) run.toLong() else factorial2(n - 1, run * n)
}