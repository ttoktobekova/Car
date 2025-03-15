package com.example.cameraappkotlin.ui.fragment.rvExample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cameraappkotlin.databinding.FragmentTwoBinding

class TwoFragment : Fragment() {
    private var _binding: FragmentTwoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTwoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args = TwoFragmentArgs.fromBundle(requireArguments())
        val car = args.carDataModel
        binding.tvName.text = car.name
        binding.tvYear.text = car.year.toString()
        binding.ivUser.setImageResource(car.image)
    }
}