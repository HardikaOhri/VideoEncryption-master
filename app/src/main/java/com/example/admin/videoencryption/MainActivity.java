package com.example.admin.videoencryption;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button aesblo;
    private Button blowbttn;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aesblo = (Button) findViewById(R.id.aes_bttn);
        blowbttn = (Button) findViewById(R.id.blowfishbttn);

        blowbttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(), Blowfish.class );
                startActivity(k);
            }
        });

        aesblo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Crypt.class);
                startActivity(i);
            }
        });
    }
}
