package haddad.maia.barbosa.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

//Classe main activity = tela principal do app
public class MainActivity extends AppCompatActivity {

    //Quando a tela for criada, chama -> onCreate

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Cria elementos de interface
        setContentView(R.layout.activity_main);

        //Procura o elemento botao pelo seu respectivo id e o atribui a uma variavel
        Button btnEnviar = findViewById(R.id.btnEnviar);

        //Define a acao ao clicar no botao
        btnEnviar.setOnClickListener(new View.OnClickListener() {

            //Executado quando o botao for clicado
            @Override
            public void onClick(View v) {

                //Ao ser clicado nao permite outro clique
                v.setEnabled(false);

                //pega o EditText pelo id
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);

                //pega o texto digitado dentro da caixa de texto
                String textoDigitado = etDigiteAqui.getText().toString();

                //cria uma intenção para navegar até a nova activity
                Intent i = new Intent(MainActivity.this, NextActivity.class);

                //a intenção manda o texto digitado para a nova activity
                i.putExtra("Texto", textoDigitado);

                //inicia a nova activity / sobrepõe
                startActivity(i);
            }
        });
    }
}