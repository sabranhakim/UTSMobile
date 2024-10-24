package com.sabran.utsmobile.Model

import com.sabran.utsmobile.R

data class FavoritesModel
    (
    val gambar : Int,
    val nama : String,
    val detail : String
)

object MakananList {
    fun getModel(): List<FavoritesModel> {
        val itemModel1 = FavoritesModel(
            R.drawable.chickencurry,
            "Chicken Curry",
            "Lorem ipsum dolor sit amet, consectetur",
        )
        val itemModel2 = FavoritesModel(
            R.drawable.chickenburger,
            "Chicken Burger",
            "Lorem ipsum dolor sit amet, consectetur",
        )
        val itemModel3 = FavoritesModel(
            R.drawable.broccolilasagna,
            "Broccoli Lasagna",
            "Lorem ipsum dolor sit amet, consectetur",
        )
        val itemModel4 = FavoritesModel(
            R.drawable.mexicanappetizer,
            "Mexican Appetizer",
            "Lorem ipsum dolor sit amet, consectetur",
        )
        val itemModel5 = FavoritesModel(
            R.drawable.chickenwings,
            "Chicken Wings",
            "Lorem ipsum dolor sit amet, consectetur",
        )
        val itemModel6 = FavoritesModel(
            R.drawable.milkshake,
            "Sweet Milkshake",
            "Lorem ipsum dolor sit amet, consectetur",
        )

        val itemList: ArrayList<FavoritesModel> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)

        return itemList
    }
}
