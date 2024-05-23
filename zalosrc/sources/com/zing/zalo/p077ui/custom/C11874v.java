package com.zing.zalo.p077ui.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.zing.zalo.p077ui.widget.C13641h;
import com.zing.zalo.p077ui.widget.C13687m;
import kd0.C21693c;

/* renamed from: com.zing.zalo.ui.custom.v */
/* loaded from: classes5.dex */
public class C11874v extends C21693c {

    /* renamed from: c1 */
    private static RectF f61856c1;

    /* renamed from: d1 */
    private static Paint f61857d1;

    /* renamed from: W0 */
    private C13687m f61858W0;

    /* renamed from: X0 */
    private float f61859X0;

    /* renamed from: Y0 */
    private float f61860Y0;

    /* renamed from: Z0 */
    private int f61861Z0;

    /* renamed from: a1 */
    private int f61862a1;

    /* renamed from: b1 */
    private int f61863b1;

    public C11874v(Context context) {
        super(context);
        this.f61863b1 = 0;
        m65984C1(context);
    }

    /* renamed from: C1 */
    private void m65984C1(Context context) {
        this.f61858W0 = new C13641h(this);
        f61856c1 = new RectF();
        Paint paint = new Paint(1);
        f61857d1 = paint;
        paint.setColor(Integer.MIN_VALUE);
        f61857d1.setStyle(Paint.Style.FILL);
    }

    /* renamed from: B1 */
    public int m65985B1() {
        return this.f61863b1;
    }

    /* renamed from: D1 */
    public void m65986D1(int i11) {
        C13687m c13687m = this.f61858W0;
        if (c13687m != null) {
            c13687m.m76416k(i11);
        }
    }

    /* renamed from: E1 */
    public void m65987E1(int i11) {
        this.f61863b1 = i11;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kd0.C21693c, com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        super.mo44775o0(canvas);
        try {
            if (this.f61863b1 == 1) {
                f61856c1.set(0.0f, 0.0f, this.f61861Z0, this.f61862a1);
                canvas.drawRoundRect(f61856c1, 0.0f, 0.0f, f61857d1);
                canvas.save();
                canvas.translate(this.f61859X0, this.f61860Y0);
                this.f61858W0.m76410b(canvas);
                canvas.restore();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // kd0.C21693c, com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        super.mo44180q0(i11, i12, i13, i14);
        try {
            this.f61861Z0 = i11 + m89106L().f84716l + m89106L().f84718n;
            this.f61862a1 = i13 + m89106L().f84717m + m89106L().f84719o;
            this.f61859X0 = (this.f61861Z0 / 2) - this.f61858W0.m76413g();
            this.f61860Y0 = (this.f61862a1 / 2) - this.f61858W0.m76413g();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
