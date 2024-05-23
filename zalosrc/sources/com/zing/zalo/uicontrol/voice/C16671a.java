package com.zing.zalo.uicontrol.voice;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import com.zing.zalo.uicontrol.voice.C16671a;
import fn0.AbstractC19074t;
import hn0.AbstractC20104d;

/* renamed from: com.zing.zalo.uicontrol.voice.a */
/* loaded from: classes4.dex */
public final class C16671a {

    /* renamed from: a */
    private int f84548a;

    /* renamed from: b */
    private final long f84549b;

    /* renamed from: c */
    private final int f84550c;

    /* renamed from: d */
    private final a f84551d;

    /* renamed from: e */
    private float f84552e;

    /* renamed from: f */
    private int f84553f;

    /* renamed from: g */
    private float f84554g;

    /* renamed from: h */
    private final ValueAnimator f84555h;

    /* renamed from: com.zing.zalo.uicontrol.voice.a$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo88853a();

        /* renamed from: b */
        void mo88854b(C16671a c16671a);
    }

    /* renamed from: com.zing.zalo.uicontrol.voice.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            a aVar = C16671a.this.f84551d;
            if (aVar != null) {
                aVar.mo88854b(C16671a.this);
            }
        }
    }

    public C16671a(int i11, long j11, int i12, a aVar) {
        this.f84548a = i11;
        this.f84549b = j11;
        this.f84550c = i12;
        this.f84551d = aVar;
        this.f84553f = i12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(j11);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fd0.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C16671a.m88848c(C16671a.this, valueAnimator);
            }
        });
        ofFloat.addListener(new b());
        this.f84555h = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m88848c(C16671a c16671a, ValueAnimator valueAnimator) {
        Float f11;
        float f12;
        int m104529e;
        AbstractC19074t.m100208f(c16671a, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Float) {
            f11 = (Float) animatedValue;
        } else {
            f11 = null;
        }
        if (f11 != null) {
            f12 = f11.floatValue();
        } else {
            f12 = 0.0f;
        }
        if (f12 < 1.0f) {
            float f13 = c16671a.f84552e;
            float f14 = c16671a.f84554g;
            c16671a.f84552e = f13 + (((f12 - f14) / (1.0f - f14)) * (c16671a.f84548a - f13));
            m104529e = AbstractC20104d.m104529e((1.0f - f12) * c16671a.f84550c);
            c16671a.f84553f = m104529e;
            c16671a.f84554g = f12;
        } else {
            c16671a.f84552e = c16671a.f84548a;
            c16671a.f84553f = 0;
        }
        a aVar = c16671a.f84551d;
        if (aVar != null) {
            aVar.mo88853a();
        }
    }

    /* renamed from: d */
    public final int m88849d() {
        return this.f84553f;
    }

    /* renamed from: e */
    public final float m88850e() {
        return this.f84552e;
    }

    /* renamed from: f */
    public final void m88851f(int i11) {
        this.f84548a = i11;
    }

    /* renamed from: g */
    public final void m88852g() {
        if (!this.f84555h.isStarted()) {
            this.f84555h.start();
        }
    }
}
