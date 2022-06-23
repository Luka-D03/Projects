package com.example.myapplication;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    Button b_get;
    TextView tv_fact;

    String quoteString = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_get = findViewById(R.id.b_get);
        tv_fact = findViewById(R.id.tv_fact);

        b_get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //start the job on click
                new QuoteLoader().execute();
            }
        });
    }

    //quote loader
    private class QuoteLoader extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            //get json from url
            String jsonString = getJson("https://api.chucknorris.io/jokes/random");

            //get quote from the json
            try {
                JSONObject jsonObject = new JSONObject(jsonString);
                quoteString = jsonObject.getString("value");
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            quoteString = "";
            tv_fact.setText("Loading...");
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

            //display the quote if any
            if (!quoteString.equals("")) {
                tv_fact.setText(quoteString);
            }
        }
    }

    //get json from url
    private String getJson(String link) {
        String stream = "";
        try {
            URL url = new URL(link);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            if (urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                BufferedReader r = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), "utf-8"));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = r.readLine()) != null) {
                    sb.append(line);
                    sb.append("\n");
                }
                stream = sb.toString();
                urlConnection.disconnect();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stream;
    }
}