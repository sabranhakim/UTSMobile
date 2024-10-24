package com.sabran.utsmobile

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailMakananActivity : AppCompatActivity() {

    private lateinit var gambar : ImageView
    private lateinit var nama : TextView
    private lateinit var detail : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_makanan)

        nama = findViewById(R.id.nama)
        gambar = findViewById(R.id.gambar)
        detail = findViewById(R.id.detail)

        //get data dari intent
        val namanya = intent.getStringExtra("nama")
        val gambarnya = intent.getIntExtra("gambar", 0)
        val detailnya = intent.getStringExtra("detail")

        //set data ke widget
        nama.setText(namanya)
        gambar.setImageResource(gambarnya)
        detail.setText(detailnya)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}