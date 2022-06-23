package com.lukec;
/*
napiši program za android operacijski sistem, ki vsebuje dve tipki. Ob pritisku na prvo tipko se število poveča za vrednost števca množeno z 2,
ob pritisku na drugo tipko pa se števec resetira oziroma postavi na vrednost 0.
Pri tem se izpisuje število.
Program nas na začetku vpraša za začetno vrednost števca (Vnesi začetno vrednost števca).
Program naj vsebuje rumeno ozadje.
Ikona za program naj bo vaša izbira.
 */
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivities();
            }
        });
    }

    private void switchActivities() {
        Intent switchActivityIntent = new Intent(this, MainActivity2.class);
        startActivity(switchActivityIntent);
    }
}