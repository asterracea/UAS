package com.example.uas

import android.os.Parcel
import android.os.Parcelable

data class datafood(val image:Int, val name:String, var bahan:Int, var resep:Int) : Parcelable { //parcelable untuk mengirim objek
    constructor(parcel: Parcel) : this( //membaca properti objek dari parcel
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readInt(),
    ){
    }
    override fun writeToParcel(parcel: Parcel, flags: Int) {//menulis properti ke objek parcel
        parcel.writeInt(image)
        parcel.writeString(name)
        parcel.writeInt(bahan)
        parcel.writeInt(resep)
    }
    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<datafood> {   //menyediakan method yang diperlukan untuk membuat objek datafood dari parcel
        override fun createFromParcel(parcel: Parcel): datafood {
            return datafood(parcel)
        }

        override fun newArray(size: Int): Array<datafood?> {
            return arrayOfNulls(size)
        }
    }
}
