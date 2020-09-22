package com.example.apitest

import com.google.gson.annotations.SerializedName

class PostModel {

    //@SerializedName("id") se quiser definir um nome customizado para um atributo da API, utilizar @SerializedName ("tituloNaAp")
    @SerializedName("id")
    var id: Int = 0

    @SerializedName("userId")
    var userId: Int = 0

    @SerializedName("title")
    var title: String = ""

    @SerializedName("body")
    var body: String = ""


}