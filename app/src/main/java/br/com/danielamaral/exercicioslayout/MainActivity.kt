package br.com.danielamaral.exercicioslayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun abrirTelefoneLinearLayout(view: View){
        val intent = Intent(this, TelefoneLinearLayoutActivity::class.java)
        startActivity(intent)
    }

    fun abrirTelefoneConstraintLayout(view: View){
        val intent = Intent(this, TelefoneConstraintLayoutActivity::class.java)
        startActivity(intent)
    }


    fun abrirFormularioLinearLayoutVertical(view: View){
        val intent = Intent(this, FormularioLinearLayoutVerticalActivity::class.java)
        startActivity(intent)
    }


}