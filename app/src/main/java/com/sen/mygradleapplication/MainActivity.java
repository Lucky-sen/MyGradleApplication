package com.sen.mygradleapplication;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvText;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvText = findViewById(R.id.tv_text);
        editText = findViewById(R.id.edit_text);

        String dataValue = MyUtils.getMetaDataFromApp(this);
        tvText.setText(dataValue);

//        tvText.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.setClass(MainActivity.this, TestAActivity.class);
//                startActivity(intent);
//            }
//        });

        tvText.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, TestAActivity.class);
            startActivity(intent);
        });

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }



    Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            System.out.println("Running without Lambda");
        }
    };

    Runnable runnable2 = ()->{
        System.out.println("Running without Lambda");
    };
}