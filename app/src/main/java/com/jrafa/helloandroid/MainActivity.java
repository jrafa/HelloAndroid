package com.jrafa.helloandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *  This method go to url after button is pressed.
     */
    public void goToPage(View view) {
        TextView page = (TextView) (findViewById(R.id.url));
        String url = "http://" + page.getText().toString();
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse(url) );
        startActivity(browse);
    }
}
