package com.zing.zalo.p077ui.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.view.MotionEvent;
import java.util.Arrays;
import l80.C22122a0;
import me0.AbstractC23136l9;

/* renamed from: com.zing.zalo.ui.custom.a */
/* loaded from: classes5.dex */
public class C11850a extends C22122a0 {

    /* renamed from: f1 */
    private float f61717f1;

    /* renamed from: g1 */
    private boolean f61718g1;

    /* renamed from: h1 */
    private int f61719h1;

    /* renamed from: i1 */
    private int f61720i1;

    /* renamed from: j1 */
    private int f61721j1;

    /* renamed from: k1 */
    private int f61722k1;

    /* renamed from: l1 */
    private int f61723l1;

    /* renamed from: m1 */
    private int f61724m1;

    /* renamed from: n1 */
    private int f61725n1;

    /* renamed from: o1 */
    private boolean f61726o1;

    /* renamed from: p1 */
    private int f61727p1;

    /* renamed from: q1 */
    private Paint f61728q1;

    /* renamed from: r1 */
    private int f61729r1;

    /* renamed from: s1 */
    private int f61730s1;

    /* renamed from: t1 */
    private int f61731t1;

    /* renamed from: u1 */
    private RectF f61732u1;

    /* renamed from: v1 */
    private int[] f61733v1;

    /* renamed from: w1 */
    private boolean f61734w1;

    /* renamed from: x1 */
    private int f61735x1;

    public C11850a(Context context) {
        super(context);
        this.f61717f1 = -1.0f;
        this.f61719h1 = 0;
        this.f61720i1 = 1;
        this.f61721j1 = 0;
        this.f61722k1 = -1;
        this.f61723l1 = -1;
        this.f61725n1 = 5;
        this.f61726o1 = false;
        this.f61727p1 = 1140850688;
        this.f61733v1 = new int[]{0, -16538118};
        m65861X1();
    }

    /* renamed from: X1 */
    private void m65861X1() {
        try {
            this.f61731t1 = 0;
            this.f61729r1 = AbstractC23136l9.m118742r(25.0f);
            this.f61730s1 = AbstractC23136l9.m118742r(25.0f);
            this.f61732u1 = new RectF(0.0f, 0.0f, this.f61729r1, this.f61730s1);
            Paint paint = new Paint(1);
            this.f61728q1 = paint;
            paint.setStyle(Paint.Style.STROKE);
            int m118742r = AbstractC23136l9.m118742r(3.0f);
            this.f61735x1 = m118742r;
            this.f61728q1.setStrokeWidth(m118742r);
            m65863g2();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Y1 */
    private void m65862Y1(int i11, int i12) {
        int min = Math.min(i11, i12) / 2;
        if (this.f61729r1 > min || this.f61730s1 > min) {
            m65865a2(min, min);
        }
    }

    /* renamed from: g2 */
    private void m65863g2() {
        try {
            SweepGradient sweepGradient = new SweepGradient(this.f61729r1 / 2, this.f61730s1 / 2, this.f61733v1, (float[]) null);
            Paint paint = this.f61728q1;
            if (paint != null) {
                paint.setShader(sweepGradient);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Z1 */
    public void m65864Z1(int[] iArr) {
        try {
            if (!Arrays.equals(this.f61733v1, iArr)) {
                this.f61733v1 = iArr;
                m65863g2();
                invalidate();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a2 */
    public void m65865a2(int i11, int i12) {
        try {
            if (this.f61729r1 == i11 && this.f61730s1 == i12) {
                return;
            }
            this.f61729r1 = i11;
            this.f61730s1 = i12;
            this.f61732u1 = new RectF(0.0f, 0.0f, i11, i12);
            m65863g2();
            requestLayout();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b2 */
    public void m65866b2(int i11) {
        if (this.f61719h1 != i11) {
            this.f61719h1 = i11;
            requestLayout();
        }
    }

    /* renamed from: c2 */
    public void m65867c2(int i11) {
        if (this.f61720i1 != i11) {
            this.f61720i1 = i11;
            requestLayout();
        }
    }

    /* renamed from: d2 */
    public void m65868d2(float f11) {
        if (this.f61717f1 != f11) {
            this.f61717f1 = f11;
            requestLayout();
        }
    }

    /* renamed from: e2 */
    public void m65869e2(int i11) {
        if (this.f61724m1 != i11) {
            this.f61724m1 = i11;
            requestLayout();
        }
    }

    /* renamed from: f2 */
    public void m65870f2(boolean z11) {
        this.f61734w1 = z11;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // l80.C22122a0, kd0.C21693c, com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        super.mo44775o0(canvas);
        try {
            if (this.f61734w1 && this.f61729r1 > 0 && this.f61730s1 > 0) {
                canvas.save();
                canvas.translate((m89114P() / 2) - (this.f61729r1 / 2), (m89112O() / 2) - (this.f61730s1 / 2));
                canvas.rotate(this.f61731t1, this.f61729r1 / 2, this.f61730s1 / 2);
                canvas.drawArc(this.f61732u1, 0.0f, 360.0f, false, this.f61728q1);
                this.f61731t1 = (this.f61731t1 + 5) % 360;
                invalidate();
                canvas.restore();
            } else {
                this.f61731t1 = 0;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f61734w1 = false;
            invalidate();
        }
    }

    @Override // kd0.C21693c, com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        if (m111920q1()) {
            this.f61722k1 = m89106L().f84716l + i11 + m89106L().f84718n;
            this.f61723l1 = m89106L().f84717m + i13 + m89106L().f84719o;
            if (this.f61719h1 <= 0) {
                this.f61719h1 = this.f61722k1;
            }
            try {
                int m111917m1 = m111917m1();
                int m111916l1 = m111916l1();
                float f11 = -1.0f;
                float f12 = 1.2f;
                switch (this.f61724m1) {
                    case 0:
                        if (m111917m1 > 0) {
                            this.f61723l1 = (this.f61722k1 * m111916l1) / m111917m1;
                        } else {
                            this.f61723l1 = this.f61722k1;
                        }
                        m111929z1(0);
                        break;
                    case 1:
                        this.f61723l1 = this.f61722k1;
                        m111929z1(5);
                        break;
                    case 2:
                        if (m111917m1 > 0) {
                            this.f61723l1 = (this.f61722k1 * m111916l1) / m111917m1;
                        } else {
                            this.f61723l1 = this.f61722k1;
                        }
                        m111929z1(0);
                        int i15 = this.f61723l1;
                        int i16 = this.f61722k1;
                        if (i15 > i16) {
                            this.f61723l1 = i16;
                            m111929z1(5);
                            break;
                        }
                        break;
                    case 3:
                        float f13 = this.f61717f1;
                        if (f13 > 0.0f) {
                            if (f13 < 0.25f) {
                                f12 = 0.25f;
                            } else if (f13 <= 1.2f) {
                                f12 = f13;
                            }
                            this.f61723l1 = (int) (this.f61722k1 * f12);
                        } else {
                            this.f61723l1 = this.f61722k1;
                        }
                        m111929z1(5);
                        break;
                    case 4:
                        float f14 = this.f61717f1;
                        if (f14 > 0.0f) {
                            f11 = f14;
                        } else if (m111917m1 > 0 && m111916l1 > 0) {
                            f11 = (m111916l1 * 1.0f) / m111917m1;
                        }
                        if (f11 > 0.0f) {
                            int i17 = (int) (this.f61722k1 * f11);
                            this.f61723l1 = i17;
                            int i18 = this.f61719h1;
                            if (i17 > i18) {
                                this.f61723l1 = i18;
                                this.f61722k1 = (int) (i18 / f11);
                            }
                            this.f61722k1 = Math.max(this.f61722k1, this.f61721j1);
                            this.f61723l1 = Math.max(this.f61723l1, this.f61720i1);
                            m111929z1(3);
                            break;
                        } else {
                            this.f61723l1 = this.f61722k1;
                            m111929z1(5);
                            break;
                        }
                    case 5:
                        float f15 = this.f61717f1;
                        if (f15 > 0.0f) {
                            f11 = f15;
                        } else if (m111917m1 > 0 && m111916l1 > 0) {
                            f11 = (m111916l1 * 1.0f) / m111917m1;
                        }
                        if (f11 > 0.0f) {
                            this.f61722k1 = (int) (this.f61723l1 / f11);
                        } else {
                            this.f61722k1 = this.f61723l1;
                        }
                        m111929z1(0);
                        break;
                    case 6:
                        float f16 = this.f61717f1;
                        if (f16 > 0.0f) {
                            m111929z1(this.f61725n1);
                            this.f61723l1 = (int) (this.f61722k1 * f16);
                            break;
                        } else {
                            this.f61723l1 = this.f61722k1;
                            m111929z1(5);
                            break;
                        }
                    case 7:
                        float f17 = this.f61717f1;
                        if (f17 > 0.0f) {
                            if (f17 > 1.2f) {
                                this.f61723l1 = (int) (this.f61722k1 * 1.2f);
                            } else {
                                int i19 = (int) (this.f61722k1 * f17);
                                this.f61723l1 = i19;
                                this.f61723l1 = Math.max(i19, this.f61720i1);
                            }
                        } else {
                            this.f61723l1 = this.f61722k1;
                        }
                        int i21 = this.f61719h1;
                        if (i21 > 0 && this.f61723l1 > i21) {
                            this.f61723l1 = i21;
                        }
                        m111929z1(5);
                        break;
                }
                int i22 = (this.f61722k1 - m89106L().f84716l) - m89106L().f84718n;
                int i23 = (this.f61723l1 - m89106L().f84717m) - m89106L().f84719o;
                if (this.f61718g1) {
                    m65862Y1(i11, i13);
                    super.mo44180q0(i11, i12, i13, i14);
                    return;
                } else {
                    m65862Y1(this.f61722k1, this.f61723l1);
                    m89097G0(i22, i23);
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                m65862Y1(this.f61722k1, this.f61723l1);
                m89097G0(i11, i13);
                return;
            }
        }
        m65862Y1(i11, i13);
        super.mo44180q0(i11, i12, i13, i14);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: t0 */
    public boolean mo65871t0(MotionEvent motionEvent) {
        try {
            if (this.f61726o1) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 4) {
                            m111922s1(0, PorterDuff.Mode.SRC_OVER);
                        }
                    } else {
                        m111922s1(0, PorterDuff.Mode.SRC_OVER);
                    }
                } else {
                    m111922s1(this.f61727p1, PorterDuff.Mode.SRC_OVER);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return super.mo65871t0(motionEvent);
    }
}
