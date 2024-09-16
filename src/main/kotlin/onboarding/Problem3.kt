package onboarding

fun solution3(number: Int): Int {
    var clapTimes = 0
    val numbersList = mutableListOf<String>()
    for (i in 0 until number) {
        numbersList.add(i, "${i + 1}")
        val numberItemList = numbersList[i].split("")
        for (element in numberItemList) {
            if (element.contains("3")) {
                clapTimes++
            } else if (element.contains("6")) {
                clapTimes++
            } else if (element.contains("9")) {
                clapTimes++
            }
        }

    }
    return clapTimes
}
