package org.soumen

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.concurrent.atomic.AtomicLong

/**
 * @author Soumen Karmakar
 * 27/07/2020
 */

fun main() {
    var c = AtomicLong()
    for (i in 1..1_000_000L) {
        GlobalScope.launch {
            c.addAndGet(i)
        }
    }
    println(c)
}
