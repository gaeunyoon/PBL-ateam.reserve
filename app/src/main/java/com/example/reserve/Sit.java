package com.example.reserve;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class Sit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sit);
        final Button reserveButton=(Button) findViewById(R.id.reserveButton);
        final Button menuButton=(Button) findViewById(R.id.menuButton);
        final Button orderButton=(Button) findViewById(R.id.orderButton);

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

        final ImageButton imageButton20 = (ImageButton) findViewById(R.id.imageButton20);
        final ImageButton imageButton21 = (ImageButton) findViewById(R.id.imageButton21);
        final ImageButton imageButton22 = (ImageButton) findViewById(R.id.imageButton22);
        final ImageButton imageButton23 = (ImageButton) findViewById(R.id.imageButton23);
        final ImageButton imageButton24 = (ImageButton) findViewById(R.id.imageButton24);
        final ImageButton imageButton25 = (ImageButton) findViewById(R.id.imageButton25);
        final ImageButton imageButton26 = (ImageButton) findViewById(R.id.imageButton26);
        final ImageButton imageButton27 = (ImageButton) findViewById(R.id.imageButton27);


        imageButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ReserveActivity.class );
                startActivity(intent);
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.commit();
                imageButton20.setBackgroundColor(getResources().getColor(R.color.colorDark));
                imageButton21.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton22.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton23.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton24.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton25.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton26.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton27.setBackgroundColor(getResources().getColor(R.color.colorGray));

            }
        });


        imageButton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReserveActivity.class );
                startActivity(intent);
                imageButton20.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton21.setBackgroundColor(getResources().getColor(R.color.colorDark));
                imageButton22.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton23.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton24.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton25.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton26.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton27.setBackgroundColor(getResources().getColor(R.color.colorGray));

            }
        });



        imageButton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReserveActivity.class );
                startActivity(intent);
                imageButton20.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton21.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton22.setBackgroundColor(getResources().getColor(R.color.colorDark));
                imageButton23.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton24.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton25.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton26.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton27.setBackgroundColor(getResources().getColor(R.color.colorGray));

            }
        });



        imageButton23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReserveActivity.class );
                startActivity(intent);
                imageButton20.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton21.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton22.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton23.setBackgroundColor(getResources().getColor(R.color.colorDark));
                imageButton24.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton25.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton26.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton27.setBackgroundColor(getResources().getColor(R.color.colorGray));

            }
        });



        imageButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReserveActivity.class );
                startActivity(intent);
                imageButton20.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton21.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton22.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton23.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton24.setBackgroundColor(getResources().getColor(R.color.colorDark));
                imageButton25.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton26.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton27.setBackgroundColor(getResources().getColor(R.color.colorGray));
            }
        });



        imageButton25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReserveActivity.class );
                startActivity(intent);
                imageButton20.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton21.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton22.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton23.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton24.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton25.setBackgroundColor(getResources().getColor(R.color.colorDark));
                imageButton26.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton27.setBackgroundColor(getResources().getColor(R.color.colorGray));
            }
        });


        imageButton26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReserveActivity.class );
                startActivity(intent);
                imageButton20.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton21.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton22.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton23.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton24.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton25.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton26.setBackgroundColor(getResources().getColor(R.color.colorDark));
                imageButton27.setBackgroundColor(getResources().getColor(R.color.colorGray));
            }
        });



        imageButton27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ReserveActivity.class );
                startActivity(intent);
                imageButton20.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton21.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton22.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton23.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton24.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton25.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton26.setBackgroundColor(getResources().getColor(R.color.colorGray));
                imageButton27.setBackgroundColor(getResources().getColor(R.color.colorDark));
            }
        });

    }



}
