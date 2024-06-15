package com.example.verdeevida

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform