package com.example.usercalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(){
    add()
    substract()
    multiply()
    divide()
}
fun addingNumbers() {
    var number1 = findViewById<EditText>(R.id.number1)
    var number2 = findViewById<EditText>(R.id.number2)
    var button = findViewById<Button>(R.id.btn_add)
    button.setOnClickListener {
        var result1 = number1.text.toString().toInt()
        var result2 = number2.text.toString().toInt()
        var getResult = number1 + number22
        Toast.makeText(this, "$getResult", Toast.LENGTH_SHORT).show()
    }
}
fun substractNumbers() {
    var num1 = findViewById<EditText>(R.id.number1)
    var num2 = findViewById<EditText>(R.id.number2)
    var button = findViewById<Button>(R.id.btn_subtract)
    button.setOnClickListener {
        var number1 = num1.text.toString().toInt()
        var number2 = num2.text.toString().toInt()
        var getResult = number1 - number2
        Toast.makeText(this, "$getResult", Toast.LENGTH_SHORT).show()
    }
}
fun multiplyNumbers() {
    var number = findViewById<EditText>(R.id.number1)
    var number2 = findViewById<EditText>(R.id.number2)
    var button = findViewById<Button>(R.id.btn_multiply)
    button.setOnClickListener {
        var result1 = num1.text.toString().toInt()
        var result2 = num2.text.toString().toInt()
        var getResult = result1 * result2
        Toast.makeText(this, "$getResult", Toast.LENGTH_SHORT).show()
    }
}
fun divideNumbers() {
    var num1 = findViewById<EditText>(R.id.number1)
    var num2 = findViewById<EditText>(R.id.number2)
    var button = findViewById<Button>(R.id.btn_div)
    button.setOnClickListener {
        var result1 = num1.text.toString().toInt()
        var result2 = num2.text.toString().toInt()
        var getResult = result1 / result2
        Toast.makeText(this, "$getResult", Toast.LENGTH_SHORT).show()
    }
}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

    }
}