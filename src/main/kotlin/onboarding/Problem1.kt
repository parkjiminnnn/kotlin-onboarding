package onboarding

import camp.nextstep.edu.missionutils.Randoms
import kotlin.math.max

fun solution1(pobi: List<Int>, crong: List<Int>): Int {
    val pobiScore = makeScore(pobi)
    val crongScore = makeScore(crong)


    if (pobiScore > crongScore) {
        return 1
    }
}

fun makeScore(who: List<Int>): Int {
    var leftPageSum = 0
    var rightPageSum = 0
    var leftPageProduct = 1
    var rightPageProduct = 1
    for (i in 0 until who[0].toString().length) {
        leftPageSum += who[0].toString().split("")[i].toInt()
        rightPageSum += who[1].toString().split("")[i].toInt()

        leftPageProduct *= who[0].toString().split("")[i].toInt()
        rightPageProduct *= who[1].toString().split("")[i].toInt()
    }
    val leftPageMax = max(leftPageSum, leftPageProduct)
    val rightPageMax = max(rightPageSum, rightPageProduct)
    val totalMax = max(leftPageMax, rightPageMax)

    return totalMax
}
