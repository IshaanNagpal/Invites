package InvitesPackage

import kotlin.math.*

interface InvitesController {
    fun getEligibleUsersForInvite(): MutableList<UserDataModel>
}