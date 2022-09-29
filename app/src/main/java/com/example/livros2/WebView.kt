package com.example.livros2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.livros2.databinding.ActivityWebviewBinding


class WebView : AppCompatActivity() {
   // private lateinit var binding: ActivityMainBinding
    private lateinit var  binding: ActivityWebviewBinding
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)
        binding = ActivityWebviewBinding.inflate(layoutInflater)
        val webView = findViewById<WebView>(R.id.webView)
        webView.webViewClient = WebViewClient()
        val dados = intent.extras
        val pdf =dados?.getString("pdf")

        webView.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url="+pdf)
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled =  true


    }

}