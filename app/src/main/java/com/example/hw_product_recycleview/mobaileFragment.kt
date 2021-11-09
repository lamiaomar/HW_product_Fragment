package com.example.hw_product_recycleview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw_product_recycleview.databinding.FragmentMobaileBinding

class mobaileFragment : Fragment() {
    companion object {
        val prouctName= "iphone"
    }
    private var _binding: FragmentMobaileBinding? = null
    private val binding get() = _binding!!
lateinit var proudct : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        proudct = it.getString(prouctName).toString()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMobaileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.textView.text = proudct
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}