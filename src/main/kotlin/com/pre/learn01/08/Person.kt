package com.pre.learn01.`08`

import java.time.Period

open class Person {
    var name=""
    var age = 0
    fun  sleep(){
        println("$name is sleep.He is $age years old")
    }
}
//类继承
//定义 Student 继承 Person 类
//为啥 Person 后面会有一个括号呢？因为子类的构造函数必须调用父类中的构造函数，在 Java 中，子类的构造函数会隐式的去调用
class  Student(var sno:String ,var grade :Int) : Person(){
    init {
        name="zccc"
        age=36
    }
    //声明带一个参数的次构造函数
    constructor(sno:String):this(sno,8){

    }
    //声明一个无参的次构造函数
    constructor(): this("123",7){

    }
    fun printInfo(){
        println("I am $name, $age yeas old, sno: $sno, grade: $grade")
    }


}

fun  main(){
    val student1 = Student()
    val student2 = Student("456")
    val student3 = Student("789",100)
    student1.printInfo()
    student2.printInfo()
    student3.printInfo()


}