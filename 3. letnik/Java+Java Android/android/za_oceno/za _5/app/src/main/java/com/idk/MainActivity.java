package com.idk;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    EditText Text1;
    TextView Text2;
    TextView Text3;
    TextView Stevilo;
    TextView Stevec;

    Button next;
    Button prvi;
    Button drugi;
    Button tretji;

    int st = 0;
    boolean Gumb1 = false;
    boolean Gumb2 = false;
    boolean Gumb3 = false;
    float stevilo = 0;
    float rez = 0;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Text1 = findViewById(R.id.Text1);
        Text2 = findViewById(R.id.Text2);
        Text3 = findViewById(R.id.Text3);
        Stevilo = findViewById(R.id.textView3);
        Stevec = findViewById(R.id.textView2);

        next = findViewById(R.id.Next);
        prvi = findViewById(R.id.prvi);
        drugi = findViewById(R.id.drugi);
        tretji = findViewById(R.id.tretji);

        prvi.setVisibility(View.INVISIBLE);
        drugi.setVisibility(View.INVISIBLE);
        tretji.setVisibility(View.INVISIBLE);
        Text2.setVisibility(View.INVISIBLE);
        Text3.setVisibility(View.INVISIBLE);
        Stevilo.setVisibility(View.INVISIBLE);
        Stevec.setVisibility(View.INVISIBLE);


    }

    public void Click(View view) {
        Text2.setText(StringF(rez));
        Text3.setText(String(st));
        if (view.getId() == R.id.Next) {
            stevilo = Integer.parseInt(String.valueOf(Text1.getText()));
            next.setVisibility(View.INVISIBLE);
            Text1.setVisibility(View.INVISIBLE);
            Text2.setVisibility(View.VISIBLE);
            Text3.setVisibility(View.VISIBLE);
            Stevilo.setVisibility(View.VISIBLE);
            Stevec.setVisibility(View.VISIBLE);
            prvi.setVisibility(View.VISIBLE);
            drugi.setVisibility(View.VISIBLE);
            tretji.setVisibility(View.VISIBLE);
        }

        if (view.getId() == R.id.prvi) {
            rez += stevilo;
            Text2.setText(StringF(rez));
            st++;
            Text3.setText(String(st));
            Gumb1 = true;
        }

        if (view.getId() == R.id.drugi) {
            rez *= st;
            Text2.setText(StringF(rez));
            st++;
            Text3.setText(String(st));
            Gumb2 = true;
        }

        if (view.getId() == R.id.tretji) {

            if (Gumb3 && !Gumb1 && !Gumb2) {
                st = 1;
                Text3.setText(String(st));
                Gumb1 = false;
                Gumb2 = false;
                Gumb3 = false;
            } else {
                stevilo = 1;
                st++;
                rez = 0;
                Text2.setText(StringF(rez));
                Text3.setText(String(st));
                Gumb1 = false;
                Gumb2 = false;
                Gumb3 = true;
                prvi.setVisibility(View.INVISIBLE);
                drugi.setVisibility(View.INVISIBLE);
                tretji.setVisibility(View.INVISIBLE);
                Text2.setVisibility(View.INVISIBLE);
                Text3.setVisibility(View.INVISIBLE);
                Stevilo.setVisibility(View.INVISIBLE);
                Stevec.setVisibility(View.INVISIBLE);
                next.setVisibility(View.VISIBLE);
                Text1.setVisibility(View.VISIBLE);
            }
        }
    }

    private String StringF(float x) {
        return String.valueOf(x);
    }

    private String String(int x) {
        return String.valueOf(x);
    }
}