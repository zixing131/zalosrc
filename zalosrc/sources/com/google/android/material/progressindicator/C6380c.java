package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.InterfaceC2038b;
import p382o6.C24043c;
import p439q6.AbstractC25136a;
import p500s1.C26087b;

/* renamed from: com.google.android.material.progressindicator.c */
/* loaded from: classes3.dex */
public final class C6380c extends AbstractC6384g {

    /* renamed from: l */
    private static final int[] f35721l = {0, 1350, 2700, 4050};

    /* renamed from: m */
    private static final int[] f35722m = {667, 2017, 3367, 4717};

    /* renamed from: n */
    private static final int[] f35723n = {1000, 2350, 3700, 5050};

    /* renamed from: o */
    private static final Property f35724o = new c(Float.class, "animationFraction");

    /* renamed from: p */
    private static final Property f35725p = new d(Float.class, "completeEndFraction");

    /* renamed from: d */
    private ObjectAnimator f35726d;

    /* renamed from: e */
    private ObjectAnimator f35727e;

    /* renamed from: f */
    private final C26087b f35728f;

    /* renamed from: g */
    private final AbstractC6378a f35729g;

    /* renamed from: h */
    private int f35730h;

    /* renamed from: i */
    private float f35731i;

    /* renamed from: j */
    private float f35732j;

    /* renamed from: k */
    InterfaceC2038b.a f35733k;

    /* renamed from: com.google.android.material.progressindicator.c$a */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C6380c c6380c = C6380c.this;
            c6380c.f35730h = (c6380c.f35730h + 4) % C6380c.this.f35729g.f35713c.length;
        }
    }

    /* renamed from: com.google.android.material.progressindicator.c$b */
    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C6380c.this.mo32759a();
            C6380c c6380c = C6380c.this;
            c6380c.f35733k.mo11042b(c6380c.f35761a);
        }
    }

    /* renamed from: com.google.android.material.progressindicator.c$c */
    /* loaded from: classes3.dex */
    static class c extends Property {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(C6380c c6380c) {
            return Float.valueOf(c6380c.m32753o());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C6380c c6380c, Float f11) {
            c6380c.m32766t(f11.floatValue());
        }
    }

    /* renamed from: com.google.android.material.progressindicator.c$d */
    /* loaded from: classes3.dex */
    static class d extends Property {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(C6380c c6380c) {
            return Float.valueOf(c6380c.m32754p());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C6380c c6380c, Float f11) {
            c6380c.m32757u(f11.floatValue());
        }
    }

    public C6380c(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f35730h = 0;
        this.f35733k = null;
        this.f35729g = circularProgressIndicatorSpec;
        this.f35728f = new C26087b();
    }

    /* renamed from: o */
    public float m32753o() {
        return this.f35731i;
    }

    /* renamed from: p */
    public float m32754p() {
        return this.f35732j;
    }

    /* renamed from: q */
    private void m32755q() {
        if (this.f35726d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<C6380c, Float>) f35724o, 0.0f, 1.0f);
            this.f35726d = ofFloat;
            ofFloat.setDuration(5400L);
            this.f35726d.setInterpolator(null);
            this.f35726d.setRepeatCount(-1);
            this.f35726d.addListener(new a());
        }
        if (this.f35727e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<C6380c, Float>) f35725p, 0.0f, 1.0f);
            this.f35727e = ofFloat2;
            ofFloat2.setDuration(333L);
            this.f35727e.setInterpolator(this.f35728f);
            this.f35727e.addListener(new b());
        }
    }

    /* renamed from: r */
    private void m32756r(int i11) {
        for (int i12 = 0; i12 < 4; i12++) {
            float m32805b = m32805b(i11, f35723n[i12], 333);
            if (m32805b >= 0.0f && m32805b <= 1.0f) {
                int i13 = i12 + this.f35730h;
                int[] iArr = this.f35729g.f35713c;
                int length = i13 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                int m130291a = AbstractC25136a.m130291a(iArr[length], this.f35761a.getAlpha());
                int m130291a2 = AbstractC25136a.m130291a(this.f35729g.f35713c[length2], this.f35761a.getAlpha());
                this.f35763c[0] = C24043c.m125914b().evaluate(this.f35728f.getInterpolation(m32805b), Integer.valueOf(m130291a), Integer.valueOf(m130291a2)).intValue();
                return;
            }
        }
    }

    /* renamed from: u */
    public void m32757u(float f11) {
        this.f35732j = f11;
    }

    /* renamed from: v */
    private void m32758v(int i11) {
        float[] fArr = this.f35762b;
        float f11 = this.f35731i;
        fArr[0] = (f11 * 1520.0f) - 20.0f;
        fArr[1] = f11 * 1520.0f;
        for (int i12 = 0; i12 < 4; i12++) {
            float m32805b = m32805b(i11, f35721l[i12], 667);
            float[] fArr2 = this.f35762b;
            fArr2[1] = fArr2[1] + (this.f35728f.getInterpolation(m32805b) * 250.0f);
            float m32805b2 = m32805b(i11, f35722m[i12], 667);
            float[] fArr3 = this.f35762b;
            fArr3[0] = fArr3[0] + (this.f35728f.getInterpolation(m32805b2) * 250.0f);
        }
        float[] fArr4 = this.f35762b;
        float f12 = fArr4[0];
        float f13 = fArr4[1];
        float f14 = f12 + ((f13 - f12) * this.f35732j);
        fArr4[0] = f14;
        fArr4[0] = f14 / 360.0f;
        fArr4[1] = f13 / 360.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.AbstractC6384g
    /* renamed from: a */
    public void mo32759a() {
        ObjectAnimator objectAnimator = this.f35726d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC6384g
    /* renamed from: c */
    public void mo32760c() {
        m32765s();
    }

    @Override // com.google.android.material.progressindicator.AbstractC6384g
    /* renamed from: d */
    public void mo32761d(InterfaceC2038b.a aVar) {
        this.f35733k = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.AbstractC6384g
    /* renamed from: f */
    public void mo32762f() {
        if (this.f35727e.isRunning()) {
            return;
        }
        if (this.f35761a.isVisible()) {
            this.f35727e.start();
        } else {
            mo32759a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.AbstractC6384g
    /* renamed from: g */
    public void mo32763g() {
        m32755q();
        m32765s();
        this.f35726d.start();
    }

    @Override // com.google.android.material.progressindicator.AbstractC6384g
    /* renamed from: h */
    public void mo32764h() {
        this.f35733k = null;
    }

    /* renamed from: s */
    void m32765s() {
        this.f35730h = 0;
        this.f35763c[0] = AbstractC25136a.m130291a(this.f35729g.f35713c[0], this.f35761a.getAlpha());
        this.f35732j = 0.0f;
    }

    /* renamed from: t */
    void m32766t(float f11) {
        this.f35731i = f11;
        int i11 = (int) (f11 * 5400.0f);
        m32758v(i11);
        m32756r(i11);
        this.f35761a.invalidateSelf();
    }
}
