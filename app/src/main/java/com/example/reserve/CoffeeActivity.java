package com.example.reserve;


import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;


public class CoffeeActivity extends AppCompatActivity {
    private ListView statisticListView;
    private StatisticListAdapter adapter;
    private List<Statistic> statisticList;
    Button buttonEvent;
    EditText editTextNo;
    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        editTextNo = (EditText) findViewById(R.id.editText1);
        text1 = (TextView) findViewById(R.id.textView1);

        final Button reserveButton = (Button) findViewById(R.id.reserveButton);
        final Button menuButton = (Button) findViewById(R.id.menuButton);
        final Button statisticButton = (Button) findViewById(R.id.statisticButton);
        final Button cartButton = (Button) findViewById(R.id.cartButton);

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
        statisticButton.setOnClickListener(new View.OnClickListener() {//메뉴현황화면으로 전환
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), StatisticActivity.class);
                startActivity(intent);
            }
        });
        cartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), StatisticActivity.class);
                startActivity(intent);
            }
        });

    }

    public void onClick(View v) {
        Intent intent = new Intent(CoffeeActivity.this, Statistic.class);

        // No 입력 값을 int 값으로 변환하여 전달.
        EditText editTextNo = (EditText) findViewById(R.id.editTextNo) ;
        String strNo = editTextNo.getText().toString() ;
        if (!strNo.isEmpty() && strNo.matches("^[0-9]*$")) { // check numbers by RegEx.
            intent.putExtra("contact_no", Integer.parseInt(strNo)) ;
        } else {
            intent.putExtra("contact_no", 0) ;
        }
        // Name 입력 값을 String 값으로 그대로 전달.
        TextView textView1 = (TextView) findViewById(R.id.textView1) ;
        intent.putExtra("contact_name", textView1.getText().toString()) ;


        startActivity(intent) ;
    }

    }
