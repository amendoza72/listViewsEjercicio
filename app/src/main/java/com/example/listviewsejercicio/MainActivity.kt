package com.example.listviewsejercicio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.listviewsejercicio.adapters.PersonaAdapter
import com.example.listviewsejercicio.models.Persona

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listViewItems: ListView = findViewById(R.id.listViewItems)
        var listaPersonas = leerPersonas()
        var personaAdapter = PersonaAdapter(this, listaPersonas)

        listViewItems.adapter = personaAdapter
    }

    private fun leerPersonas(): ArrayList<Persona> {
        var lista = ArrayList<Persona>()

        for (indice in (0 ..10)){
            var persona = Persona ("Nombre$indice", "Apellido$indice")
            lista.add(persona)
        }

        return lista
    }
}