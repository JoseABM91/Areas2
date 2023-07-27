package com.example.areas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

     lateinit var textViewResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun CalcularCuadrado(view: View) {
        var miIntent = Intent (this, MainActivity2::class.java);

        miIntent.putExtra ("figura", "Cuadrado");
        startActivity(miIntent);

        }
    fun CalcularRectangulo(view: View) {
        var miIntent = Intent (this, MainActivity2::class.java);
        miIntent.putExtra ("figura", "Rectangulo");
        startActivity(miIntent);

    }
    fun CalcularTriangulo(view: View) {
        var miIntent = Intent (this, MainActivity2::class.java);
        miIntent.putExtra ("figura", "Triangulo");
        startActivity(miIntent);

    }



}



    /*


    static int calcularAreaRectangulo(String base, String altura){
        int iBase = Integer.parseInt(base);
        int iAltura = Integer.parseInt(altura);

        int areaCalculada = iBase * iAltura;
        return areaCalculada;
    }

    static double calcularAreaTriangulo (String base, String altura){
        return (Double.parseDouble(base) * Double.parseDouble(altura))/2;
    }

    static double calcularArea(int opcionSolicitada){

        double area = -1;
        switch (opcionSolicitada) {
            case 1, 2:
                System.out.println ( "Dame la altura: ");
                String altura = lectura.nextLine();
                System.out.println ( "Dame la base: ");
                String base = lectura.nextLine();
                if (opcionSolicitada == 1) {
                    area = calcularAreaTriangulo(base, altura);
                } else{
                    area = calcularAreaRectangulo(base, altura);
                }
            break;
            case 3:

                System.out.println ("Dame el lado del cuadrado:");
                String lado = lectura.nextLine();
                area = calcularAreaRectangulo(lado, lado);
            default:
                System.out.println( "Opción no válida");
                break;
        }
        return area;
    }

    static String menu(){
        System.out.println ("Qué quieres calcular: ");
        System.out.println ("1.- Triangulo");
        System.out.println ("2.- Rectangulo");
        System.out.println ("3.- Cuadrado");
        String opcionElegida = lectura.nextLine();
        return opcionElegida;
    }
    public static void main(String[] args) throws Exception {

        String elegido = menu();
        int opcionElegida = Integer.parseInt(elegido);
        double area = calcularArea(opcionElegida);

        System.out.println ( "El área calculada es: " + area);
    }
}
     */
