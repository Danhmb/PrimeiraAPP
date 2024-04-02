package haddad.maia.barbosa.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        //obtem o intent que veio de main activity
        Intent i = getIntent();

        //pega o texto digitado no main activity que veio dentro do intent
        String textoDigitado = i.getStringExtra("Texto");
        TextView tvTexto = findViewById(R.id.tvTexto);

        //muda o texto da TextView para o texto que foi digitado
        tvTexto.setText(textoDigitado);
    }
}