package com.example.rajnayan.splitwise;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public ImageButton img_btn;

    public void addGroup(){
        img_btn = (ImageButton) findViewById(R.id.imageButton);
        img_btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent addGroup = new Intent(MainActivity.this, addGroup.class);
                startActivity(addGroup);

            }
        });
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        addGroup();

//        img_btn = (ImageButton) findViewById(R.id.imageButton);
//
//
//
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "here we will add the group", Toast.LENGTH_SHORT).show();
//            }
//
//            });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
