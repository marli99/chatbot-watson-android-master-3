package com.example.vmac.WatBot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SlideScreenActivity extends AppCompatActivity implements View.OnClickListener{

    Button skipButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slide_screen);

        skipButton.setOnClickListener(this);
        skipButton = (Button) findViewById(R.id.skipButton);




    }


    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.skipButton:
                loadHome();
                break;
        }
    }

    private void loadHome(){
        startActivity(new Intent(this, Dashboard.class));
        finish();
    }
}
