package com.example.myapplicationlab2

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplicationlab2.databinding.ItemHolderBinding

class ViewPagerAdapter(
    private val context: Context,
    private val labelList: MutableList<String>,
    private val labelList2: MutableList<String>
) : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        val binding = ItemHolderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewPagerHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {
        val label = labelList[position]
        val label2 = labelList2[position]
        holder.bind(label, label2)
    }

    override fun getItemCount(): Int {
        return labelList.size
    }

    class ViewPagerHolder(private var itemHolderBinding: ItemHolderBinding) :
        RecyclerView.ViewHolder(itemHolderBinding.root) {
        fun bind(label: String, label2: String) {
            itemHolderBinding.label.text = label
            itemHolderBinding.label2.text = label2
        }
    }
}
