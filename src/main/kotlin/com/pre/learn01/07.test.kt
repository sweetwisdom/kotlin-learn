package com.pre.learn01

import kotlin.math.PI

fun main(){
    println(circleArea(5))
    println(intervalInSeconds(1, 20, 15))
    println(intervalInSeconds(minutes = 1, seconds = 25))
    println(intervalInSeconds(hours = 2))
    println(intervalInSeconds(minutes = 10))

    println(intervalInSeconds(hours = 1, seconds = 1))
    tets03()
}
fun circleArea(r:Int): Double {
    return PI*r*r
}
fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0) =
    ((hours * 60) + minutes) * 60 + seconds


//  lambda表达式 相当于箭头函数

fun lambdaEx(){
    fun upcaseString(string:String):String{
        return  string.uppercase()

    }
    println(upcaseString("hello"))
//    使用lambda
//        print({string:String -> string.uppercase()}("hello"))
    print({string:String -> string.uppercase()}("hello"))


}

fun tets03 (){
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    var urls = actions.map{ action->"$prefix/$id/$action"}

        println(urls)
}