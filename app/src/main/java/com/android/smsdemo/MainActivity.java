package com.android.smsdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.sendText();
    }


        private void sendText() {
            try {
                SmsManager sm = SmsManager.getDefault();
                String _message = "Text Sent " + (new Random()).nextInt(1000);
                sm.sendTextMessage("9147683190", null, _message, null, null);

                Toast.makeText(this, _message, Toast.LENGTH_SHORT).show();
            } catch (Exception e) {
                Log.d("ERROR SENDING TEXT:", e.toString());
            }

        }
















/*

    public void goToInbox(View v) {
        Intent intent = new Intent(MainActivity.this, ReceiveSMSActivity.class);
        startActivity(intent);
    }

    public void goToCompose(View v) {
        Intent intent = new Intent(MainActivity.this, SendSmsActivity.class);
        startActivity(intent);
    }
    */

}
