package com.example.testarquitecture2023.addtasks.ui.model

data class TaskModel(
    val id : Long = System.currentTimeMillis(),
    val task: String,
    val selected: Boolean = false
)
