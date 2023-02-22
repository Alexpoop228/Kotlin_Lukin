package com.example.kotlin_lukin

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    private var number: Int = 3
    private var number2: Int = 5
    private var text: String = "В магазине <осталось> 10 банок колы, а <может> и больше"
    private var tvText: TextView? = null //Создали переменную для TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //Отображение нужного слоя
        tvText = findViewById(R.id.tvTextView) //Связали переменную и компонент
        var subText: String = text.substringAfter('<')
        var subText2: String = subText.substringBefore('>')
        var subText3: String = text.substringAfter('<')
        var subText4: String = subText3.substringBefore('>')
            //Отобразить содержимое переменной tvText на компоненте tvTextView
            tvText?.setText(subText)
            tvText?.setText(subText4)
        }



}