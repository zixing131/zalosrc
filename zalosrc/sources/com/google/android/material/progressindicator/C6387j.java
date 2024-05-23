package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.InterfaceC2038b;
import java.util.Arrays;
import p439q6.AbstractC25136a;
import p500s1.C26087b;

/* renamed from: com.google.android.material.progressindicator.j */
/* loaded from: classes3.dex */
public final class C6387j extends AbstractC6384g {

    /* renamed from: j */
    private static final Property f35769j = new b(Float.class, "animationFraction");

    /* renamed from: d */
    private ObjectAnimator f35770d;

    /* renamed from: e */
    private C26087b f35771e;

    /* renamed from: f */
    private final AbstractC6378a f35772f;

    /* renamed from: g */
    private int f35773g;

    /* renamed from: h */
    private boolean f35774h;

    /* renamed from: i */
    private float f35775i;

    /* renamed from: com.google.android.material.progressindicator.j$a */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C6387j c6387j = C6387j.this;
            c6387j.f35773g = (c6387j.f35773g + 1) % C6387j.this.f35772f.f35713c.length;
            C6387j.this.f35774h = true;
        }
    }

    /* renamed from: com.google.android.material.progressindicator.j$b */
    /* loaded from: classes3.dex */
    static class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(C6387j c6387j) {
            return Float.valueOf(c6387j.m32819n());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C6387j c6387j, Float f11) {
            c6387j.m32824r(f11.floatValue());
        }
    }

    public C6387j(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f35773g = 1;
        this.f35772f = linearProgressIndicatorSpec;
        this.f35771e = new C26087b();
    }

    /* renamed from: n */
    public float m32819n() {
        return this.f35775i;
    }

    /* renamed from: o */
    private void m32820o() {
        if (this.f35770d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<C6387j, Float>) f35769j, 0.0f, 1.0f);
            this.f35770d = ofFloat;
            ofFloat.setDuration(333L);
            this.f35770d.setInterpolator(null);
            this.f35770d.setRepeatCount(-1);
            this.f35770d.addListener(new a());
        }
    }

    /* renamed from: p */
    private void m32821p() {
        if (this.f35774h && this.f35762b[3] < 1.0f) {
            int[] iArr = this.f35763c;
            iArr[2] = iArr[1];
            iArr[1] = iArr[0];
            iArr[0] = AbstractC25136a.m130291a(this.f35772f.f35713c[this.f35773g], this.f35761a.getAlpha());
            this.f35774h = false;
        }
    }

    /* renamed from: s */
    private void m32822s(int i11) {
        this.f35762b[0] = 0.0f;
        float m32805b = m32805b(i11, 0, 667);
        float[] fArr = this.f35762b;
        float interpolation = this.f35771e.getInterpolation(m32805b);
        fArr[2] = interpolation;
        fArr[1] = interpolation;
        float[] fArr2 = this.f35762b;
        float interpolation2 = this.f35771e.getInterpolation(m32805b + 0.49925038f);
        fArr2[4] = interpolation2;
        fArr2[3] = interpolation2;
        this.f35762b[5] = 1.0f;
    }

    @Override // com.google.android.material.progressindicator.AbstractC6384g
    /* renamed from: a */
    public void mo32759a() {
        ObjectAnimator objectAnimator = this.f35770d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC6384g
    /* renamed from: c */
    public void mo32760c() {
        m32823q();
    }

    @Override // com.google.android.material.progressindicator.AbstractC6384g
    /* renamed from: d */
    public void mo32761d(InterfaceC2038b.a aVar) {
    }

    @Override // com.google.android.material.progressindicator.AbstractC6384g
    /* renamed from: f */
    public void mo32762f() {
    }

    @Override // com.google.android.material.progressindicator.AbstractC6384g
    /* renamed from: g */
    public void mo32763g() {
        m32820o();
        m32823q();
        this.f35770d.start();
    }

    @Override // com.google.android.material.progressindicator.AbstractC6384g
    /* renamed from: h */
    public void mo32764h() {
    }

    /* renamed from: q */
    void m32823q() {
        this.f35774h = true;
        this.f35773g = 1;
        Arrays.fill(this.f35763c, AbstractC25136a.m130291a(this.f35772f.f35713c[0], this.f35761a.getAlpha()));
    }

    /* renamed from: r */
    void m32824r(float f11) {
        this.f35775i = f11;
        m32822s((int) (f11 * 333.0f));
        m32821p();
        this.f35761a.invalidateSelf();
    }
}
