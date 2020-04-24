package com.example.sagrika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void backIntent(View view) {

            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);

    }
    public void social(View view) {

        Intent intent = new Intent(this, socialMedia.class);
        startActivity(intent);

    }
}
