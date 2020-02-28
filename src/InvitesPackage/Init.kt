package InvitesPackage

object Init {

    @JvmStatic
    fun main(args: Array<String>) {
        val invitesViewModelImpl = InvitesControllerImpl()
        invitesViewModelImpl.getEligibleUsersForInvite()
    }
}