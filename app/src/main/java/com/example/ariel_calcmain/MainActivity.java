package com.example.ariel_calcmain;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private double last;
    private String text;
    private String sign ="";
    private double first=0;
    private double secound=0;
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
    public int plus(){
        text = display.getText().toString();
        if (!sign.isEmpty()){
            text = text.substring(1);
            for (int i =0; i<text.length();i++){
                if (Integer.valueOf(text.charAt(i))<49 || Integer.valueOf(text.charAt(i))>57 ){
                    display.setText("ERROR");
                    return -1;
                }
            }
            secound = Integer.valueOf(text);
            first +=secound;
        }
        else {
            for (int i = 0; i < text.length(); i++) {
                if (Integer.valueOf(text.charAt(i)) < 49 || Integer.valueOf(text.charAt(i)) > 57) {
                    display.setText("ERROR");
                    return -1;
                }
            }
            first = Integer.valueOf(text);
        }
        sign = "+";
        display.setText("+");
        return 0;

    }
    public int minus(){
        text = display.getText().toString();
        if (!sign.isEmpty()){
            text = text.substring(1);
            for (int i =0; i<text.length();i++){
                if (Integer.valueOf(text.charAt(i))<49 || Integer.valueOf(text.charAt(i))>57 ){
                    display.setText("ERROR");
                    return -1;
                }
            }
            secound = Integer.valueOf(text);
            first -=secound;
        }
        else {
            for (int i = 0; i < text.length(); i++) {
                if (Integer.valueOf(text.charAt(i)) < 49 || Integer.valueOf(text.charAt(i)) > 57) {
                    display.setText("ERROR");
                    return -1;
                }
            }
            first = Integer.valueOf(text);
        }
        sign = "-";
        display.setText("-");
        return 0;
    }
    public int multiply(){
        text = display.getText().toString();
        if (!sign.isEmpty()){
            text = text.substring(1);
            for (int i =0; i<text.length();i++){
                if (Integer.valueOf(text.charAt(i))<49 || Integer.valueOf(text.charAt(i))>57 ){
                    display.setText("ERROR");
                    return -1;
                }
            }
            secound = Integer.valueOf(text);
            first *=secound;
        }
        else {
            for (int i = 0; i < text.length(); i++) {
                if (Integer.valueOf(text.charAt(i)) < 49 || Integer.valueOf(text.charAt(i)) > 57) {
                    display.setText("ERROR");
                    return -1;
                }
            }
            first = Integer.valueOf(text);
        }
        sign = "*";
        display.setText("*");
        return 0;
    }
    public int divide(){
        text = display.getText().toString();
        if (!sign.isEmpty()){
            text = text.substring(1);
            for (int i =0; i<text.length();i++){
                if (Integer.valueOf(text.charAt(i))<49 || Integer.valueOf(text.charAt(i))>57 ){
                    display.setText("ERROR");
                    return -1;
                }
            }
            secound = Integer.valueOf(text);
            first /=secound;
        }
        else {
            for (int i = 0; i < text.length(); i++) {
                if (Integer.valueOf(text.charAt(i)) < 49 || Integer.valueOf(text.charAt(i)) > 57) {
                    display.setText("ERROR");
                    return -1;
                }
            }
            first = Integer.valueOf(text);
        }
        sign = "/";
        display.setText("/");
        return 0;
    }
    public void equal(){
        if (sign.isEmpty()){display.setText("ERROR");}

        else{
            text = display.getText().toString();
            secound=Integer.valueOf(text.substring(1));
            switch (sign){
                case "+":
                    last = first+secound;
                    display.setText(""+last);
                case "-":
                    last = first-secound;
                    display.setText(""+last);
                case "*":
                    last = first*secound;
                    display.setText(""+last);
                case "/":
                    last = first/secound;display.setText(""+last); default: display.setText("ERROR");
            }
            sign = "";
        }
    }
    public void credits(){

    }
}