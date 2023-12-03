package com.pre.learn01

fun main(){
    ifFun(31)
    ifFun(102)
    whenFun()
    for (number in 1..5) {
        // number is the iterator and 1..5 is the range
        print("$number,")
    }
    for (num in 2..8){
        println(num)
    }

    var cakesEaten = 0
    var cakesBaked = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }
    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten-2)
//   test01()
    test02()
}

fun test02() {
    val words = listOf("dinosaur", "limousine", "magazine", "language")
    for( item in words){
        if(item.startsWith("l")){
            println(item)
        }

    }
}

//for when 循环使用
fun test01() {

    for (num in 1 .. 100){
      val ppp=  when{
            num % 15 == 0 -> "fizzbuzz"
            num % 3 == 0 -> "fizz"
            num % 5 == 0 -> "buzz"
          else ->num.toString()
        }
       println(ppp)

    }

}

fun  ifFun( num:Int ){

    if(num>=60){
        println("通过")
    }else{
        println("不及格")
    }


}

fun whenFun(){
    val obj = "1"

    val result = when (obj) {
        // If obj equals "1", sets result to "one"
        "1" -> "One"
        // If obj equals "Hello", sets result to "Greeting"
        "Hello" -> "Greeting"
        "ooz"->"ooz"
        // Sets result to "Unknown" if no previous condition is satisfied
        else -> "Unknown"
    }
    println(result)
}