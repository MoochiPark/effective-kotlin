package item08

class User(
    val name: String?,
)

//fun process(user: User) {
//    requireNotNull(user.name)
//    val context = checkNotNull(context)
//    val networkService =
//        getNetworkService(context) ?:
//        throw NoInternetConnection()
//    networkService.getData { data, userData ->
//        show(data!!, userData!!)
//    }
//}