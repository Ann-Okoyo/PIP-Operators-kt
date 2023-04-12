
fun main() {
    add(1, 2)
    add2(432, 647)
    add(43, 67)
//    greeting4("Ann")
//    workOut(34,71)
    val iskotlinFun :Boolean = true
    val isfishTasty :Boolean = false
    println(iskotlinFun)
    println(iskotlinFun)
    //Booleans values are mostly used fr conditional testing
    //
    val myGrade :Char = 'B'
    println(myGrade)

    val myLetter :Char ='A'
    println(myLetter)

    //Kotlin operatorser
    var x = 100
    ++x
    println(x)

//
    var myBool = true
    println(!myBool)

    var vv = 7
    println(vv>8|| vv<6)



    var txt = "I am Ann"
    println(txt.length)

    var message = "Hello I am Ann Muyale"
    println(message.indexOf('M'))

    var firstName = "Ann"
    var lastName = "Muyale"
    println(firstName + " "+ lastName)

    var lady1 = "School mates"
    var lady2 = "I am happy"
    println(lady1 +"" + lady2)


    var moment="Ann"
    var moment2 ="Muyale"
    println("Hello my name is $moment $moment2")


    var time =20
    if(time> 21){
        println("Good day")

    }else{
        (time<21)
        println("Good evening")
    }




    //operators grouped into:
    //Arithmetic operators
    //Assingment operators
    //Comparison operators
    //logical operators

    //Arithmetic operators
    //-Used to perform common maths operations.
    //+ addition
    //-subtracton
    //* multiplication
    //(/) division
    //% modulus
    //++ increment- increases the value by one
    //-- decreases the value by 1

        //Assingment Operators
    //they are used to assign values to variables
    //assingment operator (=) to assign the value 10
//    var x =10
    //The addition assignment operator(+=) adds a value to a variable
    var x1 =10
    x1 +=5
    println(x1)

    var r =5
    r *=2
    println(r)

   var x2 = 7
    x2 +=3
    println(x2)

    var v =9
    v *=4
    println(v)


    var x3 =8
    x3 +=4
    println(x3)


    var q =8
    q *=2
    println(q)

    var g =7
    g -=0
    println(g)

    var A = 71
    var B = 78
    println(A < B)

    var t =71
    println(x>4 && x<84)

    var y =68
    println(y >54 && y<61)

    val timex =22
    if(time<10){
        println("Good morning")

    }else if(time<20){
        println("Good day")

    }else{
        println("Good evening")
    }




}

fun add( x:Int, y:Int) {
    var sum = x + y
    println(sum)
}

//fun greeting4(name:String) {
//    println("HI" + name)
//}
fun add2(num1: Int, num2: Int): Int {
    var sum = num1 + num2
    return sum
}

//fun workOut(x:Int ,y: Int)=Unit {
//    var sum = x * y
//    println()
//}
//Boolean
//Char-data type is used to store  a single character .
//A char value must be surrounded by single quotes














