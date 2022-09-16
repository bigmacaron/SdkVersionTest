package kr.kro.fatcats.sdkversiontest

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kr.kro.fatcats.sdkversiontest.annotation.IoDispatcher

@InstallIn(SingletonComponent::class)
@Module
class DispatcherModule {
    @IoDispatcher
    @Provides
    fun provideIoDispatcher(): CoroutineDispatcher = Dispatchers.IO
}