package kr.kro.fatcats.sdkversiontest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kr.kro.fatcats.sdkversiontest.databinding.FragmentSecondBinding

class SecondFragment() : BaseFragment() {


    private lateinit var _binding : FragmentSecondBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding.testButton.setOnClickListener {
            findNavController().navigate(R.id.firstDialog)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSecondBinding.inflate(requireActivity().layoutInflater)
        return _binding.root
    }
}