package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animals = mutableListOf<Animal>()
        animals.add(Animal("Lion", "jaune"))
        animals.add(Animal("Oiseau", "bleu"))
        animals.add(Animal("Lion", "jaune"))
        animals.add(Animal("Oiseau", "bleu"))
        animals.add(Animal("Lion", "jaune"))
        animals.add(Animal("Oiseau", "bleu"))
        animals.add(Animal("Lion", "jaune"))
        animals.add(Animal("Oiseau", "bleu"))
        animals.add(Animal("Lion", "jaune"))
        animals.add(Animal("Oiseau", "bleu"))
        animals.add(Animal("Lion", "jaune"))
        animals.add(Animal("Oiseau", "bleu"))
        animals.add(Animal("Lion", "jaune"))
        animals.add(Animal("Oiseau", "bleu"))
        animals.add(Animal("Lion", "jaune"))
        animals.add(Animal("Oiseau", "bleu"))
        animals.add(Animal("Lion", "jaune"))
        animals.add(Animal("Oiseau", "bleu"))
        animals.add(Animal("Lion", "jaune"))
        animals.add(Animal("Oiseau", "bleu"))
        animals.add(Animal("Lion", "jaune"))
        animals.add(Animal("Oiseau", "bleu"))
        animals.add(Animal("Lion", "jaune"))
        animals.add(Animal("Oiseau", "bleu"))
        animals.add(Animal("Lion", "jaune"))
        animals.add(Animal("Oiseau", "bleu"))
        animals.add(Animal("Lion", "jaune"))
        animals.add(Animal("Oiseau", "bleu"))
        animals.add(Animal("Lion", "jaune"))
        animals.add(Animal("Oiseau", "bleu"))
        animals.add(Animal("Lion", "jaune"))
        animals.add(Animal("Oiseau", "bleu"))

        val adapter = AnimalsRecyclerAdapter(animals)

        val divider = DividerItemDecoration(this ,DividerItemDecoration.VERTICAL)
        divider.setDrawable(ContextCompat.getDrawable(this, R.drawable.divider)!!)
        myRecyclerView.addItemDecoration(divider)

        myRecyclerView.adapter = adapter

        btnAddAnimal.setOnClickListener {
            val newAnimal = Animal("Chien", "rouge")
            adapter.addAnimal(newAnimal)
        }



    }
}
