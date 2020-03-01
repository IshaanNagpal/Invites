package InvitesPackage

import org.junit.Assert
import org.junit.Test

class InvitesControllerImplTest {

    private val invitesViewModelImpl by lazy { InvitesControllerImpl() }

    @Test
    fun `test for data extraction from input file`() {
        Assert.assertTrue(invitesViewModelImpl.getEligibleUsersForInvite().isNotEmpty())
    }
}