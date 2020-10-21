package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * 主界面AppCompatActivity类
 * 主界面：点击应用图标启动的界面
 * extends AppCompatActivity
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText et_main_message;
    private Button btn_main_start1;
    private Button btn_main_start2;
    /**
     * 重写的方法
     * onCreate:在当前类(activity)对象创建的时候自动调用
     * 回调方法：不是我们调的，是系统在一定条件下自动调用的，基本都以on开头 onXXX
     *          这些方法我们不需要调用，一般只是去重写此类方法
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //调用父类处理做一些默认初始化的工作
        super.onCreate(savedInstanceState);
        //设置窗口要显示的内容视图(界面/布局)
        //指定布局文件在R所对应的变量，加载布局文件最终显示到窗口中
        setContentView(R.layout.activity_main);

        //初始化视图对象
        et_main_message = (EditText) findViewById(R.id.et_main_message);
        btn_main_start1 = (Button) findViewById(R.id.btn_main_stat1);
        btn_main_start2 = (Button) findViewById(R.id.btn_main_stat2);
        //设置点击监听
        btn_main_start1.setOnClickListener((View.OnClickListener) this);
        btn_main_start2.setOnClickListener((View.OnClickListener) this);
    }

    @SuppressLint("WrongConstant")
    @Override
    public void onClick(View v) {//v就是发生事件的视图对象（操作的）
        if (v==btn_main_start1){
//            Toast.makeText(this,"一般启动",0).show();
            //1.创建Intent对象（显式）
            Intent intent = new Intent(this,SecondActivity.class);
            //2.通过intent携带额外数据
            String message = et_main_message.getText().toString();
            intent.putExtra("MESSAGE",message);
            //3.启动Activity
            startActivity(intent);
        }else if (v==btn_main_start2){
            Toast.makeText(this,"带回调启动",0).show();
        }

    }
}