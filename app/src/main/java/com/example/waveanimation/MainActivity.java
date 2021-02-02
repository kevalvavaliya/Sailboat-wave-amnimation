package com.example.waveanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView im,c1,c2,c3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        im=findViewById(R.id.bot);
        c1=findViewById(R.id.cl1);
        c2=findViewById(R.id.cl2);
       /* ObjectAnimator imageanimator=(ObjectAnimator) AnimatorInflater.loadAnimator(this,R.animator.boat);
        imageanimator.setTarget(im);
        imageanimator.start();*/
        animation();

    }
    void animation()
    {
        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(this,
                R.animator.boat);
        set.setTarget(im);

        AnimatorSet set1 = (AnimatorSet) AnimatorInflater.loadAnimator(this,
                R.animator.cloud);
        set1.setTarget(c1);

        AnimatorSet set2 = (AnimatorSet) AnimatorInflater.loadAnimator(this,
                R.animator.cloud2);
        set2.setTarget(c2);


        set.start();
        set1.start();
        set2.start();


    }
}