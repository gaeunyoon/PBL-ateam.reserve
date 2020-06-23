package com.example.reserve;


import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class OrderActivity extends AppCompatActivity {

    private ListView statisticListView;
    private OrderListAdapter adapter;
    private List<Order> statisticList;
    public static String userID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_statistic);

        userID=getIntent().getStringExtra("userID");

        statisticListView=(ListView)findViewById(R.id.statisticListView);
        statisticList=new ArrayList<Order>();
        adapter=new OrderListAdapter(getApplicationContext(), statisticList); //adapter에 statisticlist 넣어줌
        statisticListView.setAdapter(adapter); //adapter에 들어간 내용 view 형태로 보여짐

        final LinearLayout user = (LinearLayout) findViewById(R.id.user);
        final Button reserveButton = (Button) findViewById(R.id.reserveButton);
        final Button menuButton = (Button) findViewById(R.id.menuButton);
        final Button orderButton = (Button) findViewById(R.id.orderButton);

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



        class BackgroundTask extends AsyncTask<Void, Void, String> {
            String target;

            @Override
            protected void onPreExecute() {
                target = "https://gaeun0215.cafe24.com/menulist.php";//target에 해당php 파일과 연결시켜줌
            }

            @Override
            protected String doInBackground(Void... voids) {
                try {
                    URL url = new URL(target);
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    InputStream inputStream = httpURLConnection.getInputStream();//넘어오는 결과값 저장할수있도록해줌
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream)); //inputstream에 있는 내용 buffer에담아 읽을수있도록함
                    String temp;
                    StringBuilder stringBuilder = new StringBuilder();
                    while ((temp = bufferedReader.readLine()) != null) {
                        stringBuilder.append(temp + "\n");
                    }//null 값이 아닐때까지 한줄씩넣어줌
                    bufferedReader.close();
                    inputStream.close();
                    httpURLConnection.disconnect();//연결끊어줌
                    return stringBuilder.toString().trim();

                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            public void onProgressUpdate(Void... values) {
                super.onProgressUpdate();
            }

            @Override
            public void onPostExecute(String result) {
                try {
                    JSONObject jsonObject = new JSONObject(result);
                    JSONArray jsonArray = jsonObject.getJSONArray("response"); //response에 메뉴 리스트 넣어줌
                    int count = 0;
                    String menuID, userID, menuName, menuAmount;//주문번호, 아이디, 메뉴이름, 수량 넣을수있음
                    while (count < jsonArray.length()) //카운트가 array 크기보다 작을때까지
                    {
                        JSONObject object = jsonArray.getJSONObject(count); //현재 배열 원소값넣을수있도록함

                        menuID = object.getString("menuID"); //menuid 값을 가져옴
                        userID = object.getString("userID"); //userid 값을 가져옴
                        menuName = object.getString("menuName"); //menuname 값을 가져옴
                        menuAmount = object.getString(" menuAmount"); //menuamount 값을 가져옴
                        Order statistic = new Order(menuID, userID, menuName, menuAmount); //하나의 주문 객체 만들어줌
                        statisticList.add(statistic); //statisticlist에 추가해줌
                        count++;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}