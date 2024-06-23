package com.example.matrimony.roomdatabase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\u000e"}, d2 = {"Lcom/example/matrimony/roomdatabase/MatrimonyDatabase;", "Landroidx/room/RoomDatabase;", "()V", "clearAllTables", "", "createInvalidationTracker", "Landroidx/room/InvalidationTracker;", "createOpenHelper", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "config", "Landroidx/room/DatabaseConfiguration;", "matrimonyDao", "Lcom/example/matrimony/roomdatabase/DAOAccess;", "Companion", "app_debug"})
@androidx.room.Database(entities = {com.example.matrimony.model.MatrimonyData.class, com.example.matrimony.model.ProfileImageModel.class}, version = 1, exportSchema = false)
public abstract class MatrimonyDatabase extends androidx.room.RoomDatabase {
    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private static volatile com.example.matrimony.roomdatabase.MatrimonyDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull
    public static final com.example.matrimony.roomdatabase.MatrimonyDatabase.Companion Companion = null;
    
    public MatrimonyDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.matrimony.roomdatabase.DAOAccess matrimonyDao();
    
    @java.lang.Override
    public void clearAllTables() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    protected androidx.room.InvalidationTracker createInvalidationTracker() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    protected androidx.sqlite.db.SupportSQLiteOpenHelper createOpenHelper(@org.jetbrains.annotations.NotNull
    androidx.room.DatabaseConfiguration config) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/matrimony/roomdatabase/MatrimonyDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/example/matrimony/roomdatabase/MatrimonyDatabase;", "getDatabaseClient", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.example.matrimony.roomdatabase.MatrimonyDatabase getDatabaseClient(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
    }
}