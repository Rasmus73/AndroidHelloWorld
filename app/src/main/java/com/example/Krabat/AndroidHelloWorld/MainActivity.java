package com.example.Krabat.AndroidHelloWorld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // onClick eventHandler
    public void sendMessage(View view) {
        EditText editText = (EditText)findViewById(R.id.myEditText);
        TextView textView = (TextView)findViewById(R.id.myTextView);

        textView.setText(editText.getText().toString());
    }
}