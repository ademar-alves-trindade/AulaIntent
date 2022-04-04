package br.com.lsdm.aulaintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button botaoFinalizar, botaoAbreTela;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("TELA PRINCIPAL");
        botaoAbreTela = findViewById(R.id.btnAbrirSecundaTela);
        botaoFinalizar = findViewById(R.id.btnFinalizar);

        botaoFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        botaoAbreTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intencaoOutraTela = new Intent(getApplicationContext(), TelaSecundaria.class);
                startActivity(intencaoOutraTela);
            }
        });

    }
}