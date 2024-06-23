package com.example.matrimony;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.matrimony.databinding.GestureFragmentBindingImpl;
import com.example.matrimony.databinding.GestureProfileAdapterBindingImpl;
import com.example.matrimony.databinding.HomeFragmentBindingImpl;
import com.example.matrimony.databinding.HomeProfileAdapterBindingImpl;
import com.example.matrimony.databinding.ProfileDetailsBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_GESTUREFRAGMENT = 1;

  private static final int LAYOUT_GESTUREPROFILEADAPTER = 2;

  private static final int LAYOUT_HOMEFRAGMENT = 3;

  private static final int LAYOUT_HOMEPROFILEADAPTER = 4;

  private static final int LAYOUT_PROFILEDETAILS = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.matrimony.R.layout.gesture_fragment, LAYOUT_GESTUREFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.matrimony.R.layout.gesture_profile_adapter, LAYOUT_GESTUREPROFILEADAPTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.matrimony.R.layout.home_fragment, LAYOUT_HOMEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.matrimony.R.layout.home_profile_adapter, LAYOUT_HOMEPROFILEADAPTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.matrimony.R.layout.profile_details, LAYOUT_PROFILEDETAILS);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_GESTUREFRAGMENT: {
          if ("layout/gesture_fragment_0".equals(tag)) {
            return new GestureFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for gesture_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_GESTUREPROFILEADAPTER: {
          if ("layout/gesture_profile_adapter_0".equals(tag)) {
            return new GestureProfileAdapterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for gesture_profile_adapter is invalid. Received: " + tag);
        }
        case  LAYOUT_HOMEFRAGMENT: {
          if ("layout/home_fragment_0".equals(tag)) {
            return new HomeFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for home_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_HOMEPROFILEADAPTER: {
          if ("layout/home_profile_adapter_0".equals(tag)) {
            return new HomeProfileAdapterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for home_profile_adapter is invalid. Received: " + tag);
        }
        case  LAYOUT_PROFILEDETAILS: {
          if ("layout/profile_details_0".equals(tag)) {
            return new ProfileDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for profile_details is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(8);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "clickListener");
      sKeys.put(2, "dashboardViewModel");
      sKeys.put(3, "gestureProfileViewModel");
      sKeys.put(4, "gestureViewModel");
      sKeys.put(5, "position");
      sKeys.put(6, "profileDetailsViewModel");
      sKeys.put(7, "viewmodel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/gesture_fragment_0", com.example.matrimony.R.layout.gesture_fragment);
      sKeys.put("layout/gesture_profile_adapter_0", com.example.matrimony.R.layout.gesture_profile_adapter);
      sKeys.put("layout/home_fragment_0", com.example.matrimony.R.layout.home_fragment);
      sKeys.put("layout/home_profile_adapter_0", com.example.matrimony.R.layout.home_profile_adapter);
      sKeys.put("layout/profile_details_0", com.example.matrimony.R.layout.profile_details);
    }
  }
}
