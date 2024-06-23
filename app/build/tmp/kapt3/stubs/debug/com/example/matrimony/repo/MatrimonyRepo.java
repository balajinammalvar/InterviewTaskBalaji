package com.example.matrimony.repo;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J!\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ#\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J\'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0006H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/example/matrimony/repo/MatrimonyRepo;", "", "()V", "matrimonyDatabase", "Lcom/example/matrimony/roomdatabase/MatrimonyDatabase;", "getMatrimonyDetails", "", "Lcom/example/matrimony/model/MatrimonyData;", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProfileWithImages", "Lcom/example/matrimony/model/ProfileWithImages;", "profileId", "", "(Landroid/content/Context;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initializeDB", "insertProfileWithImages", "", "profileImageData", "(Landroid/content/Context;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MatrimonyRepo {
    @org.jetbrains.annotations.Nullable
    private com.example.matrimony.roomdatabase.MatrimonyDatabase matrimonyDatabase;
    
    public MatrimonyRepo() {
        super();
    }
    
    private final com.example.matrimony.roomdatabase.MatrimonyDatabase initializeDB(android.content.Context context) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SuspiciousIndentation"})
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertProfileWithImages(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.matrimony.model.ProfileWithImages> profileImageData, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getMatrimonyDetails(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.matrimony.model.MatrimonyData>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getProfileWithImages(@org.jetbrains.annotations.NotNull
    android.content.Context context, int profileId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.matrimony.model.ProfileWithImages> $completion) {
        return null;
    }
}