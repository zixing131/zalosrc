package com.zing.zalo.zinstant.component.skeleton;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.zing.zalo.zinstant.component.skeleton.C17109b;

/* renamed from: com.zing.zalo.zinstant.component.skeleton.b */
/* loaded from: classes7.dex */
public class C17109b extends Drawable {

    /* renamed from: a */
    private final ValueAnimator.AnimatorUpdateListener f87509a = new ValueAnimator.AnimatorUpdateListener() { // from class: uj0.a
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C17109b.this.m91476f(valueAnimator);
        }
    };

    /* renamed from: b */
    private final Paint f87510b;

    /* renamed from: c */
    private final Rect f87511c;

    /* renamed from: d */
    private final Matrix f87512d;

    /* renamed from: e */
    private ValueAnimator f87513e;

    /* renamed from: f */
    private C17108a f87514f;

    /* renamed from: g */
    private final Object f87515g;

    /* renamed from: h */
    private float f87516h;

    /* renamed from: i */
    PorterDuffXfermode f87517i;

    public C17109b() {
        Paint paint = new Paint();
        this.f87510b = paint;
        this.f87511c = new Rect();
        this.f87512d = new Matrix();
        this.f87515g = new Object();
        this.f87517i = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        paint.setAntiAlias(true);
    }

    /* renamed from: b */
    private void m91475b() {
        if (this.f87514f != null) {
            this.f87516h = this.f87511c.width() + (((float) Math.tan(Math.toRadians(r0.f87502j))) * this.f87511c.height());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m91476f(ValueAnimator valueAnimator) {
        invalidateSelf();
    }

    /* renamed from: g */
    private float m91477g(float f11, float f12, float f13) {
        return f11 + ((f12 - f11) * f13);
    }

    /* renamed from: k */
    private void m91478k() {
        int width = getBounds().width();
        if (width != 0 && this.f87514f != null) {
            float f11 = width;
            C17108a c17108a = this.f87514f;
            this.f87510b.setShader(new LinearGradient(0.0f, 0.0f, f11, 0.0f, c17108a.f87494b, c17108a.f87493a, Shader.TileMode.CLAMP));
        }
    }

    /* renamed from: l */
    private void m91479l() {
        boolean z11;
        if (this.f87514f == null) {
            return;
        }
        ValueAnimator valueAnimator = this.f87513e;
        if (valueAnimator != null) {
            z11 = valueAnimator.isStarted();
            this.f87513e.cancel();
            this.f87513e.removeAllUpdateListeners();
        } else {
            z11 = false;
        }
        C17108a c17108a = this.f87514f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, (((float) c17108a.f87507o) / ((float) c17108a.f87506n)) + 1.0f);
        this.f87513e = ofFloat;
        ofFloat.setRepeatMode(this.f87514f.f87505m);
        this.f87513e.setRepeatCount(this.f87514f.f87504l);
        ValueAnimator valueAnimator2 = this.f87513e;
        C17108a c17108a2 = this.f87514f;
        valueAnimator2.setDuration(c17108a2.f87506n + c17108a2.f87507o);
        this.f87513e.addUpdateListener(this.f87509a);
        if (z11) {
            this.f87513e.start();
        }
    }

    /* renamed from: c */
    public boolean m91480c() {
        C17108a c17108a = this.f87514f;
        if (c17108a != null && c17108a.f87503k) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean m91481d() {
        ValueAnimator valueAnimator;
        if (this.f87514f != null && (valueAnimator = this.f87513e) != null && valueAnimator.isRunning()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f11;
        if (this.f87514f != null && this.f87510b.getShader() != null) {
            ValueAnimator valueAnimator = this.f87513e;
            if (valueAnimator != null) {
                f11 = valueAnimator.getAnimatedFraction();
            } else {
                f11 = 0.0f;
            }
            float f12 = this.f87516h;
            float m91477g = m91477g(-f12, f12, f11);
            this.f87512d.reset();
            this.f87512d.setRotate(this.f87514f.f87502j, this.f87511c.width() / 2.0f, this.f87511c.height() / 2.0f);
            this.f87512d.postTranslate(m91477g, 0.0f);
            this.f87510b.getShader().setLocalMatrix(this.f87512d);
            canvas.drawRect(this.f87511c, this.f87510b);
        }
    }

    /* renamed from: e */
    public boolean m91482e() {
        ValueAnimator valueAnimator;
        if (this.f87514f != null && (valueAnimator = this.f87513e) != null && valueAnimator.isStarted()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f87514f != null ? -3 : -1;
    }

    /* renamed from: h */
    public void m91483h(C17108a c17108a) {
        this.f87514f = c17108a;
        if (c17108a != null) {
            this.f87510b.setXfermode(this.f87517i);
        }
        m91478k();
        m91479l();
        m91475b();
        invalidateSelf();
    }

    /* renamed from: i */
    public void m91484i() {
        synchronized (this.f87515g) {
            try {
                if (this.f87514f != null && this.f87513e != null && !m91482e() && getCallback() != null) {
                    this.f87513e.start();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: j */
    public void m91485j() {
        synchronized (this.f87515g) {
            try {
                if (this.f87514f != null && this.f87513e != null && m91482e()) {
                    this.f87513e.cancel();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f87511c.set(0, 0, rect.width(), rect.height());
        m91478k();
        m91475b();
        if (m91480c()) {
            m91484i();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
