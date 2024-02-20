// Generated by view binder compiler. Do not edit!
package com.example.oko.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.oko.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityUserDataPageBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView userDataBirthday;

  @NonNull
  public final TextView userDataEmail;

  @NonNull
  public final ImageView userDataImage;

  @NonNull
  public final TextView userDataName;

  @NonNull
  public final TextView userDataPatronymic;

  @NonNull
  public final TextView userDataPhone;

  @NonNull
  public final TextView userDataRole;

  @NonNull
  public final TextView userDataSurname;

  private ActivityUserDataPageBinding(@NonNull LinearLayout rootView,
      @NonNull TextView userDataBirthday, @NonNull TextView userDataEmail,
      @NonNull ImageView userDataImage, @NonNull TextView userDataName,
      @NonNull TextView userDataPatronymic, @NonNull TextView userDataPhone,
      @NonNull TextView userDataRole, @NonNull TextView userDataSurname) {
    this.rootView = rootView;
    this.userDataBirthday = userDataBirthday;
    this.userDataEmail = userDataEmail;
    this.userDataImage = userDataImage;
    this.userDataName = userDataName;
    this.userDataPatronymic = userDataPatronymic;
    this.userDataPhone = userDataPhone;
    this.userDataRole = userDataRole;
    this.userDataSurname = userDataSurname;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityUserDataPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityUserDataPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_user_data_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityUserDataPageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.userDataBirthday;
      TextView userDataBirthday = ViewBindings.findChildViewById(rootView, id);
      if (userDataBirthday == null) {
        break missingId;
      }

      id = R.id.userDataEmail;
      TextView userDataEmail = ViewBindings.findChildViewById(rootView, id);
      if (userDataEmail == null) {
        break missingId;
      }

      id = R.id.userDataImage;
      ImageView userDataImage = ViewBindings.findChildViewById(rootView, id);
      if (userDataImage == null) {
        break missingId;
      }

      id = R.id.userDataName;
      TextView userDataName = ViewBindings.findChildViewById(rootView, id);
      if (userDataName == null) {
        break missingId;
      }

      id = R.id.userDataPatronymic;
      TextView userDataPatronymic = ViewBindings.findChildViewById(rootView, id);
      if (userDataPatronymic == null) {
        break missingId;
      }

      id = R.id.userDataPhone;
      TextView userDataPhone = ViewBindings.findChildViewById(rootView, id);
      if (userDataPhone == null) {
        break missingId;
      }

      id = R.id.userDataRole;
      TextView userDataRole = ViewBindings.findChildViewById(rootView, id);
      if (userDataRole == null) {
        break missingId;
      }

      id = R.id.userDataSurname;
      TextView userDataSurname = ViewBindings.findChildViewById(rootView, id);
      if (userDataSurname == null) {
        break missingId;
      }

      return new ActivityUserDataPageBinding((LinearLayout) rootView, userDataBirthday,
          userDataEmail, userDataImage, userDataName, userDataPatronymic, userDataPhone,
          userDataRole, userDataSurname);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
