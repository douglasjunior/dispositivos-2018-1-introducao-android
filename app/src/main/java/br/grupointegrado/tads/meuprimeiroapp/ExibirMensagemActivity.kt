package br.grupointegrado.tads.meuprimeiroapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_exibir_mensagem.*

class ExibirMensagemActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exibir_mensagem)

        val intent = this.intent
        val mensagem =
                intent.getStringExtra(MainActivity.EXTRA_MENSAGEM)

        textView.text = mensagem
    }
}
