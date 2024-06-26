package com.example.nbcsporsassignmentapp.presentation.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nbcsporsassignmentapp.R
import com.example.nbcsporsassignmentapp.domain.models.Shelf

class HomeShelfListAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        private const val TYPE_SHELF = 0
    }

    private var shelves: List<Shelf> = emptyList()

    inner class ShelfViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val shelfTitle: TextView = itemView.findViewById(R.id.tvShelfTitle)
        val childRecyclerView: RecyclerView = itemView.findViewById(R.id.rvShelfItemsList)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_shelf, parent, false)
        return ShelfViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val shelf = shelves[position]
        if (holder is ShelfViewHolder) {
            holder.shelfTitle.text = shelf.title
            val childAdapter = ShelfItemListAdapter(shelf.shelfItems)
            holder.childRecyclerView.layoutManager =
                LinearLayoutManager(holder.itemView.context, LinearLayoutManager.HORIZONTAL, false)
            holder.childRecyclerView.adapter = childAdapter
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (shelves[position].type) {
            "Shelf" -> TYPE_SHELF
            else -> throw IllegalArgumentException("Invalid type of data $position")
        }
    }

    override fun getItemCount(): Int {
        return shelves.size
    }

    fun setShelves(shelves: List<Shelf>) {
        this.shelves = shelves
        notifyDataSetChanged()
    }
}