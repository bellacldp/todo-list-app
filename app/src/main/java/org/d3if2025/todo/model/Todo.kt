package org.d3if2025.todo.model

import com.google.gson.annotations.SerializedName

data class Todo(
    @SerializedName("data")
    val data: List<Data>,
    @SerializedName("message")
    val message: String
)