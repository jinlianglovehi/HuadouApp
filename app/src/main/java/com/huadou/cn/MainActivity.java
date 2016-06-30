package com.huadou.cn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

     private static  final String  TAG  = MainActivity.class.getSimpleName();
    @BindView(R.id.btn_login)
    TextView btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn_login)
    public void fun_btn_login(){
        Log.i(TAG, "fun_btn_login: ");
    }
}
