package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes4.dex */
public class SegmentProgressBar extends View {

    /* renamed from: p */
    private float f45115p;

    /* renamed from: q */
    private float f45116q;

    /* renamed from: r */
    private float f45117r;

    /* renamed from: s */
    private final Paint f45118s;

    /* renamed from: t */
    private int f45119t;

    /* renamed from: u */
    private int f45120u;

    public SegmentProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45115p = 1.0f;
        this.f45116q = 0.0f;
        this.f45117r = 0.0f;
        this.f45118s = new Paint();
        this.f45119t = -1;
        this.f45120u = -7829368;
        m44496a();
    }

    /* renamed from: a */
    private void m44496a() {
        this.f45118s.setStyle(Paint.Style.FILL);
        this.f45118s.setColor(this.f45119t);
        setBackgroundColor(this.f45120u);
    }

    /* renamed from: b */
    public void m44497b(float f11) {
        if (f11 < 0.0f) {
            f11 = 0.0f;
        } else if (f11 > 100.0f) {
            f11 = 100.0f;
        }
        if (this.f45117r != f11) {
            this.f45117r = f11;
            invalidate();
        }
    }

    /* renamed from: c */
    public void m44498c(boolean z11) {
        float f11 = this.f45116q;
        float f12 = this.f45115p;
        float f13 = 100.0f;
        if (f11 != f12) {
            f13 = (100.0f / f12) * f11;
        }
        m44497b(f13);
        if (z11) {
            invalidate();
        }
    }

    public float getSegmentSize() {
        float f11 = this.f45115p;
        if (f11 > 0.0f) {
            return 100.0f / f11;
        }
        return 100.0f;
    }

    public float getTotalSegment() {
        return this.f45115p;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() * 1.0f;
        float height = getHeight() * 1.0f;
        if (width > 0.0f && height > 0.0f) {
            float f11 = this.f45117r;
            if (f11 != 100.0f) {
                width = (f11 * width) / 100.0f;
            }
            canvas.drawRect(0.0f, 0.0f, width, height, this.f45118s);
        }
    }

    public void setPosition(int i11) {
        if (i11 < 0) {
            i11 = 0;
        } else {
            float f11 = i11;
            float f12 = this.f45115p;
            if (f11 > f12) {
                i11 = (int) f12;
            }
        }
        float f13 = i11;
        if (this.f45116q != f13) {
            this.f45116q = f13;
            m44498c(false);
        }
    }

    public void setProgressBgColor(int i11) {
        if (this.f45120u != i11) {
            this.f45120u = i11;
            setBackgroundColor(i11);
            invalidate();
        }
    }

    public void setProgressColor(int i11) {
        if (this.f45119t != i11) {
            this.f45119t = i11;
            this.f45118s.setColor(i11);
            invalidate();
        }
    }

    public void setTotalSegment(int i11) {
        if (i11 < 1) {
            i11 = 1;
        }
        float f11 = i11;
        if (this.f45115p != f11) {
            this.f45115p = f11;
            m44498c(false);
        }
    }
}
