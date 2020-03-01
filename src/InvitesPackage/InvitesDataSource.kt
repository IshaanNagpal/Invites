package InvitesPackage

interface InvitesDataSource {
    fun fetchListOfAllGuests(): MutableList<UserDataModel>?
    fun saveOutput(guestsList: List<UserDataModel>?)
}