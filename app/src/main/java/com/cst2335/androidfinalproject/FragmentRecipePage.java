package com.cst2335.androidfinalproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.view.View;

import com.cst2335.androidfinalproject.ui.main.FragmentRecipePageFragment;

import java.util.Timer;
import java.util.TimerTask;

public class FragmentRecipePage extends AppCompatActivity {
    ProgressBar progressBar;
    int count = 0;
    Timer timer;

    //Progress Bar code
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_recipe_page);

        progressBar = findViewById(R.id.progressBar);
        timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run()  {
                count++;
                progressBar.setProgress(count);
                if(count == 100) {
                    timer.cancel();
                }
            }
        };
        timer.schedule(timerTask, 0, 100);
        //End of Progress Bar code



        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, FragmentRecipePageFragment.newInstance())
                .commitNow();
        }
    }

    //Toast message when the star button is clicked
    public void onCustomToggleClick(View view) {
        Toast.makeText(this, "Added to the favorite list", Toast.LENGTH_SHORT).show();
    }
}