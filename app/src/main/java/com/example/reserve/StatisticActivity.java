package com.example.reserve;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class StatisticActivity extends AppCompatActivity {

    private ListView statisticListView;
    private StatisticListAdapter adapter;
    private List<Statistic> statisticList;
    public static String userID;

    Intent intent = getIntent() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistic);

      //  userID = getIntent().getStringExtra("userID");
//        statisticListView = (ListView) findViewById(R.id.statisticListView);
     //   statisticList = new ArrayList<Statistic>();
       // adapter = new StatisticListAdapter(getApplicationContext(), statisticList); //adapter에 statisticlist 넣어줌
        //statisticListView.setAdapter(adapter); //adapter에 들어간 내용 view 형태로 보여짐

       // final LinearLayout user = (LinearLayout) findViewById(R.id.user);
        final Button reserveButton = (Button) findViewById(R.id.reserveButton);
        final Button menuButton = (Button) findViewById(R.id.menuButton);
        final Button statisticButton = (Button) findViewById(R.id.statisticButton);

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

        // Intent 가져오기.
        Intent intent = getIntent() ;

// No 값을 int 타입에서 String 타입으로 변환하여 표시.
        TextView orderText1 = (TextView) findViewById(R.id.orderText1) ;
        int no = intent.getIntExtra("contact_no", 0) ;
        orderText1.setText(Integer.toString(no)) ;

        // Name 값을 String 타입 그대로 표시.
        TextView menuName1 = (TextView) findViewById(R.id.menuName1) ;
        String name = intent.getStringExtra("contact_name") ;
        if (name != null)
            menuName1.setText(name) ;

    }
    /*

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
                JSONArray jsonArray = jsonObject.getJSONArray("response"); //response에 공지사항 리스트 넣어줌
                int count = 0;
                String menuID, userID, menuName, menuAmount;//주문번호, 아이디, 메뉴이름, 수량 넣을수있음
                while (count < jsonArray.length()) //카운트가 array 크기보다 작을때까지
                {
                    JSONObject object = jsonArray.getJSONObject(count); //현재 배열 원소값넣을수있도록함

                    menuID = object.getString("menuID"); //menuid 값을 가져옴
                    userID = object.getString("userID"); //userid 값을 가져옴
                    menuName = object.getString("menuName"); //menuname 값을 가져옴
                    menuAmount = object.getString(" menuAmount"); //menuamount 값을 가져옴
                    Statistic statistic = new Statistic(menuID, userID, menuName, menuAmount); //하나의 주문 객체 만들어줌
                    statisticList.add(statistic); //noticelist에 추가해줌
                    count++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }*/
}