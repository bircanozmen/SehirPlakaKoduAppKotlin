package com.bircanozmen.sehirplakakodubulmakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.bircanozmen.sehirplakakodubulmakotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener{
            if(binding.plakaText.text.isNotEmpty()) {

                var plakakodu = binding.plakaText.text.toString().toInt()

                when (plakakodu) {

                    35 -> binding.sehirText.text = "İzmir"
                    45 -> binding.sehirText.text = "Manisa"
                    34 -> binding.sehirText.text = "İstanbul"
                    3 -> binding.sehirText.text = "Afyon"
                    9 -> binding.sehirText.text = "İzmir"
                else ->{
                    binding.sehirText.text="Bulunamadı"
                }
                }

            }
            else{
                Toast.makeText(applicationContext, "Şehir İsmi Giriniz", Toast.LENGTH_LONG).show()

            }
            //binding.plakaText.text.clear()
        }
}
}