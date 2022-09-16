package kr.kro.fatcats.sdkversiontest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kr.kro.fatcats.sdkversiontest.databinding.FragmentFirstBinding
import kr.kro.fatcats.sdkversiontest.databinding.FragmentMainBinding
import kr.kro.fatcats.sdkversiontest.databinding.FragmentSecondBinding

class FirstFragment : BaseFragment() {

    private lateinit var _binding : FragmentFirstBinding



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding.testButton.setOnClickListener {
            findNavController().navigate(R.id.secondFragment)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstBinding.inflate(requireActivity().layoutInflater)
        return _binding.root
    }
}