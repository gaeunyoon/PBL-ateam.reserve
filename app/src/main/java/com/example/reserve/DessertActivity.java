package com.example.reserve;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DessertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desertmenu);

        final Button reserveButton=(Button) findViewById(R.id.reserveButton);
        final Button menuButton=(Button) findViewById(R.id.menuButton);
        final Button orderButton=(Button) findViewById(R.id.orderButton);
        final Button cartButton=(Button) findViewById(R.id.cartButton);

        menuButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(getApplicationContext(), MenuActivity.class);

                startActivity(intent);
            }
        });
        reserveButton.setOnClickListener(new View.OnClickListener(){//자리예약화면으로 전환
            @Override
            public void onClick(View view){
                Intent intent=new Intent(getApplicationContext(),Sit.class);
                startActivity(intent);
            }
        });
        orderButton.setOnClickListener(new View.OnClickListener(){//메뉴현황화면으로 전환
            @Override
            public void onClick(View view){
                Intent intent=new Intent(getApplicationContext(), OrderActivity.class);
                startActivity(intent);
            }
        });

        cartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), OrderActivity.class);
                startActivity(intent);
            }
        });

    }

}