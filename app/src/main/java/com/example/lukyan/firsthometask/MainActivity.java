package com.example.lukyan.firsthometask;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.A_Activity:
                startActivity(new Intent(this, AActivity.class));
                break;
            case R.id.B_Activity:
                startActivity(new Intent(this, BActivity.class));
                break;
            case R.id.C_Activity:
                startActivity(new Intent(this, CActivity.class));
                return super.onOptionsItemSelected(item);
        }
        return true;
    }



}
