package com.example.cameraappkotlin.ui.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Car(
    val name:String,
    val year:Int,
    val image: Int
):Parcelable
