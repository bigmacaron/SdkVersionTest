package kr.kro.fatcats.sdkversiontest

import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainRepository  @Inject constructor(
    private val externalScope: CoroutineScope
){

    suspend fun isRun(): Boolean{
        externalScope.launch {
            Log.e("TAG", "isRun: ", )
        }
        return true
    }

}