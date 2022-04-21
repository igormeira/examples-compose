package com.igormeira.compose_examples.lazycolumn.util

import com.igormeira.compose_examples.lazycolumn.data.Contact

object DefaultData {

    fun createContactList() : List<Contact> {
        return listOf(
            Contact("Adam Lemos"),
            Contact("Adriel Salvador"),
            Contact("Christian Banes"),
            Contact("Floriano Sinco"),
            Contact("José Alcantra"),
            Contact("Chris Jordan"),
            Contact("Evandro Neto"),
            Contact("Josemar Lemos"),
            Contact("Éder Oliveira"),
            Contact("Jéssica Escobar"),
            Contact("Marta Osias"),
            Contact("Ellen Ortiz"),
            Contact("Kaike Promes")
        )
    }

}