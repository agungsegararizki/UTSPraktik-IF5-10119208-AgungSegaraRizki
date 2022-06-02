package com.example.utspraktik_if5_10119208_agungsegararizki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tekanlanjut(View view){
        Intent intent = new Intent(this, CekActivity.class);
        startActivity(intent);
    }

}