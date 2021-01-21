package com.example.coolcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val zeroBtn = findViewById<Button>(R.id.Btn0)
        val oneBtn = findViewById<Button>(R.id.Btn1)
        val twoBtn = findViewById<Button>(R.id.Btn2)
        val threeBtn = findViewById<Button>(R.id.Btn3)
        val fourBtn = findViewById<Button>(R.id.Btn4)
        val fiveBtn = findViewById<Button>(R.id.Btn5)
        val sixBtn = findViewById<Button>(R.id.Btn6)
        val sevenBtn = findViewById<Button>(R.id.Btn7)
        val eightBtn = findViewById<Button>(R.id.Btn8)
        val nineBtn = findViewById<Button>(R.id.Btn9)

        val devideBtn = findViewById<ImageView>(R.id.devideBtn)
        val multiplyeBtn = findViewById<ImageView>(R.id.multBtn)
        val addBtn = findViewById<ImageView>(R.id.addBtn)
        val minusBtn = findViewById<ImageView>(R.id.minusBtn)

        val clearBtn = findViewById<Button>(R.id.clearBtn)

        val finalResult = findViewById<TextView>(R.id.finalResult)

        val equalBtn  = findViewById<ImageView>(R.id.equalBtn)

        var leftNumber   = ""
        var rightNumber  = ""

        var operation = ' '

        zeroBtn.setOnClickListener {
            rightNumber += "0"
            finalResult.text = rightNumber
        }

        oneBtn.setOnClickListener {
            rightNumber += "1"
            finalResult.text = rightNumber
        }

        twoBtn.setOnClickListener {
            rightNumber += "2"
            finalResult.text = rightNumber

        }

        threeBtn.setOnClickListener {
            rightNumber += "3"
            finalResult.text = rightNumber

        }

        fourBtn.setOnClickListener {
            rightNumber += "4"
            finalResult.text = rightNumber
        }

        fiveBtn.setOnClickListener {
            rightNumber += "5"
            finalResult.text = rightNumber
        }

        sixBtn.setOnClickListener {
            rightNumber += "6"
            finalResult.text = rightNumber
        }

        sevenBtn.setOnClickListener {
            rightNumber += "7"
            finalResult.text = rightNumber
        }

        eightBtn.setOnClickListener {
            rightNumber += "8"
            finalResult.text = rightNumber
        }

        nineBtn.setOnClickListener {
            rightNumber += "9"
            finalResult.text = rightNumber
        }

        addBtn.setOnClickListener {
            leftNumber = rightNumber
            rightNumber = ""
            finalResult.text = ""
            operation = '+'

        }

        minusBtn.setOnClickListener {
            leftNumber = rightNumber
            rightNumber = ""
            finalResult.text = ""
            operation = '-'
        }

        multiplyeBtn.setOnClickListener {
            leftNumber = rightNumber
            rightNumber = ""
            finalResult.text = ""
            operation = '*'
        }

        devideBtn.setOnClickListener {
            leftNumber = rightNumber
            rightNumber = ""
            finalResult.text = ""
            operation = '/'
        }

        equalBtn.setOnClickListener {

            when (operation) {
                '+' -> {
                    finalResult.text = (leftNumber.toString().toInt() + rightNumber.toString().toInt()).toString()
                    rightNumber = finalResult.text.toString()
                }
                '-' -> {
                    finalResult.text = (leftNumber.toString().toInt() - rightNumber.toString().toInt()).toString()
                    rightNumber = finalResult.text.toString()
                }
                '/' -> {
                    finalResult.text = (leftNumber.toString().toDouble() / rightNumber.toString().toDouble()).toString()
                    rightNumber = finalResult.text.toString()
                }
                '*' -> {
                    finalResult.text = (leftNumber.toString().toInt() * rightNumber.toString().toInt()).toString()
                    rightNumber = finalResult.text.toString()
                }

            }

        }
        
        clearBtn.setOnClickListener {
            leftNumber = ""
            rightNumber = ""
            operation = ' '
            finalResult.text = ""
        }





    }
}