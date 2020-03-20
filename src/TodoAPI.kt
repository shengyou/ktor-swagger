package io.kraftsman

import java.util.*
import io.ktor.http.*
import io.ktor.request.*
import io.ktor.swagger.experimental.*

data class Task(
    val id: Long,
    val title: String,
    val completed: Boolean,
    val createdAt: Date,
    val updatedAt: Date
)

data class TaskRequest(
    val title: String
)
