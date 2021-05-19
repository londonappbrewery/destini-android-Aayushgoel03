package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    private Button red_button;
    private Button blue_button;
    private TextView story_text;
    private int mStoryIndex=1;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        red_button = (Button) findViewById(R.id.buttonTop);
        blue_button = (Button) findViewById(R.id.buttonBottom);
        story_text = (TextView) findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:


        red_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mStoryIndex = mStoryIndex * 3;
                if(mStoryIndex==3 ) {
                    story_text.setText(R.string.T3_Story);
                    red_button.setText(R.string.T3_Ans1);
                    blue_button.setText(R.string.T3_Ans2);
                }
                if(mStoryIndex==9)
                {
                    story_text.setText(R.string.T6_End);
                    red_button.setVisibility(View.GONE);
                    blue_button.setVisibility(View.GONE);
                }
                if(mStoryIndex==6){
                    story_text.setText(R.string.T3_Story);
                    red_button.setText(R.string.T3_Ans1);
                    blue_button.setText(R.string.T3_Ans2);
                }
                if(mStoryIndex==18){
                    story_text.setText(R.string.T6_End);
                    red_button.setVisibility(View.GONE);
                    blue_button.setVisibility(View.GONE);
                }
            }

        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        blue_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mStoryIndex = mStoryIndex*2;
                if(mStoryIndex==2) {
                    story_text.setText(R.string.T2_Story);
                    red_button.setText(R.string.T2_Ans1);
                    blue_button.setText(R.string.T2_Ans2);
                }
                if(mStoryIndex==6){
                    story_text.setText(R.string.T5_End);
                    red_button.setVisibility(View.GONE);
                    blue_button.setVisibility(View.GONE);

                }
                if(mStoryIndex==12){
                    story_text.setText(R.string.T5_End);
                    red_button.setVisibility(View.GONE);
                    blue_button.setVisibility(View.GONE);

                }
                if(mStoryIndex==4){
                    story_text.setText(R.string.T4_End);
                    red_button.setVisibility(View.GONE);
                    blue_button.setVisibility(View.GONE);

                }
            }
        });

        }
}
