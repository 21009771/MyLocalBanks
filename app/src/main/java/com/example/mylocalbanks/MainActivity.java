package com.example.mylocalbanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;



public class MainActivity extends AppCompatActivity {

    ImageButton DBSButton;
    ImageButton OCBCButton;
    ImageButton UOBButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBSButton = findViewById(R.id.imageButton);
        OCBCButton = findViewById(R.id.imageButton2);
        UOBButton = findViewById(R.id.imageButton3);



        DBSButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentCall = new Intent(Intent. ACTION_DIAL, Uri.parse("tel:" + 001111111));
                startActivity(intentCall);


                Intent intent = new Intent(Intent. ACTION_VIEW, Uri.parse("@string/URL1"));
                startActivity(intent);

            }
        });

        OCBCButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentCall = new Intent(Intent. ACTION_DIAL, Uri.parse("tel:" + 003633333));
                startActivity(intentCall);


                Intent intent = new Intent(Intent. ACTION_VIEW, Uri.parse("@string/URL2"));
                startActivity(intent);

            }
        });

        UOBButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentCall = new Intent(Intent. ACTION_DIAL, Uri.parse("tel:" + 002222121));
                startActivity(intentCall);


                Intent intent = new Intent(Intent. ACTION_VIEW, Uri.parse("@string/URL3"));
                startActivity(intent);

            }
        });
    }

}