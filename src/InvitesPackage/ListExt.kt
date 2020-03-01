package InvitesPackage

fun <T> List<T>?.filterNull(): List<T> {
    return this ?: listOf()
}