package com.example.a621activity_2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;

public class ViewPhotoActivity extends AppCompatActivity {

    private Button button_next;
    private Button button_back;
    private TextView textView_number;
    Random random = new Random();
    int ActivityNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_photo);

        button_next = findViewById(R.id.button_next);
        button_back = findViewById(R.id.button_back);

        button_next.setOnClickListener(clickListener_next);
        button_back.setOnClickListener(clickListener_back);

        textView_number = findViewById(R.id.textView_number);
        ActivityNumber = Integer.parseInt(String.valueOf(random.nextInt(101)));
        nextActivity();
        Log.d("Lifecycle", ActivityNumber + "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle", ActivityNumber + "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle", ActivityNumber + "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle", ActivityNumber + "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle", ActivityNumber + "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle", ActivityNumber + "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Lifecycle", ActivityNumber + "onRestart");
    }

    private View.OnClickListener clickListener_next = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(ViewPhotoActivity.this,
                    ViewPhotoActivity.class );
            startActivity(intent);
        }
    };

    @SuppressLint("SetTextI18n")
    private void nextActivity() {
        textView_number.setText("http://myfile.org/" +
                ActivityNumber);
    }

    private View.OnClickListener clickListener_back = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };
}