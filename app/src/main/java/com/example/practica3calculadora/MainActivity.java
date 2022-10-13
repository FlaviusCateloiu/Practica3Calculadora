package com.example.practica3calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private boolean sintaxError = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickResult(View view) {
        TextView mostrar = (TextView) findViewById(R.id.tFResultado);
        try {
            mostrar.setText(calculate(mostrar.getText().toString()));
        } catch (Exception e) {
            mostrar.setText("Syntax Error");
        }

    }

    public void clickNumber1(View view) {
        if (!sintaxError) {
            TextView mostrar = (TextView) findViewById(R.id.tFResultado);
            mostrar.setText(mostrar.getText() + "1");
        }
    }

    public void clickNumber2(View view) {
        if (!sintaxError) {
            TextView mostrar = (TextView) findViewById(R.id.tFResultado);
            mostrar.setText(mostrar.getText() + "2");
        }
    }

    public void clickNumber3(View view) {
        if (!sintaxError) {
            TextView mostrar = (TextView) findViewById(R.id.tFResultado);
            mostrar.setText(mostrar.getText() + "3");
        }
    }

    public void clickNumber4(View view) {
        if (!sintaxError) {
            TextView mostrar = (TextView) findViewById(R.id.tFResultado);
            mostrar.setText(mostrar.getText() + "4");
        }
    }

    public void clickNumber5(View view) {
        if (!sintaxError) {
            TextView mostrar = (TextView) findViewById(R.id.tFResultado);
            mostrar.setText(mostrar.getText() + "5");
        }
    }

    public void clickNumber6(View view) {
        if (!sintaxError) {
            TextView mostrar = (TextView) findViewById(R.id.tFResultado);
            mostrar.setText(mostrar.getText() + "6");
        }
    }

    public void clickNumber7(View view) {
        if (!sintaxError) {
            TextView mostrar = (TextView) findViewById(R.id.tFResultado);
            mostrar.setText(mostrar.getText() + "7");
        }
    }

    public void clickNumber8(View view) {
        if (!sintaxError) {
            TextView mostrar = (TextView) findViewById(R.id.tFResultado);
            mostrar.setText(mostrar.getText() + "8");
        }
    }

    public void clickNumber9(View view) {
        if (!sintaxError) {
            TextView mostrar = (TextView) findViewById(R.id.tFResultado);
            mostrar.setText(mostrar.getText() + "9");
        }
    }

    public void clickNumber0(View view) {
        if (!sintaxError) {
            TextView mostrar = (TextView) findViewById(R.id.tFResultado);
            mostrar.setText(mostrar.getText() + "0");
        }
    }

    public void clickPlus(View view) {
        if (!sintaxError) {
            TextView mostrar = (TextView) findViewById(R.id.tFResultado);
            mostrar.setText(mostrar.getText() + "+");
        }
    }

    public void clickMinus(View view) {
        if (!sintaxError) {
            TextView mostrar = (TextView) findViewById(R.id.tFResultado);
            mostrar.setText(mostrar.getText() + "-");
        }
    }

    public void clickCBorrar(View view) {
        TextView mostrar = (TextView) findViewById(R.id.tFResultado);
        mostrar.setText("");
        this.sintaxError = false;
    }

    public String calculate(String cadena) throws Exception {
        int posMas;
        String num1, num2;

        if (cadena.contains("+")) {
            posMas = cadena.indexOf("+");
            num1 = cadena.substring(0, posMas);
            num2 = cadena.substring(posMas + 1);
            return Integer.toString(Integer.parseInt(calculate(num1)) + Integer.parseInt(calculate(num2)));
        } else if (cadena.contains("-")) {
            posMas = cadena.indexOf("-");
            num1 = cadena.substring(0, posMas);
            num2 = cadena.substring(posMas + 1);
            if (Integer.parseInt(calculate(num1)) < Integer.parseInt(calculate(num2))) {
                return "-" + Integer.toString(Integer.parseInt(calculate(num2)) - Integer.parseInt(calculate(num1)));
            } else {
                return Integer.toString(Integer.parseInt(calculate(num1)) - Integer.parseInt(calculate(num2)));
            }
        } else {
            if (cadena.isEmpty()) {
                return "0";
            } else {
                return cadena;
            }
        }
    }
}