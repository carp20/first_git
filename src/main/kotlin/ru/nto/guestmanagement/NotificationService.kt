package ru.nto.guestmanagement

import org.springframework.stereotype.Service

@Service
class NotificationService {

    fun notifyGuest(guestId: String): String =
        "Notification queued for guest $guestId"
}
