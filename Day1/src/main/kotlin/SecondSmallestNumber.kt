package main.kotlin

//Q Write a program to find the second smallest element in an array.


class SecondSmallestNumber {

    fun secondSmallestNumber(values:Array<Int>){

        if(values.size < 2 || values == null){
            print("invalid input")
            return
        }

        var smallest = Int.MAX_VALUE
        var secondSmallest = Int.MAX_VALUE

        for(value in values){
            if(smallest >  value){
                secondSmallest = smallest
                smallest = value
            }else if(smallest <  value && secondSmallest > value){
                secondSmallest = value
            }
        }
        println(secondSmallest)
    }

}

fun main(){
    var obj = SecondSmallestNumber()
    println(obj.secondSmallestNumber(arrayOf<Int>(1,2,3,4,5,0)))
}
