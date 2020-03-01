package InvitesPackage

import java.io.IOException
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

/**
 * This class is responsible to perform Read/Write operations with files
 */
class FileHandlerImpl : FilesHandler {
    override fun readFromFiles(filePath: String?): List<String> {
        return try {
            Files.readAllLines(Paths.get(filePath.filterNull()))
        } catch (exception: IOException) {
            listOf()
        }
    }

    override fun writeToFiles(filePath: String?, content: String?) {
        try {
            Files.write(Paths.get(filePath.filterNull()), content.filterNull().toByteArray(StandardCharsets.UTF_8), StandardOpenOption.CREATE)
        } catch (exception: IOException) {
            //Show some kind of alert
        }
    }
}