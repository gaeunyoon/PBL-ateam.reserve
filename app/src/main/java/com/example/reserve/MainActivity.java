package com.example.reserve;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedinstanceState){
        super.onCreate(savedinstanceState);
        setContentView(R.layout.activity_main);

        final Button reserveButton=(Button) findViewById(R.id.reserveButton);
        final Button menuButton=(Button) findViewById(R.id.menuButton);
        final Button statisticButton=(Button) findViewById(R.id.statisticButton);
        final LinearLayout notice=(LinearLayout) findViewById(R.id.notice);

        menuButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                notice.setVisibility(View.GONE); //공지사항 linearlayout 이 해당 fragment로 보이게 화면전환
                menuButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));//menu 버튼만 어두운색으로
                reserveButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                statisticButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new MenuFragment());
                fragmentTransaction.commit();
            }
        });
        reserveButton.setOnClickListener(new View.OnClickListener(){//자리예약화면으로 전환
           @Override
            public void onClick(View view){
                notice.setVisibility(View.GONE);
                menuButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                reserveButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));//reserve 버튼만 어두운색으로
                statisticButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new ReserveFragment());
                fragmentTransaction.commit();
            }
        });
        statisticButton.setOnClickListener(new View.OnClickListener(){//메뉴현황화면으로 전환
            @Override
            public void onClick(View view){
                notice.setVisibility(View.GONE);
                menuButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                reserveButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                statisticButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));//statistic 버튼만 어두운색으로
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new StatisticFragment());
                fragmentTransaction.commit();
            }
        });
    }
}
