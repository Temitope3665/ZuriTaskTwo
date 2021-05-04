package com.zuritasktwo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import com.google.android.material.textview.MaterialTextView

class FruitAdapter(context: Context, fruits: List<FruitModel> ): ArrayAdapter<FruitModel>(context, 0, fruits) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView

        val fruit = getItem(position)

        if (view == null) {
            view = LayoutInflater.from(parent.context).inflate(R.layout.fruit_item_layout, parent, false)
        }

        val image = view?.findViewById<ImageView>(R.id.image_view)
        val name = view?.findViewById<MaterialTextView>(R.id.name)
        val description = view?.findViewById<MaterialTextView>(R.id.description)

        image!!.setImageResource(fruit!!.image)
        name!!.text = fruit.name
        description!!.text = fruit.description

        return view!!
    }

}