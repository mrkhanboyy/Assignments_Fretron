package main.kotlin

import javax.sound.sampled.Line

class LinearSearch {

    fun linearSearch(array:Array<Int>,element:Int):Int{
        for(i in 0 until array.size){
            if(array[i] == element){
                return i
            }
        }
        return -1
    }

}

fun main(){
    var obj = LinearSearch()
    var array = arrayOf(1,2,3,4,5,6,)
    print(obj.linearSearch(array,0))
}