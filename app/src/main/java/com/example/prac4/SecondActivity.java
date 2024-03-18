package com.example.prac4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public void goBack(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void goNext(View view)
    {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

    private TextView textView1;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView1 = findViewById(R.id.NameIs);
        textView2 = findViewById(R.id.SurnameIs);

        Intent intent = getIntent();

        String name = intent.getStringExtra("NAME");
        String surname = intent.getStringExtra("SURNAME");

        textView1.setText(surname);
        textView2.setText(name);
    }
}