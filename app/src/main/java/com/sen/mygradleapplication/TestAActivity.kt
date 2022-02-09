package com.sen.mygradleapplication

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
作者：admin016
日期时间: 2022/1/7 16:11
内容描述:
 */
class TestAActivity : AppCompatActivity() {

    var tvText : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_testa)

        tvText = findViewById(R.id.tv_text)
        tvText?.text = "Vararg的sum值${sumArg(1,2,3,4,5)}"



    }

    private fun sumArg(vararg arg : Int) : Int{
        var sum : Int = 0
        for(a in arg){
            sum += a
        }
        return sum
    }

    val sumLambda : (Int,Int) -> Int = {x,y -> x+y}

    private fun getLength(a : Any) : Int{
        if(a is String){
            return a.length
        }
        return 0
    }

    private fun printResult(){
        for(i in 1..10){
            print(i)
        }

        for(i in 1..10 step 2){
            print(i)
        }

        for(i in 10 downTo 1 step 2){
            print(i)
        }

        // i in [1, 10) 排除了 10
        for(i in 1 until 10){
            print(i)
        }
    }

    private fun printWhenResult(a : Int){
        when(a){
            1,2 -> print("输出筛选结果$a")
            else -> print("输出没有筛选出结果$a")
        }
    }

    private fun printListItem(){
        val listA = listOf("a","b","c")
        for( x in listA){
            print(x)
        }
        for(x in listA.indices){
            print(listA[x])
        }
    }




}