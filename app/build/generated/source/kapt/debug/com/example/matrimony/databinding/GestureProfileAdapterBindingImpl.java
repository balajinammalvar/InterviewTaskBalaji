package com.example.matrimony.databinding;
import com.example.matrimony.R;
import com.example.matrimony.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class GestureProfileAdapterBindingImpl extends GestureProfileAdapterBinding implements com.example.matrimony.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ivProfile, 5);
        sViewsWithIds.put(R.id.ivVerified, 6);
        sViewsWithIds.put(R.id.tvVerified, 7);
        sViewsWithIds.put(R.id.ivPremiumNRI, 8);
        sViewsWithIds.put(R.id.tvPremium, 9);
        sViewsWithIds.put(R.id.tvLike, 10);
        sViewsWithIds.put(R.id.ivShortlist, 11);
        sViewsWithIds.put(R.id.tvShortlist, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public GestureProfileAdapterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private GestureProfileAdapterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[7]
            );
        this.ivCancel.setTag(null);
        this.ivRight.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvProfileDetails.setTag(null);
        this.tvProfileName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new com.example.matrimony.generated.callback.OnClickListener(this, 2);
        mCallback6 = new com.example.matrimony.generated.callback.OnClickListener(this, 3);
        mCallback4 = new com.example.matrimony.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.position == variableId) {
            setPosition((java.lang.Integer) variable);
        }
        else if (BR.clickListener == variableId) {
            setClickListener((com.example.matrimony.utilis.CommonListener.ProfileInterestInterface) variable);
        }
        else if (BR.gestureProfileViewModel == variableId) {
            setGestureProfileViewModel((com.example.matrimony.model.MatrimonyData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPosition(@Nullable java.lang.Integer Position) {
        this.mPosition = Position;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.position);
        super.requestRebind();
    }
    public void setClickListener(@Nullable com.example.matrimony.utilis.CommonListener.ProfileInterestInterface ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }
    public void setGestureProfileViewModel(@Nullable com.example.matrimony.model.MatrimonyData GestureProfileViewModel) {
        this.mGestureProfileViewModel = GestureProfileViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.gestureProfileViewModel);
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
        java.lang.Integer position = mPosition;
        java.lang.String gestureProfileViewModelGestureProfileDetails = null;
        com.example.matrimony.utilis.CommonListener.ProfileInterestInterface clickListener = mClickListener;
        com.example.matrimony.model.MatrimonyData gestureProfileViewModel = mGestureProfileViewModel;
        java.lang.String gestureProfileViewModelFirstName = null;

        if ((dirtyFlags & 0xcL) != 0) {



                if (gestureProfileViewModel != null) {
                    // read gestureProfileViewModel.gestureProfileDetails
                    gestureProfileViewModelGestureProfileDetails = gestureProfileViewModel.getGestureProfileDetails();
                    // read gestureProfileViewModel.firstName
                    gestureProfileViewModelFirstName = gestureProfileViewModel.getFirstName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.ivCancel.setOnClickListener(mCallback6);
            this.ivRight.setOnClickListener(mCallback5);
            this.mboundView0.setOnClickListener(mCallback4);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvProfileDetails, gestureProfileViewModelGestureProfileDetails);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvProfileName, gestureProfileViewModelFirstName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // clickListener
                com.example.matrimony.utilis.CommonListener.ProfileInterestInterface clickListener = mClickListener;
                // position
                java.lang.Integer position = mPosition;
                // clickListener != null
                boolean clickListenerJavaLangObjectNull = false;



                clickListenerJavaLangObjectNull = (clickListener) != (null);
                if (clickListenerJavaLangObjectNull) {




                    clickListener.onProfileMark(true, position);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // clickListener
                com.example.matrimony.utilis.CommonListener.ProfileInterestInterface clickListener = mClickListener;
                // position
                java.lang.Integer position = mPosition;
                // clickListener != null
                boolean clickListenerJavaLangObjectNull = false;



                clickListenerJavaLangObjectNull = (clickListener) != (null);
                if (clickListenerJavaLangObjectNull) {




                    clickListener.onProfileMark(false, position);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // clickListener
                com.example.matrimony.utilis.CommonListener.ProfileInterestInterface clickListener = mClickListener;
                // gestureProfileViewModel
                com.example.matrimony.model.MatrimonyData gestureProfileViewModel = mGestureProfileViewModel;
                // gestureProfileViewModel != null
                boolean gestureProfileViewModelJavaLangObjectNull = false;
                // clickListener != null
                boolean clickListenerJavaLangObjectNull = false;
                // gestureProfileViewModel.id
                java.lang.Integer gestureProfileViewModelId = null;



                clickListenerJavaLangObjectNull = (clickListener) != (null);
                if (clickListenerJavaLangObjectNull) {



                    gestureProfileViewModelJavaLangObjectNull = (gestureProfileViewModel) != (null);
                    if (gestureProfileViewModelJavaLangObjectNull) {


                        gestureProfileViewModelId = gestureProfileViewModel.getId();

                        clickListener.onProfileClick(gestureProfileViewModelId);
                    }
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): position
        flag 1 (0x2L): clickListener
        flag 2 (0x3L): gestureProfileViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}