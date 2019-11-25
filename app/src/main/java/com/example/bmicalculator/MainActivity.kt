package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalculate.setOnClickListener(){
            //todo:: calc BMI
            val weight:Double = editTextWeight.text.toString().toDouble()
            val height:Double = editTextHeight.text.toString().toDouble()

            //val BMI:Double = weight/Math.pow(height, 2.00)
            val BMI:Double = weight / (height * height)
            textViewBMI.text = BMI.toString()

            //todo:: display image
            if (BMI <= 18.5)
            {
                imageViewProfile.setImageResource(R.drawable.under)
            }else if (BMI >= 18.5 && BMI <= 24.9)
            {
                imageViewProfile.setImageResource(R.drawable.normal)
            }else
            {
                imageViewProfile.setImageResource(R.drawable.over)
            }

        }

        btnReset.setOnClickListener(){
            //todo:: clear inputs & results
            editTextHeight.text = null
            editTextWeight.text = null
            textViewBMI.text = null

            //todo:: clear image
            imageViewProfile.setImageResource(R.drawable.empty)
        }


    }
}
