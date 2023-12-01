package com.example.listviewsejercicio.adapters

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.listviewsejercicio.R
import com.example.listviewsejercicio.models.Persona

class PersonaAdapter(private val activity:Activity, private val listaPersonas:ArrayList<Persona>): BaseAdapter() {
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
        var inflater = activity.layoutInflater
        var myView = inflater.inflate(R.layout.item_persona_layout, null)

        var textViewNombre = myView.findViewById<TextView>(R.id.textViewNombre)
        var textViewApellido = myView.findViewById<TextView>(R.id.textViewApellido)

        textViewNombre.text = listaPersonas[position].nombre
        textViewApellido.text = listaPersonas[position].apellido

        return myView
    }

}