package com.zing.zalo.p077ui.widget.progress;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.p077ui.widget.C13704p1;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* loaded from: classes6.dex */
public class CircularProgress extends View {

    /* renamed from: A */
    boolean f70972A;

    /* renamed from: p */
    Paint f70973p;

    /* renamed from: q */
    float f70974q;

    /* renamed from: r */
    int f70975r;

    /* renamed from: s */
    int f70976s;

    /* renamed from: t */
    float f70977t;

    /* renamed from: u */
    float f70978u;

    /* renamed from: v */
    float f70979v;

    /* renamed from: w */
    RectF f70980w;

    /* renamed from: x */
    TextPaint f70981x;

    /* renamed from: y */
    String f70982y;

    /* renamed from: z */
    StaticLayout f70983z;

    public CircularProgress(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70973p = new Paint(1);
        this.f70974q = AbstractC23136l9.m118742r(2.0f);
        this.f70975r = Color.parseColor("#ff848c94");
        this.f70976s = Color.parseColor("#fff8f8f8");
        this.f70977t = 0.0f;
        this.f70978u = -90.0f;
        this.f70979v = 0.0f;
        this.f70980w = new RectF();
        this.f70981x = new C13704p1(1);
        this.f70982y = null;
        this.f70972A = false;
        m76679a();
    }

    /* renamed from: a */
    void m76679a() {
        this.f70973p.setStyle(Paint.Style.STROKE);
        this.f70981x.setColor(C23212s8.m119607o(getContext(), AbstractC16781w.ChatTextColor1));
        this.f70981x.setTextSize(AbstractC23136l9.m118742r(16.0f));
    }

    /* renamed from: b */
    public void m76680b(float f11, String str) {
        this.f70977t = f11;
        if (f11 < 0.0f) {
            this.f70977t = 0.0f;
        }
        if (this.f70977t > 1.0f) {
            this.f70977t = 1.0f;
        }
        this.f70979v = this.f70977t * 360.0f;
        if (!TextUtils.equals(str, this.f70982y)) {
            this.f70982y = str;
            if (TextUtils.isEmpty(str)) {
                this.f70983z = null;
            } else {
                this.f70983z = new StaticLayout(this.f70982y, this.f70981x, (int) this.f70981x.measureText(this.f70982y), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
        }
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i11;
        int i12;
        super.onDraw(canvas);
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        float f11 = this.f70974q / 2.0f;
        this.f70980w.set(f11, f11, width - f11, height - f11);
        this.f70973p.setStrokeWidth(this.f70974q);
        Paint paint = this.f70973p;
        if (this.f70972A) {
            i11 = this.f70976s;
        } else {
            i11 = this.f70975r;
        }
        paint.setColor(i11);
        canvas.drawArc(this.f70980w, this.f70978u, this.f70979v, false, this.f70973p);
        Paint paint2 = this.f70973p;
        if (this.f70972A) {
            i12 = this.f70975r;
        } else {
            i12 = this.f70976s;
        }
        paint2.setColor(i12);
        float f12 = this.f70978u;
        float f13 = this.f70979v;
        canvas.drawArc(this.f70980w, f12 + f13, 360.0f - f13, false, this.f70973p);
        if (this.f70983z != null) {
            canvas.save();
            canvas.translate((width - this.f70983z.getWidth()) / 2.0f, (height - this.f70983z.getHeight()) / 2.0f);
            this.f70983z.draw(canvas);
            canvas.restore();
        }
    }

    public void setCountDown(boolean z11) {
        this.f70972A = z11;
    }

    public void setStrokeWidth(float f11) {
        this.f70974q = f11;
        invalidate();
    }

    public CircularProgress(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f70973p = new Paint(1);
        this.f70974q = AbstractC23136l9.m118742r(2.0f);
        this.f70975r = Color.parseColor("#ff848c94");
        this.f70976s = Color.parseColor("#fff8f8f8");
        this.f70977t = 0.0f;
        this.f70978u = -90.0f;
        this.f70979v = 0.0f;
        this.f70980w = new RectF();
        this.f70981x = new C13704p1(1);
        this.f70982y = null;
        this.f70972A = false;
        m76679a();
    }
}
