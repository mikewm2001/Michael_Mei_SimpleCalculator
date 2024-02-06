package com.bignerdranch.android.michaelmei_simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input1: EditText = findViewById(R.id.input1)
        val input2: EditText = findViewById(R.id.input2)
        val solution: EditText = findViewById(R.id.solution)
        val add: Button = findViewById(R.id.add)
        val sub: Button = findViewById(R.id.sub)
        val mult: Button = findViewById(R.id.mult)
        val div: Button = findViewById(R.id.div)
        val mod: Button = findViewById(R.id.mod)


        add.setOnClickListener {
            val in1 = input1.text.toString()
            val in2 = input2.text.toString()
            var sum = 0.0
            if (in1.isNotEmpty() && in2.isNotEmpty()) {
                sum = in1.toDouble() + in2.toDouble()
            }
            solution.setText(sum.toString())
        }
        sub.setOnClickListener {
            val in1 = input1.text.toString()
            val in2 = input2.text.toString()
            var diff = 0.0
            if (in1.isNotEmpty() && in2.isNotEmpty()) {
                diff = in1.toDouble() - in2.toDouble()
            }
            solution.setText(diff.toString())
        }
        mult.setOnClickListener {
            val in1 = input1.text.toString()
            val in2 = input2.text.toString()
            var product = 0.0
            if (in1.isNotEmpty() && in2.isNotEmpty()) {
                product = in1.toDouble() * in2.toDouble()
            }
            solution.setText(product.toString())
        }
        div.setOnClickListener {view : View ->
            val in1 = input1.text.toString()
            val in2 = input2.text.toString()
            var quotient = 0.0
            if (in2.toDouble() == 0.0) {
                val snack = Snackbar.make(
                    view,
                    R.string.div_zero,
                    Snackbar.LENGTH_SHORT
                )
                snack.anchorView = input1
                snack.show()
            }
            if (in1.isNotEmpty() && in2.isNotEmpty() && in2.toDouble() != 0.0) {
                quotient = in1.toDouble() / in2.toDouble()
                solution.setText(quotient.toString())
            }

        }
        mod.setOnClickListener {view : View ->
            val in1 = input1.text.toString()
            val in2 = input2.text.toString()
            var modded = 0.0
            if (in2.toDouble() == 0.0) {
                val snack = Snackbar.make(
                    view,
                    R.string.mod_zero,
                    Snackbar.LENGTH_SHORT
                )
                snack.anchorView = input1
                snack.show()
            }
            if (in1.isNotEmpty() && in2.isNotEmpty() && in2.toDouble() != 0.0) {
                modded = in1.toDouble() % in2.toDouble()
                solution.setText(modded.toString())
            }
        }


    }
}