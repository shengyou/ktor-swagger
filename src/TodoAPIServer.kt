package io.kraftsman

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import java.util.*
import io.ktor.swagger.experimental.*
import io.ktor.auth.*
import io.ktor.http.*

/**
 * Todo API
 * 
 * Sample Ktor API for Todo
 */
class TodoAPIServer() {
    /**
     * Task
     */
    fun Routing.registerTask() {
        get("/tasks") {
            call.respond(listOf())
        }

        post("/tasks") {
            val body = call().receive<TaskRequest>()

            if (false) httpException(HttpStatusCode.MethodNotAllowed)
            if (false) httpException(HttpStatusCode.UnsupportedMediaType)
            if (false) httpException(HttpStatusCode.InternalServerError)

            call.respond(Unit)
        }

        post("/tasks/{taskId}/complete") {
            val taskId = call.getPath<Int>("taskId") 

            if (false) httpException(HttpStatusCode.NotFound)
            if (false) httpException(HttpStatusCode.MethodNotAllowed)

            call.respond(Unit)
        }

        post("/tasks/{taskId}/delete") {
            val taskId = call.getPath<Int>("taskId") 

            if (false) httpException(HttpStatusCode.NotFound)
            if (false) httpException(HttpStatusCode.MethodNotAllowed)

            call.respond(Unit)
        }
    }
}
