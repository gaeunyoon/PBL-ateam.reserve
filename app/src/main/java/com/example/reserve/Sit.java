package com.example.reserve;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Sit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sit);

        ImageButton imageButton20 = (ImageButton) findViewById(R.id.imageButton20);

        imageButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReserveActivity.class );

                startActivity(intent);
            }
        });

        ImageButton imageButton21 = (ImageButton) findViewById(R.id.imageButton21);

        imageButton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReserveActivity.class );

                startActivity(intent);
            }
        });

        ImageButton imageButton22 = (ImageButton) findViewById(R.id.imageButton22);

        imageButton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReserveActivity.class );

                startActivity(intent);
            }
        });

        ImageButton imageButton23 = (ImageButton) findViewById(R.id.imageButton23);

        imageButton23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReserveActivity.class );

                startActivity(intent);
            }
        });

        ImageButton imageButton24 = (ImageButton) findViewById(R.id.imageButton24);

        imageButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReserveActivity.class );

                startActivity(intent);
            }
        });

        ImageButton imageButton25 = (ImageButton) findViewById(R.id.imageButton25);

        imageButton25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReserveActivity.class );

                startActivity(intent);
            }
        });
        ImageButton imageButton26 = (ImageButton) findViewById(R.id.imageButton26);

        imageButton26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReserveActivity.class );

                startActivity(intent);
            }
        });

        ImageButton imageButton27 = (ImageButton) findViewById(R.id.imageButton27);

        imageButton27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReserveActivity.class );

                startActivity(intent);
            }
        });

    }
}