package com.example.vmac.WatBot;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.firebase.auth.FirebaseAuth;

import javax.annotation.Nullable;

public class InfoFragment extends Fragment {
    ImageView logobackground;
    ImageView logo;
    TextView title;
    TextView description;
    TextView description2;
    TextView description3;
    ImageView descriptionImage;
    ImageView skipbtnBackground;
    Button skipButton;



    int curPos = 1;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.slide_screen, container, false);
        logobackground = view.findViewById(R.id.logoBackground);
        logo = view.findViewById(R.id.logo);
        title = view.findViewById(R.id.title);
        description = view.findViewById(R.id.description);
        description2 = view.findViewById(R.id.description2);
        description3 = view.findViewById(R.id.description3);
        skipbtnBackground = view.findViewById(R.id.skipbtnBackground);
        skipButton = view.findViewById(R.id.skipButton);
        descriptionImage = view.findViewById(R.id.descriptionimage);

        switch (curPos){
            case 0 :
                skipButton.setText("SKIP");

                break;

            case 1 :
                title.setText("Gill will be your guide through Your journey!");
                description.setText("");
                description2.setText("Every Day you will have an interesting Question to think about. Take a minute or two to write/talk About your thoughts.");
                description3.setText("");
                descriptionImage.setImageResource(R.drawable.ic_baseline_mic_24);
                skipButton.setText("SKIP");
                break;

            case 2 :
                title.setText("Gill will be your guide through Your journey!");
                description.setText("");
                description2.setText("Talk to Gill how you are feeling. You will better understand the Changes in you.");
                description3.setText("");
                descriptionImage.setImageResource(R.drawable.ic_baseline_emoji_emotions_24);
                skipButton.setText("SKIP");
                break;
        }

        return view;



    }
    

    public void setCurPos(int curPos) {
        this.curPos = curPos;
    }

}
