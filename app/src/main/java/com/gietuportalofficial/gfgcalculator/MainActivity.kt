package com.gietuportalofficial.gfgcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.math.log

class MainActivity : AppCompatActivity() {


    lateinit var number: TextView
    var isfirst:Boolean=true
    var oldnumber:String=""
    var op="+"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //supportActionBar?.hide()

        number=findViewById(R.id.number)


    }
    fun getnum(view: View) {

        if (isfirst)
        {
            number.text=""
        }
       isfirst=false

        var numbera=number.text.toString()
        when(view.id)
        {
            R.id.one ->{
               numbera= numbera+"1"
                number.setText(numbera)
            }
            R.id.two ->{
                numbera= numbera+"2"
                number.setText(numbera)
            }
            R.id.three ->{
                numbera= numbera+"3"
                number.setText(numbera)
            }
            R.id.four ->{
                numbera= numbera+"4"
                number.setText(numbera)
            }
            R.id.five ->{
                numbera= numbera+"5"
                number.setText(numbera)
            }
            R.id.six ->{
                numbera= numbera+"6"
                number.setText(numbera)
            }
            R.id.seven ->{
                numbera= numbera+"7"
                number.setText(numbera)
            }
            R.id.eight ->{
                numbera= numbera+"8"
                number.setText(numbera)
            }
            R.id.nine ->{
                numbera= numbera+"9"
                number.setText(numbera)
            }

            R.id.zero ->{
                numbera= numbera+"0"
                number.setText(numbera)
            }
            R.id.doublezero ->{
                numbera= numbera+"00"
                number.setText(numbera)
            }
            R.id.dot ->{
                numbera= numbera+"."
                number.text = numbera
            }
            R.id.plusminus ->{
                numbera= "-"+numbera
                number.text = numbera
            }



        }



    }

   fun allsettozero(view: View){

       number.text="0"
       isfirst=true
   }
    fun operations(view: View) {
    oldnumber=number.text.toString()
        Log.d("oldnumber", "operations: $oldnumber")
        isfirst=true
        when(view.id)
        {
            R.id.plus->{op="+"}
            R.id.minus->{op="-"}
            R.id.multiply->{op="*"}
            R.id.division->{op="/"}
            R.id.percentage->{op="%"}
        }
    }


    fun eqalevent(view: View) {

        var result:Double=0.0

        when(op)
        {
            "+"->{ number.text=(oldnumber.toDouble() + number.text.toString().toDouble()).toString() }
            "-"->{ number.text=(oldnumber.toDouble() - number.text.toString().toDouble()).toString() }
            "*"->{ number.text=(oldnumber.toDouble() * number.text.toString().toDouble()).toString() }
            "/"->{ number.text=(oldnumber.toDouble() / number.text.toString().toDouble()).toString() }
            "%"->{ number.text=(oldnumber.toDouble() % number.text.toString().toDouble()).toString() }

        }



    }


}