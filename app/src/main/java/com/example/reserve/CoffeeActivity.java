package com.example.reserve;

import android.app.DownloadManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CoffeeActivity extends AppCompatActivity {



    public static final int REQUEST_CODE = 1;
    public static final String AA = "number";
    private EditText editText11;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);


        final Button reserveButton = (Button) findViewById(R.id.reserveButton);
        final Button menuButton = (Button) findViewById(R.id.menuButton);
        final Button orderButton = (Button) findViewById(R.id.orderButton);
        final EditText editText11 = (EditText) findViewById(R.id.editText11);



        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);

                startActivity(intent);
            }
        });
        reserveButton.setOnClickListener(new View.OnClickListener() {//자리예약화면으로 전환
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Sit.class);
                startActivity(intent);
            }
        });
        orderButton.setOnClickListener(new View.OnClickListener() {//메뉴현황화면으로 전환
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OrderActivity.class);
                startActivity(intent);
            }
        });








        Button cartbutton = (Button) findViewById(R.id.cartButton);

        cartbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(CoffeeActivity.this, OrderActivity.class);

                String aa = editText11.getText().toString();
                editText11.setText("");
                intent.putExtra(AA,aa);
                startActivityForResult(intent, REQUEST_CODE);
            }


        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        String aa = data.getStringExtra(AA);
        editText11.setText(aa);
    }






}