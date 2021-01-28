package main.kotlin

//Q Ram , sham and rahim went for shopping apple. They bought apple worth 100 rupees.
// Ram paid 50 rupees, sham paid 30 rupees  and rahim paid 20 rupees.
// Each apple is tagged with its weight on it.
// Write a program to distribute apples such that the quantity of apple they get is in
// best proportionate to the amount they paid.

//Note : you cannot cut a apple into pieces have to allocate the whole apple to one of them.

class Person(name: String, share: Int) {
    private var name: String = name
    private var share: Int = share

        fun getName(): String{
            return this.name
        }
        fun getShare(): Int{
            return this.share
        }

}

class MyMoneyMyShare {

    fun moneyAndShare(apples:MutableList<Int> ){
        var totalWeight:Int = arraySum(apples.toIntArray())
        apples.sort()
        apples.reverse()

        val ram:Person = Person("Ram", (totalWeight*50)/100)
        val shyam:Person = Person("Shyam", (totalWeight*30)/100)
        val rahim:Person = Person("Rahim", (totalWeight*20)/100)

        calculateShare(apples, ram)
        calculateShare(apples, shyam)
        calculateShare(apples, rahim)

    }

    /**
     * @return sum of all values in the array
     */
    private fun arraySum(values: IntArray):Int{
        var total:Int = 0
        for(value in values){
            total += value
        }
        return total
    }

    /**
     * prints person's share after calculation
     */
    private fun calculateShare(apples: MutableList<Int>, person:Person){
        var totalTillNow:Int = 0

        /* list to add extra apples */
        var extraApplesList = mutableListOf<Int>()

        /* calculating share for given person */
        for(value in apples){
            if((totalTillNow+value) <= person.getShare()){
                totalTillNow += value
                extraApplesList.add(value)
            }
        }

        /* removing extra apples from main apples list */
        for(extraApples in extraApplesList){
            apples.remove(extraApples)
        }


        println("${person.getName()}'s share  : ${person.getShare()}")
        println("total apples : ${extraApplesList.size}")
        println("list of apples : $extraApplesList")
        println()
        println()


    }
}

/**
 * driver code
 */
fun main() {
    val myMoneyMyShare = MyMoneyMyShare()
    myMoneyMyShare.moneyAndShare(mutableListOf(400, 100, 400, 300, 200, 300, 100, 200))
}