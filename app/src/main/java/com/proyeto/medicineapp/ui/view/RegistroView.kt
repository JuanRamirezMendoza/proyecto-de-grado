package com.proyeto.medicineapp.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import com.proyeto.medicineapp.R
import com.google.firebase.auth.FirebaseAuth
import com.proyeto.medicineapp.databinding.ActivityLoginBinding
import com.proyeto.medicineapp.databinding.ActivityRegistroBinding
import com.proyeto.medicineapp.ui.viewmodel.LoginViewModel
import com.proyeto.medicineapp.ui.viewmodel.RegistroViewModel

class RegistroView : AppCompatActivity() {

    private lateinit var binding: ActivityRegistroBinding

    private val registroViewModel: RegistroViewModel by viewModels()

    private val context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.lifecycleOwner = this
        binding.viewModelRegistro = registroViewModel

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()

        val correo = findViewById<EditText>(R.id.correoRegistrarseEdt)
        val contraseña = findViewById<EditText>(R.id.contraseñaRegsitrarseEdt)
        val confirmarContraseña = findViewById<EditText>(R.id.contraseñaConfirmRegistrarseEdt)
        val registarseConfirmButton = findViewById<Button>(R.id.registrarseConfirmButton)


        registarseConfirmButton.setOnClickListener(View.OnClickListener {
            if (correo.text.toString().isEmpty() || contraseña.text.toString().isEmpty() || confirmarContraseña.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "No deje campos vacios", Toast.LENGTH_SHORT)
                    .show()
            } else {
                if (!confirmarContraseña.text.toString().equals(contraseña.text.toString())) {
                    Toast.makeText(
                        applicationContext,
                        "Las contraseñas no coinciden",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                } else {
                    FirebaseAuth.getInstance().createUserWithEmailAndPassword(
                        correo.text.toString(),
                        contraseña.text.toString()
                    ).addOnCompleteListener {
                        if (it.isSuccessful) {
                            showSuccesfulAlert()
                        } else {
                            showAlert()
                        }
                    }
                }

            }
        })

    }

    private fun showAlert() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Se ha producido un error crear usuario")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    private fun showSuccesfulAlert() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Creado")
        builder.setMessage("Se ha creado el usuario correctamente")
        builder.setPositiveButton("Aceptar", null)
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
}