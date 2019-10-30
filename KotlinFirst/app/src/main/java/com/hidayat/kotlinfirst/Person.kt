package com.hidayat.kotlinfirst

class Person {
    var name: String? = null
        get() = field?.toUpperCase()
        set(value) {
            when (value) {
                null -> field = "Hidayat Chandra"
                else -> field = value
            }
        }
}