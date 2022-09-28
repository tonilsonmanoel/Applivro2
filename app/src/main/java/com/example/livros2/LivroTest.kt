package com.example.livros2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LivroTest : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_livro_test)
        var lerlivro = findViewById<Button>(R.id.lerlivro)
        lerlivro.setOnClickListener {
            irParaWebView()
        }
    }

    private fun irParaWebView(){
        val intent = Intent(this@LivroTest, MainActivity::class.java)
        intent.putExtra("pdf","https://ablutionary-aviatio.000webhostapp.com/Halo_JohnShirley.pdf")
        startActivity(intent)
    }


}




