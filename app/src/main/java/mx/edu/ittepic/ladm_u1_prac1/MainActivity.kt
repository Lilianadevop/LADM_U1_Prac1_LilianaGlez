package mx.edu.ittepic.ladm_u1_prac1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lista.setOnItemClickListener{parent, view, posicion, id->
            when(posicion){
                0->{llamPrimAc()}
                1->{llamSegAc()}
                2->{
                    AlertDialog.Builder(this)
                        .setTitle("ACERCA DE NOSOTROS")
                        .setMessage("(C) Aplicación con derechos reservados al ITT")
                        .setPositiveButton("ACEPTAR",{d,i->d.dismiss()})
                        .setNegativeButton("SALIR",{d,i->d.dismiss()})
                        .show()
                }
                3->{finish()}
            }
        }
    }

    fun llamSegAc(){
        val otraVen = Intent(this, Tabbed::class.java)
        startActivity(otraVen)
    }

    fun llamPrimAc(){
        val otraVen = Intent(this, Scrolling::class.java)
        startActivity(otraVen)
    }
}