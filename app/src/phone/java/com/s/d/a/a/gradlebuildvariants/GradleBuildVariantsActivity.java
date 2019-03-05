package com.s.d.a.a.gradlebuildvariants;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;

public class GradleBuildVariantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gradle_build_variants);

        ConstraintLayout phoneLayout = findViewById(R.id.phoneLayout);
        phoneLayout.setBackgroundColor(Color.RED);
    }
}
