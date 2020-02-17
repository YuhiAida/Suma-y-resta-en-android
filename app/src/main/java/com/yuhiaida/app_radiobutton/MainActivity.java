package com.yuhiaida.app_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tvResultado;
    private RadioButton rb1, rb2, rb3, rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.editText);
        et2 = (EditText)findViewById(R.id.editText2);
        tvResultado = (TextView)findViewById(R.id.textView);
        rb1 = (RadioButton)findViewById(R.id.radioButton);
        rb2 = (RadioButton)findViewById(R.id.radioButton2);
        rb3 = (RadioButton)findViewById(R.id.radioButton3);
        rb4 = (RadioButton)findViewById(R.id.radioButton4);
    }

    //Metodo para el boton calcular
    public void Calcular(View view){
        String valor1_String = et1.getText().toString();
        String valor2_String = et2.getText().toString();

        int valor1_Int = Integer.parseInt(valor1_String);
        int valor2_Int = Integer.parseInt(valor2_String);

        if (rb1.isChecked() == true){
            int suma = valor1_Int + valor2_Int;
            String resultado = String.valueOf(suma);
            tvResultado.setText(resultado);
        }else if (rb2.isChecked() == true){
            int resta = valor1_Int - valor2_Int;
            String resultado = String.valueOf(resta);
            tvResultado.setText(resultado);
        }else if (rb3.isChecked() == true){
            int multiplicacion = valor1_Int * valor2_Int;
            String resultado = String.valueOf(multiplicacion);
            tvResultado.setText(resultado);
        }else if (rb4.isChecked() == true && valor2_Int != 0){
            int division = valor1_Int / valor2_Int;
            String resultado = String.valueOf(division);
            tvResultado.setText(resultado);
        }else if (rb4.isChecked() == true && valor2_Int == 0){
            Toast.makeText(this, "Como vas a dividir por 0 la concha de tu madre", Toast.LENGTH_LONG).show();
        }
    }
}
