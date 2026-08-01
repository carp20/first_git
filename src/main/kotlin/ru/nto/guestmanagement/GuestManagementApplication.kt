package ru.nto.guestmanagement

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GuestManagementApplication

fun main(args: Array<String>) {
    runApplication<GuestManagementApplication>(*args)
}
