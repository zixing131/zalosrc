package o20;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.animation.LinearInterpolator;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o20.b */
/* loaded from: classes5.dex */
public final class C23989b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: p */
    private final int f116095p;

    /* renamed from: q */
    private final int f116096q;

    /* renamed from: r */
    private final Paint f116097r;

    /* renamed from: s */
    private ValueAnimator f116098s;

    /* renamed from: t */
    private int f116099t;

    /* renamed from: u */
    private int f116100u;

    /* renamed from: v */
    private float f116101v;

    /* renamed from: w */
    private float f116102w;

    /* renamed from: x */
    private ArrayList f116103x;

    /* renamed from: y */
    private InterfaceC18494a f116104y;

    public C23989b(int i11, int i12) {
        this.f116095p = i11;
        this.f116096q = i12;
        Paint paint = new Paint();
        paint.setColor(i11);
        this.f116097r = paint;
        this.f116102w = 1.0f;
        this.f116103x = new ArrayList();
    }

    /* renamed from: a */
    public final void m125511a(int i11, int i12, int i13) {
        this.f116099t = i12;
        this.f116100u = i11;
        this.f116102w = 1.0f / i13;
        ArrayList arrayList = this.f116103x;
        this.f116103x = new ArrayList();
        for (int i14 = 0; i14 < i13; i14++) {
            this.f116103x.add(new C23988a(new RectF(), 0.0f, 255, i14, this.f116096q));
        }
        arrayList.clear();
    }

    /* renamed from: b */
    public final void m125512b(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        Iterator it = this.f116103x.iterator();
        while (it.hasNext()) {
            C23988a c23988a = (C23988a) it.next();
            c23988a.m125510c(this.f116100u, this.f116099t);
            c23988a.m125509b(canvas, this.f116097r);
        }
    }

    /* renamed from: c */
    public final void m125513c(InterfaceC18494a interfaceC18494a) {
        this.f116104y = interfaceC18494a;
    }

    /* renamed from: d */
    public final void m125514d() {
        if (this.f116098s == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(3000L);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addUpdateListener(this);
            ofFloat.setRepeatCount(-1);
            this.f116098s = ofFloat;
        }
        ValueAnimator valueAnimator = this.f116098s;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    /* renamed from: e */
    public final void m125515e() {
        this.f116104y = null;
        ValueAnimator valueAnimator = this.f116098s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f116098s;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        Float f11;
        AbstractC19074t.m100208f(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Float) {
            f11 = (Float) animatedValue;
        } else {
            f11 = null;
        }
        if (f11 != null) {
            float floatValue = f11.floatValue();
            this.f116101v = floatValue;
            Iterator it = this.f116103x.iterator();
            while (it.hasNext()) {
                ((C23988a) it.next()).m125508a(floatValue, this.f116102w);
            }
            InterfaceC18494a interfaceC18494a = this.f116104y;
            if (interfaceC18494a != null) {
                interfaceC18494a.mo12V4();
            }
        }
    }
}
