package com.pre.learn01
//    repeatN(5, action = { println("hello word")})
fun main (){

    repeatN(5) {
        println("hello")
    }

}

fun repeatN(n:Int, action: () -> Unit){
    for (mum in 1 ..n){
        action()
    }
}
