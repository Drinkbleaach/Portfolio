package com.example.sagrika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class socialMedia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_media);
    }

    public void intentInsta(View view) {
        Uri uri = Uri.parse("http://www.instagram.com/sxgrikx"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void intentfb(View view) {
        Uri uri = Uri.parse("https://www.facebook.com/duhitzsagrika/"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void intentyt(View view) {
        Toast.makeText(getApplicationContext(),"Coming Soon",Toast.LENGTH_SHORT).show();
    }
}
