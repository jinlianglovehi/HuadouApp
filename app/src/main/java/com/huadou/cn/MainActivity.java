package com.huadou.cn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.huadou.cn.edu.R;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.Source;
import okio.Timeout;

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
