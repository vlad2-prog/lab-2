package com.example.lab2;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView helloText;
    private ImageButton startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Находим элементы по ID
        helloText = (TextView) findViewById(R.id.hellotext);
        startButton = (ImageButton) findViewById(R.id.startButton);
    }

    public void onStartButtonClick(View view) {
        // Меняем картинку кнопки на робота
        startButton.setImageResource(R.drawable.android);

        // Делаем текст видимым
        helloText.setVisibility(View.VISIBLE);

        // Делаем кнопку неактивной после нажатия
        startButton.setClickable(false);
    }
}