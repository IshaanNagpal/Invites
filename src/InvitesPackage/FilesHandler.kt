package InvitesPackage

import java.nio.file.Path

interface FilesHandler {
    fun readFromFiles(filePath: String?): List<String>
    fun writeToFiles(filePath: String?, content: String?)
}