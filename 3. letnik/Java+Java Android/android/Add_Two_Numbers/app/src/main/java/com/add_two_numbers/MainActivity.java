package com.add_two_numbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submit = (Button) findViewById(R.id.Submit);
        EditText num1 = (EditText) findViewById(R.id.Num1);
        EditText num2 = (EditText) findViewById(R.id.Num2);
        TextView output = (TextView) findViewById(R.id.output);



        submit.setOnClickListener(view -> {
            Double a, b;
            a = Double.parseDouble(num1.getText().toString());
            b = Double.parseDouble(num2.getText().toString());
            Double resoult = a + b;
            output.setText(String.valueOf(resoult));
        });


    }
}