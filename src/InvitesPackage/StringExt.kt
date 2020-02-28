package InvitesPackage

fun String?.toNullSafeDouble(): Double {
    return this?.toDouble() ?: 0.0
}