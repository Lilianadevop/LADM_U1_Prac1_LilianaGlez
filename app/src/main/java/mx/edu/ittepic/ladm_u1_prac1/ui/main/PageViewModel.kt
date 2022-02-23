package mx.edu.ittepic.ladm_u1_prac1.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class PageViewModel : ViewModel() {

    private val _index = MutableLiveData<Int>()
    val text: LiveData<String> = Transformations.map(_index) {
        "Bienvenido al Museo No: $it Este museo fue fundado en el año de ....."
    }

    fun setIndex(index: Int) {
        _index.value = index
    }
}