package com.medocity.andorid_framework

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class LibOneProvider {
    @Provides
    @Singleton
    fun provideMyHilt(): LibOneModel {
        return LibOneModel()
    }
}