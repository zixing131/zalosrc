package com.zing.zalo.zdesign.component;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.AbstractC1388a;
import bi0.AbstractC2808b;
import sj0.C26277b;

/* loaded from: classes7.dex */
public class GlowingReddot extends View {

    /* renamed from: p */
    C26277b f86274p;

    /* renamed from: q */
    Paint f86275q;

    /* renamed from: r */
    int f86276r;

    /* renamed from: s */
    int f86277s;

    /* renamed from: t */
    int f86278t;

    /* renamed from: u */
    int f86279u;

    /* renamed from: v */
    float f86280v;

    /* renamed from: w */
    boolean f86281w;

    /* renamed from: x */
    CountDownTimer f86282x;

    /* renamed from: y */
    boolean f86283y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zdesign.component.GlowingReddot$a */
    /* loaded from: classes7.dex */
    public class CountDownTimerC16915a extends CountDownTimer {
        CountDownTimerC16915a(long j11, long j12) {
            super(j11, j12);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            GlowingReddot glowingReddot = GlowingReddot.this;
            if (glowingReddot.f86283y && glowingReddot.getVisibility() == 0) {
                GlowingReddot.this.m90574g();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j11) {
        }
    }

    public GlowingReddot(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m90568a(Context context) {
        this.f86276r = AbstractC1388a.m6961c(context, AbstractC2808b.wht_a100);
        this.f86277s = AbstractC1388a.m6961c(context, AbstractC2808b.f150830r60);
    }

    /* renamed from: b */
    private void m90569b() {
        Paint paint = new Paint();
        this.f86275q = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f86275q.setAntiAlias(true);
    }

    /* renamed from: d */
    private void m90570d(long j11) {
        CountDownTimer countDownTimer = this.f86282x;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f86282x = new CountDownTimerC16915a(j11, 1000L).start();
    }

    /* renamed from: c */
    public void m90571c(float f11, int i11, int i12, int i13, int i14, int i15, int i16) {
        C26277b c26277b = new C26277b(f11, i11, i12, i13, i14, i15, i16, new Rect(0, 0, 0, 0), f11);
        this.f86274p = c26277b;
        c26277b.setCallback(this);
        this.f86280v = f11;
        invalidate();
    }

    /* renamed from: e */
    public void m90572e() {
        C26277b c26277b = this.f86274p;
        if (c26277b != null) {
            c26277b.m135211x();
        }
        this.f86281w = true;
        invalidate();
    }

    /* renamed from: f */
    public void m90573f(long j11) {
        m90572e();
        m90570d(j11);
    }

    /* renamed from: g */
    public void m90574g() {
        C26277b c26277b = this.f86274p;
        if (c26277b != null) {
            c26277b.m135212z();
        }
        this.f86281w = false;
        invalidate();
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        invalidate();
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f86283y = true;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        this.f86283y = false;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (width > 0 && height > 0) {
            float f11 = (width * 1.0f) / 2.0f;
            float f12 = (height * 1.0f) / 2.0f;
            if (this.f86274p != null && this.f86280v > 0.0f && this.f86281w) {
                canvas.save();
                canvas.translate(f11, f12);
                this.f86274p.draw(canvas);
                canvas.restore();
            }
            if (this.f86278t > 0) {
                canvas.save();
                this.f86275q.setColor(this.f86276r);
                canvas.drawCircle(f11, f12, (this.f86278t * 1.0f) / 2.0f, this.f86275q);
                canvas.restore();
            }
            if (this.f86279u > 0) {
                canvas.save();
                this.f86275q.setColor(this.f86277s);
                canvas.drawCircle(f11, f12, (this.f86279u * 1.0f) / 2.0f, this.f86275q);
                canvas.restore();
            }
        }
    }

    public void setBottomLayerColor(int i11) {
        if (i11 != this.f86276r) {
            this.f86276r = i11;
            invalidate();
        }
    }

    public void setBottomLayerSize(int i11) {
        if (i11 > 0 && i11 != this.f86278t) {
            this.f86278t = i11;
            invalidate();
        }
    }

    public void setTopLayerColor(int i11) {
        if (i11 != this.f86277s) {
            this.f86277s = i11;
            invalidate();
        }
    }

    public void setTopLayerSize(int i11) {
        if (i11 > 0 && i11 != this.f86279u) {
            this.f86279u = i11;
            invalidate();
        }
    }

    public GlowingReddot(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m90569b();
        m90568a(context);
    }
}
