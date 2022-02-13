package com.riyagung.uas_ppb_gasal_2022

import com.smarteist.autoimageslider.SliderViewAdapter
import android.view.ViewGroup
import android.view.View
import android.view.LayoutInflater
import com.riyagung.uas_ppb_gasal_2022.R
import android.widget.ImageView

class SliderAdapter(var images: IntArray) : SliderViewAdapter<SliderAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup): Holder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.slider_item, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(viewHolder: Holder, position: Int) {
        viewHolder.imageView.setImageResource(images[position])
    }

    override fun getCount(): Int {
        return images.size
    }

    inner class Holder(itemView: View) : ViewHolder(itemView) {
        var imageView: ImageView

        init {
            imageView = itemView.findViewById(R.id.image_view)
        }
    }
}