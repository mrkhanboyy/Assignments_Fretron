package main.kotlin

//Q Write a program to find all pairs of elements in an array whose sum is equal to a specified number.

class PairSum {

    fun printPairs(values:Array<Int>, target:Int):Unit{
        if(values.size < 2){
            print("invalid input")
            return
        }

        var myset = mutableSetOf<Int>()
        myset.add(values[0])

        for(value in 1 until values.size){
            if(myset.contains(target - values[value])){
                println("${values[value]} : ${target - values[value]}")

            }
            myset.add(values[value])
        }
    }

}


fun main(){
    var obj = PairSum()
    obj.printPairs(arrayOf<Int>(1,2,3,4,5,6), 0)
}
