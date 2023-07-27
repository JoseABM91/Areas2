package com.example.areas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var editTexNum1:EditText=findViewById(R.id.editTextNum1);var figura = "";
        var editTextNum2:EditText=findViewById(R.id.editTextNum2)

        if (intent.getStringExtra("figura") != null) {
            figura = intent.getStringExtra("cuadrado").toString();
        }
        if (figura.equals ("Cuadrado") ) {
            editTextNum2.visibility = View.GONE;
        }

    }
    fun volver(view: View) {
        var miIntent = Intent(this, MainActivity::class.java);
        startActivity(miIntent);
    }
    fun calcular(view: View) {
        //HAY QUE AÑADIR UN IF PARA TENER OPCIONES CON LAS FIGURAS RESTANTES
        if (figura.equals ("Cuadrado")) {
            var editTextNum1: EditText = findViewById(R.id.editTextNum1);
            var textViewResultado: TextView = findViewById(R.id.textViewResultado);
            //CUADRADO
            var iLado = editTextNum1.text.toString().toDouble()

            var resultado = iLado * iLado

            if (resultado > 0) {
                Toast.makeText(this, "El area del cuadrado es:" + resultado, Toast.LENGTH_LONG);
            } else {
                Toast.makeText(this, "Los datos son incorrectos.", Toast.LENGTH_LONG);
            }
        if (figura.equals ("Triangulo")) {
            var editTextNum1: EditText = findViewById(R.id.editTextNum1);
            var editTextNum2: EditText = findViewById(R.id.editTextNum2);
            var textViewResultado: TextView = findViewById(R.id.textViewResultado);
            //TRIANGULO
            var iAltura = editTextNum1.text.toString().toDouble()
            var iBase = editTextNum2.text.toString().toDouble()

            var resultado = (iAltura * iBase)/2

              if (resultado > 0) {
                            Toast.makeText(this, "El area del triangulo es:" + resultado, Toast.LENGTH_LONG);
              } else {
                            Toast.makeText(this, "Los datos son incorrectos.", Toast.LENGTH_LONG);
             }
        }
        // -------------------
        if (resultado > 0) {
            Toast.makeText(this, "El area de la figura es:" + resultado, Toast.LENGTH_LONG);
        } else {
            Toast.makeText(this, "Los datos son incorrectos.", Toast.LENGTH_LONG);
        }
            if (figura.equals ("Rectangulo){
                var editTextNum1: EditText = findViewById(R.id.editTextNum1);
                var editTextNum2: EditText = findViewById(R.id.editTextNum2);
                var textViewResultado: TextView = findViewById(R.id.textViewResultado);
                //RECTANGULO
                var iAltura = editTextNum1.text.toString().toDouble()
                var iBase = editTextNum2.text.toString().toDouble()

                var resultado = (iAltura * iBase)

                if (resultado > 0) {
                    Toast.makeText(this, "El area del rectangulo  es:" + resultado, Toast.LENGTH_LONG);
                } else {
                    Toast.makeText(this, "Los datos son incorrectos.", Toast.LENGTH_LONG);
                }
            }
        }
    }


}
