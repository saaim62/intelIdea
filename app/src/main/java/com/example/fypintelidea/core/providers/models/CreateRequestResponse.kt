package com.example.fypintelidea.core.providers.models

import com.connectavo.app.connectavo_android.core.services.ConnectavoBaseApiResponse


data class CreateRequestResponse(
    val id: String? = null,
    val name: String? = null
) : ConnectavoBaseApiResponse()