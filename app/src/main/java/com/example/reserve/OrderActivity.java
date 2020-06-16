package com.example.reserve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.LongSummaryStatistics;

public class OrderActivity extends AppCompatActivity {



    private EditText editText11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Intent intent = getIntent();
        String aa = intent.getStringExtra(CoffeeActivity.AA);

        editText11 = (EditText) findViewById(R.id.editText11);
        editText11.setText(aa);

        Button cartbutton = (Button) findViewById(R.id.cartButton);
        cartbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                String aa = editText11.getText().toString();
                intent.putExtra(CoffeeActivity.AA, aa);
                setResult(RESULT_OK, intent);
                finish();
            }
        });


        


    }
}
