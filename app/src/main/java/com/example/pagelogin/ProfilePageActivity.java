package com.example.pagelogin;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfilePageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profilepage);
        ImageView settingIcon = findViewById(R.id.imgSettings);
        settingIcon.setOnClickListener(v -> {
            Intent intent = new Intent(ProfilePageActivity.this, LoginHomeActivity.class);
            startActivity(intent);
        });
    }
}
