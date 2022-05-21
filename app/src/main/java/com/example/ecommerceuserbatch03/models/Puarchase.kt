package com.example.ecommerceuserbatch03.models

import com.google.firebase.Timestamp

data class Puarchase(
    var purchaseId: String? = null,
    var productId: String? = null,
    var purchaseDate: Timestamp? = null,
    var purchasePrice: Double = 0.0,
    var quantity: Double = 1.0
)