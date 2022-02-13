package com.riyagung.uas_ppb_gasal_2022

var produkList = mutableListOf<Produk>()

val PRODUK_ID_EXTRA = "produkExtra"

class Produk (
    var cover: Int,
    var title: String,
    var description: String,
    val id: Int? = produkList.size

)