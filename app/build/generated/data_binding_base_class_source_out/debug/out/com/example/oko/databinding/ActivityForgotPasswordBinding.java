// Generated by view binder compiler. Do not edit!
package com.example.oko.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.oko.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityForgotPasswordBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final TextInputLayout loginText;

  @NonNull
  public final TextInputEditText loginTextView;

  @NonNull
  public final ImageView logodog;

  @NonNull
  public final ProgressBar progressBarForgot;

  @NonNull
  public final Button signIn;

  @NonNull
  public final TextView textViewKO;

  private ActivityForgotPasswordBinding(@NonNull ConstraintLayout rootView,
      @NonNull LinearLayout linearLayout, @NonNull TextInputLayout loginText,
      @NonNull TextInputEditText loginTextView, @NonNull ImageView logodog,
      @NonNull ProgressBar progressBarForgot, @NonNull Button signIn,
      @NonNull TextView textViewKO) {
    this.rootView = rootView;
    this.linearLayout = linearLayout;
    this.loginText = loginText;
    this.loginTextView = loginTextView;
    this.logodog = logodog;
    this.progressBarForgot = progressBarForgot;
    this.signIn = signIn;
    this.textViewKO = textViewKO;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityForgotPasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityForgotPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_forgot_password, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityForgotPasswordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.loginText;
      TextInputLayout loginText = ViewBindings.findChildViewById(rootView, id);
      if (loginText == null) {
        break missingId;
      }

      id = R.id.loginTextView;
      TextInputEditText loginTextView = ViewBindings.findChildViewById(rootView, id);
      if (loginTextView == null) {
        break missingId;
      }

      id = R.id.logodog;
      ImageView logodog = ViewBindings.findChildViewById(rootView, id);
      if (logodog == null) {
        break missingId;
      }

      id = R.id.progressBarForgot;
      ProgressBar progressBarForgot = ViewBindings.findChildViewById(rootView, id);
      if (progressBarForgot == null) {
        break missingId;
      }

      id = R.id.signIn;
      Button signIn = ViewBindings.findChildViewById(rootView, id);
      if (signIn == null) {
        break missingId;
      }

      id = R.id.textViewKO;
      TextView textViewKO = ViewBindings.findChildViewById(rootView, id);
      if (textViewKO == null) {
        break missingId;
      }

      return new ActivityForgotPasswordBinding((ConstraintLayout) rootView, linearLayout, loginText,
          loginTextView, logodog, progressBarForgot, signIn, textViewKO);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
