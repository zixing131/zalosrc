package kd0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import hd0.AbstractC20006d;
import p193h0.AbstractC19694b;

/* renamed from: kd0.a */
/* loaded from: classes4.dex */
public class C21691a extends C16719g {

    /* renamed from: I0 */
    public static final int f105284I0 = (int) (Resources.getSystem().getDisplayMetrics().density * 24.0f);

    /* renamed from: D0 */
    private Drawable f105285D0;

    /* renamed from: E0 */
    private Drawable f105286E0;

    /* renamed from: F0 */
    private boolean f105287F0;

    /* renamed from: G0 */
    private boolean f105288G0;

    /* renamed from: H0 */
    private long f105289H0;

    public C21691a(Context context) {
        super(context);
        this.f105287F0 = true;
        m111903h1();
    }

    /* renamed from: g1 */
    private void m111902g1(Drawable drawable) {
        if (drawable != null && m89110N() > 0 && m89108M() > 0) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int m89110N = m89110N();
            int m89108M = m89108M();
            if (intrinsicWidth != 0 && intrinsicHeight != 0) {
                float f11 = m89110N;
                float f12 = intrinsicWidth;
                float f13 = m89108M;
                float f14 = intrinsicHeight;
                float min = Math.min(f11 / f12, f13 / f14);
                float f15 = f12 * min;
                int round = Math.round((f11 - f15) * 0.5f);
                float f16 = f14 * min;
                int round2 = Math.round((f13 - f16) * 0.5f);
                drawable.setBounds(round, round2, ((int) f15) + round, ((int) f16) + round2);
                return;
            }
            drawable.setBounds(0, 0, m89110N, m89108M);
        }
    }

    /* renamed from: h1 */
    private void m111903h1() {
        C16718f m89106L = m89106L();
        int i11 = f105284I0;
        m89106L.m89028L(i11, i11);
        this.f105285D0 = AbstractC19694b.m103336d(getContext(), AbstractC20006d.icn_checkbox_normal);
        this.f105286E0 = AbstractC19694b.m103336d(getContext(), AbstractC20006d.icn_checkbox_checked);
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: D0 */
    public void mo89091D0(boolean z11) {
        m111904i1(z11, false);
    }

    /* renamed from: i1 */
    public void m111904i1(boolean z11, boolean z12) {
        if (m89141i0() == z11) {
            return;
        }
        super.mo89091D0(z11);
        if (z12) {
            this.f105289H0 = System.currentTimeMillis();
        }
        invalidate();
    }

    /* renamed from: j1 */
    public void m111905j1(Drawable drawable) {
        this.f105286E0 = drawable;
        this.f105288G0 = false;
        invalidate();
    }

    /* renamed from: k1 */
    public void m111906k1(Drawable drawable) {
        this.f105285D0 = drawable;
        this.f105288G0 = false;
        invalidate();
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
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo44775o0(Canvas canvas) {
        Drawable drawable;
        Drawable drawable2;
        boolean z11;
        long j11;
        float f11;
        super.mo44775o0(canvas);
        if (m89141i0()) {
            drawable = this.f105286E0;
        } else {
            drawable = this.f105285D0;
        }
        if (m89141i0()) {
            drawable2 = this.f105285D0;
        } else {
            drawable2 = this.f105286E0;
        }
        int i11 = m89106L().f84716l;
        int i12 = m89106L().f84717m;
        boolean z12 = true;
        boolean z13 = false;
        if (i11 == 0 && i12 == 0) {
            z11 = false;
        } else {
            canvas.save();
            canvas.translate(i11, i12);
            z11 = true;
        }
        if (this.f105289H0 > 0) {
            j11 = System.currentTimeMillis() - this.f105289H0;
            if (j11 > 120) {
                this.f105289H0 = 0L;
            }
            if (this.f105289H0 <= 0) {
                long j12 = 60;
                if (j11 > j12) {
                    f11 = ((((float) (j11 - j12)) / 60) * 0.25f) + 0.75f;
                    z13 = true;
                } else {
                    f11 = 1.0f - ((((float) j11) / 60) * 0.25f);
                }
                if (!z11) {
                    canvas.save();
                } else {
                    z12 = z11;
                }
                canvas.scale(f11, f11, this.f84747G / 2, this.f84748H / 2);
                if (z13) {
                    if (drawable != null) {
                        drawable.draw(canvas);
                    }
                } else if (drawable2 != null) {
                    drawable2.draw(canvas);
                }
                invalidate();
                z11 = z12;
            } else if (drawable != null) {
                drawable.draw(canvas);
            }
            if (!z11) {
                canvas.restore();
                return;
            }
            return;
        }
        j11 = 0;
        if (this.f105289H0 <= 0) {
        }
        if (!z11) {
        }
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        boolean z11;
        int m89110N = m89110N();
        int m89108M = m89108M();
        super.mo44180q0(i11, i12, i13, i14);
        if (this.f105288G0 && m89110N == m89110N() && m89108M == m89108M()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f105288G0 = z11;
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: r */
    public void mo88812r() {
        super.mo88812r();
        if (this.f105288G0) {
            return;
        }
        this.f105288G0 = true;
        m111902g1(this.f105285D0);
        m111902g1(this.f105286E0);
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: s0 */
    public void mo89151s0(int i11, int[] iArr, int i12, int[] iArr2) {
        super.mo89151s0(i11, iArr, i12, iArr2);
        Drawable drawable = this.f105285D0;
        if (drawable != null && drawable.setState(this.f84794x)) {
            invalidate();
        }
        if (this.f105285D0 != null && this.f105286E0.setState(this.f84794x)) {
            invalidate();
        }
        if (((i11 ^ i12) & 256) != 0) {
            invalidate();
        }
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: u0 */
    public void mo89153u0() {
        m111904i1(!m89141i0(), this.f105287F0);
        super.mo89153u0();
    }
}
