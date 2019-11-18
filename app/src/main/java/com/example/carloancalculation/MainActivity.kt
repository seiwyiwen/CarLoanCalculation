package com.example.carloancalculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn = findViewById<View>(R.id.buttonCalculate)


        buttonCalculate.setOnClickListener(){
            val price = editTextCarPrice.text.toString()
            val payment = editTextDownPayment.text.toString()
            val loadPeriod = editTextLoanPeriod.text.toString()
            val interestRate= editTextInterestRate.text.toString()

            val Carloan:Double= price.toDouble() - payment.toDouble()
            val interest:Double= Carloan * loadPeriod.toDouble() * interestRate.toDouble()
            val monthlyRepayment:Double = (Carloan + interest)/loadPeriod.toDouble()/12

            textView6.text = "%2.2f".format(Carloan)
            textView7.text = "%2.2f".format(interest)
            textView8.text = "%2.2f".format(monthlyRepayment)


        }

    }

}
