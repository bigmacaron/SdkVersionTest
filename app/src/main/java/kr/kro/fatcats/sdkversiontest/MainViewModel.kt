package kr.kro.fatcats.sdkversiontest

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val mainRepository: MainRepository
) : ViewModel() {

    private val _contentData = MutableStateFlow<String?>(String())
    val contentData = _contentData.asStateFlow()

    private val _contentDataShared = MutableSharedFlow<String>()
    val contentDataShared = _contentDataShared.asSharedFlow()


    fun setText(textString : String?){
        textString?.let {
            _contentData.value = textString
            Log.e("TAG", "setText: $textString", )
            Log.e("TAG", "setText: ${contentData.value}", )
        }
    }

    fun setShared(){
        viewModelScope.launch {
            Log.e("TAG", "setShared:click", )
            _contentDataShared.emit("test")
        }

    }

    suspend fun isRun() : Boolean{
        return mainRepository.isRun()
    }
    fun collectTest(){
        viewModelScope.launch {
            contentDataShared.collectLatest { it ->
                _contentData.value = it
                Log.e("TAG", "collectTest: $it //// ${contentData.value} ", )
            }
        }
    }


}