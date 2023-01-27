package com.vik.jfrogartifactconsumer

import android.graphics.Color
import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.vik.artifactory_jfrog_upload.SimpleTest
import com.vik.jfrogartifactconsumer.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }

        val consumerObjec :SimpleTest= SimpleTest()

        binding.textviewFirst.text =consumerObjec.getName("Client")
        binding.textviewFirst.setTextColor(ContextCompat.getColor(requireContext(),com.vik.artifactory_jfrog_upload.R.color.lib_red))

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}