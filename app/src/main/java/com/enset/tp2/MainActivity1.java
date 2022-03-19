package com.enset.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        TextView u = (TextView) findViewById(R.id.username2);
        TextView p = (TextView) findViewById(R.id.password2);
        Bundle b = getIntent().getExtras();
        String user = b.getString("username");
        String pass = b.getString("password");
        u.setText(user);
        p.setText(pass);
    }
    public void retour(View view){
        Intent i2 = new Intent(this,MainActivity.class);
        startActivity(i2);
    }
}