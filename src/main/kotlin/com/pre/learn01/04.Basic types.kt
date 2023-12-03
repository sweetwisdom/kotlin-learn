package com.pre.learn01

fun main() {
// Variable declared without initialization
    val d: Int
// Variable initialized
    d = 3

// Variable explicitly typed and initialized
    val e: String = "hello"

// Variables can be read because they have been initialized
    println(d) // 3
    println(e) // hello
//    listfun()
//    setfun()
    mapfun()

}

fun listfun() {
//    创建只读列表
    val readOnlyList = listOf("张三", "李四", "王五", "张三", true, 22)
    println(readOnlyList)
//    创建可读
//    var changeList = mutableListOf("mutableListOf张三","李四","王五")
    var changeList: MutableList<String> = mutableListOf("mutableListOf张三", "李四", "王五")

    println(changeList)
//  获取第一个
    println(changeList.first())
//    获取list长度 3
    println(changeList.count())
//    获取索引 2
    println(changeList.indexOf("王五"))
//    获取是否存在 true
    println("王五" in changeList)
//    新增
    changeList.remove("王五")

    changeList.add("蔡徐坤")
    changeList.add(0, "懒洋洋")
//    修改值
    changeList[1] = "张三"


    println(changeList)

    println("list 结束 ❤️")
}


fun setfun() {
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

    println(fruit)
    println(fruit.count())
    println(fruit.add("梨子"))
    println(fruit.indexOf("banana"))
    println("梨子" in fruit)
//    set 结束

    println("set 结束 ✅")
}

fun mapfun() {
    // Read-only map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)
    // {apple=100, kiwi=190, orange=100}

    // Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)
    // {apple=100, kiwi=190, orange=100}
//   新增
    juiceMenu.put("coconut",150)
    println(juiceMenu)
//    修改
    juiceMenu["coconut"]=160
    println(juiceMenu)
//    删除
    juiceMenu.remove("apple")
    println(juiceMenu)

}