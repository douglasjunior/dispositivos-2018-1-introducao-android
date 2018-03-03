package br.grupointegrado.tads.meuprimeiroapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    companion object {
        val EXTRA_MENSAGEM = "MENSAGEM_TEXTO"
    }

    fun enviarMensagem(view: View?) {
        val mensagem = editText.text.toString()

        val intent = Intent(this,
                ExibirMensagemActivity::class.java)
        intent.putExtra(EXTRA_MENSAGEM, mensagem)
        startActivity(intent)
    }


}
