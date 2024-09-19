package onboarding

fun solution6(forms: List<List<String>>): List<String> {
    val emailList = mutableSetOf<String>()
    val nicknameList = mutableListOf<String>()
    for (i in forms.indices) {
        nicknameList.add(forms[i][1])
        for (char in 0 until nicknameList[i].length - 1) {
            for (end in char + 2..nicknameList[i].length) {
                val subString = nicknameList[i].substring(char, end)
                for (j in nicknameList.indices) {
                    if (nicknameList[j].contains(subString) && i != j) {
                        emailList.add(forms[i][0])
                        emailList.add(forms[j][0])
                    }
                }
            }
        }
    }
    return emailList.sorted()
}
