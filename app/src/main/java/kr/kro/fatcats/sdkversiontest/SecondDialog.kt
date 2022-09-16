package kr.kro.fatcats.sdkversiontest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kr.kro.fatcats.sdkversiontest.databinding.DialogSecondBinding

class SecondDialog: BaseFragment() {

    private lateinit var _binding : DialogSecondBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = DialogSecondBinding.inflate(requireActivity().layoutInflater)
        return _binding.root
    }
}