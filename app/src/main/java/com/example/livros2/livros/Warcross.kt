package com.example.livros2.livros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.livros2.R
import com.example.livros2.WebView

class Warcross : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_warcross)
        val irWebView = findViewById<Button>(R.id.lerlivro)
        irWebView.setOnClickListener { irParaWebView() }
    }

    private fun irParaWebView(){
        val intent = Intent(this@Warcross, WebView::class.java)
        intent.putExtra("pdf","https://ablutionary-aviatio.000webhostapp.com/Warcross%20-%20Jogador%20Caçado%20Hacker%20Marie%20Lu.pdf")
        startActivity(intent)
    }
}