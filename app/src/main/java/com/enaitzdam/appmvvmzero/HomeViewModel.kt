package com.enaitzdam.appmvvmzero

import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private var _contadorAlumnesEdat = 0
    val contadorAlumnesEdat: Int
        get() = _contadorAlumnesEdat

    fun countAges(edat: Int) {
        val alumnes = AlumneProvider.alumnes()
        _contadorAlumnesEdat = alumnes.filter { it.edat == edat }.count()
    }

}