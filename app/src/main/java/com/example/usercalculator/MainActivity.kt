package com.example.usercalculator


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity(){
    lateinit var number1:EditText
    lateinit var number2:EditText
    lateinit var btn_add:Button
    lateinit var btn_subtract:Button
    lateinit var btn_multiply:Button
    lateinit var btn_divide:Button
    lateinit var tvresult:TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        number1=findViewById(R.id.number1)
        number2=findViewById(R.id.number2)
        btn_add=findViewById(R.id.btn_add)
        btn_subtract=findViewById(R.id.btn_subtract)
        btn_multiply=findViewById(R.id.btn_multiply)
        tvresult=findViewById(R.id.tvresult)
        btn_divide=findViewById(R.id.btn_divide)
        btn_add.setOnClickListener {
            val numb1 = number1.text.toString().toDouble()
            val numb2 = number2.text.toString().toDouble()
            val result = numb1 + numb2
            tvresult.text="Result"

        }

        btn_subtract.setOnClickListener {
            val numb1 = number1.text.toString().toDouble()
            val numb2 = number2.text.toString().toDouble()
            val textView = numb1 - numb2
            tvresult.text="Result"
        }
        btn_multiply.setOnClickListener {
            val numb1 = number1.text.toString().toDouble()
            val numb2 = number2.text.toString().toDouble()
            val textView = numb1 * numb2
            tvresult.text="Result"
        }
        btn_divide.setOnClickListener {
            val numb1 = number1.text.toString().toDouble()
            val numb2 = number2.text.toString().toDouble()
            val textView = numb1 / numb2
            tvresult.text="Result"

        }



    }
}