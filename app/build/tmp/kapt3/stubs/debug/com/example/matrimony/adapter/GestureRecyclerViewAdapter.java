package com.example.matrimony.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0014\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/matrimony/adapter/GestureRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/matrimony/adapter/GestureRecyclerViewAdapter$GestureProfileViewHolder;", "profileInterestInterface", "Lcom/example/matrimony/utilis/CommonListener$ProfileInterestInterface;", "(Lcom/example/matrimony/utilis/CommonListener$ProfileInterestInterface;)V", "gestureProfileAdapterBinding", "Lcom/example/matrimony/databinding/GestureProfileAdapterBinding;", "matrimonyDetails", "", "Lcom/example/matrimony/model/MatrimonyData;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "list", "GestureProfileViewHolder", "app_debug"})
public final class GestureRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.matrimony.adapter.GestureRecyclerViewAdapter.GestureProfileViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final com.example.matrimony.utilis.CommonListener.ProfileInterestInterface profileInterestInterface = null;
    @org.jetbrains.annotations.Nullable
    private com.example.matrimony.databinding.GestureProfileAdapterBinding gestureProfileAdapterBinding;
    @org.jetbrains.annotations.Nullable
    private java.util.List<com.example.matrimony.model.MatrimonyData> matrimonyDetails;
    
    public GestureRecyclerViewAdapter(@org.jetbrains.annotations.NotNull
    com.example.matrimony.utilis.CommonListener.ProfileInterestInterface profileInterestInterface) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.matrimony.adapter.GestureRecyclerViewAdapter.GestureProfileViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.matrimony.adapter.GestureRecyclerViewAdapter.GestureProfileViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.matrimony.model.MatrimonyData> list) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/matrimony/adapter/GestureRecyclerViewAdapter$GestureProfileViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "gestureProfileAdapterBinding", "Lcom/example/matrimony/databinding/GestureProfileAdapterBinding;", "(Lcom/example/matrimony/databinding/GestureProfileAdapterBinding;)V", "bind", "", "profileData", "Lcom/example/matrimony/model/MatrimonyData;", "gestureClickListener", "Lcom/example/matrimony/utilis/CommonListener$ProfileInterestInterface;", "app_debug"})
    public static final class GestureProfileViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.example.matrimony.databinding.GestureProfileAdapterBinding gestureProfileAdapterBinding = null;
        
        public GestureProfileViewHolder(@org.jetbrains.annotations.NotNull
        com.example.matrimony.databinding.GestureProfileAdapterBinding gestureProfileAdapterBinding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.Nullable
        com.example.matrimony.model.MatrimonyData profileData, @org.jetbrains.annotations.NotNull
        com.example.matrimony.utilis.CommonListener.ProfileInterestInterface gestureClickListener) {
        }
    }
}