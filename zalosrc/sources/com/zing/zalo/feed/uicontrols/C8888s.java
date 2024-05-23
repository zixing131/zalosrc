package com.zing.zalo.feed.uicontrols;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;

/* renamed from: com.zing.zalo.feed.uicontrols.s */
/* loaded from: classes4.dex */
public class C8888s extends C16716d {

    /* renamed from: M0 */
    private final boolean f47541M0;

    /* renamed from: N0 */
    public int f47542N0;

    /* renamed from: O0 */
    public boolean f47543O0;

    /* renamed from: P0 */
    public int f47544P0;

    /* renamed from: Q0 */
    public int f47545Q0;

    /* renamed from: R0 */
    public Bitmap f47546R0;

    /* renamed from: S0 */
    private int f47547S0;

    /* renamed from: T0 */
    private int f47548T0;

    /* renamed from: U0 */
    private final Paint f47549U0;

    /* renamed from: V0 */
    private final RectF f47550V0;

    /* renamed from: W0 */
    private int f47551W0;

    /* renamed from: X0 */
    private int f47552X0;

    /* renamed from: Y0 */
    private int f47553Y0;

    /* renamed from: Z0 */
    private C16719g f47554Z0;

    /* renamed from: a1 */
    private C16719g f47555a1;

    public C8888s(Context context) {
        super(context);
        this.f47541M0 = false;
        this.f47543O0 = false;
        this.f47549U0 = new Paint();
        this.f47550V0 = new RectF();
        this.f47551W0 = 0;
        this.f47552X0 = 0;
        m47434q1(context);
    }

    /* renamed from: o1 */
    private void m47432o1(Canvas canvas) {
        int m89114P = m89114P();
        int m89112O = m89112O();
        int i11 = this.f47542N0;
        int i12 = m89112O / 2;
        this.f47549U0.setAntiAlias(true);
        Paint paint = this.f47549U0;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f47549U0.setColor(this.f47544P0);
        this.f47549U0.setStrokeWidth(this.f47553Y0);
        Paint paint2 = this.f47549U0;
        paint2.setFlags(paint2.getFlags() | 1);
        if (this.f47551W0 == 1) {
            float f11 = i12;
            canvas.drawLine((this.f47542N0 * 2) + this.f47552X0, f11, m89114P, f11, this.f47549U0);
        }
        if (this.f47546R0 != null) {
            this.f47549U0.setStrokeWidth(0.0f);
            this.f47549U0.setColor(this.f47545Q0);
            int i13 = this.f47542N0;
            float f12 = i11 - i13;
            float f13 = i12 - i13;
            this.f47550V0.set(f12, f13, (i13 * 2) + f12, (i13 * 2) + f13);
            try {
                Bitmap bitmap = this.f47546R0;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, this.f47550V0, this.f47549U0);
                    return;
                }
                return;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        this.f47549U0.setStyle(style);
        this.f47549U0.setColor(this.f47544P0);
        this.f47549U0.setStrokeWidth(0.0f);
        float f14 = i11;
        float f15 = i12;
        canvas.drawCircle(f14, f15, f14, this.f47549U0);
        this.f47549U0.setColor(this.f47545Q0);
        canvas.drawCircle(f14, f15, i11 - this.f47548T0, this.f47549U0);
    }

    /* renamed from: p1 */
    private void m47433p1(Canvas canvas) {
        int m89114P = m89114P();
        int m89112O = m89112O();
        int i11 = this.f47542N0;
        this.f47549U0.setAntiAlias(true);
        this.f47549U0.setStyle(Paint.Style.STROKE);
        this.f47549U0.setColor(this.f47544P0);
        this.f47549U0.setStrokeWidth(this.f47547S0);
        Paint paint = this.f47549U0;
        paint.setFlags(paint.getFlags() | 1);
        float f11 = i11;
        float f12 = m89112O / 2;
        canvas.drawCircle(f11, f12, f11, this.f47549U0);
        this.f47549U0.setStrokeWidth(this.f47553Y0);
        if (this.f47551W0 == 1) {
            canvas.drawLine((this.f47542N0 * 2) + this.f47552X0, f12, m89114P, f12, this.f47549U0);
        }
    }

    /* renamed from: q1 */
    private void m47434q1(Context context) {
        this.f47547S0 = AbstractC23136l9.m118742r(2.0f);
        this.f47553Y0 = AbstractC23136l9.m118742r(1.0f);
        this.f47548T0 = AbstractC23136l9.m118742r(2.0f);
        this.f47544P0 = AbstractC23136l9.m118641B(this.f84786r, AbstractC16801x.cProfileDotStroke);
        this.f47545Q0 = AbstractC23136l9.m118641B(this.f84786r, AbstractC16801x.cProfileDot);
        this.f47554Z0 = new C16719g(this.f84786r);
        this.f47555a1 = new C16719g(this.f84786r);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        System.currentTimeMillis();
        try {
            if (this.f47543O0) {
                m47432o1(canvas);
            } else {
                m47433p1(canvas);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: r1 */
    public void m47435r1() {
        if (this.f47551W0 == 2) {
            C16718f m89106L = this.f47554Z0.m89106L();
            int i11 = this.f47542N0;
            m89106L.m89028L(i11 * 2, i11 * 2).m89027K(true);
            m89001g1(this.f47554Z0);
            this.f47555a1.m89106L().m89028L(this.f47553Y0, -1).m89023G(this.f47554Z0).m89036T(this.f47552X0).m89034R(this.f47542N0);
            this.f47555a1.mo89161z0(this.f47544P0);
            m89001g1(this.f47555a1);
        }
    }

    /* renamed from: s1 */
    public void m47436s1(int i11) {
        this.f47552X0 = i11;
    }

    /* renamed from: t1 */
    public void m47437t1(int i11) {
        this.f47551W0 = i11;
    }
}
