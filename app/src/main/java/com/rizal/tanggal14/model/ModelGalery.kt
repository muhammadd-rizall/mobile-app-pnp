package com.rizal.tanggal14.model

import android.media.Image
import com.rizal.tanggal14.R

data class ModelGalery(
    val image: Int
)

object MockList{

    fun getModel() : List<ModelGalery>{
        val  itemModel1 = ModelGalery(
            R.drawable.logopoli
        )

        val  itemModel2 = ModelGalery(
            R.drawable.gambar1

        )

        val  itemModel3 = ModelGalery(
            R.drawable.gambar2

        )

        val  itemModel4 = ModelGalery(
            R.drawable.gambar3

        )

        val  itemModel5 = ModelGalery(
            R.drawable.gambar4
        )

        val  itemModel6 = ModelGalery(
            R.drawable.gambar5

        )

        val itemList:ArrayList<ModelGalery> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)

        return itemList

    }
}
