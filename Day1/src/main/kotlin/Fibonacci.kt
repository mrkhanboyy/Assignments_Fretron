package main.kotlin

class Fibonacci {


    fun printFibonacci(target: Int){


        if(target <= 0){
            print("Invalid input")
            return
        }else if(target == 1){
            print("0")
            return
        }else if(target == 2){
            print("0 1")
            return
        }

        var previous:Int = 0;
        var current:Int = 1;

        print("0 1 ")
        for(value in 2 until target){

            var res = previous + current
            previous = current
            current = res
            print("$res ")
        }
    }

}

fun main(){
    val obj = Fibonacci()
    obj.printFibonacci(10)
}