
/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 daimajia
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package cn.com.hwtc.animations;

import cn.com.hwtc.animations.attention.BounceAnimator;
import cn.com.hwtc.animations.attention.FlashAnimator;
import cn.com.hwtc.animations.attention.PulseAnimator;
import cn.com.hwtc.animations.attention.RubberBandAnimator;
import cn.com.hwtc.animations.attention.ShakeAnimator;
import cn.com.hwtc.animations.attention.StandUpAnimator;
import cn.com.hwtc.animations.attention.SwingAnimator;
import cn.com.hwtc.animations.attention.TadaAnimator;
import cn.com.hwtc.animations.attention.WaveAnimator;
import cn.com.hwtc.animations.attention.WobbleAnimator;
import cn.com.hwtc.animations.bouncing_entrances.BounceInAnimator;
import cn.com.hwtc.animations.bouncing_entrances.BounceInDownAnimator;
import cn.com.hwtc.animations.bouncing_entrances.BounceInLeftAnimator;
import cn.com.hwtc.animations.bouncing_entrances.BounceInRightAnimator;
import cn.com.hwtc.animations.bouncing_entrances.BounceInUpAnimator;
import cn.com.hwtc.animations.fading_entrances.FadeInAnimator;
import cn.com.hwtc.animations.fading_entrances.FadeInDownAnimator;
import cn.com.hwtc.animations.fading_entrances.FadeInLeftAnimator;
import cn.com.hwtc.animations.fading_entrances.FadeInRightAnimator;
import cn.com.hwtc.animations.fading_entrances.FadeInUpAnimator;
import cn.com.hwtc.animations.fading_exits.FadeOutAnimator;
import cn.com.hwtc.animations.fading_exits.FadeOutDownAnimator;
import cn.com.hwtc.animations.fading_exits.FadeOutLeftAnimator;
import cn.com.hwtc.animations.fading_exits.FadeOutRightAnimator;
import cn.com.hwtc.animations.fading_exits.FadeOutUpAnimator;
import cn.com.hwtc.animations.flippers.FlipInXAnimator;
import cn.com.hwtc.animations.flippers.FlipInYAnimator;
import cn.com.hwtc.animations.flippers.FlipOutXAnimator;
import cn.com.hwtc.animations.flippers.FlipOutYAnimator;
import cn.com.hwtc.animations.rotating_entrances.RotateInAnimator;
import cn.com.hwtc.animations.rotating_entrances.RotateInDownLeftAnimator;
import cn.com.hwtc.animations.rotating_entrances.RotateInDownRightAnimator;
import cn.com.hwtc.animations.rotating_entrances.RotateInUpLeftAnimator;
import cn.com.hwtc.animations.rotating_entrances.RotateInUpRightAnimator;
import cn.com.hwtc.animations.rotating_exits.RotateOutAnimator;
import cn.com.hwtc.animations.rotating_exits.RotateOutDownLeftAnimator;
import cn.com.hwtc.animations.rotating_exits.RotateOutDownRightAnimator;
import cn.com.hwtc.animations.rotating_exits.RotateOutUpLeftAnimator;
import cn.com.hwtc.animations.rotating_exits.RotateOutUpRightAnimator;
import cn.com.hwtc.animations.sliders.SlideInDownAnimator;
import cn.com.hwtc.animations.sliders.SlideInLeftAnimator;
import cn.com.hwtc.animations.sliders.SlideInRightAnimator;
import cn.com.hwtc.animations.sliders.SlideInUpAnimator;
import cn.com.hwtc.animations.sliders.SlideOutDownAnimator;
import cn.com.hwtc.animations.sliders.SlideOutLeftAnimator;
import cn.com.hwtc.animations.sliders.SlideOutRightAnimator;
import cn.com.hwtc.animations.sliders.SlideOutUpAnimator;
import cn.com.hwtc.animations.specials.HingeAnimator;
import cn.com.hwtc.animations.specials.RollInAnimator;
import cn.com.hwtc.animations.specials.RollOutAnimator;
import cn.com.hwtc.animations.specials.in.DropOutAnimator;
import cn.com.hwtc.animations.specials.in.LandingAnimator;
import cn.com.hwtc.animations.specials.out.TakingOffAnimator;
import cn.com.hwtc.animations.zooming_entrances.ZoomInAnimator;
import cn.com.hwtc.animations.zooming_entrances.ZoomInDownAnimator;
import cn.com.hwtc.animations.zooming_entrances.ZoomInLeftAnimator;
import cn.com.hwtc.animations.zooming_entrances.ZoomInRightAnimator;
import cn.com.hwtc.animations.zooming_entrances.ZoomInUpAnimator;
import cn.com.hwtc.animations.zooming_exits.ZoomOutAnimator;
import cn.com.hwtc.animations.zooming_exits.ZoomOutDownAnimator;
import cn.com.hwtc.animations.zooming_exits.ZoomOutLeftAnimator;
import cn.com.hwtc.animations.zooming_exits.ZoomOutRightAnimator;
import cn.com.hwtc.animations.zooming_exits.ZoomOutUpAnimator;

public enum Techniques {

    DropOut(DropOutAnimator.class),
    Landing(LandingAnimator.class),
    TakingOff(TakingOffAnimator.class),

    Flash(FlashAnimator.class),
    Pulse(PulseAnimator.class),
    RubberBand(RubberBandAnimator.class),
    Shake(ShakeAnimator.class),
    Swing(SwingAnimator.class),
    Wobble(WobbleAnimator.class),
    Bounce(BounceAnimator.class),
    Tada(TadaAnimator.class),
    StandUp(StandUpAnimator.class),
    Wave(WaveAnimator.class),

    Hinge(HingeAnimator.class),
    RollIn(RollInAnimator.class),
    RollOut(RollOutAnimator.class),

    BounceIn(BounceInAnimator.class),
    BounceInDown(BounceInDownAnimator.class),
    BounceInLeft(BounceInLeftAnimator.class),
    BounceInRight(BounceInRightAnimator.class),
    BounceInUp(BounceInUpAnimator.class),

    FadeIn(FadeInAnimator.class),
    FadeInUp(FadeInUpAnimator.class),
    FadeInDown(FadeInDownAnimator.class),
    FadeInLeft(FadeInLeftAnimator.class),
    FadeInRight(FadeInRightAnimator.class),

    FadeOut(FadeOutAnimator.class),
    FadeOutDown(FadeOutDownAnimator.class),
    FadeOutLeft(FadeOutLeftAnimator.class),
    FadeOutRight(FadeOutRightAnimator.class),
    FadeOutUp(FadeOutUpAnimator.class),

    FlipInX(FlipInXAnimator.class),
    FlipOutX(FlipOutXAnimator.class),
    FlipInY(FlipInYAnimator.class),
    FlipOutY(FlipOutYAnimator.class),
    RotateIn(RotateInAnimator.class),
    RotateInDownLeft(RotateInDownLeftAnimator.class),
    RotateInDownRight(RotateInDownRightAnimator.class),
    RotateInUpLeft(RotateInUpLeftAnimator.class),
    RotateInUpRight(RotateInUpRightAnimator.class),

    RotateOut(RotateOutAnimator.class),
    RotateOutDownLeft(RotateOutDownLeftAnimator.class),
    RotateOutDownRight(RotateOutDownRightAnimator.class),
    RotateOutUpLeft(RotateOutUpLeftAnimator.class),
    RotateOutUpRight(RotateOutUpRightAnimator.class),

    SlideInLeft(SlideInLeftAnimator.class),
    SlideInRight(SlideInRightAnimator.class),
    SlideInUp(SlideInUpAnimator.class),
    SlideInDown(SlideInDownAnimator.class),

    SlideOutLeft(SlideOutLeftAnimator.class),
    SlideOutRight(SlideOutRightAnimator.class),
    SlideOutUp(SlideOutUpAnimator.class),
    SlideOutDown(SlideOutDownAnimator.class),

    ZoomIn(ZoomInAnimator.class),
    ZoomInDown(ZoomInDownAnimator.class),
    ZoomInLeft(ZoomInLeftAnimator.class),
    ZoomInRight(ZoomInRightAnimator.class),
    ZoomInUp(ZoomInUpAnimator.class),

    ZoomOut(ZoomOutAnimator.class),
    ZoomOutDown(ZoomOutDownAnimator.class),
    ZoomOutLeft(ZoomOutLeftAnimator.class),
    ZoomOutRight(ZoomOutRightAnimator.class),
    ZoomOutUp(ZoomOutUpAnimator.class);



    private Class animatorClazz;

    private Techniques(Class clazz) {
        animatorClazz = clazz;
    }

    public BaseViewAnimator getAnimator() {
        try {
            return (BaseViewAnimator) animatorClazz.newInstance();
        } catch (Exception e) {
            throw new Error("Can not init animatorClazz instance");
        }
    }
}
