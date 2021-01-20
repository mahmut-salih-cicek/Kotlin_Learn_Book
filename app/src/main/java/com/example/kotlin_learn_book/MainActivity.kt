package com.example.kotlin_learn_book

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // data ArrayList text hazırlığı
        var kotlinCodeTextList = ArrayList<String>()
        kotlinCodeTextList.add("Activity Data Gönder")
        kotlinCodeTextList.add("Runnable Handler Sayaç")
        kotlinCodeTextList.add("Context Alert Dialog")
        kotlinCodeTextList.add("Hesap Makinası")

      /// resimleri tanımlama ArrayListe Atma
        val drawableKod1Resmi = R.drawable.activity_data_gonder
        val drawableKod2Resmi = R.drawable.runnable_handler_sayac
        val drawableKod3Resmi = R.drawable.context_alert_dialog
        val drableKod4Resmi = R.drawable.hesap

        var resimArrayList = ArrayList<Int>()
        resimArrayList.add(drawableKod1Resmi)
        resimArrayList.add(drawableKod2Resmi)
        resimArrayList.add(drawableKod3Resmi)
        resimArrayList.add(drableKod4Resmi)

      /////   adapter kurulumu  RecycleAdapter.kt deki CodeIsımleriListesi ve CodeResimleriListesi ne MainActivity.kt deki
      /////   kotlinCodeTextList ve  resimArrayList gondermeye yarar cok onemlidir !!!!!

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager  //// goruntuyu bagladı



        val adapter = RecycleAdapter(kotlinCodeTextList,resimArrayList)
        recyclerView.adapter = adapter //// listeleri bagladı




    }
}