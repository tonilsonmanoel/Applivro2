package com.example.livros2.livros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.livros2.R
import com.example.livros2.WebView

class SweetKisses2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sweet_kisses2)
        val irWebView = findViewById<Button>(R.id.lerlivro)
        irWebView.setOnClickListener { irParaWebView() }
    }

    private fun irParaWebView(){
        val intent = Intent(this@SweetKisses2, WebView::class.java)
        intent.putExtra("pdf","https://ablutionary-aviatio.000webhostapp.com/Kisses%203%20-%20Saved%20Kisses%20-%20Ella%20Goode.pdf")
        startActivity(intent)
    }
}