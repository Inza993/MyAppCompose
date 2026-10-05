package com.example.tech.myappcompose


class SmartDevice {
    val name = "Android TV"
    val category = "Entertainment"
    var deviceStatus = "online"
    var speakerVolume: Int = 0
        get() {
            println("get..")
            return field+2
        }
//        private
        set(value) {
            println("set..")
            field = if (value < 10)
                value + 10
            else
                value
        }

    fun turnOn() {
        println("Smart device is turned on.")
    }

    fun turnOff() {
        println("Smart device is turned off.")
    }
}

class SmartHome(val name: String, val category: String) {
    var deviceStatus = "online"

    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }
}

fun main() {
    var favoriteActor: String? = null

    val lengthOfName: Int? = favoriteActor?.length

    println("The number of characters in your favorite actor's name is $lengthOfName.")

    val device = SmartDevice()
    device.speakerVolume = 1
    print(device.speakerVolume)
    print(device.speakerVolume)
    print(device.speakerVolume)

    val home = SmartHome("test", "test C", 0)
    println(home.deviceStatus)
}