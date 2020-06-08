package com.example.reserve;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

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

public class MainActivity extends AppCompatActivity {

    //멤버변수 만들어줌
    private ListView noticeListView;
    private NoticeListAdapter adapter;
    private List<Notice> noticeList;
    public static String userID;


    @Override
    protected void onCreate(Bundle savedinstanceState){
        super.onCreate(savedinstanceState);
        setContentView(R.layout.activity_main);

        userID=getIntent().getStringExtra("userID");

        noticeListView=(ListView) findViewById(R.id.noticeListView);
        noticeList=new ArrayList<Notice>();
        noticeList.add(new Notice("공지사항입니다.", "Ateam", "2020-05-11"));
        noticeList.add(new Notice("공지사항입니다.", "Ateam", "2020-05-11"));
        noticeList.add(new Notice("공지사항입니다.", "Ateam", "2020-05-11"));
        noticeList.add(new Notice("공지사항입니다.", "Ateam", "2020-05-11"));
        noticeList.add(new Notice("공지사항입니다.", "Ateam", "2020-05-11"));
        noticeList.add(new Notice("공지사항입니다.", "Ateam", "2020-05-11"));
        noticeList.add(new Notice("공지사항입니다.", "Ateam", "2020-05-11"));
        noticeList.add(new Notice("공지사항입니다.", "Ateam", "2020-05-11"));
        noticeList.add(new Notice("공지사항입니다.", "Ateam", "2020-05-11"));
        adapter=new NoticeListAdapter(getApplicationContext(), noticeList); //adapter에 noticelist 넣어줌
        noticeListView.setAdapter(adapter); //adapter에 들어간 내용 view 형태로 보여짐

        final Button reserveButton=(Button) findViewById(R.id.reserveButton);
        final Button menuButton=(Button) findViewById(R.id.menuButton);
        final Button statisticButton=(Button) findViewById(R.id.statisticButton);
        final LinearLayout notice=(LinearLayout) findViewById(R.id.notice);

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
                Intent intent=new Intent(getApplicationContext(),Statistic.class);
                startActivity(intent);
            }
        });

        new BackgroundTask().execute();

    }

    class BackgroundTask extends AsyncTask<Void, Void, String>{
        String target;

        @Override
        protected void onPreExecute(){
            target="https://gaeun0215.cafe24.com/NoticeList.php";//target에 해당php 파일과 연결시켜줌
        }

        @Override
        protected String doInBackground(Void... voids) {
            try {
                URL url=new URL(target);
                HttpURLConnection httpURLConnection=(HttpURLConnection) url.openConnection();
                InputStream inputStream=httpURLConnection.getInputStream();//넘어오는 결과값 저장할수있도록해줌
                BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream)); //inputstream에 있는 내용 buffer에담아 읽을수있도록함
                String temp;
                StringBuilder stringBuilder=new StringBuilder();
                while((temp=bufferedReader.readLine()) != null){
                    stringBuilder.append(temp+"\n");
                }//null 값이 아닐때까지 한줄씩넣어줌
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();//연결끊어줌
                return stringBuilder.toString().trim();

            }catch (Exception e){
                e.printStackTrace();
            }
            return null;
        }
        @Override
        public void onProgressUpdate(Void... values){
            super.onProgressUpdate();
        }
        @Override
        public void onPostExecute(String result){
            try{
                JSONObject jsonObject=new JSONObject(result);
                JSONArray jsonArray=jsonObject.getJSONArray("response"); //response에 공지사항 리스트 넣어줌
                int count=0;
                String noticeContent, noticeName, noticeDate;//공지사항내용,이름,날짜 넣을수있음
                while (count<jsonArray.length()) //카운트가 array 크기보다 작을때까지
                {
                    JSONObject object=jsonArray.getJSONObject(count); //현재 배열 원소값넣을수있도록함
                    noticeContent=object.getString("noticeContent"); //noticecontent 값을 가져옴
                    noticeName=object.getString("noticeName"); //noticename 값을 가져옴
                    noticeDate=object.getString("noticeDate"); //noticedate 값을 가져옴
                    Notice notice=new Notice(noticeContent, noticeName, noticeDate); //하나의 공지사항 객체 만들어줌
                    noticeList.add(notice); //noticelist에 추가해줌
                    count ++;
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    private long lastTimeBackPressed;
    //뒤로가기 버튼 두번 눌렀을때 앱 종료
    @Override
    public void onBackPressed(){
        //한번 버튼 누른 후 1.5초 이내로 한번 더 누르면 종료
        if(System.currentTimeMillis()-lastTimeBackPressed<1500)
        {
            finish();
            return;
        }
        Toast.makeText(this, "Good Bye",Toast.LENGTH_SHORT);
        lastTimeBackPressed=System.currentTimeMillis();
    }

}
