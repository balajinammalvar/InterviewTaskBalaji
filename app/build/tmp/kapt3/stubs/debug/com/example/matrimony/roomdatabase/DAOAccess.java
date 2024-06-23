package com.example.matrimony.roomdatabase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001f\u0010\f\u001a\u00020\u00102\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/example/matrimony/roomdatabase/DAOAccess;", "", "getMatrimonyDetails", "", "Lcom/example/matrimony/model/MatrimonyData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProfileDetail", "profileId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProfileWithImages", "Lcom/example/matrimony/model/ProfileWithImages;", "insertMatrimonyDetails", "", "matrimonyData", "(Lcom/example/matrimony/model/MatrimonyData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertProfileImages", "profileImageData", "Lcom/example/matrimony/model/ProfileImageModel;", "(Lcom/example/matrimony/model/ProfileImageModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao
public abstract interface DAOAccess {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertMatrimonyDetails(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.matrimony.model.MatrimonyData> matrimonyData, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertMatrimonyDetails(@org.jetbrains.annotations.NotNull
    com.example.matrimony.model.MatrimonyData matrimonyData, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM MatrimonyDetails")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMatrimonyDetails(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.matrimony.model.MatrimonyData>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM MatrimonyDetails where Id=:profileId")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getProfileDetail(int profileId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.matrimony.model.MatrimonyData> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertProfileImages(@org.jetbrains.annotations.NotNull
    com.example.matrimony.model.ProfileImageModel profileImageData, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Transaction
    @androidx.room.Query(value = "SELECT * FROM MatrimonyDetails WHERE id = :profileId")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getProfileWithImages(int profileId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.matrimony.model.ProfileWithImages> $completion);
}