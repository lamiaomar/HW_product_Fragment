package com.example.hw_product_recycleview.model

import androidx.annotation.DrawableRes

data class Product(
    @DrawableRes val productImage: Int,
                 val productName : Int,
                 val productPrice : Int ,
                 val isVip : Int,
                 val quantityNumber : Int )
