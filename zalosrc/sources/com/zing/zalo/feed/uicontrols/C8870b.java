package com.zing.zalo.feed.uicontrols;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import l80.C22122a0;

/* renamed from: com.zing.zalo.feed.uicontrols.b */
/* loaded from: classes4.dex */
public class C8870b extends C22122a0 {

    /* renamed from: f1 */
    private float f47385f1;

    /* renamed from: g1 */
    private float f47386g1;

    /* renamed from: h1 */
    private float f47387h1;

    /* renamed from: i1 */
    private int f47388i1;

    /* renamed from: j1 */
    private int f47389j1;

    /* renamed from: k1 */
    private Drawable f47390k1;

    /* renamed from: l1 */
    private boolean f47391l1;

    public C8870b(Context context) {
        super(context);
        this.f47385f1 = 0.0f;
        this.f47386g1 = 0.0f;
        this.f47387h1 = 0.0f;
        this.f47391l1 = false;
    }

    /* renamed from: X1 */
    public void m47326X1(boolean z11) {
        this.f47391l1 = z11;
    }

    /* renamed from: Y1 */
    public void m47327Y1(Drawable drawable) {
        try {
            this.f47390k1 = drawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f47390k1.getIntrinsicHeight());
            }
            invalidate();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Z1 */
    public void m47328Z1(float f11) {
        this.f47386g1 = f11;
        this.f47385f1 = f11;
        this.f47387h1 = f11;
    }

    /* renamed from: a2 */
    public void m47329a2(int i11, int i12) {
        this.f47388i1 = i11;
        this.f47389j1 = i12;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // l80.C22122a0, kd0.C21693c, com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        super.mo44775o0(canvas);
        if (this.f47390k1 != null && this.f47391l1) {
            int m89114P = (m89114P() - this.f47390k1.getIntrinsicWidth()) / 2;
            int m89112O = (m89112O() - this.f47390k1.getIntrinsicHeight()) / 2;
            canvas.save();
            canvas.translate(m89114P, m89112O);
            this.f47390k1.draw(canvas);
            canvas.restore();
        }
    }

    @Override // kd0.C21693c, com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        int i15;
        try {
            if (m111920q1()) {
                int i16 = this.f47388i1;
                if (i16 != 0 && (i15 = this.f47389j1) != 0) {
                    float f11 = i16 / i15;
                    float f12 = this.f47386g1;
                    if (f11 < f12) {
                        this.f47385f1 = f12;
                    } else if (f11 >= f12 && f11 <= this.f47387h1) {
                        this.f47385f1 = f11;
                    } else {
                        this.f47385f1 = this.f47387h1;
                    }
                    int i17 = m89106L().f84716l + i11 + m89106L().f84718n;
                    this.f47388i1 = i17;
                    int i18 = (int) (i17 / this.f47385f1);
                    this.f47389j1 = i18;
                    m89097G0(i17, i18);
                    m111929z1(5);
                    return;
                }
                this.f47385f1 = 1.78f;
                int i172 = m89106L().f84716l + i11 + m89106L().f84718n;
                this.f47388i1 = i172;
                int i182 = (int) (i172 / this.f47385f1);
                this.f47389j1 = i182;
                m89097G0(i172, i182);
                m111929z1(5);
                return;
            }
            super.mo44180q0(i11, i12, i13, i14);
        } catch (Exception e11) {
            e11.printStackTrace();
            super.mo44180q0(i11, i12, i13, i14);
        }
    }
}
