package com.zezel.calculadoraoperaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextA;
    private EditText editTextB;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);

        editTextA = findViewById(R.id.editTextNumberA);
        editTextB = findViewById(R.id.editTextNumberB);
        textViewResultado = findViewById(R.id.textViewResultado);
    }

    public void sumar(View view) {
        double operacion = Double.parseDouble(editTextA.getText().toString()) + Double.parseDouble(editTextB.getText().toString());
        textViewResultado.setText(operacion + "");
    }

    public void restar(View view) {
        double operacion = Double.parseDouble(editTextA.getText().toString()) - Double.parseDouble(editTextB.getText().toString());
        textViewResultado.setText(operacion + "");
    }

    public void multiplicar(View view) {
        double operacion = Double.parseDouble(editTextA.getText().toString()) * Double.parseDouble(editTextB.getText().toString());
        textViewResultado.setText(operacion + "");
    }

    public void dividir(View view) {
        double numeroA = Double.parseDouble(editTextA.getText().toString());
        double numeroB = Double.parseDouble(editTextB.getText().toString());
        double operacion;

        if(numeroB != 0) operacion = numeroA / numeroB;
        else operacion = 0;

        textViewResultado.setText(operacion + "");
    }

}