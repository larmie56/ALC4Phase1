package com.example.alc4phase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ALC4Phase1 extends AppCompatActivity {

    private Button mAboutAlc;
    private Button mMyProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAboutAlc = findViewById(R.id.button_about_alc);
        mMyProfile = findViewById(R.id.button_my_profile);

        setUpButtonClicks();
    }

    private void setUpButtonClicks() {
        mAboutAlc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ALC4Phase1.this, AboutALC.class);
                startActivity(intent);
            }
        });

        mMyProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ALC4Phase1.this, MyProfile.class);
                startActivity(intent);
            }
        });

    }
}
