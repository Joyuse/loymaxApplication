package com.example.saray.app

import android.content.Context
import android.content.SharedPreferences
import loymax.sdk.tokenManager.TokenStorage

class SharedPreferencesTokenStorage(context: Context) : TokenStorage {

    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences("app_prefs", Context.MODE_PRIVATE)

    override fun saveToken(token: String) {
        sharedPreferences.edit().putString("bearer_token", token).apply()
    }

    override fun getToken(): String? {
        return sharedPreferences.getString("bearer_token", null)
    }
}