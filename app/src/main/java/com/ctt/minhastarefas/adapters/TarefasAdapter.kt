package com.ctt.minhastarefas.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ctt.minhastarefas.R
import com.ctt.minhastarefas.model.Tarefas

class TarefasAdapter(private val listaTarefas: MutableList<Tarefas>) :
    RecyclerView.Adapter<TarefasAdapter.TarefasHolder>() {

    class TarefasHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titulo: TextView = view.findViewById(R.id.edtTitulo)
        val descricao: TextView = view.findViewById(R.id.edtDescricao)
    }

    fun adicionarTarefa(novaTarefa: Tarefas) {
        listaTarefas.add(novaTarefa)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefasHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_lista, parent,false)

        return TarefasHolder(view)
    }

    override fun onBindViewHolder(holder: TarefasHolder, position: Int) {
        holder.titulo.text = listaTarefas[position].titulo
        holder.descricao.text = listaTarefas[position].descricao
    }

    override fun getItemCount(): Int {
    return listaTarefas.size
    }
}
