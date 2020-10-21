package com.example.myapplication;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends Activity{
    private EditText et_second_message;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        et_second_message = (EditText) findViewById(R.id.et_second_message);
        //4.得到intent对象
        Intent intent = getIntent();
        //5.通过intent读取额外数据
        String message = intent.getStringExtra("MESSAGE");
        //6.显示到EDitText
        et_second_message.setText(message);
    }

    public void back1(View v){
        //关闭当前界面
        finish();
    }
}
