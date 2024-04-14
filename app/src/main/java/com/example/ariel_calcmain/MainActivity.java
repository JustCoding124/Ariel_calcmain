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
}