package com.sen.mygradleapplication

/**
作者：admin016
日期时间: 2022/1/14 16:48
内容描述:
 */
class B(c : Int) : A(c) {

    var c : Int = 0
    var d : Int = 1

    fun A.print(intc : Int){
        c = intc
    }

    fun addSum(inta : Int,intb : Int) : Int{
        var AA = A(1)
        AA.print(2)
        return  c + d
    }
}