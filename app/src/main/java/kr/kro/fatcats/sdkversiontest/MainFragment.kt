package kr.kro.fatcats.sdkversiontest

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import kr.kro.fatcats.sdkversiontest.databinding.FragmentMainBinding

@AndroidEntryPoint
class MainFragment : BaseFragment(){

    private lateinit var binding: FragmentMainBinding
    private val viewModel : MainViewModel by activityViewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(requireActivity().layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        lifecycleScope.launch {

            Log.e("TAG", "onViewCreated: 진입 ", )
            viewModel.setText("테스트입니다.")
            val isRun = viewModel.isRun()
            Log.e("TAG", "isRun: $isRun ", )
        }
        lifecycleScope.launchWhenResumed {
            viewModel.collectTest()
        }
        binding.testButton.setOnClickListener {
            findNavController().navigate(R.id.firstFragment)
        }


    }
}