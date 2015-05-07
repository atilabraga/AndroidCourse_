package com.atilabraga.cursoandroid;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

/**
 * Created by Átila on 07/05/2015.
 */
public class SecondActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String name = getIntent().getStringExtra("my_name");

        TextView mName = (TextView) findViewById(R.id.second_tv_name);
        mName.setText("Olá, mundo do " + name);
    }
}
