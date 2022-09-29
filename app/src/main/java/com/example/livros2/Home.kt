package com.example.livros2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.livros2.livros.HaloBrokenCircle

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val logoImg= findViewById<ImageView>(R.id.logo)

        Glide.with(this).load("https://copias.supermidiapf.com.br/wp-content/uploads/sites/4/manuais-e-livros-passo-fundo-impressao-super-copias-grafica-digital/Livros-e-Manuais-Passo-Fundo-Super-C%C3%B3pias-Gr%C3%A1fica-Digital-2.png").into(logoImg)
        val livro1 = findViewById<ImageView>(R.id.livro1)
        livro1.setOnClickListener{
            irParaLivro1()
        }

    }
    private fun irParaLivro1(){
        val intent = Intent(this@Home,HaloBrokenCircle::class.java)
        startActivity(intent)
    }
}