package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.View;
import com.zing.zalo.AbstractC16801x;
import me0.AbstractC23136l9;
import sj0.C26277b;

/* loaded from: classes4.dex */
public class GlowingReddot extends View {

    /* renamed from: p */
    C26277b f45033p;

    /* renamed from: q */
    Paint f45034q;

    /* renamed from: r */
    int f45035r;

    /* renamed from: s */
    int f45036s;

    /* renamed from: t */
    int f45037t;

    /* renamed from: u */
    int f45038u;

    /* renamed from: v */
    float f45039v;

    /* renamed from: w */
    boolean f45040w;

    /* renamed from: x */
    CountDownTimer f45041x;

    /* renamed from: y */
    boolean f45042y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.GlowingReddot$a */
    /* loaded from: classes4.dex */
    public class CountDownTimerC8209a extends CountDownTimer {
        CountDownTimerC8209a(long j11, long j12) {
            super(j11, j12);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            GlowingReddot glowingReddot = GlowingReddot.this;
            if (glowingReddot.f45042y && glowingReddot.getVisibility() == 0) {
                GlowingReddot.this.m44427g();
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
    private void m44421a() {
        this.f45035r = AbstractC23136l9.m118641B(getContext(), AbstractC16801x.white);
        this.f45036s = AbstractC23136l9.m118641B(getContext(), AbstractC16801x.red);
    }

    /* renamed from: b */
    private void m44422b() {
        Paint paint = new Paint();
        this.f45034q = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f45034q.setAntiAlias(true);
    }

    /* renamed from: d */
    private void m44423d(long j11) {
        CountDownTimer countDownTimer = this.f45041x;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f45041x = new CountDownTimerC8209a(j11, 1000L).start();
    }

    /* renamed from: c */
    public void m44424c(float f11, int i11, int i12, int i13, int i14, int i15, int i16) {
        C26277b c26277b = new C26277b(f11, i11, i12, i13, i14, i15, i16, new Rect(0, 0, 0, 0), f11);
        this.f45033p = c26277b;
        c26277b.setCallback(this);
        this.f45039v = f11;
        invalidate();
    }

    /* renamed from: e */
    public void m44425e() {
        C26277b c26277b = this.f45033p;
        if (c26277b != null) {
            c26277b.m135211x();
        }
        this.f45040w = true;
        invalidate();
    }

    /* renamed from: f */
    public void m44426f(long j11) {
        m44425e();
        m44423d(j11);
    }

    /* renamed from: g */
    public void m44427g() {
        C26277b c26277b = this.f45033p;
        if (c26277b != null) {
            c26277b.m135212z();
        }
        this.f45040w = false;
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
        this.f45042y = true;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        this.f45042y = false;
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
            if (this.f45033p != null && this.f45039v > 0.0f && this.f45040w) {
                canvas.save();
                canvas.translate(f11, f12);
                this.f45033p.draw(canvas);
                canvas.restore();
            }
            if (this.f45037t > 0) {
                canvas.save();
                this.f45034q.setColor(this.f45035r);
                canvas.drawCircle(f11, f12, (this.f45037t * 1.0f) / 2.0f, this.f45034q);
                canvas.restore();
            }
            if (this.f45038u > 0) {
                canvas.save();
                this.f45034q.setColor(this.f45036s);
                canvas.drawCircle(f11, f12, (this.f45038u * 1.0f) / 2.0f, this.f45034q);
                canvas.restore();
            }
        }
    }

    public void setBottomLayerColor(int i11) {
        if (i11 != this.f45035r) {
            this.f45035r = i11;
            invalidate();
        }
    }

    public void setBottomLayerSize(int i11) {
        if (i11 > 0 && i11 != this.f45037t) {
            this.f45037t = i11;
            invalidate();
        }
    }

    public void setTopLayerColor(int i11) {
        if (i11 != this.f45036s) {
            this.f45036s = i11;
            invalidate();
        }
    }

    public void setTopLayerSize(int i11) {
        if (i11 > 0 && i11 != this.f45038u) {
            this.f45038u = i11;
            invalidate();
        }
    }

    public GlowingReddot(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m44422b();
        m44421a();
    }
}
