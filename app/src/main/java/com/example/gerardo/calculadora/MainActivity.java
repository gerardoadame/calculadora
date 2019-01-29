package com.example.gerardo.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn0,btn1,btn2, btn3, btn4, btn5, btn6, btn7, btn8,btn9,limpiar,punto,suma,resta,multi,divicion,igual,borrar ;
    TextView texto;
    double resultado=0;
    String operador,mostrar,reserva;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        limpiar=findViewById(R.id.limp);
        punto=findViewById(R.id.punto);
        suma=findViewById(R.id.suma);
        resta=findViewById(R.id.resta);
        multi=findViewById(R.id.multi);
        igual=findViewById(R.id.igual);


        btn0.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar= texto.getText().toString();
                mostrar=mostrar+"0";
                texto.setText(mostrar);

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=texto.getText().toString();
                mostrar=mostrar+"1";
                texto.setText(mostrar);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=texto.getText().toString();
                mostrar=mostrar+"2";
                texto.setText(mostrar);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=texto.getText().toString();
                mostrar=mostrar+"3";
                texto.setText(mostrar);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=texto.getText().toString();
                mostrar=mostrar+"4";
                texto.setText(mostrar);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=texto.getText().toString();
                mostrar=mostrar+"5";
                texto.setText(mostrar);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=texto.getText().toString();
                mostrar=mostrar+"6";
                texto.setText(mostrar);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=texto.getText().toString();
                mostrar=mostrar+"7";
                texto.setText(mostrar);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=texto.getText().toString();
                mostrar=mostrar+"8";
                texto.setText(mostrar);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=texto.getText().toString();
                mostrar=mostrar+"9";
                texto.setText(mostrar);
            }
        });
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reserva=texto.getText().toString();
                operador="+";
                texto.setText("");
            }
        });
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reserva=texto.getText().toString();
                operador="-";
                texto.setText("");
            }
        });
        divicion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reserva=texto.getText().toString();
                operador="/";
                texto.setText("");
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reserva=texto.getText().toString();
                operador="*";
                texto.setText("");
            }
        });
        punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=texto.getText().toString();
                mostrar=mostrar+".";
                texto.setText(mostrar);
            }
        });
        limpiar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = "";
                texto.setText(mostrar);
                reserva = "";
                operador = "";
            }
        });
        borrar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = texto.getText().toString();
                mostrar = mostrar.substring(0,mostrar.length()-1);
                texto.setText(mostrar);
            }
        });
        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = texto.getText().toString();
                mostrar = mostrar + "1";
                if(operador.equals("-")){
                    resultado = Double.parseDouble(reserva) - Double.parseDouble(texto.getText().toString());
                    texto.setText(String.valueOf(resultado));
                }
                if(operador.equals("+")){
                    resultado = Double.parseDouble(reserva) + Double.parseDouble(texto.getText().toString());
                    texto.setText(String.valueOf(resultado));
                }
                if(operador.equals("/")){
                    resultado = Double.parseDouble(reserva) / Double.parseDouble(texto.getText().toString());
                    texto.setText(String.valueOf(resultado));
                }
                if(operador.equals("*")){
                    resultado = Double.parseDouble(reserva) * Double.parseDouble(texto.getText().toString());
                    texto.setText(String.valueOf(resultado));
                }
            }
        });
    }
}
