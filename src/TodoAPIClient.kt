package io.kraftsman

import io.ktor.client.*
import io.ktor.client.request.*

/**
 * Todo API Client
 * 
 * Sample Ktor API for Todo
 */
open class TodoAPIClient(val endpoint: String, val client: HttpClient = HttpClient()) {
    /**
     * null
     * 
     * Get all tasks
     * 
     * @return A list of tasks
     */
    suspend fun getTasks(
    ): List<Task> {
        return client.get<List<Task>>("$endpoint/tasks") {
        }
    }

    /**
     * null
     * 
     * Add a new task
     * 
     * @return Successful operation
     */
    suspend fun postTasks(
    ): Unit {
        return client.post<Unit>("$endpoint/tasks") {
        }
    }

    /**
     * null
     * 
     * Complete a task
     * 
     * @param taskId Numeric ID of the task to complete
     * 
     * @return Successful operation
     */
    suspend fun postTasksTaskIdComplete(
        taskId: Int // PATH
    ): Unit {
        return client.post<Unit>("$endpoint/tasks/$taskId/complete") {
        }
    }

    /**
     * null
     * 
     * Delete a task
     * 
     * @param taskId Numeric ID of the task to delete
     * 
     * @return Successful operation
     */
    suspend fun postTasksTaskIdDelete(
        taskId: Int // PATH
    ): Unit {
        return client.post<Unit>("$endpoint/tasks/$taskId/delete") {
        }
    }
}
