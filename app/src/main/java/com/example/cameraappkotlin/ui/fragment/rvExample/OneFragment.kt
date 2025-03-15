package com.example.cameraappkotlin.ui.fragment.rvExample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cameraappkotlin.R
import com.example.cameraappkotlin.ui.adapter.CarAdapter
import com.example.cameraappkotlin.databinding.FragmentOneBinding
import com.example.cameraappkotlin.ui.model.Car

class OneFragment : Fragment() {
    private var _binding: FragmentOneBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOneBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val cars = listOf(
            Car(getString(R.string.tayota), 2024, R.drawable.img_tayota),
            Car(getString(R.string.mercedes), 2020, R.drawable.img_mercedes),
            Car(getString(R.string.ferrari), 2021, R.drawable.img_ferrari),
            Car(getString(R.string.bmw), 2021, R.drawable.img_bmw),
        )

        val adapter = CarAdapter(cars) { user ->
            val action = OneFragmentDirections.actionOneFragmentToTwoFragment(user)
            findNavController().navigate(action)
        }
        binding.recyclerView.adapter = adapter
    }
}