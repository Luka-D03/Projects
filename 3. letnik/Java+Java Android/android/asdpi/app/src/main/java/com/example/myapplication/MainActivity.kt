package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var zapored = 0
        var pritiski = 1
        var sum = 0
        val vneseno = findViewById<EditText>(R.id.vno                                                                             s)//vrednost števca
        val pristeva = findViewById<Button>(R.id.prišteva)
        val pomnozi = findViewById<Button>(R.id.pomnoži)
        val ponastavi = findViewById<Button>(R.id.ponastavi)
        val izpisskupaj = findViewById<TextView>(R.id.izpisŠtevila)//izpisuje rezultat
        val izpisklikov = findViewById<TextView>(R.id.izpisKlikov)//izpise stevilo klikov na vse gumbe


        pristeva.setOnClickListener{//številu se prišteva vrednost števca
            sum += vneseno.text.toString().toInt()
            pritiski++
            zapored = 0

            izpisskupaj.setText("" + sum)//izpisuje vrednost števila
            izpisklikov.setText("" + pritiski)//izpisuje število pritisnjenih tipk
        }

        pomnozi.setOnClickListener{//pomnoži vrednost števila z vrednostjo števila do tedaj pritisnjenih tipk
            sum *= pritiski
            pritiski++
            zapored = 0

            izpisskupaj.setText("" + sum)//izpisuje vrednost števila
            izpisklikov.setText("" + pritiski)//izpisuje število pritisnjenih tipk
        }

        ponastavi.setOnClickListener{//postavi število na 1 in ponovno vpraša za števec
            sum = 1
            zapored += 1

            vneseno.getText().clear()//izbriše text iz vnosnega polja

            izpisskupaj.setText("" + sum)//izpisuje vrednost števila
            izpisklikov.setText("" + pritiski)//izpisuje število pritisnjenih tipk

            if(zapored == 2){//če je gumb pritisnjen dvakrat zapored se število pritiskov postavi na 1
                pritiski = 1

                izpisklikov.setText("" + pritiski)//izpisuje število pritisnjenih tipk
            }
        }

    }
}