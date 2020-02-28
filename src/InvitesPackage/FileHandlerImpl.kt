package InvitesPackage

import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardOpenOption

class FileHandlerImpl: FilesHandler {
    override fun readFromFiles(filePath: String): List<String> {
       return Files.readAllLines(Paths.get(filePath))
    }

    override fun writeToFiles(filePath: String, content: String) {
        Files.write(Paths.get(filePath), content.toByteArray(StandardCharsets.UTF_8), StandardOpenOption.CREATE)
    }
}