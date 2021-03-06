package com.rjdeleon.legocatalog.legotheme.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.rjdeleon.legocatalog.databinding.ViewListItemThemeBinding
import com.rjdeleon.legocatalog.model.LegoTheme

class LegoThemeAdapter: ListAdapter<LegoTheme, LegoThemeAdapter.ViewHolder>(DiffCallback()){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ViewListItemThemeBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val legoTheme = getItem(position)
        holder.apply {
            bind(createOnClickListener(legoTheme.id, legoTheme.name), legoTheme)
            itemView.tag
        }
    }

    private fun createOnClickListener(id: Int, name: String): View.OnClickListener {
        return View.OnClickListener {
            /*
            TODO: Add following code

            val direction = LegoThemeFragmentDirections.actionThemeFragmentToSetsFragment(id, name)
            it.findNavController().navigate(direction)
             */
        }
    }

    class ViewHolder(private val binding: ViewListItemThemeBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(listener: View.OnClickListener, item: LegoTheme) {
            binding.apply {
                clickListener = listener
                legoTheme = item
                executePendingBindings()
            }
        }
    }
}

class DiffCallback: DiffUtil.ItemCallback<LegoTheme>() {
    override fun areItemsTheSame(oldItem: LegoTheme, newItem: LegoTheme): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: LegoTheme, newItem: LegoTheme): Boolean {
        return oldItem == newItem
    }

}
