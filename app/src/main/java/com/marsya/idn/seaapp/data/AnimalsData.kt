package com.marsya.idn.seaapp.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class AnimalsData (
    var Name : String = " ",
    var Food : String = " ",
    var Description : String = " ",
    var photo : Int = 0,

    ): Parcelable