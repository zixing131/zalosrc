package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import androidx.vectordrawable.graphics.drawable.AbstractC2041e;
import androidx.vectordrawable.graphics.drawable.InterfaceC2038b;
import java.util.Arrays;
import p357n6.AbstractC23576a;
import p439q6.AbstractC25136a;

/* renamed from: com.google.android.material.progressindicator.k */
/* loaded from: classes3.dex */
public final class C6388k extends AbstractC6384g {

    /* renamed from: l */
    private static final int[] f35777l = {533, 567, 850, 750};

    /* renamed from: m */
    private static final int[] f35778m = {1267, 1000, 333, 0};

    /* renamed from: n */
    private static final Property f35779n = new b(Float.class, "animationFraction");

    /* renamed from: d */
    private ObjectAnimator f35780d;

    /* renamed from: e */
    private final Interpolator[] f35781e;

    /* renamed from: f */
    private final AbstractC6378a f35782f;

    /* renamed from: g */
    private int f35783g;

    /* renamed from: h */
    private boolean f35784h;

    /* renamed from: i */
    private float f35785i;

    /* renamed from: j */
    private boolean f35786j;

    /* renamed from: k */
    InterfaceC2038b.a f35787k;

    /* renamed from: com.google.android.material.progressindicator.k$a */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (C6388k.this.f35786j) {
                C6388k.this.f35780d.setRepeatCount(-1);
                C6388k c6388k = C6388k.this;
                c6388k.f35787k.mo11042b(c6388k.f35761a);
                C6388k.this.f35786j = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C6388k c6388k = C6388k.this;
            c6388k.f35783g = (c6388k.f35783g + 1) % C6388k.this.f35782f.f35713c.length;
            C6388k.this.f35784h = true;
        }
    }

    /* renamed from: com.google.android.material.progressindicator.k$b */
    /* loaded from: classes3.dex */
    static class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(C6388k c6388k) {
            return Float.valueOf(c6388k.m32835q());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C6388k c6388k, Float f11) {
            c6388k.m32840u(f11.floatValue());
        }
    }

    public C6388k(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.f35783g = 0;
        this.f35787k = null;
        this.f35782f = linearProgressIndicatorSpec;
        this.f35781e = new Interpolator[]{AbstractC2041e.m11050a(context, AbstractC23576a.linear_indeterminate_line1_head_interpolator), AbstractC2041e.m11050a(context, AbstractC23576a.linear_indeterminate_line1_tail_interpolator), AbstractC2041e.m11050a(context, AbstractC23576a.linear_indeterminate_line2_head_interpolator), AbstractC2041e.m11050a(context, AbstractC23576a.linear_indeterminate_line2_tail_interpolator)};
    }

    /* renamed from: q */
    public float m32835q() {
        return this.f35785i;
    }

    /* renamed from: r */
    private void m32836r() {
        if (this.f35780d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<C6388k, Float>) f35779n, 0.0f, 1.0f);
            this.f35780d = ofFloat;
            ofFloat.setDuration(1800L);
            this.f35780d.setInterpolator(null);
            this.f35780d.setRepeatCount(-1);
            this.f35780d.addListener(new a());
        }
    }

    /* renamed from: s */
    private void m32837s() {
        if (this.f35784h) {
            Arrays.fill(this.f35763c, AbstractC25136a.m130291a(this.f35782f.f35713c[this.f35783g], this.f35761a.getAlpha()));
            this.f35784h = false;
        }
    }

    /* renamed from: v */
    private void m32838v(int i11) {
        for (int i12 = 0; i12 < 4; i12++) {
            this.f35762b[i12] = Math.max(0.0f, Math.min(1.0f, this.f35781e[i12].getInterpolation(m32805b(i11, f35778m[i12], f35777l[i12]))));
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC6384g
    /* renamed from: a */
    public void mo32759a() {
        ObjectAnimator objectAnimator = this.f35780d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC6384g
    /* renamed from: c */
    public void mo32760c() {
        m32839t();
    }

    @Override // com.google.android.material.progressindicator.AbstractC6384g
    /* renamed from: d */
    public void mo32761d(InterfaceC2038b.a aVar) {
        this.f35787k = aVar;
    }

    @Override // com.google.android.material.progressindicator.AbstractC6384g
    /* renamed from: f */
    public void mo32762f() {
        if (this.f35761a.isVisible()) {
            this.f35786j = true;
            this.f35780d.setRepeatCount(0);
        } else {
            mo32759a();
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC6384g
    /* renamed from: g */
    public void mo32763g() {
        m32836r();
        m32839t();
        this.f35780d.start();
    }

    @Override // com.google.android.material.progressindicator.AbstractC6384g
    /* renamed from: h */
    public void mo32764h() {
        this.f35787k = null;
    }

    /* renamed from: t */
    void m32839t() {
        this.f35783g = 0;
        int m130291a = AbstractC25136a.m130291a(this.f35782f.f35713c[0], this.f35761a.getAlpha());
        int[] iArr = this.f35763c;
        iArr[0] = m130291a;
        iArr[1] = m130291a;
    }

    /* renamed from: u */
    void m32840u(float f11) {
        this.f35785i = f11;
        m32838v((int) (f11 * 1800.0f));
        m32837s();
        this.f35761a.invalidateSelf();
    }
}
