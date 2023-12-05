package com.example.listviewsejercicio.adapters

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.listviewsejercicio.R
import com.example.listviewsejercicio.models.Persona

class PersonaAdapter(private val activity:Activity, private val listaPersonas:ArrayList<Persona>): BaseAdapter() {

    class ViewHolder{
        lateinit var textViewNombre: TextView
        lateinit var textViewApellido: TextView
    }
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

        var myView = convertView
        var viewHolder = ViewHolder()

        if (myView == null) {
            var inflater = activity.layoutInflater
            myView = inflater.inflate(R.layout.item_persona_layout, null)
            viewHolder.textViewNombre = myView.findViewById<TextView>(R.id.textViewNombre)
            viewHolder.textViewApellido = myView.findViewById<TextView>(R.id.textViewApellido)
            myView.setTag(viewHolder)
        }
        else{
            viewHolder = myView.tag as ViewHolder
        }
        viewHolder.textViewNombre.text = listaPersonas[position].nombre
        viewHolder.textViewApellido.text = listaPersonas[position].apellido

        return myView!!
    }

}