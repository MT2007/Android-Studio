// Generated by view binder compiler. Do not edit!
package com.example.broadcastreceiver.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.broadcastreceiver.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout f;

  @NonNull
  public final Button fbt1;

  @NonNull
  public final Button fbt2;

  @NonNull
  public final TextView ftv1;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull ConstraintLayout f,
      @NonNull Button fbt1, @NonNull Button fbt2, @NonNull TextView ftv1) {
    this.rootView = rootView;
    this.f = f;
    this.fbt1 = fbt1;
    this.fbt2 = fbt2;
    this.ftv1 = ftv1;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout f = (ConstraintLayout) rootView;

      id = R.id.fbt1;
      Button fbt1 = rootView.findViewById(id);
      if (fbt1 == null) {
        break missingId;
      }

      id = R.id.fbt2;
      Button fbt2 = rootView.findViewById(id);
      if (fbt2 == null) {
        break missingId;
      }

      id = R.id.ftv1;
      TextView ftv1 = rootView.findViewById(id);
      if (ftv1 == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, f, fbt1, fbt2, ftv1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
