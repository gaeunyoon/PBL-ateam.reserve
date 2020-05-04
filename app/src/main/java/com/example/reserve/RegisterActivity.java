package com.example.reserve;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

public class RegisterActivity extends AppCompatActivity {

    private ArrayAdapter adapter;
    private String userID;
    private String userPassword;
    private String userName;
    private String userPhoneNumber;
    private AlertDialog dialog;
    private boolean validate=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText idText=(EditText) findViewById(R.id.idText);
        final EditText passwordText=(EditText) findViewById(R.id.passwordText);
        final EditText nameText=(EditText) findViewById(R.id.nameText);
        final EditText PhoneNumberText=(EditText) findViewById(R.id.PhoneNumberText);

        final Button validateButton=(Button) findViewById(R.id.validateButton);
        validateButton.setOnClickListener(new View .OnClickListener(){

            @Override
            public void onClick(View view){
                String userID=idText.getText().toString();
                if(validate){
                    return;
                }
                if(userID.equals(""))
                {
                    AlertDialog.Builder builder=new AlertDialog.Builder(RegisterActivity.this);
                    dialog = builder.setMessage("아이디는 빈칸일 수 없습니다.")
                            .setPositiveButton("확인", null)
                            .create();
                    dialog.show();
                    return;
                }

                Response.Listener<String> responseListener = new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            if (success) {
                                AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                                dialog = builder.setMessage("사용할 수 있는 아이디입니다.")
                                        .setPositiveButton("확인", null)
                                        .create();
                                dialog.show();
                                idText.setEnabled(false);
                                validate = true;
                                idText.setBackgroundColor(getResources().getColor(R.color.colorGray));
                                validateButton.setBackgroundColor(getResources().getColor(R.color.colorGray));

                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                                dialog = builder.setMessage("사용할 수 없는 아이디입니다.")
                                        .setNegativeButton("확인", null)
                                        .create();
                                dialog.show();
                            }
                        }
                        catch (Exception e)
                        {
                            e.printStackTrace();
                        }

                    }
                    };

                ValidateRequest validateRequest=new ValidateRequest(userID, responseListener);
                RequestQueue queue= Volley.newRequestQueue(RegisterActivity.this);
                queue = Volley.newRequestQueue(RegisterActivity.this);
                queue.add(validateRequest);
            
            }
        });
                                Button registerButton=(Button) findViewById(R.id.registerButton);
                                registerButton.setOnClickListener(new OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        String userID=idText.getText().toString();
                                        String userPassword=idText.getText().toString();
                                        String userEmail=idText.getText().toString();

                                        if(!validate){
                                            AlertDialog.Builder builder=new AlertDialog.Builder(RegisterActivity.this);
                                            dialog=builder.setMessage("먼저 중복 체크를 해주세요.")
                                               .setNegativeButton("확인",null)
                                                    .create();
                                            dialog.show();
                                            return;
                                        }
                                        if(userID.equals("")||userPassword.equals("")||userName.equals("")||userPhoneNumber.equals("")){
                                            if(userID.equals("")){
                                                AlertDialog.Builder builder=new AlertDialog.Builder(RegisterActivity.this);
                                                dialog = builder.setMessage("빈칸없이 입력해주세요.")
                                                        .setNegativeButton("확인", null)
                                                        .create();
                                                dialog.show();
                                                return;
                                            }
                                            Response.Listener<String> responseListener=new Response.Listener<String>() {
                                            
                                                @Override
                                                public void onResponse(String response){
                                                    try {
                                                        JSONObject jsonResponse=new JSONObject(response);
                                                        boolean success=jsonResponse.getBoolean("success");
                                                        if(success){
                                                            AlertDialog.Builder builder=new AlertDialog.Builder(RegisterActivity.this);
                                                            dialog=builder.setMessage("회원등록에 성공했습니다.")
                                                          .setPositiveButton("확인",null)
                                                                    .create();
                                                            dialog.show();
                                                            finish();
                                                           
                                                        }
                                                        else{
                                                            AlertDialog.Builder builder=new AlertDialog.Builder(RegisterActivity.this);
                                                            dialog = builder.setMessage("회원등록에 실패하였습니다.")
                                                                    .setNegativeButton("확인", null)
                                                                    .create();
                                                            dialog.show();
                                                        }
                                                    }
                                                    catch (Exception e){
                                                        e.printStackTrace();
                                                    }
                                                }
                                            };
                                            RegisterRequest registerRequest=new RegisterRequest(userID,userPassword,userName,userPhoneNumber, responseListener);
                                            RequestQueue queue=Volley.newRequestQueue(RegisterActivity.this);
                                            queue.add(registerRequest);

                                        }
                                    }
                                });
    }
                                                            @Override
                                                                    protected void onStop(){
                                                                super.onStop();
                                                                if(dialog !=null)
                                                                {
                                                                    dialog.dismiss();
                                                                    dialog=null; 
                                                                }
        }
    }

