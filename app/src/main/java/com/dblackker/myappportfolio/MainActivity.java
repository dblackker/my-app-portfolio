package com.dblackker.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMessage(View view)
    {
        int id = view.getId();
        Button button = (Button) findViewById(id);

        CharSequence text = String.format(getString(R.string.app_click), button.getText());

        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }
}
