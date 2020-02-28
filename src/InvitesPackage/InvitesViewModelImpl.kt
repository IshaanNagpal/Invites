package InvitesPackage

import kotlin.math.*

class InvitesViewModelImpl: InvitesViewModel {

    private fun calculateDistance(source: CoordinatesModel, destination: CoordinatesModel): Double{

        val longitudeDelta = destination.longitude.convertToRadian() - source.longitude.convertToRadian()
        val latitudeDelta = destination.latitude.convertToRadian() - source.latitude.convertToRadian()

        val a = sin(latitudeDelta / 2).pow(2.0) + (cos(destination.latitude.convertToRadian()) *
                cos(destination.latitude.convertToRadian()) * sin(longitudeDelta / 2).pow(2.0))
        val c = 2 * asin(sqrt(a))

        println("TAG: Distance "+ (c * EARTH_RADIUS_KMS).toString() + " Kms")

        return c * EARTH_RADIUS_KMS
    }

    override fun calculateDistanceBetweenCoordinates(source: CoordinatesModel, destination: CoordinatesModel): Double {
        return calculateDistance(source, destination)
    }

}