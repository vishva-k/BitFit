package com.example.bitfit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NutritionActivity : AppCompatActivity() {
    private lateinit var nutritionRV : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_nutrition)
        val nutritionInputET : EditText = findViewById(R.id.nutritionInputET)
        val calorieCountET : EditText = findViewById(R.id.caloriesInputET)
        val recordInputBt : Button = findViewById<Button>(R.id.recordInputBtn)

        recordInputBt.setOnClickListener(View.OnClickListener {
            // Sending result back to main activity
            val resultIntent = Intent()
            resultIntent.putExtra("result", Nutrition(nutritionName = nutritionInputET.text.toString(), calorieCount = calorieCountET.text.toString()))
            setResult(RESULT_OK, resultIntent)
            finish()
        })
    }
}