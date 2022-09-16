package kr.kro.fatcats.sdkversiontest

import kotlinx.coroutines.CoroutineDispatcher
import kr.kro.fatcats.sdkversiontest.annotation.IoDispatcher
import javax.inject.Inject

class AnotherRepository @Inject constructor(
    @IoDispatcher private val ioDispatcher: CoroutineDispatcher
) {

}