package com.cieslinski.lab21;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getActionBar().setDisplayHomeAsUpEnabled(true);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.about_program:

                return true;


            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public void onProgramie(MenuItem item) {
        Context context = getApplicationContext();


        Intent intent = new Intent(this, AboutProgramActivity.class);

        intent.putExtra(EXTRA_MESSAGE, "WELCOME");
        startActivity(intent);



    }

    public void onMainButton(View view) {

        Context context = getApplicationContext();


        Intent intent = new Intent(this, HomeActivity.class);

        intent.putExtra(EXTRA_MESSAGE, "WELCOME");
        startActivity(intent);


        /*Context context = getApplicationContext();
        CharSequence text = "Hello toast!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();*/



    }
}
