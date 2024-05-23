package com.zing.zalo.shortvideo.p072ui.widget.p075rv;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import fn0.AbstractC19074t;
import s20.AbstractC26112n;
import u20.C26981b;
import v00.AbstractC27406a;
import v00.AbstractC27407b;

/* loaded from: classes5.dex */
public final class OverScrollableRefreshBar extends View {

    /* renamed from: p */
    private final int f54669p;

    /* renamed from: q */
    private final int f54670q;

    /* renamed from: r */
    private final int f54671r;

    /* renamed from: s */
    private final int f54672s;

    /* renamed from: t */
    private final GradientDrawable f54673t;

    /* renamed from: u */
    private final C26981b f54674u;

    /* renamed from: v */
    private final DecelerateInterpolator f54675v;

    /* renamed from: w */
    private float f54676w;

    /* renamed from: x */
    private float f54677x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverScrollableRefreshBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        int m134433y = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_refresh_bar_width);
        this.f54669p = m134433y;
        int m134433y2 = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_refresh_bar_height);
        this.f54670q = m134433y2;
        int m134426u = AbstractC26112n.m134426u(this, R.color.white);
        this.f54671r = m134426u;
        int m134426u2 = AbstractC26112n.m134426u(this, AbstractC27406a.zch_control_active);
        this.f54672s = m134426u2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setBounds(0, m134433y2 - m134433y, m134433y, m134433y2);
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(m134426u);
        this.f54673t = gradientDrawable;
        C26981b c26981b = new C26981b(context);
        c26981b.setBounds(0, m134433y2 - m134433y, m134433y, m134433y2);
        c26981b.m139053q(1);
        c26981b.m139049k(m134426u2);
        this.f54674u = c26981b;
        this.f54675v = new DecelerateInterpolator();
        this.f54677x = 1.0f;
    }

    /* renamed from: a */
    public final void m56226a() {
        float m139045g = this.f54674u.m139045g();
        boolean m139043e = this.f54674u.m139043e();
        float m139046h = this.f54674u.m139046h();
        float m139044f = this.f54674u.m139044f();
        this.f54674u.stop();
        this.f54674u.m139047i(m139043e);
        this.f54674u.m139050l(m139045g);
        this.f54674u.m139051o(m139046h, m139044f);
        this.f54677x -= 0.001f;
    }

    /* renamed from: b */
    public final boolean m56227b() {
        return this.f54674u.isRunning();
    }

    /* renamed from: c */
    public final boolean m56228c(float f11, int i11) {
        if (!m56227b() && this.f54677x >= 1.0f) {
            if (AbstractC26112n.m134380U(this)) {
                if (f11 >= 1.0f) {
                    if (i11 == 0) {
                        this.f54674u.start();
                        invalidate();
                        return true;
                    }
                    this.f54676w = f11;
                    invalidate();
                } else if (f11 >= 0.001f) {
                    this.f54676w = f11;
                    invalidate();
                } else {
                    AbstractC26112n.m134374O(this);
                }
            } else if (i11 == 1 && f11 >= 0.001f) {
                this.f54676w = f11;
                AbstractC26112n.m134431w0(this);
                invalidate();
            }
        }
        return false;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        int i11 = 255;
        if (m56227b()) {
            this.f54673t.draw(canvas);
            this.f54674u.setAlpha(255);
            this.f54674u.draw(canvas);
            invalidate();
            return;
        }
        float f11 = this.f54677x;
        if (f11 >= 1.0f) {
            float interpolation = (this.f54675v.getInterpolation(Math.min(this.f54676w, 1.0f)) - 1.0f) * this.f54670q;
            float f12 = this.f54676w;
            float f13 = ((0.3f * f12) + 0.75f) % 1.0f;
            float min = Math.min(f12 * 0.75f, 0.8f);
            if (this.f54676w < 1.0f) {
                i11 = 127;
            }
            canvas.save();
            canvas.translate(0.0f, interpolation);
            this.f54673t.draw(canvas);
            this.f54674u.m139050l(f13);
            this.f54674u.m139051o(0.0f, min);
            this.f54674u.m139047i(true);
            this.f54674u.m139048j(min);
            this.f54674u.setAlpha(i11);
            this.f54674u.draw(canvas);
            canvas.restore();
            return;
        }
        if (f11 >= 0.0f) {
            canvas.save();
            float f14 = this.f54677x;
            int i12 = this.f54669p;
            canvas.scale(f14, f14, i12 / 2.0f, this.f54670q - (i12 / 2.0f));
            this.f54673t.draw(canvas);
            this.f54674u.draw(canvas);
            canvas.restore();
            this.f54677x -= 0.1f;
            invalidate();
            return;
        }
        this.f54677x = 1.0f;
        AbstractC26112n.m134374O(this);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        AbstractC26112n.m134374O(this);
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        setMeasuredDimension(this.f54669p, this.f54670q);
    }
}
