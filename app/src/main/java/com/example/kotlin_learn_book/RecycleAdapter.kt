package com.example.kotlin_learn_book

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.reycycle_row.view.*

class RecycleAdapter (var CodeIsımleriListesi : ArrayList<String> , var CodeResimleriListesi : ArrayList<Int>) : RecyclerView.Adapter<RecycleAdapter.KodlarVH>(){
    class KodlarVH (itemView : View) : RecyclerView.ViewHolder(itemView){
         //// bu class itemholder dan gelen inflate yani xml göstermeye yarayan sınıftır....
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KodlarVH {
        //Inflater, LayoutInflater, MenuInflater xml mainactivitiye baglar
        // kodlarVH return eder
        val itemHolder =  LayoutInflater.from(parent.context).inflate(R.layout.reycycle_row,parent,false)
        return KodlarVH(itemHolder)

    }

    override fun getItemCount(): Int {
        return CodeIsımleriListesi.size
    }

    override fun onBindViewHolder(holder: KodlarVH, position: Int) {

    holder.itemView.textView20.text = CodeIsımleriListesi.get(position)
    holder.itemView.setOnClickListener {
        val intent = Intent(holder.itemView.context,CodeActivity::class.java)
        intent.putExtra("Data_Code_İsimleri",CodeIsımleriListesi.get(position))
        intent.putExtra("Resimler_Data",CodeResimleriListesi.get(position))
        holder.itemView.context.startActivity(intent)
    }

    }


}