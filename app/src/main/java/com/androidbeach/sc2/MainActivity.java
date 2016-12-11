package com.androidbeach.sc2;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {



    RelativeLayout background;
    FloatingActionButton floatingActionButton2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        background = (RelativeLayout) findViewById(R.id.activity_main);
        floatingActionButton2 = (FloatingActionButton) findViewById(R.id.floatingActionButton2);


        floatingActionButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.mashasushchuk.com"));
                startActivity(browserIntent);
            }
        });

    }




}
