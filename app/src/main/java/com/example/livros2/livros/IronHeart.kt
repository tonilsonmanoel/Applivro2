package com.example.livros2.livros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.livros2.R
import com.example.livros2.WebView

class IronHeart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iron_heart)
        val irWebView = findViewById<Button>(R.id.lerlivro)
        irWebView.setOnClickListener { irParaWebView() }
    }

    private fun irParaWebView(){
        val intent = Intent(this@IronHeart, WebView::class.java)
        intent.putExtra("pdf","https://ablutionary-aviatio.000webhostapp.com/Iron%20Heart%20-%20Nina%20Varela.pdf")
        startActivity(intent)
    }
}