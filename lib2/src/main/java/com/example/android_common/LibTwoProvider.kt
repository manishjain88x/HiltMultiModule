package com.example.android_common

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class LibTwoProvider {
    @Provides
    @Singleton
    fun provideMyHilt(): LibTwoModel {
        return LibTwoModel()
    }
}