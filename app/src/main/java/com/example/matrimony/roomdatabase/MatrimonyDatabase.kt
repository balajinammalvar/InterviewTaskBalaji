package com.example.matrimony.roomdatabase

import android.content.Context
import android.widget.Toast
import androidx.room.Database
import androidx.room.DatabaseConfiguration
import androidx.room.InvalidationTracker
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteOpenHelper
import com.example.matrimony.model.MatrimonyData
import com.example.matrimony.model.ProfileImageModel
import com.example.matrimony.utilis.APP_Constant.Matrimony_Database

@Database(
    entities = [MatrimonyData::class, ProfileImageModel::class], version = 1, exportSchema = false
)
abstract class MatrimonyDatabase : RoomDatabase() {
    abstract fun matrimonyDao(): DAOAccess
    companion object {
        @Volatile
        private var INSTANCE: MatrimonyDatabase? = null

        fun getDatabaseClient(context: Context): MatrimonyDatabase? {
            try {
                if (INSTANCE != null) return INSTANCE

                synchronized(this) {

                    INSTANCE = Room.databaseBuilder(
                            context, MatrimonyDatabase::class.java, Matrimony_Database
                        ).fallbackToDestructiveMigration().build()

                    return INSTANCE as MatrimonyDatabase
                }
            } catch (e: Exception) {
                Toast.makeText(
                    context, "getDatabaseClient Exception : ${e.message}", Toast.LENGTH_LONG
                ).show()
            }
            return null
        }
    }

    override fun clearAllTables() {
        TODO("Not yet implemented")
    }

    override fun createInvalidationTracker(): InvalidationTracker {
        TODO("Not yet implemented")
    }

    override fun createOpenHelper(config: DatabaseConfiguration): SupportSQLiteOpenHelper {
        TODO("Not yet implemented")
    }
}