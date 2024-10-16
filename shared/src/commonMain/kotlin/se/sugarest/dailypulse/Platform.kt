package se.sugarest.dailypulse

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform