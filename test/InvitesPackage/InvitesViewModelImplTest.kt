package InvitesPackage

import org.junit.After
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class InvitesViewModelImplTest {

    lateinit var source: CoordinatesModel
    lateinit var dest: CoordinatesModel

    @Before
    fun setUp() {
        source = CoordinatesModel(52.22222, -6.22222)
        dest = CoordinatesModel(52.22222, -6.22222)
    }

    @After
    fun tearDown() {
    }

    @Test
    fun calculateDistanceBetweenCoordinates() {
        val invitesViewModelImpl = InvitesViewModelImpl()
        assertEquals(0.0, invitesViewModelImpl.calculateDistanceBetweenCoordinates(source, dest), 0.0)
    }
}