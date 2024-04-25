package com.yahya.challengechapter3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(val callback: (String) -> Unit) : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    private val differ = AsyncListDiffer(this, DIFF_CALLBACK)
    fun submitList(list: List<String>) = differ.submitList(list)

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvHuruf: TextView = itemView.findViewById(R.id.city)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapter.ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListAdapter.ListViewHolder, position: Int) {
        holder.tvHuruf.text = differ.currentList[position].toString()
        holder.itemView.setOnClickListener {
            callback(differ.currentList[position])
        }
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    companion object {
        val DIFF_CALLBACK = object: DiffUtil.ItemCallback<String>() {
            override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
                return oldItem == newItem
            }

            override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
                return oldItem == newItem
            }
        }
    }
}