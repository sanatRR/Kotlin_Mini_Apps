package com.example.diceroller

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn:Button=findViewById(R.id.btn_roll)
        btn.setText(getString(R.string.rollnow))
        btn.setOnClickListener { rollDice()}
    }

    private fun rollDice() {
        val num:Int= Random().nextInt(6)+1
        val iv: ImageView =findViewById(R.id.iv_num)
        val resId:Int=when(num){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        iv.setImageResource(resId)
    }
}