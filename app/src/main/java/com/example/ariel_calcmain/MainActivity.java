package com.example.ariel_calcmain;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    public double last=0;
    private String text;
    private String sign ="";
    private double first=0;
    private EditText display;
    private Button plus;
    private Button minus;
    private Button multiply;
    private Button div;
    private Button ac;
    private Button equal;
    private Button credits;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        display =  (EditText) findViewById(R.id.Display);
        plus =  (Button) findViewById(R.id.plus);
        minus =  (Button) findViewById(R.id.minus);
        multiply =  (Button) findViewById(R.id.multipl);
        div =  (Button) findViewById(R.id.div);
        ac =  (Button) findViewById(R.id.ac);
        equal =  (Button) findViewById(R.id.equal);
        credits =  (Button) findViewById(R.id.credits);
    }
    public void plus(View view){
        text = display.getText().toString();
        if (!sign.isEmpty()){
            display.setText("ERROR");
        }
        else {
            for (int i = 0; i < text.length(); i++) {
                if ((int)(text.charAt(i)) < 49 || (int)(text.charAt(i)) > 57) {
                    display.setText("ERROR");
                    break;
                }
            }
        }
        text = display.getText().toString();
        if (!text.equals("ERROR")){
            first = Integer.valueOf(text);
            sign = "+";
            display.setHint("+");
            display.setText("");        }
    }
    public void minus(View view){
        text = display.getText().toString();
        if (!sign.isEmpty()){
            display.setText("ERROR");
        }
        else {
            for (int i = 0; i < text.length(); i++) {
                if (Integer.valueOf(text.charAt(i)) < 49 || Integer.valueOf(text.charAt(i)) > 57) {
                    display.setText("ERROR");
                    break;
                }
            }
        }
        text = display.getText().toString();
        if (!text.equals("ERROR")){
            first = Integer.valueOf(text);
            sign = "-";
            display.setHint("-");
            display.setText("");
        }
    }
    public void multiply(View view){
        text = display.getText().toString();
        if (!sign.isEmpty()){
            display.setText("ERROR");
        }
        else {
            for (int i = 0; i < text.length(); i++) {
                if (Integer.valueOf(text.charAt(i)) < 49 || Integer.valueOf(text.charAt(i)) > 57) {
                    display.setText("ERROR");
                    break;
                }
            }
        }
        text = display.getText().toString();
        if (!text.equals("ERROR")){
            first = Integer.valueOf(text);
            sign = "*";
            display.setHint("*");
            display.setText("");
        }
    }
    public void divide(View view){
        text = display.getText().toString();
        if (!sign.isEmpty()){
            display.setText("ERROR");
        }
        else {
            for (int i = 0; i < text.length(); i++) {
                if (Integer.valueOf(text.charAt(i)) < 49 || Integer.valueOf(text.charAt(i)) > 57) {
                    display.setText("ERROR");
                    break;
                }
            }
        }
        text = display.getText().toString();
        if (!text.equals("ERROR")){
            first = Integer.valueOf(text);
            sign = "/";
            display.setHint("/");
            display.setText("");
        }
    }
    public void equal(View view){
        if (sign.isEmpty()){display.setText("ERROR");}

        else{
            text = display.getText().toString();
            for (int i = 0; i < text.length(); i++) {
                if (Integer.valueOf(text.charAt(i)) < 49 || Integer.valueOf(text.charAt(i)) > 57) {
                    display.setText("ERROR");
                    break;
                }
            }
            text = display.getText().toString();
            if (!text.equals("ERROR")) {
                double secound = Integer.valueOf(text);
                switch (sign) {
                    case "+":
                        last = first + secound;
                        display.setText("" + last);
                        break;
                    case "-":
                        last = first - secound;
                        display.setText("" + last);
                        break;
                    case "*":
                        last = first * secound;
                        display.setText("" + last);
                        break;
                    case "/":
                        last = first / secound;
                        display.setText("" + last);
                        break;
                    default:
                        display.setText("ERROR2");
                }
            }

            sign ="";
            first = 0;
        }
    }
    public void credits(View view) {
        Intent si = new Intent(this, MainActivity2.class);
        si.putExtra("last",last);
        startActivity(si);
    }
    public void ac(View view){
        sign ="";
        first = 0;
        display.setText("");
        display.setHint("");
        last=0;
    }
}