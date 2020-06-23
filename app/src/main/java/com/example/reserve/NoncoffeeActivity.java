package com.example.reserve;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class NoncoffeeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nonmenu);
        final Button reserveButton=(Button) findViewById(R.id.reserveButton);
        final Button menuButton=(Button) findViewById(R.id.menuButton);
        final Button statisticButton=(Button) findViewById(R.id.statisticButton);
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
        statisticButton.setOnClickListener(new View.OnClickListener(){//메뉴현황화면으로 전환
            @Override
            public void onClick(View view){
                Intent intent=new Intent(getApplicationContext(), OrderActivity.class);
                startActivity(intent);
            }
        });

        cartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), OrderActivity.class);

                startActivity(intent);
            }
        });



    }

}
