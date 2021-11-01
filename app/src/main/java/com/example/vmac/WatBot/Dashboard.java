package com.example.vmac.WatBot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class Dashboard extends AppCompatActivity implements View.OnClickListener {

    Button depressionID, anxietyID, stressID, angerID;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { switch(item.getItemId()) {
        case R.id.action_logOut:
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            finish();

            break;

    }
        return(super.onOptionsItemSelected(item));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        depressionID = (Button) findViewById(R.id.depressionID);
        anxietyID = (Button) findViewById(R.id.anxietyID);
        stressID = (Button) findViewById(R.id.stressID);
        angerID = (Button) findViewById(R.id.angerID);


        depressionID.setOnClickListener(this);
        anxietyID.setOnClickListener(this);
        stressID.setOnClickListener(this);
        angerID.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case  R.id.depressionID:
                startActivity(new Intent(this, MainActivity.class));

                break;

            case R.id.anxietyID:
                startActivity(new Intent(this, MainActivity.class));

                break;

            case R.id.stressID:
                startActivity(new Intent(this, MainActivity.class));

                break;

            case R.id.angerID:
                startActivity(new Intent(this, MainActivity.class));

                break;

        }
    }

}