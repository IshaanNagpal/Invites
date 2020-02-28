package InvitesPackage

import java.io.IOException
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

class FileHandlerImpl : FilesHandler {
    override fun readFromFiles(filePath: String): List<String> {
        return try {
            Files.readAllLines(Paths.get(filePath))
        } catch (exception: IOException) {
            listOf()
        }
    }

    override fun writeToFiles(filePath: String, content: String) {
        try {
            Files.write(Paths.get(filePath), content.toByteArray(StandardCharsets.UTF_8), StandardOpenOption.CREATE)
        } catch (exception: IOException) {

        }
    }
}