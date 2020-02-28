package InvitesPackage

import kotlin.math.*

interface InvitesViewModel {
    fun calculateDistanceBetweenCoordinates(source: CoordinatesModel, destination: CoordinatesModel): Double
}