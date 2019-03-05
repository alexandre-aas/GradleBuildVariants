package com.s.d.a.a.gradlebuildvariants;

import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;

public class GradleBuildVariantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gradle_build_variants);

        ConstraintLayout phoneLayout = findViewById(R.id.tabletLayout);
        phoneLayout.setBackgroundColor(Color.GREEN);
    }
}
