package com.example.matrimony.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0002J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0010H\u0016J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001eH\u0016J\b\u0010#\u001a\u00020\u0010H\u0002J\b\u0010$\u001a\u00020\u0010H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006%"}, d2 = {"Lcom/example/matrimony/ui/GestureFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/lifecycle/LifecycleObserver;", "Lcom/example/matrimony/utilis/CommonListener$ProfileInterestInterface;", "()V", "context", "Landroid/content/Context;", "gestureFragmentBinding", "Lcom/example/matrimony/databinding/GestureFragmentBinding;", "matrimonyViewModel", "Lcom/example/matrimony/viewmodel/MatrimonyViewModel;", "getMatrimonyViewModel", "()Lcom/example/matrimony/viewmodel/MatrimonyViewModel;", "matrimonyViewModel$delegate", "Lkotlin/Lazy;", "initializeListener", "", "initializeObserver", "itemTouchHelper", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onProfileClick", "profileId", "", "onProfileMark", "interested", "", "position", "scrollToNextItem", "setupRecyclerView", "app_debug"})
public final class GestureFragment extends androidx.fragment.app.Fragment implements androidx.lifecycle.LifecycleObserver, com.example.matrimony.utilis.CommonListener.ProfileInterestInterface {
    private android.content.Context context;
    @org.jetbrains.annotations.Nullable
    private com.example.matrimony.databinding.GestureFragmentBinding gestureFragmentBinding;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy matrimonyViewModel$delegate = null;
    
    public GestureFragment() {
        super();
    }
    
    private final com.example.matrimony.viewmodel.MatrimonyViewModel getMatrimonyViewModel() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void initializeListener() {
    }
    
    private final void itemTouchHelper() {
    }
    
    private final void initializeObserver() {
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void scrollToNextItem() {
    }
    
    @java.lang.Override
    public void onProfileMark(boolean interested, int position) {
    }
    
    @java.lang.Override
    public void onProfileClick(int profileId) {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
}