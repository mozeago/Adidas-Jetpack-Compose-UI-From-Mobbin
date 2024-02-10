package com.tvtruelight.adidasjetpackcomposemobbin.data

import androidx.annotation.DrawableRes


data class ShoeInformationDataClass(
    val category: String, // Essentials
    val discount: Int, // +3%
    val gender: String, // Women's
    val name: String, // Puremotion 2.0 Shoes
    val price: Int, // KES 75.00
    @DrawableRes val imageUrl: Int
)