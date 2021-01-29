package com.example.weatherwidget.ui.content

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.weatherwidget.databinding.FragmentContentBinding


class ContentFragment : Fragment() {

    private var _binding: FragmentContentBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentContentBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private val viewModel: ContentViewModel by viewModels()
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        //set OnClickListener
        binding.forecast5dBttn.setOnClickListener(clickListener)

        //set Observer
        val nameObserver = Observer<String> { newCity ->
            binding.cityTv.text = newCity
        }
        viewModel.currentCity.observe(viewLifecycleOwner, nameObserver)

    }
    val clickListener = View.OnClickListener {view ->
        when(view){
            binding.forecast5dBttn ->{

            }
        }
    }


}