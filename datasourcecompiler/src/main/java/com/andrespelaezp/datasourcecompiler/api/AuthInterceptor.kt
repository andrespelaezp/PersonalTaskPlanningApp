package com.andrespelaezp.datasourcecompiler.api

import okhttp3.Interceptor
import okhttp3.Response

class AuthInterceptor(private val tokenProvider: TokenProvider) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val token = tokenProvider.getToken()
        val request = chain.request().newBuilder()
            .addHeader("Authorization", "Basic $token")
            .build()
        return chain.proceed(request)
    }
}