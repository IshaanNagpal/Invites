package InvitesPackage

object Init {
    @JvmStatic
    fun main(args: Array<String>) {
        val sourceCoordinatesModel = CoordinatesModel(52.986375, -6.043701)
        val destCoordinatesModel = CoordinatesModel(53.31861111111111, -1.6997222222222223)

        val invitesViewModelImpl = InvitesViewModelImpl()
        invitesViewModelImpl.calculateDistanceBetweenCoordinates(sourceCoordinatesModel, destCoordinatesModel)
    }
}