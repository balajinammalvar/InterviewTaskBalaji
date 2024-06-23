package com.example.matrimony.roomdatabase;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.matrimony.model.MatrimonyData;
import com.example.matrimony.model.ProfileImageModel;
import com.example.matrimony.model.ProfileWithImages;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DAOAccess_Impl implements DAOAccess {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MatrimonyData> __insertionAdapterOfMatrimonyData;

  private final EntityInsertionAdapter<ProfileImageModel> __insertionAdapterOfProfileImageModel;

  public DAOAccess_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMatrimonyData = new EntityInsertionAdapter<MatrimonyData>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `MatrimonyDetails` (`firstName`,`lastName`,`age`,`height`,`state`,`professional`,`address`,`verified`,`caste`,`profilePic`,`gestureProfileDetails`,`id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final MatrimonyData entity) {
        if (entity.getFirstName() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getFirstName());
        }
        if (entity.getLastName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getLastName());
        }
        statement.bindLong(3, entity.getAge());
        statement.bindDouble(4, entity.getHeight());
        if (entity.getState() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getState());
        }
        if (entity.getProfessional() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getProfessional());
        }
        if (entity.getAddress() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getAddress());
        }
        final int _tmp = entity.getVerified() ? 1 : 0;
        statement.bindLong(8, _tmp);
        if (entity.getCaste() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getCaste());
        }
        statement.bindLong(10, entity.getProfilePic());
        if (entity.getGestureProfileDetails() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getGestureProfileDetails());
        }
        if (entity.getId() == null) {
          statement.bindNull(12);
        } else {
          statement.bindLong(12, entity.getId());
        }
      }
    };
    this.__insertionAdapterOfProfileImageModel = new EntityInsertionAdapter<ProfileImageModel>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `ProfileImage` (`profileName`,`profileOwnerId`,`id`) VALUES (?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ProfileImageModel entity) {
        statement.bindLong(1, entity.getProfileName());
        statement.bindLong(2, entity.getProfileOwnerId());
        if (entity.getId() == null) {
          statement.bindNull(3);
        } else {
          statement.bindLong(3, entity.getId());
        }
      }
    };
  }

  @Override
  public Object insertMatrimonyDetails(final List<MatrimonyData> matrimonyData,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMatrimonyData.insert(matrimonyData);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertMatrimonyDetails(final MatrimonyData matrimonyData,
      final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfMatrimonyData.insertAndReturnId(matrimonyData);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertProfileImages(final ProfileImageModel profileImageData,
      final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfProfileImageModel.insertAndReturnId(profileImageData);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object getMatrimonyDetails(final Continuation<? super List<MatrimonyData>> $completion) {
    final String _sql = "SELECT * FROM MatrimonyDetails";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<MatrimonyData>>() {
      @Override
      @Nullable
      public List<MatrimonyData> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfFirstName = CursorUtil.getColumnIndexOrThrow(_cursor, "firstName");
          final int _cursorIndexOfLastName = CursorUtil.getColumnIndexOrThrow(_cursor, "lastName");
          final int _cursorIndexOfAge = CursorUtil.getColumnIndexOrThrow(_cursor, "age");
          final int _cursorIndexOfHeight = CursorUtil.getColumnIndexOrThrow(_cursor, "height");
          final int _cursorIndexOfState = CursorUtil.getColumnIndexOrThrow(_cursor, "state");
          final int _cursorIndexOfProfessional = CursorUtil.getColumnIndexOrThrow(_cursor, "professional");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfVerified = CursorUtil.getColumnIndexOrThrow(_cursor, "verified");
          final int _cursorIndexOfCaste = CursorUtil.getColumnIndexOrThrow(_cursor, "caste");
          final int _cursorIndexOfProfilePic = CursorUtil.getColumnIndexOrThrow(_cursor, "profilePic");
          final int _cursorIndexOfGestureProfileDetails = CursorUtil.getColumnIndexOrThrow(_cursor, "gestureProfileDetails");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<MatrimonyData> _result = new ArrayList<MatrimonyData>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final MatrimonyData _item;
            final String _tmpFirstName;
            if (_cursor.isNull(_cursorIndexOfFirstName)) {
              _tmpFirstName = null;
            } else {
              _tmpFirstName = _cursor.getString(_cursorIndexOfFirstName);
            }
            final String _tmpLastName;
            if (_cursor.isNull(_cursorIndexOfLastName)) {
              _tmpLastName = null;
            } else {
              _tmpLastName = _cursor.getString(_cursorIndexOfLastName);
            }
            final int _tmpAge;
            _tmpAge = _cursor.getInt(_cursorIndexOfAge);
            final float _tmpHeight;
            _tmpHeight = _cursor.getFloat(_cursorIndexOfHeight);
            final String _tmpState;
            if (_cursor.isNull(_cursorIndexOfState)) {
              _tmpState = null;
            } else {
              _tmpState = _cursor.getString(_cursorIndexOfState);
            }
            final String _tmpProfessional;
            if (_cursor.isNull(_cursorIndexOfProfessional)) {
              _tmpProfessional = null;
            } else {
              _tmpProfessional = _cursor.getString(_cursorIndexOfProfessional);
            }
            final String _tmpAddress;
            if (_cursor.isNull(_cursorIndexOfAddress)) {
              _tmpAddress = null;
            } else {
              _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            }
            final boolean _tmpVerified;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfVerified);
            _tmpVerified = _tmp != 0;
            final String _tmpCaste;
            if (_cursor.isNull(_cursorIndexOfCaste)) {
              _tmpCaste = null;
            } else {
              _tmpCaste = _cursor.getString(_cursorIndexOfCaste);
            }
            final int _tmpProfilePic;
            _tmpProfilePic = _cursor.getInt(_cursorIndexOfProfilePic);
            final String _tmpGestureProfileDetails;
            if (_cursor.isNull(_cursorIndexOfGestureProfileDetails)) {
              _tmpGestureProfileDetails = null;
            } else {
              _tmpGestureProfileDetails = _cursor.getString(_cursorIndexOfGestureProfileDetails);
            }
            _item = new MatrimonyData(_tmpFirstName,_tmpLastName,_tmpAge,_tmpHeight,_tmpState,_tmpProfessional,_tmpAddress,_tmpVerified,_tmpCaste,_tmpProfilePic,_tmpGestureProfileDetails);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getProfileDetail(final int profileId,
      final Continuation<? super MatrimonyData> $completion) {
    final String _sql = "SELECT * FROM MatrimonyDetails where Id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, profileId);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<MatrimonyData>() {
      @Override
      @Nullable
      public MatrimonyData call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfFirstName = CursorUtil.getColumnIndexOrThrow(_cursor, "firstName");
          final int _cursorIndexOfLastName = CursorUtil.getColumnIndexOrThrow(_cursor, "lastName");
          final int _cursorIndexOfAge = CursorUtil.getColumnIndexOrThrow(_cursor, "age");
          final int _cursorIndexOfHeight = CursorUtil.getColumnIndexOrThrow(_cursor, "height");
          final int _cursorIndexOfState = CursorUtil.getColumnIndexOrThrow(_cursor, "state");
          final int _cursorIndexOfProfessional = CursorUtil.getColumnIndexOrThrow(_cursor, "professional");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final int _cursorIndexOfVerified = CursorUtil.getColumnIndexOrThrow(_cursor, "verified");
          final int _cursorIndexOfCaste = CursorUtil.getColumnIndexOrThrow(_cursor, "caste");
          final int _cursorIndexOfProfilePic = CursorUtil.getColumnIndexOrThrow(_cursor, "profilePic");
          final int _cursorIndexOfGestureProfileDetails = CursorUtil.getColumnIndexOrThrow(_cursor, "gestureProfileDetails");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final MatrimonyData _result;
          if (_cursor.moveToFirst()) {
            final String _tmpFirstName;
            if (_cursor.isNull(_cursorIndexOfFirstName)) {
              _tmpFirstName = null;
            } else {
              _tmpFirstName = _cursor.getString(_cursorIndexOfFirstName);
            }
            final String _tmpLastName;
            if (_cursor.isNull(_cursorIndexOfLastName)) {
              _tmpLastName = null;
            } else {
              _tmpLastName = _cursor.getString(_cursorIndexOfLastName);
            }
            final int _tmpAge;
            _tmpAge = _cursor.getInt(_cursorIndexOfAge);
            final float _tmpHeight;
            _tmpHeight = _cursor.getFloat(_cursorIndexOfHeight);
            final String _tmpState;
            if (_cursor.isNull(_cursorIndexOfState)) {
              _tmpState = null;
            } else {
              _tmpState = _cursor.getString(_cursorIndexOfState);
            }
            final String _tmpProfessional;
            if (_cursor.isNull(_cursorIndexOfProfessional)) {
              _tmpProfessional = null;
            } else {
              _tmpProfessional = _cursor.getString(_cursorIndexOfProfessional);
            }
            final String _tmpAddress;
            if (_cursor.isNull(_cursorIndexOfAddress)) {
              _tmpAddress = null;
            } else {
              _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            }
            final boolean _tmpVerified;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfVerified);
            _tmpVerified = _tmp != 0;
            final String _tmpCaste;
            if (_cursor.isNull(_cursorIndexOfCaste)) {
              _tmpCaste = null;
            } else {
              _tmpCaste = _cursor.getString(_cursorIndexOfCaste);
            }
            final int _tmpProfilePic;
            _tmpProfilePic = _cursor.getInt(_cursorIndexOfProfilePic);
            final String _tmpGestureProfileDetails;
            if (_cursor.isNull(_cursorIndexOfGestureProfileDetails)) {
              _tmpGestureProfileDetails = null;
            } else {
              _tmpGestureProfileDetails = _cursor.getString(_cursorIndexOfGestureProfileDetails);
            }
            _result = new MatrimonyData(_tmpFirstName,_tmpLastName,_tmpAge,_tmpHeight,_tmpState,_tmpProfessional,_tmpAddress,_tmpVerified,_tmpCaste,_tmpProfilePic,_tmpGestureProfileDetails);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _result.setId(_tmpId);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getProfileWithImages(final int profileId,
      final Continuation<? super ProfileWithImages> $completion) {
    final String _sql = "SELECT * FROM MatrimonyDetails WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, profileId);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, true, _cancellationSignal, new Callable<ProfileWithImages>() {
      @Override
      @NonNull
      public ProfileWithImages call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfFirstName = CursorUtil.getColumnIndexOrThrow(_cursor, "firstName");
            final int _cursorIndexOfLastName = CursorUtil.getColumnIndexOrThrow(_cursor, "lastName");
            final int _cursorIndexOfAge = CursorUtil.getColumnIndexOrThrow(_cursor, "age");
            final int _cursorIndexOfHeight = CursorUtil.getColumnIndexOrThrow(_cursor, "height");
            final int _cursorIndexOfState = CursorUtil.getColumnIndexOrThrow(_cursor, "state");
            final int _cursorIndexOfProfessional = CursorUtil.getColumnIndexOrThrow(_cursor, "professional");
            final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
            final int _cursorIndexOfVerified = CursorUtil.getColumnIndexOrThrow(_cursor, "verified");
            final int _cursorIndexOfCaste = CursorUtil.getColumnIndexOrThrow(_cursor, "caste");
            final int _cursorIndexOfProfilePic = CursorUtil.getColumnIndexOrThrow(_cursor, "profilePic");
            final int _cursorIndexOfGestureProfileDetails = CursorUtil.getColumnIndexOrThrow(_cursor, "gestureProfileDetails");
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final LongSparseArray<ArrayList<ProfileImageModel>> _collectionImages = new LongSparseArray<ArrayList<ProfileImageModel>>();
            while (_cursor.moveToNext()) {
              final Long _tmpKey;
              if (_cursor.isNull(_cursorIndexOfId)) {
                _tmpKey = null;
              } else {
                _tmpKey = _cursor.getLong(_cursorIndexOfId);
              }
              if (_tmpKey != null) {
                if (!_collectionImages.containsKey(_tmpKey)) {
                  _collectionImages.put(_tmpKey, new ArrayList<ProfileImageModel>());
                }
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipProfileImageAscomExampleMatrimonyModelProfileImageModel(_collectionImages);
            final ProfileWithImages _result;
            if (_cursor.moveToFirst()) {
              final MatrimonyData _tmpProfile;
              final String _tmpFirstName;
              if (_cursor.isNull(_cursorIndexOfFirstName)) {
                _tmpFirstName = null;
              } else {
                _tmpFirstName = _cursor.getString(_cursorIndexOfFirstName);
              }
              final String _tmpLastName;
              if (_cursor.isNull(_cursorIndexOfLastName)) {
                _tmpLastName = null;
              } else {
                _tmpLastName = _cursor.getString(_cursorIndexOfLastName);
              }
              final int _tmpAge;
              _tmpAge = _cursor.getInt(_cursorIndexOfAge);
              final float _tmpHeight;
              _tmpHeight = _cursor.getFloat(_cursorIndexOfHeight);
              final String _tmpState;
              if (_cursor.isNull(_cursorIndexOfState)) {
                _tmpState = null;
              } else {
                _tmpState = _cursor.getString(_cursorIndexOfState);
              }
              final String _tmpProfessional;
              if (_cursor.isNull(_cursorIndexOfProfessional)) {
                _tmpProfessional = null;
              } else {
                _tmpProfessional = _cursor.getString(_cursorIndexOfProfessional);
              }
              final String _tmpAddress;
              if (_cursor.isNull(_cursorIndexOfAddress)) {
                _tmpAddress = null;
              } else {
                _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
              }
              final boolean _tmpVerified;
              final int _tmp;
              _tmp = _cursor.getInt(_cursorIndexOfVerified);
              _tmpVerified = _tmp != 0;
              final String _tmpCaste;
              if (_cursor.isNull(_cursorIndexOfCaste)) {
                _tmpCaste = null;
              } else {
                _tmpCaste = _cursor.getString(_cursorIndexOfCaste);
              }
              final int _tmpProfilePic;
              _tmpProfilePic = _cursor.getInt(_cursorIndexOfProfilePic);
              final String _tmpGestureProfileDetails;
              if (_cursor.isNull(_cursorIndexOfGestureProfileDetails)) {
                _tmpGestureProfileDetails = null;
              } else {
                _tmpGestureProfileDetails = _cursor.getString(_cursorIndexOfGestureProfileDetails);
              }
              _tmpProfile = new MatrimonyData(_tmpFirstName,_tmpLastName,_tmpAge,_tmpHeight,_tmpState,_tmpProfessional,_tmpAddress,_tmpVerified,_tmpCaste,_tmpProfilePic,_tmpGestureProfileDetails);
              final Integer _tmpId;
              if (_cursor.isNull(_cursorIndexOfId)) {
                _tmpId = null;
              } else {
                _tmpId = _cursor.getInt(_cursorIndexOfId);
              }
              _tmpProfile.setId(_tmpId);
              final ArrayList<ProfileImageModel> _tmpImagesCollection;
              final Long _tmpKey_1;
              if (_cursor.isNull(_cursorIndexOfId)) {
                _tmpKey_1 = null;
              } else {
                _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
              }
              if (_tmpKey_1 != null) {
                _tmpImagesCollection = _collectionImages.get(_tmpKey_1);
              } else {
                _tmpImagesCollection = new ArrayList<ProfileImageModel>();
              }
              _result = new ProfileWithImages(_tmpProfile,_tmpImagesCollection);
            } else {
              _result = null;
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
            _statement.release();
          }
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private void __fetchRelationshipProfileImageAscomExampleMatrimonyModelProfileImageModel(
      @NonNull final LongSparseArray<ArrayList<ProfileImageModel>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    if (_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      RelationUtil.recursiveFetchLongSparseArray(_map, true, (map) -> {
        __fetchRelationshipProfileImageAscomExampleMatrimonyModelProfileImageModel(map);
        return Unit.INSTANCE;
      });
      return;
    }
    final StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `profileName`,`profileOwnerId`,`id` FROM `ProfileImage` WHERE `profileOwnerId` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      final long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "profileOwnerId");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfProfileName = 0;
      final int _cursorIndexOfProfileOwnerId = 1;
      final int _cursorIndexOfId = 2;
      while (_cursor.moveToNext()) {
        final long _tmpKey;
        _tmpKey = _cursor.getLong(_itemKeyIndex);
        final ArrayList<ProfileImageModel> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final ProfileImageModel _item_1;
          final int _tmpProfileName;
          _tmpProfileName = _cursor.getInt(_cursorIndexOfProfileName);
          final int _tmpProfileOwnerId;
          _tmpProfileOwnerId = _cursor.getInt(_cursorIndexOfProfileOwnerId);
          final Integer _tmpId;
          if (_cursor.isNull(_cursorIndexOfId)) {
            _tmpId = null;
          } else {
            _tmpId = _cursor.getInt(_cursorIndexOfId);
          }
          _item_1 = new ProfileImageModel(_tmpProfileName,_tmpProfileOwnerId,_tmpId);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
