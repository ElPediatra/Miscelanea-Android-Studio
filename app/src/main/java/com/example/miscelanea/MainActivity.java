package com.example.miscelanea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText numero1, numero2;
    public TextView resultado2;
    public int operando1, operando2, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = findViewById(R.id.editTextNumber);
        numero2 = findViewById(R.id.editTextNumber2);
        resultado2 = findViewById(R.id.TxtResultado2);
    }

    public void opPotencia(View view) {
        operando1 = Integer.parseInt(numero1.getText().toString());
        operando2 = Integer.parseInt(numero2.getText().toString());
        resultado = (int)Math.pow(operando1, operando2);
        resultado2.setText(String.valueOf(resultado));
    }

    public void opFibonacci(View view) {
        EditText et1 = (EditText) findViewById(R.id.txtOperando1);
        TextView resultado = (TextView) findViewById(R.id.lblResultado);
        int op1 = Integer.parseInt(et1.getText().toString());
        String resul=new String("");
        resul=fibonacci(op1);
        resultado.setText(String.valueOf(resul));
    }

    public void opFactorial(View view) {
        EditText et1 = (EditText) findViewById(R.id.txtOperando1);
        TextView resultado = (TextView) findViewById(R.id.lblResultado);
        int op1 = Integer.parseInt(et1.getText().toString());
        int resul;
        resul=factorial(op1);
        resultado.setText(String.valueOf(resul));
    }

    public void limpiar(View view){
        resultado2.setText("0");
        numero1.setText("");
        numero2.setText("");
    }
}