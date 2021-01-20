package com.example.kotlin_learn_book

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_code.*

class CodeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code)

        //// Arraylisteki Textleri 2. Activitiye alma
        val intent = intent
        val secilenKodText = intent.getStringExtra("Data_Code_İsimleri")
        textView2.text = secilenKodText

        //// ArrayListedeki Gorselleri 2. Aktivite alma
        val secilenKodGorsel = intent.getIntExtra("Resimler_Data",0)
        val bitmap = BitmapFactory.decodeResource(applicationContext.resources,secilenKodGorsel)
        imageView2.setImageBitmap(bitmap)

    }
}