package com.thenapster.project.lottie;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.animation_view)
    LottieAnimationView lottieAnimationView;

    @BindView(R.id.bt_like)
    ImageView ivLike;

    @BindView(R.id.bt_like_red)
    ImageView ivLikeRed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.bt_like, R.id.bt_like_red})
    public void onViewClicked(View v){
        switch (v.getId()){
            case R.id.bt_like:
                lottieAnimationView.setVisibility(View.VISIBLE);
                animateThat();
            break;
            case R.id.bt_like_red:
                ivLikeRed.setVisibility(View.GONE);
                ivLike.setVisibility(View.VISIBLE);
                break;
        }
    }

    private void animateThat(){
        lottieAnimationView.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                ivLike.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationEnd(Animator animation) {

                lottieAnimationView.pauseAnimation();
                lottieAnimationView.setVisibility(View.GONE);
                ivLikeRed.setVisibility(View.VISIBLE);

            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
        lottieAnimationView.playAnimation();
    }
}
