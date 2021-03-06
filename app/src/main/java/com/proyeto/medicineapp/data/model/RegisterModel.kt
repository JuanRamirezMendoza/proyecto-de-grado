package com.proyeto.medicineapp.data.model

import com.proyeto.medicineapp.data.network.FirebaseController

data class RegisterModel(val email: String, val password: String, val passwordConfirm: String) {
    private val firebaseController = FirebaseController()

    fun register(success: () -> Unit, error: () -> Unit){
        firebaseController.register(this, success, error)
    }
}