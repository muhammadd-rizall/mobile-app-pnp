package com.rizal.tanggal14

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rizal.tanggal14.adapter.GaleryAdapter
import com.rizal.tanggal14.model.MockList
import com.rizal.tanggal14.model.ModelGalery

class RecycleGalery : AppCompatActivity() {
    private lateinit var rv_galery : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_galery)

        rv_galery = findViewById(R.id.rv_galery)

        rv_galery.layoutManager = GridLayoutManager(this,2)
        val adapter = GaleryAdapter(MockList.getModel() as ArrayList<ModelGalery>, this)
        rv_galery.adapter = adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}