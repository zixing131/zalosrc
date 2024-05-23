package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.C2030t;
import androidx.transition.Transition;
import java.util.Map;

/* renamed from: com.google.android.material.internal.t */
/* loaded from: classes3.dex */
public class C6353t extends Transition {

    /* renamed from: com.google.android.material.internal.t$a */
    /* loaded from: classes3.dex */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: p */
        final /* synthetic */ TextView f35598p;

        a(TextView textView) {
            this.f35598p = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f35598p.setScaleX(floatValue);
            this.f35598p.setScaleY(floatValue);
        }
    }

    /* renamed from: r0 */
    private void m32631r0(C2030t c2030t) {
        View view = c2030t.f8616b;
        if (view instanceof TextView) {
            c2030t.f8615a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: i */
    public void mo10818i(C2030t c2030t) {
        m32631r0(c2030t);
    }

    @Override // androidx.transition.Transition
    /* renamed from: l */
    public void mo10819l(C2030t c2030t) {
        m32631r0(c2030t);
    }

    @Override // androidx.transition.Transition
    /* renamed from: p */
    public Animator mo10820p(ViewGroup viewGroup, C2030t c2030t, C2030t c2030t2) {
        float f11;
        if (c2030t == null || c2030t2 == null || !(c2030t.f8616b instanceof TextView)) {
            return null;
        }
        View view = c2030t2.f8616b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map map = c2030t.f8615a;
        Map map2 = c2030t2.f8615a;
        float f12 = 1.0f;
        if (map.get("android:textscale:scale") != null) {
            f11 = ((Float) map.get("android:textscale:scale")).floatValue();
        } else {
            f11 = 1.0f;
        }
        if (map2.get("android:textscale:scale") != null) {
            f12 = ((Float) map2.get("android:textscale:scale")).floatValue();
        }
        if (f11 == f12) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f12);
        ofFloat.addUpdateListener(new a(textView));
        return ofFloat;
    }
}
