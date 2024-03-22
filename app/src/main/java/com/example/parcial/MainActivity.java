package com.example.parcial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edtVal1, edtVal2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        edtVal1 = findViewById(R.id.edtVal1);
        edtVal2 = findViewById(R.id.edtVal2);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val1 = edtVal1.getText().toString();
                String val2 = edtVal2.getText().toString();

                if (val1.isEmpty() || val2.isEmpty()){
                    edtVal1.setText("rellene los datos");
                    edtVal2.setText("rellene los datos");
                } else {
                    if(val1.equals("uac123") && val2.equals("12345678")){
                        Intent i = new Intent(MainActivity.this, MainActivity2.class);
                        startActivity(i);
                    } else {
                        edtVal1.setText("datos erroneos");
                        edtVal2.setText("datos erroneos");
                    }
                }
            }
        });



    }
}

