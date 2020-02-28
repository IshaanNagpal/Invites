package InvitesPackage

import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DistanceCalculatorTest {

    private lateinit var sourceCoordinatesModel: CoordinatesModel
    private lateinit var destinationCoordinatesModel: CoordinatesModel
    private val distanceCalculator by lazy { DistanceCalculator() }

    @Before
    fun setup() {
        sourceCoordinatesModel = CoordinatesModel(52.986375, -6.043701)
        destinationCoordinatesModel = CoordinatesModel(INTERCOMM_DUBLIN_LAT, INTERCOMM_DUBLIN_LON)
    }

    @Test
    fun calculateDistance() {
        assertEquals(41.748768604566, distanceCalculator.calculateDistance(sourceCoordinatesModel, destinationCoordinatesModel), 0.0)
    }
}