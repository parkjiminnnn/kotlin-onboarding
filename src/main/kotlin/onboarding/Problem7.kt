package onboarding

fun solution7(
    user: String,
    friends: List<List<String>>,
    visitors: List<String>
): List<String> {
    val sharedFriends = mutableListOf<List<Any>>()
    val sharedFriendsScore = mutableListOf<List<Any>>()
    val result = mutableListOf<String>()

    for (i in friends.indices) {
        for (j in friends.indices) {
            if (user == friends[i][0]) {
                when {
                    friends[i][1] == friends[j][1] && i != j -> {
                        sharedFriends.add(listOf(friends[j][0], 10))
                    }

                    friends[i][1] == friends[j][0] -> {
                        sharedFriends.add(listOf(friends[j][1], 10))
                    }
                }
            } else if (user == friends[i][1]) {
                when {
                    friends[i][0] == friends[j][0] && i != j -> {
                        sharedFriends.add(listOf(friends[j][1], 10))
                    }

                    friends[i][0] == friends[j][1] -> {
                        sharedFriends.add(listOf(friends[j][0], 10))
                    }
                }
            }
        }
    }
    for (k in sharedFriends.indices) {
        if (!sharedFriendsScore.toString().contains(sharedFriends[k][0].toString())) {
            sharedFriendsScore.add(listOf(sharedFriends[k][0], sharedFriends[k].count() * 10))
        }
        println(sharedFriendsScore.toString())
    }
    return result
}
