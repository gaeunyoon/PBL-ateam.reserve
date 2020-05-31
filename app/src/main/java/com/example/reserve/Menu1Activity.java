package com.example.reserve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);

        Button CoffeeButton = (Button) findViewById(R.id.CoffeeButton);

        CoffeeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CoffeeActivity.class );

                startActivity(intent);
            }
        });

        Button DesertButton = (Button) findViewById(R.id.DesertButton);

        DesertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DesertActivity.class );

                startActivity(intent);
            }
        });

        Button NoncoffeeButton = (Button) findViewById(R.id.NoncoffeeButton);

        NoncoffeeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),NoncoffeeActivity.class );

                startActivity(intent);
            }
        });

    }
}
