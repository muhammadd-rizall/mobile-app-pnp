package com.rizal.tanggal14.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.rizal.tanggal14.GaleryDetail
import com.rizal.tanggal14.R
import com.rizal.tanggal14.model.ModelGalery

class GaleryAdapter(
    private val itemList: ArrayList<ModelGalery>,
    private val context: Context
) : RecyclerView.Adapter<GaleryAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemImage: ImageView = itemView.findViewById(R.id.gambar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recycle_image, parent, false)
        return MyViewHolder(nView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemList[position]

        // Set images for the item
        holder.itemImage.setImageResource(currentItem.image)

        // Set click listener for the image
        holder.itemImage.setOnClickListener {
            openDetailActivity(currentItem.image)
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    // Function to start GalleryDetailActivity and pass the clicked image resource ID
    private fun openDetailActivity(imageResId: Int) {
        val intent = Intent(context, GaleryDetail::class.java)
        intent.putExtra("imageResId", imageResId)
        context.startActivity(intent)
    }
}
