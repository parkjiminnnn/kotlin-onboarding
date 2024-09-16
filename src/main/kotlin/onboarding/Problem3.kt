package onboarding

fun solution3(number: Int): Int {
    var clapTimes = 0
    val numberArray = mutableListOf<String>()
    for (i in 0 until number) {
        numberArray.add(i, "${i + 1}")
    }
    return clapTimes
}
