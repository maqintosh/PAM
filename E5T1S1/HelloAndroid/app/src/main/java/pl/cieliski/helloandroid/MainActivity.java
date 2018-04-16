package pl.cieliski.helloandroid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyActivity";

    EditText messageEditText;
    Button logButton;
    Button toastButton;
    Button rewriteButton;
    TextView textView;
    Button loginButton;
    EditText loginEditText;
    EditText passwordEditText;

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);


        //ustawiam widok

        setContentView(R.layout.activity_main_active);
        messageEditText = findViewById(R.id.messageEditText);
        logButton = findViewById(R.id.logButton);
        toastButton = findViewById(R.id.toastButton);
        rewriteButton = findViewById(R.id.rewriteButton);
        textView = findViewById(R.id.textView);
        loginButton = findViewById(R.id.loginButton);

        loginEditText = findViewById(R.id.loginEditText);
        passwordEditText = findViewById(R.id.passwordEditText);

    }

    //WIDGETY

//    Button toastButton = findViewById(R.id.toastButton);
    //toastButton.


    public void onLogClick(View view) {

        int i =0;
        Log.d(TAG, "index=" + i);


    }


    public void onToastClick(View view) {


        Context context = getApplicationContext();
        CharSequence text = "Hello toast!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();



    }

    public void onRewriteClick(View view) {
        //rewriteButton.callOnClick();

        CharSequence parser =messageEditText.getText();
        textView.setText(parser);

    }


    public void onLoginClick(View view) {

        if(passwordEditText.getText().toString().equals("android")){
            Context context = getApplicationContext();
            CharSequence text = "HASŁO POPRAWNE!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();


            Intent intent = new Intent(this, LoginSuccesActivity.class);
            //EditText editText = (EditText) findViewById(R.id.editText);
            //String message = editText.getText().toString();
            intent.putExtra(EXTRA_MESSAGE, "WELCOME");
            startActivity(intent);



        }else{Context context = getApplicationContext();
            CharSequence text = "BŁAD!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();}



    }
}
