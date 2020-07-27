package org.soumen

/**
 * @author Soumen Karmakar
 * 27/07/2020
 */

val fiboNacciSeq = sequence {
    var a = 0
    var b = 1
    yield(1)
    while (true) {
        yield(a + b)
        val tmp = a + b
        a = b
        b = tmp
    }
}

fun main() {
    val toList = fiboNacciSeq.take(5).toList()
    println(toList)
}
