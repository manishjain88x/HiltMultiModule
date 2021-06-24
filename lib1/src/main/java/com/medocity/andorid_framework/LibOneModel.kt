package com.medocity.andorid_framework

import android.util.Log

class LibOneModel {
    init {
        Log.i("MyLog", "inside LibOneModel ")
    }

    fun getMessage():String {
        return "LibOneModel calling..."
    }
}