package com.example.hw_product_recycleview.data

import com.example.hw_product_recycleview.R
import com.example.hw_product_recycleview.model.Product

class Datasource {
    fun loadAffirmations(): List<Product> {
        return listOf<Product>(
            Product(R.drawable.iphone , R.string.product_name1 , R.string.productPrice1,
                    R.drawable.star2,R.string.quantityNumber1),
            Product(R.drawable.samsung_galaxy_uitra , R.string.product_name2 , R.string.productPrice2,
                R.drawable.whitestarimage1,R.string.quantityNumber2),
            Product(R.drawable.xiaomi_pro , R.string.product_name3 , R.string.productPrice3,
                R.drawable.star2,R.string.quantityNumber3),
            Product(R.drawable.huawei_yp , R.string.product_name4 , R.string.productPrice4,
                R.drawable.whitestarimage1,R.string.quantityNumber4),
            Product(R.drawable.samsung_galaxy_z_flip , R.string.product_name5 , R.string.productPrice5,
                R.drawable.star2,R.string.quantityNumber5),
            Product(R.drawable.iphone13 , R.string.product_name6 , R.string.productPrice6,
                R.drawable.star2,R.string.quantityNumber6)
        )
    }
}