package com.Kareem.myapplication.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.Kareem.myapplication.adapter.RecipeAdapter
import com.Kareem.myapplication.data.DataRecipe
import com.Kareem.myapplication.databinding.FragmentBreakfastBinding

class BreakfastFragment : Fragment() {

    private var _binding: FragmentBreakfastBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentBreakfastBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvBreakfast.apply{
            layoutManager = GridLayoutManager(activity, 2)
            adapter = RecipeAdapter(DataRecipe.listBreakfast)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}