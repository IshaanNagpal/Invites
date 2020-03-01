package InvitesPackage

fun String?.filterNull(): String {
    return this ?: ""
}

fun String?.toNullSafeDouble(): Double {
    return this?.toDouble() ?: 0.0
}