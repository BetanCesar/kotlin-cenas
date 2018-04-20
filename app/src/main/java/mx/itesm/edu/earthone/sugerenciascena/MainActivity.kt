package mx.itesm.edu.earthone.sugerenciascena

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    val cenas = arrayListOf("HotDog", "Quesadillas", "Chilacayotes en Mole", "Sandwich", "ChopSuey")
    val calorias = arrayListOf("290", "350", "210", "150", "550")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        comidaText.text = cenas[0]
        caloriaText.text = calorias[0]

        agrega.setOnClickListener {
            val nuevaCena = nuevaText.text.toString()
            val nuevaCaloria = nuevaCaloriaText.text.toString()
            cenas.add(nuevaCena)
            calorias.add(nuevaCaloria)
            nuevaText.text.clear()
            nuevaCaloriaText.text.clear()
        }

        selecciona.setOnClickListener {
            val aleatorio = Random()
            val cenaAleatoria = aleatorio.nextInt(cenas.count())
            comidaText.text = cenas[cenaAleatoria]
            caloriaText.text = calorias[cenaAleatoria]
        }

    }
}
