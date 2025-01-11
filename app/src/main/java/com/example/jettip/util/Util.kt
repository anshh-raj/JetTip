package com.example.jettip.util

fun calculateTotalTip(totalBill: String, tipPercentage: Int): Double {
    return if (totalBill.trim().isNotEmpty() && totalBill.toDouble() > 0){
        (totalBill.toDouble() * tipPercentage)/100
    }
    else 0.0
}

fun calculateTotalPerPerson(
    totalBill: String,
    split: Int,
    tipPercentage: Int
): Double{
    var bill = 0.0
    if(totalBill.trim().isNotEmpty() && totalBill.toDouble() > 0) {
        bill = calculateTotalTip(totalBill, tipPercentage) + totalBill.toDouble()
    }
    return bill/split
}