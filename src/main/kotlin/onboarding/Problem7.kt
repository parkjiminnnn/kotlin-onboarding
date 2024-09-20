package onboarding

fun solution7(
    user: String,
    friends: List<List<String>>,
    visitors: List<String>
): List<String> {
    val sharedFriends = mutableListOf<List<Any>>()
    val sharedFriendsCount = mutableListOf<List<Any>>()
    var visitorCount = 0
    for (i in friends.indices) {
        for (j in friends[i].indices) {
            when (user) {
                friends[i][0] -> {
                    sharedFriends.add(listOf(friends[i][1], 10))
                }

                friends[i][1] -> sharedFriends.add(listOf(friends[i][0], 10))
            }
        }
    }
    //sharedfriends = {[a,10][b,10][a,10][c,10]}
    for (k in sharedFriends.indices) {
        sharedFriendsCount.add(listOf(sharedFriends[k][0], sharedFriends[k].count() * 10))
        for (l in visitors.indices) {
            visitorCount = visitors[l].count()
            if (sharedFriends[k][0] == visitors[l]) {
                sharedFriendsCount[k] = listOf(sharedFriends[k][0],sharedFriends[k].count() * 10 + visitorCount)
            }
        }
    }
    


}
