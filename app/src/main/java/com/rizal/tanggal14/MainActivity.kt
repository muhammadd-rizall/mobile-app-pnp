package com.rizal.tanggal14

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnmi : Button
    private lateinit var btntk : Button
    private lateinit var btngalery : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnmi = findViewById(R.id.btnmi)
        btntk = findViewById(R.id.btntk)
        btngalery = findViewById(R.id.btngaleri)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnmi.setOnClickListener(){
            val intent = Intent(this@MainActivity, ManajemenInformatika::class.java)
            startActivity(intent)
        }

        btntk.setOnClickListener(){
            val intent = Intent(this@MainActivity, TeknikKomputer::class.java)
            startActivity(intent)
        }

        btngalery.setOnClickListener(){
            val intent = Intent(this@MainActivity, RecycleGalery::class.java)
            startActivity(intent)
        }
    }
}