package com.example.lab9tspp1.models

data class Choreographer(
    override var id: Int,
    override var login: String,
    override var password: String,
    override var userInfo: AdditionalUserInfo,
    var speciality: String = ""
) : User(id, login, password, userInfo)
