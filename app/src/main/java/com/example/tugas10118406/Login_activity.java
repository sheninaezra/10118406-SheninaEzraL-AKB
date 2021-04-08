package com.example.tugas10118406;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login_activity extends AppCompatActivity {

    Button button, keluar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);

        button = (Button) findViewById(R.id.login);
        keluar = (Button) findViewById(R.id.register);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_activity.this, MainActivity.class);
                Login_activity.this.startActivity(intent);
                Login_activity.this.finish();
            }
        });

        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_activity.this, Register_activity.class);
                Login_activity.this.startActivity(intent);
                Login_activity.this.finish();
            }
        });

    }
}