package com.sabran.utsmobile

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sabran.utsmobile.Adapter.FavoritesAdapter
import com.sabran.utsmobile.Model.FavoritesModel
import com.sabran.utsmobile.Model.MakananList

class PageOurFavorites : AppCompatActivity() {
    private lateinit var rv_makanan : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_our_favorites)

        rv_makanan= findViewById(R.id.rv_makanan)

        rv_makanan.layoutManager = GridLayoutManager(this,  2)
        val adapter = FavoritesAdapter(MakananList.getModel() as ArrayList<FavoritesModel> , this)
        rv_makanan.adapter = adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }
}