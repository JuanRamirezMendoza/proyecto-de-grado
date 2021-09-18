// Generated by view binder compiler. Do not edit!
package com.proyeto.medicineapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.proyeto.medicineapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegistroBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextInputEditText contraseAConfirmRegistrarseEdt;

  @NonNull
  public final TextInputLayout contraseAConfirmRegistrarseTxtInput;

  @NonNull
  public final TextInputEditText contraseARegsitrarseEdt;

  @NonNull
  public final TextInputLayout contraseARegsitrarseTxtInput;

  @NonNull
  public final TextInputEditText correoRegistrarseEdt;

  @NonNull
  public final TextInputLayout correoRegistrarseTxtInput;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final Button registrarseConfirmButton;

  private ActivityRegistroBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextInputEditText contraseAConfirmRegistrarseEdt,
      @NonNull TextInputLayout contraseAConfirmRegistrarseTxtInput,
      @NonNull TextInputEditText contraseARegsitrarseEdt,
      @NonNull TextInputLayout contraseARegsitrarseTxtInput,
      @NonNull TextInputEditText correoRegistrarseEdt,
      @NonNull TextInputLayout correoRegistrarseTxtInput, @NonNull ImageView imageView,
      @NonNull Button registrarseConfirmButton) {
    this.rootView = rootView;
    this.contraseAConfirmRegistrarseEdt = contraseAConfirmRegistrarseEdt;
    this.contraseAConfirmRegistrarseTxtInput = contraseAConfirmRegistrarseTxtInput;
    this.contraseARegsitrarseEdt = contraseARegsitrarseEdt;
    this.contraseARegsitrarseTxtInput = contraseARegsitrarseTxtInput;
    this.correoRegistrarseEdt = correoRegistrarseEdt;
    this.correoRegistrarseTxtInput = correoRegistrarseTxtInput;
    this.imageView = imageView;
    this.registrarseConfirmButton = registrarseConfirmButton;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegistroBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegistroBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_registro, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegistroBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.contraseñaConfirmRegistrarseEdt;
      TextInputEditText contraseAConfirmRegistrarseEdt = rootView.findViewById(id);
      if (contraseAConfirmRegistrarseEdt == null) {
        break missingId;
      }

      id = R.id.contraseñaConfirmRegistrarseTxtInput;
      TextInputLayout contraseAConfirmRegistrarseTxtInput = rootView.findViewById(id);
      if (contraseAConfirmRegistrarseTxtInput == null) {
        break missingId;
      }

      id = R.id.contraseñaRegsitrarseEdt;
      TextInputEditText contraseARegsitrarseEdt = rootView.findViewById(id);
      if (contraseARegsitrarseEdt == null) {
        break missingId;
      }

      id = R.id.contraseñaRegsitrarseTxtInput;
      TextInputLayout contraseARegsitrarseTxtInput = rootView.findViewById(id);
      if (contraseARegsitrarseTxtInput == null) {
        break missingId;
      }

      id = R.id.correoRegistrarseEdt;
      TextInputEditText correoRegistrarseEdt = rootView.findViewById(id);
      if (correoRegistrarseEdt == null) {
        break missingId;
      }

      id = R.id.correoRegistrarseTxtInput;
      TextInputLayout correoRegistrarseTxtInput = rootView.findViewById(id);
      if (correoRegistrarseTxtInput == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = rootView.findViewById(id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.registrarseConfirmButton;
      Button registrarseConfirmButton = rootView.findViewById(id);
      if (registrarseConfirmButton == null) {
        break missingId;
      }

      return new ActivityRegistroBinding((ConstraintLayout) rootView,
          contraseAConfirmRegistrarseEdt, contraseAConfirmRegistrarseTxtInput,
          contraseARegsitrarseEdt, contraseARegsitrarseTxtInput, correoRegistrarseEdt,
          correoRegistrarseTxtInput, imageView, registrarseConfirmButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}