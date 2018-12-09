package com.example.orel.x_o;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inicio_x0 extends AppCompatActivity {

    Button boton_next;
    MediaPlayer mp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_x0);
        /*------------------------------AVANZAR AL MAIN ACTIVITY---------------------------------*/
        boton_next = (Button) findViewById(R.id.inicio_boton_next);

        mp3 = MediaPlayer.create(this, R.raw.fight1);

        boton_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Inicio_x0.this, MainActivity.class);
                startActivity(i);
                mp3.start();

            }
        });
        /*------------------------------AVANZAR AL MAIN ACTIVITY---------------------------------*/

    }

}
