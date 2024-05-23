package kd0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.zing.zalo.uidrawing.C16719g;

/* renamed from: kd0.d */
/* loaded from: classes4.dex */
public class C21694d extends C16719g {

    /* renamed from: L0 */
    private static final int f105332L0;

    /* renamed from: M0 */
    private static final int f105333M0;

    /* renamed from: N0 */
    private static final float f105334N0;

    /* renamed from: D0 */
    private Paint f105335D0;

    /* renamed from: E0 */
    private Paint f105336E0;

    /* renamed from: F0 */
    private RectF f105337F0;

    /* renamed from: G0 */
    private long f105338G0;

    /* renamed from: H0 */
    private float f105339H0;

    /* renamed from: I0 */
    private int f105340I0;

    /* renamed from: J0 */
    private int f105341J0;

    /* renamed from: K0 */
    private float f105342K0;

    static {
        int i11 = ((int) Resources.getSystem().getDisplayMetrics().density) * 80;
        f105332L0 = i11;
        int i12 = ((int) Resources.getSystem().getDisplayMetrics().density) * 3;
        f105333M0 = i12;
        f105334N0 = i11 / i12;
    }

    public C21694d(Context context) {
        super(context);
        this.f105338G0 = 0L;
        this.f105339H0 = 0.0f;
        this.f105340I0 = -15624961;
        this.f105341J0 = -6642520;
        this.f105342K0 = 0.0f;
        Paint paint = new Paint(1);
        this.f105335D0 = paint;
        paint.setColor(-6642520);
        Paint paint2 = new Paint(1);
        this.f105336E0 = paint2;
        paint2.setColor(-15624961);
        this.f105337F0 = new RectF();
    }

    /* renamed from: g1 */
    public void m111938g1(float f11, boolean z11) {
        if (f11 > 1.0f) {
            f11 = 1.0f;
        } else if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (this.f105342K0 != f11) {
            this.f105342K0 = f11;
            invalidate();
            if (z11) {
                this.f105338G0 = System.currentTimeMillis();
            }
        }
    }

    /* renamed from: h1 */
    public void m111939h1(int i11) {
        if (this.f105341J0 != i11) {
            this.f105341J0 = i11;
            this.f105335D0.setColor(i11);
            invalidate();
        }
    }

    /* renamed from: i1 */
    public void m111940i1(int i11) {
        if (this.f105340I0 != i11) {
            this.f105340I0 = i11;
            this.f105336E0.setColor(i11);
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    public void mo44775o0(Canvas canvas) {
        boolean z11;
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
        int m89110N = m89110N();
        float m89112O = m89112O();
        float f11 = m89112O / 2.0f;
        if (this.f105338G0 > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f105338G0;
            if (currentTimeMillis > 400) {
                this.f105338G0 = 0L;
                this.f105339H0 = this.f105342K0;
            } else {
                float f12 = this.f105339H0;
                this.f105339H0 = f12 + ((this.f105342K0 - f12) * (((float) currentTimeMillis) / 400.0f));
                invalidate();
            }
        } else {
            this.f105339H0 = this.f105342K0;
        }
        float f13 = m89110N;
        this.f105337F0.set(0.0f, 0.0f, f13, m89112O);
        canvas.drawRoundRect(this.f105337F0, f11, f11, this.f105335D0);
        this.f105337F0.set(0.0f, 0.0f, f13 * this.f105339H0, m89112O);
        canvas.drawRoundRect(this.f105337F0, f11, f11, this.f105336E0);
        if (z11) {
            canvas.restore();
        }
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        if (i12 != 1073741824) {
            int i15 = f105332L0;
            if (i12 == Integer.MIN_VALUE) {
                i11 = Math.min(i15, i11);
            } else {
                i11 = i15;
            }
        }
        if (i14 != 1073741824) {
            int i16 = f105333M0;
            if (i14 == Integer.MIN_VALUE) {
                i13 = Math.min(i16, i13);
            } else {
                i13 = i16;
            }
        }
        float f11 = i11;
        float f12 = i13;
        float f13 = f11 / f12;
        if (i14 != 1073741824) {
            float f14 = f105334N0;
            if (f13 != f14) {
                i13 = (int) (f11 / f14);
                m89097G0(i11, i13);
                this.f105337F0.set(0.0f, 0.0f, i11, i13);
            }
        }
        if (i12 != 1073741824) {
            float f15 = f105334N0;
            if (f13 != f15) {
                i11 = (int) (f12 * f15);
            }
        }
        m89097G0(i11, i13);
        this.f105337F0.set(0.0f, 0.0f, i11, i13);
    }
}
