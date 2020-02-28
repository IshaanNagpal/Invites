package InvitesPackage

import com.google.gson.Gson
import java.io.IOException

/**
 * This class acts a repository of data.
 * The fetching and writing of data happens here
 *
 * Implements interface [InvitesDataSource]
 */
class InvitesInvitesDataSourceImpl : InvitesDataSource {

    private val fileHandlerImpl by lazy { FileHandlerImpl() }

    private fun getUserDataFromFile(): MutableList<UserDataModel> {
        return try {
            val strList = fileHandlerImpl.readFromFiles(INPUT_FILE_PATH)
            val gson = Gson()
            val userDataList = mutableListOf<UserDataModel>()
            strList.forEach {
                userDataList.add(gson.fromJson(it, UserDataModel::class.java))
            }
            userDataList
        } catch (exception: IOException) {
            mutableListOf()
        } catch (exception: Exception) {
            mutableListOf()
        }
    }


    override fun fetchListOfAllGuests(): MutableList<UserDataModel> {
        return getUserDataFromFile()
    }

    override fun saveOutput(guestsList: List<UserDataModel>) {
        val stringBuilder = StringBuilder()
        guestsList.forEach {
            stringBuilder.append("Guest Id: ${it.user_id} | Name: ${it.name} \n")
        }
        fileHandlerImpl.writeToFiles(OUTPUT_FILE_PATH, stringBuilder.toString())
    }

}