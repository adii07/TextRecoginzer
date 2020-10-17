package com.example.textrecognizer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button selectImage;
    private TextView extractedView;
    private ImageView selectedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selectImage=findViewById(R.id.button);
        extractedView=findViewById(R.id.textView);
        selectedImage=findViewById(R.id.imageView);
    }
}