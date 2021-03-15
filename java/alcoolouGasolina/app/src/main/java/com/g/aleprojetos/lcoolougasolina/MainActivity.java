package com.g.aleprojetos.lcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editPrecoAlcool, editPrecoGasolina;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoAlcool   = findViewById(R.id.editPrecoAlcool);
        editPrecoGasolina = findViewById(R.id.editPrecoGasolina);
        textResultado     = findViewById(R.id.textResultado);

    }

    public void calcularPreco(View view){

        //recuperar valores digitatos
        String precoAlcool    = editPrecoAlcool.getText().toString();
        String precoGasolinha = editPrecoGasolina.getText().toString();

        //validar os campos digitados
        Boolean camposValidados = validarCampos(precoAlcool,precoGasolinha);

        if(camposValidados){

            //convertendo string para número
            Double valorAlcool = Double.parseDouble(precoAlcool);
            Double valorGasolina = Double.parseDouble(precoGasolinha);

            /* Fazer cálculo de menor preço
             *Se (valorAlcool / valorGasolina) >=0.7 é melhor utilizar gasolina
             * senão é melhor utilizar álcool
             **/
            double resultado = valorAlcool / valorGasolina;

            if(resultado >= 0.7){
                textResultado.setText("O melhor utilizar Gasolina");
            }else{
                textResultado.setText("O melhor utilizar Álcool");
            }
        }else{
            textResultado.setText("Preencha os preços primeiro!");
        }
    }

    public Boolean validarCampos (String pAlcool, String pGasolina){

        Boolean camposValidados = true;

        if(pAlcool == null || pAlcool.equals("")) {

            camposValidados = false;

        }else if(pGasolina == null || pGasolina.equals("")){

            camposValidados = false;

        }

        return camposValidados;
    }
}
