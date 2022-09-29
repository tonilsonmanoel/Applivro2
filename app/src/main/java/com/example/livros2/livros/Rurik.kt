package com.example.livros2.livros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.livros2.R
import com.example.livros2.WebView

class Rurik : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rurik)
        val irWebView = findViewById<Button>(R.id.lerlivro)
        irWebView.setOnClickListener { irParaWebView() }
    }

    private fun irParaWebView(){
        val intent = Intent(this@Rurik, WebView::class.java)
        intent.putExtra("pdf","https://ablutionary-aviatio.000webhostapp.com/Brothers%20of%20Ash%20and%20Fire%203%20-%20Rurik%20-%20Lauren%20Smith%20.pdf")
        startActivity(intent)
    }
}