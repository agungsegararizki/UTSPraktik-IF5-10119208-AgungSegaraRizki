package com.example.utspraktik_if5_10119208_agungsegararizki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CekActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek);
    }
    public void tekanback(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void tekancek(View view){
        Intent intent = new Intent(this, NotifActivity.class);
        startActivity(intent);
    }
}