package com.example.matrimony.roomdatabase;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MatrimonyDatabase_Impl extends MatrimonyDatabase {
  private volatile DAOAccess _dAOAccess;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `MatrimonyDetails` (`firstName` TEXT NOT NULL, `lastName` TEXT NOT NULL, `age` INTEGER NOT NULL, `height` REAL NOT NULL, `state` TEXT NOT NULL, `professional` TEXT NOT NULL, `address` TEXT NOT NULL, `verified` INTEGER NOT NULL, `caste` TEXT NOT NULL, `profilePic` INTEGER NOT NULL, `gestureProfileDetails` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `ProfileImage` (`profileName` INTEGER NOT NULL, `profileOwnerId` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT, FOREIGN KEY(`profileOwnerId`) REFERENCES `MatrimonyDetails`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4ece1f366a4b5b50a8ea7bac11c11fa9')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `MatrimonyDetails`");
        db.execSQL("DROP TABLE IF EXISTS `ProfileImage`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsMatrimonyDetails = new HashMap<String, TableInfo.Column>(12);
        _columnsMatrimonyDetails.put("firstName", new TableInfo.Column("firstName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMatrimonyDetails.put("lastName", new TableInfo.Column("lastName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMatrimonyDetails.put("age", new TableInfo.Column("age", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMatrimonyDetails.put("height", new TableInfo.Column("height", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMatrimonyDetails.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMatrimonyDetails.put("professional", new TableInfo.Column("professional", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMatrimonyDetails.put("address", new TableInfo.Column("address", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMatrimonyDetails.put("verified", new TableInfo.Column("verified", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMatrimonyDetails.put("caste", new TableInfo.Column("caste", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMatrimonyDetails.put("profilePic", new TableInfo.Column("profilePic", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMatrimonyDetails.put("gestureProfileDetails", new TableInfo.Column("gestureProfileDetails", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMatrimonyDetails.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMatrimonyDetails = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMatrimonyDetails = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMatrimonyDetails = new TableInfo("MatrimonyDetails", _columnsMatrimonyDetails, _foreignKeysMatrimonyDetails, _indicesMatrimonyDetails);
        final TableInfo _existingMatrimonyDetails = TableInfo.read(db, "MatrimonyDetails");
        if (!_infoMatrimonyDetails.equals(_existingMatrimonyDetails)) {
          return new RoomOpenHelper.ValidationResult(false, "MatrimonyDetails(com.example.matrimony.model.MatrimonyData).\n"
                  + " Expected:\n" + _infoMatrimonyDetails + "\n"
                  + " Found:\n" + _existingMatrimonyDetails);
        }
        final HashMap<String, TableInfo.Column> _columnsProfileImage = new HashMap<String, TableInfo.Column>(3);
        _columnsProfileImage.put("profileName", new TableInfo.Column("profileName", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfileImage.put("profileOwnerId", new TableInfo.Column("profileOwnerId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProfileImage.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysProfileImage = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysProfileImage.add(new TableInfo.ForeignKey("MatrimonyDetails", "CASCADE", "NO ACTION", Arrays.asList("profileOwnerId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesProfileImage = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoProfileImage = new TableInfo("ProfileImage", _columnsProfileImage, _foreignKeysProfileImage, _indicesProfileImage);
        final TableInfo _existingProfileImage = TableInfo.read(db, "ProfileImage");
        if (!_infoProfileImage.equals(_existingProfileImage)) {
          return new RoomOpenHelper.ValidationResult(false, "ProfileImage(com.example.matrimony.model.ProfileImageModel).\n"
                  + " Expected:\n" + _infoProfileImage + "\n"
                  + " Found:\n" + _existingProfileImage);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "4ece1f366a4b5b50a8ea7bac11c11fa9", "3415ef2240ade246fff1aaf6043f5edf");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "MatrimonyDetails","ProfileImage");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    final boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `MatrimonyDetails`");
      _db.execSQL("DELETE FROM `ProfileImage`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(DAOAccess.class, DAOAccess_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public DAOAccess matrimonyDao() {
    if (_dAOAccess != null) {
      return _dAOAccess;
    } else {
      synchronized(this) {
        if(_dAOAccess == null) {
          _dAOAccess = new DAOAccess_Impl(this);
        }
        return _dAOAccess;
      }
    }
  }
}
