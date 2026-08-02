package ru.nto.guestmanagement

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class HealthController {

    @GetMapping("/health")
    fun health(): HealthResponse = HealthResponse(
        status = "ok",
        service = "guest-management-backend",
        version = "1.0.0"
    )
}

data class HealthResponse(
    val status: String,
    val service: String,
    val version: String
)
