package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button boton;
    EditText edi1, edi2;
    TextView tvs, tvm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edi1 = (EditText) findViewById(R.id.num1);
        edi2 = (EditText) findViewById(R.id.num2);

        tvs = (TextView) findViewById(R.id.ressuma);
        tvm = (TextView) findViewById(R.id.resmul);

        boton = (Button) findViewById(R.id.botoncal);

        boton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                    int n1, n2;
                    int resum, resmult;

                    n1 = Integer.parseInt(edi1.getText().toString());
                    n2 = Integer.parseInt(edi2.getText().toString());

                    Suma su = new Suma();
                    Multiplicacion mu = new Multiplicacion();

                    su.setResultado(n1, n2);
                    mu.setResultado(n1, n2);

                    resum = su.getRes();
                    resmult = mu.getRes();

                    tvs.setText("La suma es " +resum);
                    tvm.setText("La multiplicacion es " +resmult);
                }
        });
    }
}


