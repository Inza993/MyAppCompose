package com.example.tech.myappcompose

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class Test(initialValue: Int, val multiplier: Int): ReadWriteProperty<Any?, Int> {
    var fieldValue = initialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        println("getValue() called with: thisRef = $thisRef, property = $property")
        return fieldValue
    }

    override fun setValue(
        thisRef: Any?,
        property: KProperty<*>,
        value: Int
    ) {
        println(
            "setValue() called with: thisRef = $thisRef, property = $property, value = $value"
        )
        if (value > 1){
            fieldValue = value * multiplier
        }
    }

}

fun main() {
    var num by Test(2, 2)
    println(num)
    num = 4
    println(num)
}
