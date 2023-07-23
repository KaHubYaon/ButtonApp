package com.example.experiment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonToast extends AppCompatActivity {

    Button Submitbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_toast);

        Submitbtn = findViewById(R.id.Submitbtn);

        Submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonToast.this, "Submit Button", Toast.LENGTH_SHORT).show();
            }
        });

    }
}