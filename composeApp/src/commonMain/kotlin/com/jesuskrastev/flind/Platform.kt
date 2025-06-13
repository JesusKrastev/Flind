package com.jesuskrastev.flind

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform