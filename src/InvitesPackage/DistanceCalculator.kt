package InvitesPackage

import kotlin.math.*

class DistanceCalculator {

    fun calculateDistance(source: CoordinatesModel, destination: CoordinatesModel): Double {

        val longitudeDelta = destination.longitude.convertToRadian() - source.longitude.convertToRadian()
        val latitudeDelta = destination.latitude.convertToRadian() - source.latitude.convertToRadian()

        val a = sin(latitudeDelta / 2).pow(2.0) + (cos(destination.latitude.convertToRadian()) *
                cos(destination.latitude.convertToRadian()) * sin(longitudeDelta / 2).pow(2.0))
        val c = 2 * asin(sqrt(a))

        return c * EARTH_RADIUS_KMS
    }
}