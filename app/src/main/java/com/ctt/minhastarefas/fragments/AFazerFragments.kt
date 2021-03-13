package com.ctt.minhastarefas.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ctt.minhastarefas.R
import com.ctt.minhastarefas.adapters.PageAdapter
import com.ctt.minhastarefas.adapters.TarefasAdapter
import com.ctt.minhastarefas.model.Tarefas

class AFazerFragments : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragments_afazer, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listaTarefas = mutableListOf<Tarefas>(
            Tarefas(titulo = " Ir ao mercado", descricao = "Comprar arroz"),
            Tarefas(titulo = " Estudar POO", descricao = "Estudar herança e polimorfismo"),
            Tarefas(titulo = " Terminar app Minhas Tarefas", descricao = "")
        )

        val rvTarefas = view.findViewById<RecyclerView>(R.id.recyclerTarefas)

        val adapterTarefas = TarefasAdapter(listaTarefas)
        rvTarefas.adapter = adapterTarefas
        rvTarefas.layoutManager = LinearLayoutManager(requireContext())
    }
}