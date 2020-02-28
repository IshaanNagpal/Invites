package InvitesPackage

/**
 * This is a controller class which maintains all the business logic for the application.
 * Commands & delegates other classes
 *
 * Implements [InvitesController]
 */
class InvitesControllerImpl : InvitesController {

    private val invitesDataSource by lazy { InvitesInvitesDataSourceImpl() }
    private val distanceCalculator by lazy { DistanceCalculator() }
    private var intercommDublinCoords: CoordinatesModel = CoordinatesModel(INTERCOMM_DUBLIN_LAT, INTERCOMM_DUBLIN_LON)

    override fun getEligibleUsersForInvite(): MutableList<UserDataModel> {
        val guestsList = invitesDataSource.fetchListOfAllGuests()
        val eligibleGuestsList = mutableListOf<UserDataModel>()
        if (guestsList.isNotEmpty()) {
            guestsList.forEach { userDataModel ->
                if (isGuestWithinDistanceRange(userDataModel))
                    eligibleGuestsList.add(userDataModel)
            }
        }
        eligibleGuestsList.sortBy { it.user_id?.toInt() }

        writeToFile(eligibleGuestsList)

        return eligibleGuestsList
    }

    private fun writeToFile(eligibleGuestsList: List<UserDataModel>) {
        invitesDataSource.saveOutput(eligibleGuestsList)
    }

    private fun getDistanceBetweenCoordinates(source: CoordinatesModel, destination: CoordinatesModel): Double {
        return distanceCalculator.calculateDistance(source, destination)
    }

    private fun isGuestWithinDistanceRange(userDataModel: UserDataModel): Boolean {
        return getDistanceBetweenCoordinates(intercommDublinCoords, CoordinatesModel(userDataModel.latitude.toNullSafeDouble(), userDataModel.longitude.toNullSafeDouble())) <= THRESHOLD_DISTANCE
    }
}