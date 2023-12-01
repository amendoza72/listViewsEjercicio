package com.example.listviewsejercicio.adapters

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.listviewsejercicio.models.Persona

class PersonaAdapter(private val listaPersonas:ArrayList<Persona>): BaseAdapter() {
    override fun getCount(): Int {
       return listaPersonas.size
    }

    override fun getItem(position: Int): Persona {
        return listaPersonas.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        TODO("Not yet implemented")
    }

}