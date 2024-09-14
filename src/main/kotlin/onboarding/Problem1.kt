package onboarding

import camp.nextstep.edu.missionutils.Randoms

//fun solution1(pobi: List<Int>, crong: List<Int>): Int {
//
//}

fun makePageNumbers(): List<Int> {
    var leftPage = 0
    var rightPage = 0
    val pageNumbers = mutableListOf<Int>()
    while (leftPage % 2 == 0) {
        leftPage = Randoms.pickNumberInRange(3, 397)
    }
    rightPage = leftPage + 1
    pageNumbers.add(0,leftPage)
    pageNumbers.add(1,rightPage)
    return pageNumbers
}

fun main() {
    makePageNumbers()
}