package com.example.testingactivity1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.testingactivity1.Arthimetic.Arithmetic

class MainActivity : AppCompatActivity() {
    private lateinit var firstnum: EditText
    private lateinit var secondnum: EditText
    private var sumResult: Float = 0F
    private var subResult: Float = 0F
    private var divResult: Float = 1F

    //    abstract var sumResult:Int
    private lateinit var btnadd: Button
    private lateinit var btnsub: Button
    private lateinit var btndiv: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        firstnum=findViewById(R.id.etFirst)
        secondnum=findViewById(R.id.etSecond)
        btnadd=findViewById(R.id.btnSum)
        btnsub=findViewById(R.id.btnSubtract)
        btndiv=findViewById(R.id.btnDivide)

        btnadd.setOnClickListener {

            retriveValue()
            val intent= Intent(this, ResultActivity::class.java)
            intent.putExtra("resultsumko",sumResult)
//            intent.putExtra("resutdivko",divResult)
            startActivity(intent)


            Toast.makeText(this, "$sumResult", Toast.LENGTH_SHORT).show()

        }



    }

    private fun retriveValue() {
        val first = firstnum.text.toString().toInt().toFloat()
        val second = secondnum.text.toString().toInt().toFloat()
        sumResult = Arithmetic.add(first = first, Second = second)
        subResult = Arithmetic.subtract(first = first, Second = second)
        divResult = Arithmetic.divide(first = first, Second = second)

    }
}