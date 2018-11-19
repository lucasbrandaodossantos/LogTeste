package com.example.lucas.logteste;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtinfoip = findViewById(R.id.txt_info_ip);
        TextView txtinfomodelo = findViewById(R.id.txt_info_modelo);
        TextView txtinfoversao = findViewById(R.id.txt_info_versao);

        LogInfo log = new LogInfo();
        txtinfoversao.setText(log.getAndroidVersion());
        txtinfomodelo.setText(log.getDeviceName());
        txtinfoip.setText(log.getUserIP(this));
    }
}
