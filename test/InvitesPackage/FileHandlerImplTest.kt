package InvitesPackage

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class FileHandlerImplTest {

    private lateinit var fileHandlerImpl: FileHandlerImpl

    @Before
    fun setup() {
        if (!::fileHandlerImpl.isInitialized)
            fileHandlerImpl = FileHandlerImpl()
    }

    @Test
    fun `check for file saving and reading`() {
        val pathString = "res/test.txt"
        fileHandlerImpl.writeToFiles(pathString, "Test content")
        val stringList = fileHandlerImpl.readFromFiles(pathString)
        if (!stringList.isNullOrEmpty())
            assertEquals("Test content", stringList[0])
    }

}