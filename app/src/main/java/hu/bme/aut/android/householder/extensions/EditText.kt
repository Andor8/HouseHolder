package hu.bme.aut.android.householder.extensions

import android.widget.EditText

fun EditText.validateNonEmpty(): Boolean{
    if(this.text.isEmpty()){
        this.error = "Required"
        return false
    }
    return true
}