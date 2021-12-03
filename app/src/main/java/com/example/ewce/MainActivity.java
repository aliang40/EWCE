package com.example.ewce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.EWCE.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the notification button */
    public void goToNotif(View view) {
        Intent intent = new Intent(this, notifications.class);
//        EditText editText = (EditText) findViewById(R.id.);
//        int message = R.string.testMessage;
//        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}