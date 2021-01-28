package main.kotlin

class Test {

    fun test(list: MutableList<Int>){
        for(item in list){
            println(item)
        }
        list.remove(4)
        list.remove(2)
        println()

        for(item in list){
            println(item)
        }
    }

}

fun main() {
    var list = mutableListOf<Int>(1,2,3,4,5,6,7)
    Test().test(list)
}


//package main.kotlin
//
//class Person(name: String, share: Int) {
//    private var name: String = name
//    private var share: Int = share
//
//    fun getName(): String{
//        return this.name
//    }
//    fun getShare(): Int{
//        return this.share
//    }
//
//}
//
//class MyMoneyMyShare {
//
//    fun moneyAndShare(apples:MutableList<Int> ){
//        var totalWeight:Int = arraySum(apples.toIntArray())
//        apples.sort()
//        apples.reverse()
//        var localApplesList = apples
//
//
//        val ram:Person = Person("Ram", (totalWeight*50)/100)
//        val shyam:Person = Person("Shyam", (totalWeight*30)/100)
//        val rahim:Person = Person("Rahim", (totalWeight*20)/100)
//
//
//        localApplesList =  calculateShare(localApplesList, ram)
//        localApplesList = calculateShare(localApplesList, shyam)
//        localApplesList = calculateShare(localApplesList, rahim)
//
//    }
//
//    private fun arraySum(values: IntArray):Int{
//        var total:Int = 0
//        for(value in values){
//            total += value
//        }
//        return total
//    }
//
//    private fun calculateShare(apples: MutableList<Int>, person:Person): MutableList<Int>{
//        var totalTillNow:Int = 0
//        var applesList = mutableListOf<Int>()
//        var localList = apples.toMutableList()
//
//        for(value in apples){
//            if((totalTillNow+value) <= person.getShare()){
//                totalTillNow += value
//                applesList.add(value)
//            }
//        }
//
//        for(extraValues in applesList){
//            localList.remove(extraValues)
//        }
//
//
//        println("${person.getName()}'s share  : ${person.getShare()}")
//        println("total apples : ${applesList.size}")
//        println("list of apples : $applesList")
//        println()
//        println()
//
//        return localList
//
//    }
//}
//
//fun main() {
//    val myMoneyMyShare = MyMoneyMyShare()
//    myMoneyMyShare.moneyAndShare(mutableListOf(400, 100, 400, 300, 200, 300, 100, 200))
//}