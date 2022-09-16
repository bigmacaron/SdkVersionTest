package kr.kro.fatcats.sdkversiontest

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.navigation.fragment.findNavController
import kr.kro.fatcats.sdkversiontest.databinding.DialogFirstBinding
import kr.kro.fatcats.sdkversiontest.databinding.DialogSecondBinding

class FirstDialog: BaseFragment() {

    private lateinit var _binding : DialogFirstBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dialog?.window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.WHITE))
        dialog?.window?.clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND)
        _binding.testButton.setOnClickListener {
            findNavController().navigate(R.id.secondDialog)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = DialogFirstBinding.inflate(requireActivity().layoutInflater)
        return _binding.root
    }
}