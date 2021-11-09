package com.example.hw_product_recycleview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_product_recycleview.*
import com.example.hw_product_recycleview.model.Product
import androidx.navigation.findNavController

class productAdapter (
    private val context: Context,
    private val dataset: List<Product>
) : RecyclerView.Adapter<productAdapter.ProductViewHolder>(){



    class ProductViewHolder(internal val view : View): RecyclerView.ViewHolder(view){
        val nameText : TextView = view.findViewById(R.id.item_title)
        val priceText : TextView = view.findViewById(R.id.price)
        val imageView : ImageView = view.findViewById(R.id.item_image)
        val buttonView : Button = view.findViewById(R.id.button)
        val isVibView : ImageView = view.findViewById(R.id.imageView2)
        val qunN : TextView = view.findViewById(R.id.qunNum)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
      val adapterLayout = LayoutInflater.from(parent.context)
          .inflate(R.layout.product_item,parent,false)
        return ProductViewHolder(adapterLayout)
    }


    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val item = dataset[position]
        holder.nameText.text = context.resources.getString(item.productName)
        holder.priceText.text = context.resources.getString(item.productPrice)
        holder.imageView.setImageResource(item.productImage)
        holder.isVibView.setImageResource(item.isVip)

        holder.qunN.text = context.resources.getString(item.quantityNumber)



        if (holder.qunN.text == "0"){
            holder.buttonView.setOnClickListener(){
                val toast = Toast.makeText(context,"The product is not available right now",Toast.LENGTH_SHORT)
                toast.show()
            }

        }else {
            holder.buttonView.setOnClickListener(){
            val action = ProductListFragmentDirections.actionProductListFragmentToMobaileFragment(iphone = holder.nameText.text.toString())
                holder.buttonView.findNavController().navigate(action)

            }
        }
    }

    override fun getItemCount(): Int = dataset.size
}



