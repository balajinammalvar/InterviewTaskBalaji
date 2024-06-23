package com.example.matrimony.databinding;
import com.example.matrimony.R;
import com.example.matrimony.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HomeProfileAdapterBindingImpl extends HomeProfileAdapterBinding implements com.example.matrimony.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ivProfile, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HomeProfileAdapterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private HomeProfileAdapterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[5]
            , (androidx.cardview.widget.CardView) bindings[1]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.Button) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.btnNO.setTag(null);
        this.cvProfileDetails.setTag(null);
        this.ivRight.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvProfileDetails.setTag(null);
        this.tvProfileName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.example.matrimony.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.example.matrimony.generated.callback.OnClickListener(this, 1);
        mCallback2 = new com.example.matrimony.generated.callback.OnClickListener(this, 2);
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
        else if (BR.dashboardViewModel == variableId) {
            setDashboardViewModel((com.example.matrimony.model.MatrimonyData) variable);
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
    public void setDashboardViewModel(@Nullable com.example.matrimony.model.MatrimonyData DashboardViewModel) {
        this.mDashboardViewModel = DashboardViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.dashboardViewModel);
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
        java.lang.String dashboardViewModelFirstName = null;
        java.lang.Integer position = mPosition;
        java.lang.String dashboardViewModelGestureProfileDetails = null;
        com.example.matrimony.utilis.CommonListener.ProfileInterestInterface clickListener = mClickListener;
        com.example.matrimony.model.MatrimonyData dashboardViewModel = mDashboardViewModel;

        if ((dirtyFlags & 0xcL) != 0) {



                if (dashboardViewModel != null) {
                    // read dashboardViewModel.firstName
                    dashboardViewModelFirstName = dashboardViewModel.getFirstName();
                    // read dashboardViewModel.gestureProfileDetails
                    dashboardViewModelGestureProfileDetails = dashboardViewModel.getGestureProfileDetails();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.btnNO.setOnClickListener(mCallback3);
            this.cvProfileDetails.setOnClickListener(mCallback1);
            this.ivRight.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvProfileDetails, dashboardViewModelGestureProfileDetails);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvProfileName, dashboardViewModelFirstName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
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
                // dashboardViewModel.id
                java.lang.Integer dashboardViewModelId = null;
                // clickListener
                com.example.matrimony.utilis.CommonListener.ProfileInterestInterface clickListener = mClickListener;
                // dashboardViewModel != null
                boolean dashboardViewModelJavaLangObjectNull = false;
                // dashboardViewModel
                com.example.matrimony.model.MatrimonyData dashboardViewModel = mDashboardViewModel;
                // clickListener != null
                boolean clickListenerJavaLangObjectNull = false;



                clickListenerJavaLangObjectNull = (clickListener) != (null);
                if (clickListenerJavaLangObjectNull) {



                    dashboardViewModelJavaLangObjectNull = (dashboardViewModel) != (null);
                    if (dashboardViewModelJavaLangObjectNull) {


                        dashboardViewModelId = dashboardViewModel.getId();

                        clickListener.onProfileClick(dashboardViewModelId);
                    }
                }
                break;
            }
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
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): position
        flag 1 (0x2L): clickListener
        flag 2 (0x3L): dashboardViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}