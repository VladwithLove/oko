// Generated by view binder compiler. Do not edit!
package com.example.oko.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.oko.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddCategoryBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button addCategory;

  @NonNull
  public final TextInputEditText nameE;

  @NonNull
  public final TextInputLayout nameL;

  private ActivityAddCategoryBinding(@NonNull LinearLayout rootView, @NonNull Button addCategory,
      @NonNull TextInputEditText nameE, @NonNull TextInputLayout nameL) {
    this.rootView = rootView;
    this.addCategory = addCategory;
    this.nameE = nameE;
    this.nameL = nameL;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddCategoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_category, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddCategoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addCategory;
      Button addCategory = ViewBindings.findChildViewById(rootView, id);
      if (addCategory == null) {
        break missingId;
      }

      id = R.id.nameE;
      TextInputEditText nameE = ViewBindings.findChildViewById(rootView, id);
      if (nameE == null) {
        break missingId;
      }

      id = R.id.nameL;
      TextInputLayout nameL = ViewBindings.findChildViewById(rootView, id);
      if (nameL == null) {
        break missingId;
      }

      return new ActivityAddCategoryBinding((LinearLayout) rootView, addCategory, nameE, nameL);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
