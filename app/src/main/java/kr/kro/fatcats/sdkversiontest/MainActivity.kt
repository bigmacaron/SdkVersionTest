package kr.kro.fatcats.sdkversiontest

import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import kr.kro.fatcats.sdkversiontest.databinding.ActivityMainBinding

@AndroidEntryPoint
class MainActivity : FragmentActivity() {

    private lateinit var binding : ActivityMainBinding
    private val viewModel : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        lifecycleScope.launchWhenCreated {
            if (savedInstanceState == null) {
                supportFragmentManager.beginTransaction()
                    .replace(binding.rootFragment.id, MainFragment())
                    .commitNow()
            }
        }
    }
}