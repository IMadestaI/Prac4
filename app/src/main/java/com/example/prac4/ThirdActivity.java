package com.example.prac4;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    public void startNewActivity(Intent intent)
    {
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

    }

    public void onClickOk (View view)
    {
        Toast toast = Toast.makeText(this, "Дата и время занятия успешно переданы",Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP, 0,160);
        toast.show();
    }
}