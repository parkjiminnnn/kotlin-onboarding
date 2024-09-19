package onboarding

fun solution5(money: Int): List<Int> {
    val amountList = listOf(50000, 10000, 5000, 1000, 500, 100, 50, 10, 1)
    var leftAmount = money
    val result = mutableListOf<Int>()

    for (i in amountList.indices) {
        result.add(i, leftAmount / amountList[i])
        leftAmount = money % amountList[i]
    }

    return result
}
