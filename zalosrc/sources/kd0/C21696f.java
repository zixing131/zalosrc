package kd0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.zing.zalo.uidrawing.C16719g;
import hd0.AbstractC20006d;
import p193h0.AbstractC19694b;

/* renamed from: kd0.f */
/* loaded from: classes4.dex */
public class C21696f extends C16719g {

    /* renamed from: R0 */
    private static final int f105346R0;

    /* renamed from: S0 */
    private static final int f105347S0;

    /* renamed from: D0 */
    private int f105348D0;

    /* renamed from: E0 */
    private float f105349E0;

    /* renamed from: F0 */
    private RectF f105350F0;

    /* renamed from: G0 */
    private Paint f105351G0;

    /* renamed from: H0 */
    private Paint f105352H0;

    /* renamed from: I0 */
    private Drawable f105353I0;

    /* renamed from: J0 */
    private Drawable f105354J0;

    /* renamed from: K0 */
    private float f105355K0;

    /* renamed from: L0 */
    private int f105356L0;

    /* renamed from: M0 */
    private boolean f105357M0;

    /* renamed from: N0 */
    private long f105358N0;

    /* renamed from: O0 */
    private float f105359O0;

    /* renamed from: P0 */
    private float f105360P0;

    /* renamed from: Q0 */
    private float f105361Q0;

    static {
        int i11 = (int) (Resources.getSystem().getDisplayMetrics().density * 30.0f);
        f105346R0 = i11;
        f105347S0 = (int) (i11 * 1.6666666f);
    }

    public C21696f(Context context) {
        super(context);
        this.f105356L0 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        m111946i1();
    }

    /* renamed from: g1 */
    private float m111944g1() {
        return this.f105359O0;
    }

    /* renamed from: h1 */
    private boolean m111945h1() {
        if (m111944g1() > 0.5f) {
            return true;
        }
        return false;
    }

    /* renamed from: i1 */
    private void m111946i1() {
        this.f105350F0 = new RectF();
        Paint paint = new Paint(1);
        this.f105351G0 = paint;
        paint.setColor(1714005503);
        Paint paint2 = new Paint(1);
        this.f105352H0 = paint2;
        paint2.setColor(1723710909);
        if (m89141i0()) {
            this.f105359O0 = 1.0f;
            this.f105360P0 = 1.0f;
        } else {
            this.f105359O0 = 0.0f;
            this.f105360P0 = 0.0f;
        }
    }

    /* renamed from: k1 */
    private void m111947k1(float f11) {
        if (f11 > 1.0f) {
            f11 = 1.0f;
        } else if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (this.f105359O0 == f11) {
            return;
        }
        this.f105359O0 = f11;
        invalidate();
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: D0 */
    public void mo89091D0(boolean z11) {
        m111948j1(z11, false);
    }

    /* renamed from: j1 */
    public void m111948j1(boolean z11, boolean z12) {
        float f11;
        super.mo89091D0(z11);
        this.f105360P0 = this.f105359O0;
        if (z11) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        m111947k1(f11);
        if (z12 && this.f105360P0 != this.f105359O0) {
            this.f105358N0 = System.currentTimeMillis();
        } else {
            this.f105358N0 = 0L;
        }
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: n */
    public boolean mo89149n() {
        if (!super.mo89149n() && (!this.f84777k0 || !m89143j0())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        boolean z11;
        Paint paint;
        Drawable drawable;
        float f11;
        super.mo44775o0(canvas);
        int i11 = m89106L().f84716l;
        int i12 = m89106L().f84717m;
        if (i11 == 0 && i12 == 0) {
            z11 = false;
        } else {
            canvas.save();
            canvas.translate(i11, i12);
            z11 = true;
        }
        boolean m89141i0 = m89141i0();
        if (this.f105358N0 > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f105358N0;
            if (m89141i0) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            if (currentTimeMillis < 100) {
                float f12 = this.f105360P0;
                this.f105359O0 = f12 + ((((float) currentTimeMillis) / 100.0f) * (f11 - f12));
                invalidate();
            } else {
                this.f105359O0 = f11;
                this.f105358N0 = 0L;
            }
        }
        if (m111945h1()) {
            paint = this.f105351G0;
        } else {
            paint = this.f105352H0;
        }
        RectF rectF = this.f105350F0;
        float f13 = this.f105349E0;
        canvas.drawRoundRect(rectF, f13, f13, paint);
        int i13 = (int) (this.f105359O0 * this.f105361Q0);
        if (m89141i0) {
            drawable = this.f105353I0;
        } else {
            drawable = this.f105354J0;
        }
        if (drawable != null) {
            int i14 = this.f105348D0;
            drawable.setBounds(i13, 0, i13 + i14, i14);
            drawable.draw(canvas);
        }
        if (z11) {
            canvas.restore();
        }
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        if (i14 != 1073741824) {
            int i15 = f105346R0;
            if (i14 == Integer.MIN_VALUE) {
                i13 = Math.min(i15, i13);
            } else {
                i13 = i15;
            }
        }
        if (i12 != 1073741824) {
            int i16 = f105347S0;
            if (i12 == Integer.MIN_VALUE) {
                i11 = Math.min(i16, i11);
            } else {
                i11 = i16;
            }
        }
        if (i11 != 0 && i13 != 0) {
            float f11 = i11;
            float f12 = i13;
            if (f11 / f12 < 1.6666666f) {
                i13 = (int) (f11 / 1.6666666f);
            } else {
                i11 = (int) (f12 * 1.6666666f);
            }
            this.f105348D0 = i13;
            float f13 = (i13 - (i13 * 0.53333336f)) / 2.0f;
            this.f105350F0.set(f13, f13, i11 - f13, i13 - f13);
            this.f105349E0 = this.f105350F0.height() / 2.0f;
            this.f105361Q0 = i11 - this.f105348D0;
        }
        m89097G0(i11, i13);
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: r */
    public void mo88812r() {
        super.mo88812r();
        if (this.f105353I0 == null) {
            this.f105353I0 = AbstractC19694b.m103336d(getContext(), AbstractC20006d.btn_switchknob_on);
        }
        if (this.f105354J0 == null) {
            this.f105354J0 = AbstractC19694b.m103336d(getContext(), AbstractC20006d.btn_switchknob_off);
        }
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: s0 */
    public void mo89151s0(int i11, int[] iArr, int i12, int[] iArr2) {
        super.mo89151s0(i11, iArr, i12, iArr2);
        if (((i11 ^ i12) & 256) != 0) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:            if (r0 != 3) goto L48;     */
    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: t0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo65871t0(MotionEvent motionEvent) {
        boolean m89141i0;
        float f11;
        super.mo65871t0(motionEvent);
        if (!mo89149n()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x11 = motionEvent.getX();
                    if (!this.f105357M0 && Math.abs(x11 - this.f105355K0) >= this.f105356L0) {
                        this.f105357M0 = true;
                        this.f105355K0 = x11;
                    }
                    if (this.f105357M0) {
                        float m111944g1 = m111944g1();
                        float f12 = this.f105361Q0;
                        if (f12 > 0.0f) {
                            f11 = (x11 - this.f105355K0) / f12;
                        } else {
                            f11 = 0.0f;
                        }
                        m111947k1(m111944g1 + f11);
                        if (m111944g1() > 0.0f && m111944g1() < 1.0f) {
                            this.f105355K0 = x11;
                        }
                    }
                }
            }
            if (m89119T() != null && m89119T().getParent() != null) {
                m89119T().getParent().requestDisallowInterceptTouchEvent(false);
            }
            if (this.f105357M0) {
                this.f105357M0 = false;
                if (motionEvent.getAction() == 1) {
                    m89141i0 = m111945h1();
                } else {
                    m89141i0 = m89141i0();
                }
                m111948j1(m89141i0, true);
            }
        } else {
            this.f105355K0 = motionEvent.getX();
            this.f105357M0 = false;
            if (m89119T() != null && m89119T().getParent() != null) {
                m89119T().getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        return true;
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: u0 */
    public void mo89153u0() {
        if (!this.f105357M0) {
            m111948j1(!m89141i0(), true);
        }
        super.mo89153u0();
    }
}
