package tj0;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;
import com.zing.zalo.zinstant.zom.properties.ZOMLoading;
import com.zing.zalo.zinstant.zom.properties.ZOMSkeletonLoading;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Arrays;
import ln0.AbstractC22543l;
import nk0.AbstractC23825g0;
import pm0.C24860q;

/* renamed from: tj0.e */
/* loaded from: classes7.dex */
public final class C26720e extends AbstractC26719d {
    public static final a Companion = new a(null);

    /* renamed from: d0 */
    private int f126727d0;

    /* renamed from: e0 */
    private float f126728e0;

    /* renamed from: f0 */
    private int f126729f0;

    /* renamed from: g0 */
    private int f126730g0;

    /* renamed from: h0 */
    private float f126731h0;

    /* renamed from: i0 */
    private float f126732i0;

    /* renamed from: j0 */
    private final Paint f126733j0;

    /* renamed from: k0 */
    private final int[] f126734k0;

    /* renamed from: l0 */
    private final float[] f126735l0;

    /* renamed from: m0 */
    private final RectF f126736m0;

    /* renamed from: n0 */
    private PointF f126737n0;

    /* renamed from: o0 */
    private float f126738o0;

    /* renamed from: p0 */
    private float f126739p0;

    /* renamed from: tj0.e$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C26720e() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.f126733j0 = paint;
        this.f126734k0 = new int[4];
        this.f126735l0 = new float[4];
        this.f126736m0 = new RectF();
        this.f126737n0 = new PointF();
        m137423T(2);
    }

    /* renamed from: X */
    private final C24860q m137430X(int i11, int i12, float f11, float f12) {
        double d11;
        float tan;
        double sin;
        if (f12 > 90.0f) {
            f12 = 180 - f12;
        }
        double radians = Math.toRadians(f12);
        if (Math.tan(radians) < 1.0d) {
            d11 = i11;
            tan = (float) ((i12 - (Math.tan(radians) * d11)) * Math.sin(radians));
            sin = Math.cos(radians);
        } else {
            d11 = i12;
            tan = (float) ((i11 - (d11 / Math.tan(radians))) * Math.cos(radians));
            sin = Math.sin(radians);
        }
        float f13 = (float) ((d11 / sin) + tan);
        this.f126738o0 = (float) (i11 * Math.sin(radians));
        return m137431Y(m137429z(), this.f126729f0, -f11, f13);
    }

    /* renamed from: Y */
    private final C24860q m137431Y(int i11, int i12, float f11, float f12) {
        long j11 = i11 + i12;
        int m137432Z = (int) ((j11 / m137432Z(i11, i12)) + 1);
        double d11 = (i11 * 1.0d) / j11;
        int i13 = (int) ((m137432Z - 1) * d11);
        if (m137432Z > 100) {
            i13 = (int) (d11 * 100);
            m137432Z = 100;
        }
        float f13 = f12 - f11;
        float[] fArr = new float[m137432Z];
        if (i13 >= 0) {
            int i14 = 0;
            while (true) {
                fArr[i14] = ((i14 * f13) / i13) + f11;
                if (i14 == i13) {
                    break;
                }
                i14++;
            }
        }
        while (i13 < m137432Z) {
            fArr[i13] = f12;
            i13++;
        }
        return new C24860q(fArr, Long.valueOf(j11));
    }

    /* renamed from: Z */
    private final int m137432Z(int i11, int i12) {
        if (i11 == 0) {
            return i12;
        }
        return m137432Z(i12 % i11, i11);
    }

    /* renamed from: a0 */
    private final void m137433a0(int i11) {
        if (this.f126727d0 == i11) {
            return;
        }
        this.f126727d0 = i11;
        m137422S(m137426w() | 16384);
    }

    /* renamed from: b0 */
    private final void m137434b0(int i11) {
        if (this.f126730g0 == i11) {
            return;
        }
        this.f126730g0 = i11;
        m137422S(m137426w() | 131072);
    }

    /* renamed from: c0 */
    private final void m137435c0(float f11) {
        if (this.f126732i0 == f11) {
            return;
        }
        this.f126732i0 = f11;
        m137422S(m137426w() | 8192);
    }

    /* renamed from: d0 */
    private final void m137436d0(float f11) {
        if (this.f126731h0 == f11) {
            return;
        }
        this.f126731h0 = f11;
        m137422S(m137426w() | 262144);
    }

    /* renamed from: e0 */
    private final void m137437e0(int i11) {
        if (this.f126729f0 == i11) {
            return;
        }
        this.f126729f0 = i11;
        m137422S(m137426w() | 65536);
    }

    /* renamed from: f0 */
    private final void m137438f0(float f11) {
        float m116579b;
        float m116583f;
        m116579b = AbstractC22543l.m116579b(f11, 0.0f);
        m116583f = AbstractC22543l.m116583f(m116579b, 180.0f);
        if (this.f126728e0 == m116583f) {
            return;
        }
        this.f126728e0 = m116583f;
        m137422S(m137426w() | 32768);
    }

    /* renamed from: g0 */
    private final void m137439g0() {
        int[] iArr = this.f126734k0;
        iArr[0] = this.f126727d0;
        iArr[1] = m137427x();
        this.f126734k0[2] = m137427x();
        this.f126734k0[3] = this.f126727d0;
    }

    /* renamed from: h0 */
    private final void m137440h0() {
        int i11 = this.f126730g0;
        if (i11 != 0) {
            if (i11 == 1) {
                this.f126736m0.set(getBounds().right - m137417E(), getBounds().top - this.f126738o0, getBounds().right, getBounds().bottom + this.f126738o0);
                return;
            }
            return;
        }
        this.f126736m0.set(getBounds().left, getBounds().top - this.f126738o0, getBounds().left + m137417E(), getBounds().bottom + this.f126738o0);
    }

    /* renamed from: i0 */
    private final void m137441i0() {
        int i11 = this.f126730g0;
        if (i11 != 0) {
            if (i11 == 1) {
                this.f126737n0.x = this.f126736m0.right;
            }
        } else {
            this.f126737n0.x = this.f126736m0.left;
        }
        if (this.f126728e0 > 90.0f) {
            this.f126737n0.y = getBounds().bottom;
        } else {
            this.f126737n0.y = getBounds().top;
        }
    }

    /* renamed from: j0 */
    private final void m137442j0() {
        float m116579b;
        float m116579b2;
        float m116583f;
        float m116583f2;
        float[] fArr = this.f126735l0;
        m116579b = AbstractC22543l.m116579b(((1.0f - this.f126731h0) - this.f126732i0) / 2.0f, 0.0f);
        fArr[0] = m116579b;
        float[] fArr2 = this.f126735l0;
        m116579b2 = AbstractC22543l.m116579b(((1.0f - this.f126731h0) - 0.001f) / 2.0f, 0.0f);
        fArr2[1] = m116579b2;
        float[] fArr3 = this.f126735l0;
        m116583f = AbstractC22543l.m116583f(((this.f126731h0 + 1.0f) + 0.001f) / 2.0f, 1.0f);
        fArr3[2] = m116583f;
        float[] fArr4 = this.f126735l0;
        m116583f2 = AbstractC22543l.m116583f(((this.f126731h0 + 1.0f) + this.f126732i0) / 2.0f, 1.0f);
        fArr4[3] = m116583f2;
    }

    @Override // tj0.AbstractC26719d
    /* renamed from: H */
    protected void mo137386H() {
        if (m137418F(16384) || m137418F(16)) {
            m137439g0();
        }
        if (m137418F(262144) || m137418F(8192)) {
            m137442j0();
        }
        if (m137418F(32768) || m137418F(131072)) {
            float f11 = this.f126728e0;
            if (f11 > 90.0f) {
                f11 = -(180 - f11);
            }
            this.f126739p0 = f11;
            if (this.f126730g0 != 0) {
                f11 = -f11;
            }
            this.f126739p0 = f11;
        }
        if (m137418F(1) || m137418F(4) || m137418F(32768) || m137418F(32) || m137418F(65536)) {
            C24860q m137430X = m137430X(getBounds().width(), getBounds().height(), m137417E(), this.f126728e0);
            ValueAnimator m137425v = m137425v();
            float[] fArr = (float[]) m137430X.m129215c();
            m137425v.setFloatValues(Arrays.copyOf(fArr, fArr.length));
            m137425v().setDuration(((Number) m137430X.m129216d()).longValue());
        }
        m137440h0();
        m137441i0();
        Paint paint = this.f126733j0;
        RectF rectF = this.f126736m0;
        paint.setShader(new LinearGradient(rectF.left, 0.0f, rectF.right, 0.0f, this.f126734k0, this.f126735l0, Shader.TileMode.CLAMP));
        m137422S(0);
    }

    @Override // tj0.AbstractC26719d
    /* renamed from: I */
    public void mo137387I(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        Object animatedValue = m137425v().getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        if (this.f126730g0 != 0) {
            floatValue = -floatValue;
        }
        float f11 = this.f126739p0;
        PointF pointF = this.f126737n0;
        canvas.rotate(f11, pointF.x, pointF.y);
        canvas.translate(floatValue, 0.0f);
        canvas.drawRect(this.f126736m0, this.f126733j0);
        if (AbstractC23825g0.f115102E) {
            canvas.drawRect(this.f126736m0, m137428y());
        }
    }

    @Override // tj0.AbstractC26719d
    /* renamed from: L */
    protected void mo137388L(ZOMLoading zOMLoading) {
        AbstractC19074t.m100208f(zOMLoading, "loading");
        ZOMSkeletonLoading zOMSkeletonLoading = zOMLoading.mSkeletonLoading;
        if (zOMSkeletonLoading != null) {
            m137433a0(zOMSkeletonLoading.mBaseColor);
            m137434b0(zOMSkeletonLoading.mDirection);
            m137437e0(zOMSkeletonLoading.mRepeatDelay);
            m137438f0(zOMSkeletonLoading.mTilt);
            m137435c0(zOMSkeletonLoading.mDropOff);
            m137436d0(zOMSkeletonLoading.mIntensity);
        }
    }

    @Override // tj0.AbstractC26719d, sj0.C26280e, android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        super.setAlpha(i11);
        this.f126733j0.setAlpha(i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tj0.AbstractC26719d
    /* renamed from: u */
    public boolean mo137389u() {
        if (m137417E() > 0.0f && (this.f126727d0 != 0 || m137427x() != 0)) {
            return true;
        }
        return false;
    }
}
