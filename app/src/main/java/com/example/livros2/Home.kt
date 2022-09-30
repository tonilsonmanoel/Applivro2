package com.example.livros2

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.livros2.livros.*

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val logoImg= findViewById<ImageView>(R.id.logo)

        Glide.with(this).load("https://copias.supermidiapf.com.br/wp-content/uploads/sites/4/manuais-e-livros-passo-fundo-impressao-super-copias-grafica-digital/Livros-e-Manuais-Passo-Fundo-Super-C%C3%B3pias-Gr%C3%A1fica-Digital-2.png").into(logoImg)
        val halo = findViewById<ImageView>(R.id.halo)
        halo.setOnClickListener{ irParaHalo() }
        val bioshock = findViewById<ImageView>(R.id.bioshock)
        bioshock.setOnClickListener{ irParaBioshock() }
        val rotasdecolisao = findViewById<ImageView>(R.id.rotasdecolisao)
        rotasdecolisao.setOnClickListener { irParaRotas() }
        val nyxia = findViewById<ImageView>(R.id.nyxia)
        nyxia.setOnClickListener { irParanyxia() }
        val umMundoBrilante = findViewById<ImageView>(R.id.ummundobrilhante)
        umMundoBrilante.setOnClickListener { irParaUmMundo() }
        val forestOfSouls = findViewById<ImageView>(R.id.forestofsouls)
        forestOfSouls.setOnClickListener { irParaForest() }
        val ironheart = findViewById<ImageView>(R.id.ironheart)
        ironheart.setOnClickListener { irParaIron() }
        val lightbringer = findViewById<ImageView>(R.id.lightbringer)
        lightbringer.setOnClickListener { irParaLighibringer() }
        val ocacador = findViewById<ImageView>(R.id.oca_adordedemonios)
        ocacador.setOnClickListener { irParaOcacador() }
        val queen = findViewById<ImageView>(R.id.queen)
        queen.setOnClickListener { irParaQueen() }
        val grigori = findViewById<ImageView>(R.id.grigori)
        grigori.setOnClickListener { irParaGrigore() }
        val holdingMia = findViewById<ImageView>(R.id.holdingmed)
        holdingMia.setOnClickListener { irParaHolding() }
        val mikhail = findViewById<ImageView>(R.id.mikhail)
        mikhail.setOnClickListener {irParaMikhail() }
        val rurik = findViewById<ImageView>(R.id.rurik)
        rurik.setOnClickListener { irParaRurik() }
        val savedKisses3 = findViewById<ImageView>(R.id.savedkisses)
        savedKisses3.setOnClickListener { irParaSaved() }
        val sweetKisses2 = findViewById<ImageView>(R.id.sweetkisses3)
        sweetKisses2.setOnClickListener { irParaSweet() }
        val tudoJunto= findViewById<ImageView>(R.id.tudojunto)
        tudoJunto.setOnClickListener { irParaTudoJunto() }
        val umContoDoDestino = findViewById<ImageView>(R.id.umcontododestino)
        umContoDoDestino.setOnClickListener { irParaUmConto() }
        val irmaMorte = findViewById<ImageView>(R.id.irmamorte)
        irmaMorte.setOnClickListener { irParaIrmaMorte() }
        val thoseWhoPrey = findViewById<ImageView>(R.id.thosewhoprey)
        thoseWhoPrey.setOnClickListener { irParaThoseWho() }
    }
    private fun irParaHalo(){
        val intent = Intent(this@Home,HaloBrokenCircle::class.java)
        startActivity(intent)
    }
    private fun irParaBioshock(){
        val intent = Intent(this@Home,BioshockRapture::class.java)
        startActivity(intent)
    }
    private fun irParaRotas(){
        val intent = Intent(this@Home,RotasdeColisa::class.java)
        startActivity(intent)
    }
    private fun irParanyxia(){
        val intent = Intent(this@Home,Nyxia::class.java)
        startActivity(intent)
    }
    private fun irParaUmMundo(){
        val intent = Intent(this@Home,UmMundoBrilhante::class.java)
        startActivity(intent)
    }
    private fun irParaForest(){
        val intent = Intent(this@Home,Forest_Of_Souls::class.java)
        startActivity(intent)
    }
    private fun irParaIron(){
        val intent = Intent(this@Home,IronHeart::class.java)
        startActivity(intent)
    }
    private fun irParaLighibringer(){
        val intent = Intent(this@Home,Lightbringer::class.java)
        startActivity(intent)
    }
    private fun irParaOcacador(){
        val intent = Intent(this@Home,O_cacador_de_demonios::class.java)
        startActivity(intent)
    }
    private fun irParaQueen(){
        val intent = Intent(this@Home,QueenOfTheWildwood::class.java)
        startActivity(intent)
    }
    private fun irParaGrigore(){
        val intent = Intent(this@Home,Grigori::class.java)
        startActivity(intent)
    }
    private fun irParaHolding(){
        val intent = Intent(this@Home,HoldingMia::class.java)
        startActivity(intent)
    }
    private fun irParaMikhail(){
        val intent = Intent(this@Home,Mikhail::class.java)
        startActivity(intent)
    }
    private fun irParaRurik(){
        val intent = Intent(this@Home,Rurik::class.java)
        startActivity(intent)
    }
    private fun irParaSaved(){
        val intent = Intent(this@Home,SavedKisses3::class.java)
        startActivity(intent)
    }
    private fun irParaSweet(){
        val intent = Intent(this@Home,SweetKisses2::class.java)
        startActivity(intent)
    }
    private fun irParaTudoJunto(){
        val intent = Intent(this@Home,Tudo_junto_e_misturado::class.java)
        startActivity(intent)
    }
    private fun irParaUmConto(){
        val intent = Intent(this@Home,UmContoDoDestino::class.java)
        startActivity(intent)
    }
    private fun irParaIrmaMorte(){
        val intent = Intent(this@Home,Irma_morte::class.java)
        startActivity(intent)
    }
    private fun irParaThoseWho(){
        val intent = Intent(this@Home,ThoseWhoPrey::class.java)
        startActivity(intent)
    }



}