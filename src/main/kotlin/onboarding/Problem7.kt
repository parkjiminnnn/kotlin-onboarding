package onboarding

fun solution7(
    user: String,
    friends: List<List<String>>,
    visitors: List<String>
): List<String> {
    val sharedFriendList = mutableListOf<String>()
    val userFriendList = mutableSetOf<String>()
    val sharedFriendsScore = mutableListOf<List<Any>>()
    val result = mutableListOf<String>()

    for (i in friends.indices) {
        for (j in friends.indices) {
            if (user == friends[i][0]) {
                userFriendList.add(friends[i][1])
                when {
                    friends[i][1] == friends[j][1] && i != j -> {
                        sharedFriendList.add(friends[j][0])
                    }

                    friends[i][1] == friends[j][0] -> {
                        sharedFriendList.add(friends[j][1])
                    }
                }
            } else if (user == friends[i][1]) {
                userFriendList.add(friends[i][0])
                when {
                    friends[i][0] == friends[j][0] && i != j -> {
                        sharedFriendList.add(friends[j][1])
                    }

                    friends[i][0] == friends[j][1] -> {
                        sharedFriendList.add(friends[j][0])
                    }
                }
            }
        }
    }
    for (k in sharedFriendList.indices) {
        if (!sharedFriendsScore.toString().contains(sharedFriendList[k])) {
            sharedFriendsScore.add(
                listOf(
                    sharedFriendList[k],
                    sharedFriendList.count { it == sharedFriendList[k] } * 10))
        }
    }
    for (l in visitors.indices) {
        for (m in sharedFriendsScore.indices) {
            when {
                !userFriendList.contains(visitors[l]) && !sharedFriendsScore.toString().contains(visitors[l]) -> {
                    sharedFriendsScore.add(listOf(visitors[l], 1))
                }

                !userFriendList.contains(visitors[l]) && sharedFriendsScore[m][0] == visitors[l] -> {
                    sharedFriendsScore[m] = listOf(visitors[l], sharedFriendsScore[m][1] as Int + 1)
                }
            }
        }
    }
    return result
}
