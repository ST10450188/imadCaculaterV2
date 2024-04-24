package com.ST10450188.imadcalculator2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.sqrt
import android.content.Intent

class MainActivity : AppCompatActivity() {

    var etNum1 : EditText? = null
    var etNum2 : EditText? = null
    var tvDisp : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNum1 = findViewById(R.id.etNum1) //connecting code to screen
        etNum2 = findViewById(R.id.etNum2)
        tvDisp = findViewById(R.id.tvDisp)

        val btnAdd = findViewById<Button>(R.id.btnAdd) //assigning a value to the button at declaration
        btnAdd.setOnClickListener{add()}

        val btnSub = findViewById<Button>(R.id.btnSub)
        btnSub.setOnClickListener{sub()}

        val btnMul = findViewById<Button>(R.id.btnMul)
        btnMul.setOnClickListener{mul()}

        val btnDiv = findViewById<Button>(R.id.btnDiv)
        btnDiv.setOnClickListener{div()}

        val btnSqr = findViewById<Button>(R.id.btnSqr)
        btnSqr.setOnClickListener{sqr()}

        val btnPow = findViewById<Button>(R.id.btnPower)
        btnPow.setOnClickListener{pow()}

        val btnNextSc = findViewById<Button>(R.id.btnNextScreen)
        btnNextSc.setOnClickListener{
            //call the next screen
            val intent = Intent (this, MainActivity2::class.java)
            //start your next activity
            startActivity(intent)
        }
    }

    private fun add(){
        val strNum1 = etNum1?.text?.toString()
        val strNum2 = etNum2?.text?.toString()

        if (strNum1.isNullOrEmpty() || strNum2.isNullOrEmpty()) {
            tvDisp?.text = "Please enter valid number"
            return
        }

        val intNum1 = strNum1.toInt()
        val intNum2 = strNum2.toInt()
        var intAnswer = 0

        intAnswer = intNum1 + intNum2
        tvDisp?.text = intAnswer.toString()
        }

    private fun sub(){
        val strNum1 = etNum1?.text?.toString()
        val strNum2 = etNum2?.text?.toString()

        if (strNum1.isNullOrEmpty() || strNum2.isNullOrEmpty()) {
            tvDisp?.text = "Please enter valid number"
            return
        }

        val intNum1 = strNum1.toInt()
        val intNum2 = strNum2.toInt()
        var intAnswer = 0

        intAnswer = intNum1 - intNum2
        tvDisp?.text = intAnswer.toString()
        return
        }

    private fun mul(){
        val strNum1 = etNum1?.text?.toString()
        val strNum2 = etNum1?.text?.toString()

        if (strNum1.isNullOrEmpty() || strNum2.isNullOrEmpty()) {
            tvDisp?.text = "Please enter valid number"
            return
        }

        val intNum1 = strNum1.toInt()
        val intNum2 = strNum2.toInt()
        var intAnswer = 0

        intAnswer = intNum1 * intNum2
        tvDisp?.text = intAnswer.toString()
    }

    private fun div(){
        val strNum1 = etNum1?.text?.toString()
        val strNum2 = etNum1?.text?.toString()

        if (strNum1.isNullOrEmpty() || strNum2.isNullOrEmpty()) {
            tvDisp?.text = "Please enter valid number"
            return
        }

        val intNum1 = strNum1.toInt()
        val intNum2 = strNum2.toInt()
        var fltAnswer = 0

        if (intNum2 == 0) {
            tvDisp?.text = "Division by zero is not allowed"
        } else {
            fltAnswer = intNum1 / intNum2
        }

        tvDisp?.text = fltAnswer.toString()

        }

    private fun sqr(){
        val strNum1 = etNum1?.text?.toString()
        //val intNum2 = etNum1?.text?.toString()

        if (strNum1.isNullOrEmpty()) {              //|| intNum2.isNullOrEmpty()) {
            tvDisp?.text = "Please enter valid number"
            return
        }

        val intNum1 = strNum1.toInt()
        //val intNum2 = intNum2.toInt()
        var fltAnswer = 1

            fltAnswer = sqrt(intNum1.toDouble()).toInt()
            tvDisp?.text = fltAnswer.toString()
        }

    private fun pow(){
        val strNum1 = etNum1?.text?.toString()
        val strNum2 = etNum1?.text?.toString()

        if (strNum1.isNullOrEmpty() || strNum2.isNullOrEmpty()) {
            tvDisp?.text = "Please enter valid number"
            return
        }

        val intNum1 = strNum1.toInt()
        val intNum2 = strNum2.toInt()
        var intAnswer = 1
        
        for (i in 1..intNum2) {
            intAnswer *= intNum1
            //intAnswer = intNum1.pow(intNum2)
        }
      /*  var intAnswer : Int = 0

        for (i in 1..intNum2!!) {
            intAnswer = intAnswer * intNum1
        } */
        tvDisp?.text = intAnswer.toString()
    }


}