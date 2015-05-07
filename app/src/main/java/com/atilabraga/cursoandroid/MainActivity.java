package com.atilabraga.cursoandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mOpenSecond = (Button) findViewById(R.id.main_btn_open_second);
        mOpenSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("my_name", "Átila Braga");
                startActivity(intent);
            }
        });

        Button mOpenGoogle = (Button) findViewById(R.id.main_btn_open_google);
        mOpenGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("www.google.com"));
                startActivity(intent);
            }
        });
    }

}
