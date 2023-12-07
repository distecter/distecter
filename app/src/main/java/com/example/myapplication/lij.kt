package com.example.myapplication

fun main() {

    var operator = '+'
    val num1=1
    val num2=3

    if (operator === '+') {
        println(num1 + num2)
    } else if (operator === '-') {
        println(num1 - num2)
    } else if (operator === '*') {
        println(num1 * num2)
    } else if (operator === '/') {
        println(num1 / num2)
    } else if (operator === '%') {
        println(num1 % num2)
    } else {
        println("잘못된 입력입니다.")
    }
}