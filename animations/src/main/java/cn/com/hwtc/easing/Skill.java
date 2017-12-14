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

package cn.com.hwtc.easing;

import cn.com.hwtc.easing.back.BackEaseIn;
import cn.com.hwtc.easing.back.BackEaseInOut;
import cn.com.hwtc.easing.back.BackEaseOut;
import cn.com.hwtc.easing.bounce.BounceEaseIn;
import cn.com.hwtc.easing.bounce.BounceEaseInOut;
import cn.com.hwtc.easing.bounce.BounceEaseOut;
import cn.com.hwtc.easing.circ.CircEaseIn;
import cn.com.hwtc.easing.circ.CircEaseInOut;
import cn.com.hwtc.easing.circ.CircEaseOut;
import cn.com.hwtc.easing.cubic.CubicEaseIn;
import cn.com.hwtc.easing.cubic.CubicEaseInOut;
import cn.com.hwtc.easing.cubic.CubicEaseOut;
import cn.com.hwtc.easing.elastic.ElasticEaseIn;
import cn.com.hwtc.easing.elastic.ElasticEaseOut;
import cn.com.hwtc.easing.expo.ExpoEaseIn;
import cn.com.hwtc.easing.expo.ExpoEaseInOut;
import cn.com.hwtc.easing.expo.ExpoEaseOut;
import cn.com.hwtc.easing.quad.QuadEaseIn;
import cn.com.hwtc.easing.quad.QuadEaseInOut;
import cn.com.hwtc.easing.quad.QuadEaseOut;
import cn.com.hwtc.easing.quint.QuintEaseIn;
import cn.com.hwtc.easing.quint.QuintEaseInOut;
import cn.com.hwtc.easing.quint.QuintEaseOut;
import cn.com.hwtc.easing.sine.SineEaseIn;
import cn.com.hwtc.easing.sine.SineEaseInOut;
import cn.com.hwtc.easing.sine.SineEaseOut;
import cn.com.hwtc.easing.linear.Linear;


public enum  Skill {

    BackEaseIn(BackEaseIn.class),
    BackEaseOut(BackEaseOut.class),
    BackEaseInOut(BackEaseInOut.class),

    BounceEaseIn(BounceEaseIn.class),
    BounceEaseOut(BounceEaseOut.class),
    BounceEaseInOut(BounceEaseInOut.class),

    CircEaseIn(CircEaseIn.class),
    CircEaseOut(CircEaseOut.class),
    CircEaseInOut(CircEaseInOut.class),

    CubicEaseIn(CubicEaseIn.class),
    CubicEaseOut(CubicEaseOut.class),
    CubicEaseInOut(CubicEaseInOut.class),

    ElasticEaseIn(ElasticEaseIn.class),
    ElasticEaseOut(ElasticEaseOut.class),

    ExpoEaseIn(ExpoEaseIn.class),
    ExpoEaseOut(ExpoEaseOut.class),
    ExpoEaseInOut(ExpoEaseInOut.class),

    QuadEaseIn(QuadEaseIn.class),
    QuadEaseOut(QuadEaseOut.class),
    QuadEaseInOut(QuadEaseInOut.class),

    QuintEaseIn(QuintEaseIn.class),
    QuintEaseOut(QuintEaseOut.class),
    QuintEaseInOut(QuintEaseInOut.class),

    SineEaseIn(SineEaseIn.class),
    SineEaseOut(SineEaseOut.class),
    SineEaseInOut(SineEaseInOut.class),

    Linear(Linear.class);


    private Class easingMethod;

    private Skill(Class clazz) {
        easingMethod = clazz;
    }

    public BaseEasingMethod getMethod(float duration) {
        try {
            return (BaseEasingMethod)easingMethod.getConstructor(float.class).newInstance(duration);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Error("Can not init easingMethod instance");
        }
    }
}
