package com.cst2335.androidfinalproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.cst2335.androidfinalproject.ui.main.FragmentRecipePageFragment;

public class FragmentRecipePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_recipe_page);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, FragmentRecipePageFragment.newInstance())
                .commitNow();
        }
    }
}