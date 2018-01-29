package com.example.ejercicio2901_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvFacebook, tvTwitter, tvYoutube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvFacebook = (TextView)findViewById(R.id.tvFacebook);
        tvTwitter = (TextView)findViewById(R.id.tvTwitter);
        tvYoutube = (TextView)findViewById(R.id.tvYoutube);

    }

    public void clickFacebook (View view) {

        tvFacebook.setText("Compartir en Facebook");
    }
    public void clickTwitter (View view) {

        tvTwitter.setText("Compartir en Twitter");
    }
    public void clickYoutube (View view) {

        tvYoutube.setText("Compartir en Youtube");
    }

    public void limpiarBotones (View view) {

        tvFacebook.setText("");
        tvTwitter.setText("");
        tvYoutube.setText("");


    }
}
