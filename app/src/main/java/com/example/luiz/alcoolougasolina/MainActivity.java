package com.example.luiz.alcoolougasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.luiz.alcoolougasolina.R.id.textoResultadoId;

public class MainActivity extends AppCompatActivity {
private EditText precoAlcool;
private EditText precoGasolina;
private Button botaoVerificar;
private TextView textoResultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Toast.makeText(getApplicationContext(),"Bem-vindo!",Toast.LENGTH_SHORT).show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = (EditText)findViewById(R.id.precoAlcoolId);
        precoGasolina = (EditText)findViewById(R.id.precoGasolinaId);
        botaoVerificar = (Button)findViewById(R.id.botaoVerificarId);
        textoResultado = (TextView) findViewById(textoResultadoId);

        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Calculando..",Toast.LENGTH_SHORT).show();
               String textoPrecoAlcool = precoAlcool.getText().toString();
                String textoPrecoGasolina = precoGasolina.getText().toString();

                Double valorPrecoAlcool = Double.parseDouble(textoPrecoAlcool);
                Double valorPrecoGasolina = Double.parseDouble(textoPrecoGasolina);

                double resultado = valorPrecoAlcool/valorPrecoGasolina;
                if(resultado>=0.7){
                    textoResultado.setText("È melhor utilizar a Gasolina! ");
                }else{
                    textoResultado.setText("È melhor utilizar o Álcool! ");
                }

            }
        });


    }

}
