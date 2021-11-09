package com.example.hw_product_recycleview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_product_recycleview.adapter.productAdapter
import com.example.hw_product_recycleview.data.Datasource
import com.example.hw_product_recycleview.databinding.FragmentProductListBinding

private var _binding: FragmentProductListBinding? = null
private lateinit var recyclerView: RecyclerView

private val binding get() = _binding!!
class ProductListFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentProductListBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val productData = Datasource().loadAffirmations()
        recyclerView = binding.recyclerView
        recyclerView.adapter = productAdapter(this.requireContext(),productData)
        recyclerView.setHasFixedSize(true)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}