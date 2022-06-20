package ru.mpt.p50_4_19.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Peremash, Vrah, Ishezv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Peremash = findViewById(R.id.Peremash);
        Vrah = findViewById(R.id.Vrah);
        Ishezv = findViewById(R.id.Ishezv);

        ObjectAnimator animator = ObjectAnimator.ofFloat(Peremash, View.X, 0F, 450 );
        animator.setInterpolator(new LinearInterpolator());
        animator.setDuration(5000);
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setRepeatMode(ValueAnimator.REVERSE);
        animator.start();

        /*
        Ishezv.setAlpha(1f);
        Ishezv.animate().alpha(0F).

        //alpha
        setInterpolator( new LinearInterpolator() )
        .setDuration(5000).start();
        */

        Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(1000); //You can manage the blinking time with this parameter
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
        Ishezv.startAnimation(anim);

        RotateAnimation r = new RotateAnimation(0f, 360f);
        r.setInterpolator(new LinearInterpolator());
        r.setDuration(5000);
        r.setRepeatCount(ValueAnimator.INFINITE);
        r.setRepeatMode(ValueAnimator.REVERSE);
        Vrah.startAnimation(r);
    }
}