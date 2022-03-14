package com.algoexpert.program

fun getNthFib(n: Int): Int {
    if (n == 1) {
        return 0
    } else if (n == 2) {
        return 1
    } else {
        return getNthFib(n - 1) + getNthFib(n - 2)
    }
}
