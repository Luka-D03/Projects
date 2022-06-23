package idk.prva;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button roll = (Button) findViewById (R.id.roll);
        TextView res = (TextView) findViewById (R.id.resoult);
        SeekBar seekBar = (SeekBar) findViewById (R.id.seekBar);

        roll.setOnClickListener(view -> {
            int rand = new Random().nextInt(seekBar.getProgress());
            res.setText(String.valueOf(rand));
        });
    }
}