package onboarding

import kotlin.math.max

fun solution1(pobi: List<Int>, crong: List<Int>): Int {
    val pobiScore = makeScore(pobi)
    val crongScore = makeScore(crong)

    if (pobi[0] + 1 == pobi[1] && crong[0] + 1 == crong[1]) {
        if (pobiScore > crongScore) {
            return 1
        } else if (pobiScore < crongScore) {
            return 2
        } else if (pobiScore == crongScore) {
            return 0
        }

    }
    return -1
}

fun makeScore(who: List<Int>): Int {
    var leftPageSum = 0
    var rightPageSum = 0
    var leftPageProduct = 1
    var rightPageProduct = 1
    for (char in who[0].toString()) {
        leftPageSum += char.toString().toInt()
        leftPageProduct *= char.toString().toInt()
    }
    for (char in who[1].toString()) {
        rightPageSum += char.toString().toInt()
        rightPageProduct *= char.toString().toInt()
    }
    val leftPageMax = max(leftPageSum, leftPageProduct)
    val rightPageMax = max(rightPageSum, rightPageProduct)
    val totalMax = max(leftPageMax, rightPageMax)

    return totalMax
}
