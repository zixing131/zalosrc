package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import kd0.C21693c;
import me0.AbstractC23136l9;

/* renamed from: com.zing.zalo.feed.components.o */
/* loaded from: classes4.dex */
public class C8345o extends C21693c {

    /* renamed from: W0 */
    boolean f45540W0;

    /* renamed from: X0 */
    Paint f45541X0;

    /* renamed from: Y0 */
    int f45542Y0;

    /* renamed from: Z0 */
    int f45543Z0;

    /* renamed from: a1 */
    int f45544a1;

    /* renamed from: b1 */
    int f45545b1;

    /* renamed from: c1 */
    int f45546c1;

    public C8345o(Context context) {
        super(context);
        this.f45542Y0 = Color.parseColor("#99000000");
        this.f45543Z0 = Color.parseColor("#80ffffff");
        this.f45544a1 = AbstractC23136l9.m118641B(getContext(), AbstractC16801x.white);
        this.f45545b1 = AbstractC23136l9.m118742r(1.5f);
        this.f45546c1 = 0;
        this.f45541X0 = new Paint(1);
    }

    /* renamed from: B1 */
    int m44788B1() {
        if (this.f45546c1 < 0) {
            this.f45546c1 = 0;
        }
        if (this.f45546c1 > 100) {
            this.f45546c1 = 100;
        }
        return (this.f45546c1 * 360) / 100;
    }

    /* renamed from: C1 */
    public void m44789C1(boolean z11) {
        int i11;
        this.f45540W0 = z11;
        Context context = getContext();
        if (this.f45540W0) {
            i11 = AbstractC16803z.icn_profile_music_pause_white;
        } else {
            i11 = AbstractC16803z.icn_profile_music_play_white;
        }
        mo111925v1(AbstractC23136l9.m118665N(context, i11));
        invalidate();
    }

    /* renamed from: D1 */
    public void m44790D1(int i11) {
        if (i11 < 0) {
            i11 = 0;
        }
        if (i11 > 100) {
            i11 = 100;
        }
        this.f45546c1 = i11;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kd0.C21693c, com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        int i11;
        try {
            int m89114P = m89114P();
            int m89112O = m89112O();
            int min = Math.min(m89114P, m89112O);
            int i12 = min / 2;
            int i13 = 0;
            if (m89114P > m89112O) {
                i11 = (m89114P - min) / 2;
            } else {
                i11 = 0;
            }
            if (m89112O > m89114P) {
                i13 = (m89112O - min) / 2;
            }
            float f11 = min;
            RectF rectF = new RectF(0.0f, 0.0f, f11, f11);
            canvas.save();
            this.f45541X0.setColor(this.f45542Y0);
            this.f45541X0.setStyle(Paint.Style.FILL);
            float f12 = i11;
            float f13 = i13;
            canvas.translate(f12, f13);
            float f14 = i12;
            canvas.drawCircle(f14, f14, f14, this.f45541X0);
            canvas.restore();
            if (this.f45540W0) {
                this.f45541X0.setStyle(Paint.Style.STROKE);
                this.f45541X0.setStrokeWidth(this.f45545b1);
                canvas.save();
                this.f45541X0.setColor(this.f45543Z0);
                canvas.translate(f12, f13);
                canvas.drawArc(rectF, 0.0f, 360.0f, false, this.f45541X0);
                canvas.restore();
                canvas.save();
                this.f45541X0.setColor(this.f45544a1);
                canvas.translate(f12, f13);
                canvas.drawArc(rectF, 270.0f, m44788B1(), false, this.f45541X0);
                canvas.restore();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo44775o0(canvas);
    }
}
