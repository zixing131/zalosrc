package com.zing.zalo.shortvideo.p072ui.widget.seek;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.graphics.AbstractC1409d;
import com.zing.zalo.shortvideo.p072ui.widget.seek.SeekBar;
import fn0.AbstractC19074t;
import hn0.AbstractC20104d;
import pm0.C24848g0;
import s20.AbstractC26112n;
import v00.AbstractC27406a;
import v00.AbstractC27407b;

/* loaded from: classes5.dex */
public final class VideoSeekBar extends SeekBar {

    /* renamed from: A */
    private int f54690A;

    /* renamed from: B */
    private int f54691B;

    /* renamed from: C */
    private int f54692C;

    /* renamed from: D */
    private float f54693D;

    /* renamed from: E */
    private boolean f54694E;

    /* renamed from: F */
    private InterfaceC10842a f54695F;

    /* renamed from: G */
    private boolean f54696G;

    /* renamed from: H */
    private long f54697H;

    /* renamed from: x */
    private final Paint f54698x;

    /* renamed from: y */
    private int f54699y;

    /* renamed from: z */
    private int f54700z;

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.seek.VideoSeekBar$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC10842a {
        /* renamed from: a */
        int mo54685a();

        /* renamed from: b */
        int mo54686b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f54698x = new Paint(1);
        this.f54699y = AbstractC26112n.m134426u(this, AbstractC27406a.zch_divider_inverse);
        this.f54700z = AbstractC26112n.m134426u(this, AbstractC27406a.zch_icon_tertiary);
        this.f54690A = AbstractC26112n.m134426u(this, AbstractC27406a.zch_icon_primary);
        this.f54691B = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_video_seek_bar_thumb_radius);
        this.f54692C = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_video_seek_bar_thickness);
    }

    private final float getBarThickness() {
        if (!m56229a()) {
            return this.f54692C / 3.0f;
        }
        return this.f54692C * ((this.f54693D * 1.0f) + 1.0f);
    }

    private final int getThumbColor() {
        return AbstractC1409d.m7135d(this.f54700z, this.f54690A, this.f54693D);
    }

    private final float getThumbRadius() {
        return this.f54691B * ((this.f54693D * 1.75f) + 1.0f);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.widget.seek.SeekBar
    /* renamed from: c */
    protected void mo56231c(MotionEvent motionEvent) {
        int m104529e;
        AbstractC19074t.m100208f(motionEvent, "event");
        m104529e = AbstractC20104d.m104529e(getMinProgress() + ((((motionEvent.getX() - getPaddingStart()) - getThumbRadius()) / (getValidWidth() - (2 * getThumbRadius()))) * (getMaxProgress() - getMinProgress())));
        int min = Math.min(Math.max(m104529e, getMinProgress()), getMaxProgress());
        if (getCurProgress() != min) {
            setCurProgress(min);
            SeekBar.InterfaceC10841a listener = getListener();
            if (listener != null) {
                listener.mo54689a(this, getCurProgress(), true);
            }
            invalidate();
        }
    }

    /* renamed from: d */
    public final boolean m56232d() {
        return this.f54694E;
    }

    /* renamed from: e */
    public final void m56233e() {
        setMaxProgress(100);
        setMinProgress(0);
        setCurProgress(0);
        setTouchable(false);
        this.f54694E = false;
        this.f54693D = 0.0f;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        InterfaceC10842a interfaceC10842a;
        AbstractC19074t.m100208f(canvas, "canvas");
        float paddingLeft = getPaddingLeft();
        float width = getWidth() - getPaddingRight();
        float paddingTop = (getPaddingTop() + (AbstractC26112n.m134428v(this) / 2.0f)) - (getBarThickness() / 2.0f);
        float thumbRadius = getThumbRadius();
        float validWidth = getValidWidth();
        this.f54698x.setStrokeWidth(getBarThickness());
        Paint paint = this.f54698x;
        paint.setColor(this.f54699y);
        C24848g0 c24848g0 = C24848g0.f119245a;
        canvas.drawLine(paddingLeft, paddingTop, width, paddingTop, paint);
        if (m56229a()) {
            width = getPaddingLeft() + thumbRadius + ((validWidth - (2 * thumbRadius)) * getPercentage());
            Paint paint2 = this.f54698x;
            paint2.setColor(getThumbColor());
            canvas.drawLine(paddingLeft, paddingTop, width, paddingTop, paint2);
            canvas.drawCircle(width, paddingTop, thumbRadius, this.f54698x);
        }
        if (this.f54696G && !m56230b() && (interfaceC10842a = this.f54695F) != null) {
            int mo54685a = interfaceC10842a.mo54685a();
            if (getCurProgress() != mo54685a) {
                setCurProgress(mo54685a);
            }
            int mo54686b = interfaceC10842a.mo54686b();
            if (getMaxProgress() != mo54686b) {
                setMaxProgress(mo54686b);
            }
            float f11 = validWidth - (2 * thumbRadius);
            if (Math.abs(((getPaddingLeft() + thumbRadius) + (getPercentage() * f11)) - width) >= 1.0f) {
                long currentTimeMillis = System.currentTimeMillis() - this.f54697H;
                long j11 = 16;
                if (currentTimeMillis >= j11) {
                    this.f54697H = System.currentTimeMillis();
                    invalidate();
                } else {
                    postInvalidateDelayed(j11 - currentTimeMillis);
                }
            } else {
                if (((((width + 1) - (getPaddingLeft() + thumbRadius)) * (getMaxProgress() - getMinProgress())) / f11) + getMinProgress() < getMaxProgress()) {
                    postInvalidateDelayed(Math.max(0L, r7 - getCurProgress()));
                }
            }
        }
        if (this.f54694E) {
            float f12 = this.f54693D;
            if (f12 < 1.0f) {
                this.f54693D = f12 + 0.1f;
                invalidate();
                return;
            }
            return;
        }
        float f13 = this.f54693D;
        if (f13 > 0.0f) {
            this.f54693D = f13 - 0.1f;
            invalidate();
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.widget.seek.SeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.f54696G && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1)) {
            postInvalidateDelayed(16L);
        }
        return onTouchEvent;
    }

    public final void setHighlight(boolean z11) {
        this.f54694E = z11;
        invalidate();
    }

    public final void setProgressProvider(InterfaceC10842a interfaceC10842a) {
        AbstractC19074t.m100208f(interfaceC10842a, "progressProvider");
        this.f54695F = interfaceC10842a;
    }

    public final void setSmoother(boolean z11) {
        this.f54696G = z11;
        invalidate();
    }
}
