package com.example.testingactivity1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.testingactivity1.Arthimetic.Arithmetic

class ResultActivity : AppCompatActivity() {
    private lateinit var tvresult:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        tvresult=findViewById(R.id.tvResult)


        val resultSum=intent.getFloatExtra("resultsumko",3.2F)
//        val resultSub=intent.getStringExtra("resultsubko")
//        val resultDiv=intent.getIntExtra("resultdivko",0)

        tvresult.text="$resultSum"
//        tvresult.text=resultSub.toString()
//        tvresult.text=resultDiv.toString()
    }
}

