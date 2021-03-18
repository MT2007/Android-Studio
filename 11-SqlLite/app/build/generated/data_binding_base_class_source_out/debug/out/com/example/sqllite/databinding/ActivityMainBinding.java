// Generated by view binder compiler. Do not edit!
package com.example.sqllite.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.example.sqllite.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button bt1;

  @NonNull
  public final CheckBox cb1;

  @NonNull
  public final RecyclerView rv1;

  @NonNull
  public final EditText tf1;

  @NonNull
  public final EditText tf2;

  @NonNull
  public final EditText tf3;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button bt1,
      @NonNull CheckBox cb1, @NonNull RecyclerView rv1, @NonNull EditText tf1,
      @NonNull EditText tf2, @NonNull EditText tf3) {
    this.rootView = rootView;
    this.bt1 = bt1;
    this.cb1 = cb1;
    this.rv1 = rv1;
    this.tf1 = tf1;
    this.tf2 = tf2;
    this.tf3 = tf3;
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
      id = R.id.bt1;
      Button bt1 = rootView.findViewById(id);
      if (bt1 == null) {
        break missingId;
      }

      id = R.id.cb1;
      CheckBox cb1 = rootView.findViewById(id);
      if (cb1 == null) {
        break missingId;
      }

      id = R.id.rv1;
      RecyclerView rv1 = rootView.findViewById(id);
      if (rv1 == null) {
        break missingId;
      }

      id = R.id.tf1;
      EditText tf1 = rootView.findViewById(id);
      if (tf1 == null) {
        break missingId;
      }

      id = R.id.tf2;
      EditText tf2 = rootView.findViewById(id);
      if (tf2 == null) {
        break missingId;
      }

      id = R.id.tf3;
      EditText tf3 = rootView.findViewById(id);
      if (tf3 == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, bt1, cb1, rv1, tf1, tf2, tf3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}