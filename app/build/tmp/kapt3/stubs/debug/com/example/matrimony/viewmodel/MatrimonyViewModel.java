package com.example.matrimony.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u0006J\u0016\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u001c\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bR \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/matrimony/viewmodel/MatrimonyViewModel;", "Landroidx/lifecycle/ViewModel;", "matrimonyRepo", "Lcom/example/matrimony/repo/MatrimonyRepo;", "(Lcom/example/matrimony/repo/MatrimonyRepo;)V", "matrimonyDetails", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/matrimony/utilis/Resource;", "", "Lcom/example/matrimony/model/MatrimonyData;", "profileWithImages", "Lcom/example/matrimony/model/ProfileWithImages;", "getDetails", "getMatrimonyDetails", "", "context", "Landroid/content/Context;", "getProfileWithImages", "profileId", "", "insertProfileWithImages", "app_debug"})
public final class MatrimonyViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.matrimony.repo.MatrimonyRepo matrimonyRepo = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.example.matrimony.utilis.Resource<java.util.List<com.example.matrimony.model.MatrimonyData>>> matrimonyDetails;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.example.matrimony.utilis.Resource<com.example.matrimony.model.ProfileWithImages>> profileWithImages;
    
    public MatrimonyViewModel(@org.jetbrains.annotations.NotNull
    com.example.matrimony.repo.MatrimonyRepo matrimonyRepo) {
        super();
    }
    
    public final void insertProfileWithImages(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.matrimony.model.ProfileWithImages> profileWithImages) {
    }
    
    public final void getMatrimonyDetails(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    public final void getProfileWithImages(@org.jetbrains.annotations.NotNull
    android.content.Context context, int profileId) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.matrimony.utilis.Resource<java.util.List<com.example.matrimony.model.MatrimonyData>>> getDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.matrimony.utilis.Resource<com.example.matrimony.model.ProfileWithImages>> getProfileWithImages() {
        return null;
    }
}