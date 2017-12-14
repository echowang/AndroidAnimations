package cn.com.hwtc.animations.specials.in;

import android.animation.ObjectAnimator;
import android.view.View;

import cn.com.hwtc.animations.BaseViewAnimator;
import cn.com.hwtc.easing.Glider;
import cn.com.hwtc.easing.Skill;

public class DropOutAnimator extends BaseViewAnimator {
    @Override
    protected void prepare(View target) {
        int distance = target.getTop() + target.getHeight();
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "alpha", 0, 1),
                Glider.glide(Skill.BounceEaseOut, getDuration(), ObjectAnimator.ofFloat(target, "translationY", -distance, 0))
        );
    }
}
