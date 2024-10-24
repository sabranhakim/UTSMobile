package com.sabran.utsmobile.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sabran.utsmobile.DetailMakananActivity
import com.sabran.utsmobile.Model.FavoritesModel
import com.sabran.utsmobile.PageOurFavorites
import com.sabran.utsmobile.R

class FavoritesAdapter
    (
    private val list: ArrayList<FavoritesModel>,
    val getActivity: PageOurFavorites
) :
    RecyclerView.Adapter<FavoritesAdapter.MyViewHolder>()
{
    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemImage : ImageView
        var itemNama : TextView
        var itemDetail : TextView

        init {
            itemImage = itemView.findViewById(R.id.gambar) as ImageView
            itemNama = itemView.findViewById(R.id.nama) as TextView
            itemDetail = itemView.findViewById(R.id.detail) as TextView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_fav, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemImage.setImageResource(list[position].gambar)
        holder.itemNama.setText(list[position].nama)
        holder.itemDetail.setText(list[position].detail)

        //kita tambahkan intent
        holder.itemView.setOnClickListener{
            //intent
            //context atau this ----> getActivity
            val intent = Intent(getActivity, DetailMakananActivity::class.java)
            //kita put data untuk kita passed ke detail
            intent.putExtra("gambar", list[position].gambar)
            intent.putExtra("nama", list[position].nama)
            intent.putExtra("detail", list[position].detail)

            getActivity.startActivity(intent)
        }
    }
}