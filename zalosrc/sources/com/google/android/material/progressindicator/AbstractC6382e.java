package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.InterfaceC2038b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p382o6.AbstractC24041a;
import p569v6.C27928a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.progressindicator.e */
/* loaded from: classes3.dex */
public abstract class AbstractC6382e extends Drawable implements InterfaceC2038b {

    /* renamed from: D */
    private static final Property f35742D = new c(Float.class, "growFraction");

    /* renamed from: A */
    private float f35743A;

    /* renamed from: C */
    private int f35745C;

    /* renamed from: p */
    final Context f35746p;

    /* renamed from: q */
    final AbstractC6378a f35747q;

    /* renamed from: s */
    private ValueAnimator f35749s;

    /* renamed from: t */
    private ValueAnimator f35750t;

    /* renamed from: u */
    private boolean f35751u;

    /* renamed from: v */
    private boolean f35752v;

    /* renamed from: w */
    private float f35753w;

    /* renamed from: x */
    private List f35754x;

    /* renamed from: y */
    private InterfaceC2038b.a f35755y;

    /* renamed from: z */
    private boolean f35756z;

    /* renamed from: B */
    final Paint f35744B = new Paint();

    /* renamed from: r */
    C27928a f35748r = new C27928a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.progressindicator.e$a */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            AbstractC6382e.this.m32794f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.progressindicator.e$b */
    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            AbstractC6382e.super.setVisible(false, false);
            AbstractC6382e.this.m32793e();
        }
    }

    /* renamed from: com.google.android.material.progressindicator.e$c */
    /* loaded from: classes3.dex */
    static class c extends Property {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(AbstractC6382e abstractC6382e) {
            return Float.valueOf(abstractC6382e.m32799h());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(AbstractC6382e abstractC6382e, Float f11) {
            abstractC6382e.m32800m(f11.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC6382e(Context context, AbstractC6378a abstractC6378a) {
        this.f35746p = context;
        this.f35747q = abstractC6378a;
        setAlpha(255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m32793e() {
        InterfaceC2038b.a aVar = this.f35755y;
        if (aVar != null) {
            aVar.mo11042b(this);
        }
        List list = this.f35754x;
        if (list != null && !this.f35756z) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC2038b.a) it.next()).mo11042b(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m32794f() {
        InterfaceC2038b.a aVar = this.f35755y;
        if (aVar != null) {
            aVar.m11043c(this);
        }
        List list = this.f35754x;
        if (list != null && !this.f35756z) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC2038b.a) it.next()).m11043c(this);
            }
        }
    }

    /* renamed from: g */
    private void m32795g(ValueAnimator... valueAnimatorArr) {
        boolean z11 = this.f35756z;
        this.f35756z = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f35756z = z11;
    }

    /* renamed from: l */
    private void m32796l() {
        if (this.f35749s == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<AbstractC6382e, Float>) f35742D, 0.0f, 1.0f);
            this.f35749s = ofFloat;
            ofFloat.setDuration(500L);
            this.f35749s.setInterpolator(AbstractC24041a.f116359b);
            m32798o(this.f35749s);
        }
        if (this.f35750t == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, (Property<AbstractC6382e, Float>) f35742D, 1.0f, 0.0f);
            this.f35750t = ofFloat2;
            ofFloat2.setDuration(500L);
            this.f35750t.setInterpolator(AbstractC24041a.f116359b);
            m32797n(this.f35750t);
        }
    }

    /* renamed from: n */
    private void m32797n(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f35750t;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f35750t = valueAnimator;
        valueAnimator.addListener(new b());
    }

    /* renamed from: o */
    private void m32798o(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f35749s;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.f35749s = valueAnimator;
        valueAnimator.addListener(new a());
    }

    /* renamed from: a */
    public void mo11040a(InterfaceC2038b.a aVar) {
        if (this.f35754x == null) {
            this.f35754x = new ArrayList();
        }
        if (!this.f35754x.contains(aVar)) {
            this.f35754x.add(aVar);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f35745C;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public float m32799h() {
        if (!this.f35747q.m32739b() && !this.f35747q.m32738a()) {
            return 1.0f;
        }
        if (!this.f35752v && !this.f35751u) {
            return this.f35743A;
        }
        return this.f35753w;
    }

    /* renamed from: i */
    public boolean mo32778i() {
        return mo32781p(false, false, false);
    }

    public boolean isRunning() {
        if (!mo32780k() && !mo32779j()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public boolean mo32779j() {
        ValueAnimator valueAnimator = this.f35750t;
        if ((valueAnimator != null && valueAnimator.isRunning()) || this.f35752v) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo32780k() {
        ValueAnimator valueAnimator = this.f35749s;
        if ((valueAnimator != null && valueAnimator.isRunning()) || this.f35751u) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m32800m(float f11) {
        if (this.f35743A != f11) {
            this.f35743A = f11;
            invalidateSelf();
        }
    }

    /* renamed from: p */
    public boolean mo32781p(boolean z11, boolean z12, boolean z13) {
        boolean z14;
        float m140783a = this.f35748r.m140783a(this.f35746p.getContentResolver());
        if (z13 && m140783a > 0.0f) {
            z14 = true;
        } else {
            z14 = false;
        }
        return mo32782q(z11, z12, z14);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo32782q(boolean z11, boolean z12, boolean z13) {
        ValueAnimator valueAnimator;
        boolean z14;
        boolean m32738a;
        m32796l();
        if (!isVisible() && !z11) {
            return false;
        }
        if (z11) {
            valueAnimator = this.f35749s;
        } else {
            valueAnimator = this.f35750t;
        }
        if (!z13) {
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                m32795g(valueAnimator);
            }
            return super.setVisible(z11, false);
        }
        if (z13 && valueAnimator.isRunning()) {
            return false;
        }
        if (z11 && !super.setVisible(z11, false)) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (z11) {
            m32738a = this.f35747q.m32739b();
        } else {
            m32738a = this.f35747q.m32738a();
        }
        if (!m32738a) {
            m32795g(valueAnimator);
            return z14;
        }
        if (!z12 && valueAnimator.isPaused()) {
            valueAnimator.resume();
        } else {
            valueAnimator.start();
        }
        return z14;
    }

    /* renamed from: r */
    public boolean mo32783r(InterfaceC2038b.a aVar) {
        List list = this.f35754x;
        if (list != null && list.contains(aVar)) {
            this.f35754x.remove(aVar);
            if (this.f35754x.isEmpty()) {
                this.f35754x = null;
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f35745C = i11;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f35744B.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        return mo32781p(z11, z12, true);
    }

    public void start() {
        mo32782q(true, true, false);
    }

    public void stop() {
        mo32782q(false, true, false);
    }
}
