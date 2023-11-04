package com.example.lab9tspp1.models

import java.util.Date

data class DanceVideoResponse(
    var id:Int,
    var textResponse:String = "",
    var data: Date,
    var request: DanceVideosRequest
)
