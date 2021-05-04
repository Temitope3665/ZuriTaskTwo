package com.zuritasktwo

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fruitItem = ArrayList<FruitModel>()
        fruitItem.add(
            FruitModel("Apple",
                "Apples are among the most popular fruits, they contains a high amount of fiber, vitamin C, potassium and vitamin K.",
                R.drawable.apple)
        )

        fruitItem.add(
            FruitModel("Mango",
                "Mangoes are an excellent source of vitamin C and they contain soluble fiber, which can provide many health benefits.",
                R.drawable.mango)
        )

        fruitItem.add(
            FruitModel("Cherry",
                "Cherries are rich in nutrients, especially potassium, fiber and vitamin C. They contain antioxidants, including anthocyanins and carotenoids.",
                R.drawable.cherries)
        )

        fruitItem.add(
            FruitModel("Avocado",
                "Avocado is different from most other fruits. Avocados are loaded with potassium, fiber and magnesium and they are low in carbs",
                R.drawable.avocado)
        )

        fruitItem.add(FruitModel("Lemon",
            "Lemons are a very healthy citrus fruit known for their high vitamin C content. Studies show that the citric acid in lemon juice has the ability to treat kidney stones",
            R.drawable.lemon)
        )

        fruitItem.add(
            FruitModel("Watermelon",
                "Watermelon is high in vitamins A and C. It’s also rich in some important antioxidants, including lycopene, carotenoids and cucurbitacin E. Watermelon is one of the most hydrating.",
                R.drawable.watermelon)
        )

        val fruitAdapter = FruitAdapter(this@MainActivity, fruitItem)

        val list = findViewById<ListView>(R.id.fruitListView)

        list.adapter = fruitAdapter

    }
}
