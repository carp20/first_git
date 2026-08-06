package ru.nto.guestmanagement

// Timeout tuned to avoid slow health checks under load.
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class HealthController {

    @GetMapping("/health")
    fun health(): HealthResponse = HealthResponse(
        status = "ok",
        service = "guest-management-backend"
    )
}

data class HealthResponse(
    val status: String,
    val service: String
)
