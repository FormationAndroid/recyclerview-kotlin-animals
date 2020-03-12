package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AnimalsRecyclerAdapter(val animalsList: MutableList<Animal>)
        : RecyclerView.Adapter<AnimalsRecyclerAdapter.AnimalsViewHolder>(){

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalsViewHolder {
                val inflater = LayoutInflater.from(parent.context)
                return AnimalsViewHolder(inflater, parent)
        }

        override fun onBindViewHolder(holder: AnimalsViewHolder, position: Int) {
                holder.bind(animalsList[position])
        }

        fun addAnimal(animal: Animal){
                animalsList.add(animal)
                notifyItemInserted(animalsList.size)
        }

        inner class AnimalsViewHolder(inflater: LayoutInflater, parent: ViewGroup):
                RecyclerView.ViewHolder(inflater.inflate(R.layout.item_animals, parent, false)){

                private val btnDelete = itemView.findViewById<Button>(R.id.btnDelete)
                private val textName = itemView.findViewById<TextView>(R.id.textName)
                private val textColor = itemView.findViewById<TextView>(R.id.textColor)

                fun bind(animal: Animal){
                        textName.text = animal.name
                        textColor.text = animal.color

                        btnDelete.setOnClickListener {
                                animalsList.removeAt(layoutPosition)
                               notifyItemRemoved(layoutPosition)
                        }

                }

        }

        override fun getItemCount() = animalsList.size

}