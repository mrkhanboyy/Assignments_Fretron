package main.kotlin

//Q Write a program to check if the given number is Armstrong number or not.

class ArmstrongNumber {

    fun isArmstrong(number:Int):Boolean{

        var length:Int = number.toString().length
        var initialNumber:Int = number
        var result:Int = 0
        var rem:Int
        var temp:Int

        while(initialNumber > 0){
            rem = initialNumber % 10
            temp = rem
            for(i in 2..length){
                temp *= rem
            }
            result += temp
            initialNumber /= 10
        }

        if(result.toInt() == number) {
            return true
        }
    return false
    }
}

fun main(){
    var obj = ArmstrongNumber()
    print(obj.isArmstrong(1634))
}
