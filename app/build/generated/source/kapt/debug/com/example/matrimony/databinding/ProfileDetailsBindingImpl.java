package com.example.matrimony.databinding;
import com.example.matrimony.R;
import com.example.matrimony.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ProfileDetailsBindingImpl extends ProfileDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.glProfileDetailsVertical, 3);
        sViewsWithIds.put(R.id.ivBack, 4);
        sViewsWithIds.put(R.id.vpProfileDetails, 5);
        sViewsWithIds.put(R.id.tbLayout, 6);
        sViewsWithIds.put(R.id.cvProfileDetails, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ProfileDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ProfileDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[7]
            , (androidx.constraintlayout.widget.Guideline) bindings[3]
            , (android.widget.ImageView) bindings[4]
            , (com.google.android.material.tabs.TabLayout) bindings[6]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (androidx.viewpager.widget.ViewPager) bindings[5]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvProfileDetails.setTag(null);
        this.tvProfileName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.profileDetailsViewModel == variableId) {
            setProfileDetailsViewModel((com.example.matrimony.model.ProfileWithImages) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProfileDetailsViewModel(@Nullable com.example.matrimony.model.ProfileWithImages ProfileDetailsViewModel) {
        this.mProfileDetailsViewModel = ProfileDetailsViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.profileDetailsViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String profileDetailsViewModelProfileFirstName = null;
        com.example.matrimony.model.ProfileWithImages profileDetailsViewModel = mProfileDetailsViewModel;
        java.lang.String profileDetailsViewModelProfileGestureProfileDetails = null;
        com.example.matrimony.model.MatrimonyData profileDetailsViewModelProfile = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (profileDetailsViewModel != null) {
                    // read profileDetailsViewModel.profile
                    profileDetailsViewModelProfile = profileDetailsViewModel.getProfile();
                }


                if (profileDetailsViewModelProfile != null) {
                    // read profileDetailsViewModel.profile.firstName
                    profileDetailsViewModelProfileFirstName = profileDetailsViewModelProfile.getFirstName();
                    // read profileDetailsViewModel.profile.gestureProfileDetails
                    profileDetailsViewModelProfileGestureProfileDetails = profileDetailsViewModelProfile.getGestureProfileDetails();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvProfileDetails, profileDetailsViewModelProfileGestureProfileDetails);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvProfileName, profileDetailsViewModelProfileFirstName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): profileDetailsViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}