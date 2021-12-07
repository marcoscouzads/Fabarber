package com.marcoscsouzads.marcoscassianoat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.marcoscsouzads.marcoscassianoat.databinding.FragmentSellBinding


class SellFragment : Fragment() {
    private var _binding: FragmentSellBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSellBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }


}