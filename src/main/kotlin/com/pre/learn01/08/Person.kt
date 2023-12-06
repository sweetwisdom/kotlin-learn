package com.pre.learn01.`08`

import java.time.Period

class Person {
    var name=""
    var age = 0
    fun  sleep(){
        println("$name is sleep.He is $age years old")
    }
}

fun  main(){
    var  person = Person()
    person.name="zc"
    person.age=88
    person.sleep()
}