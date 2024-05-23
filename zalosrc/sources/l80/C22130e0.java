package l80;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import androidx.core.content.AbstractC1388a;
import au.InterpolatorC2355k;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.uidrawing.C16719g;
import me0.AbstractC23136l9;

/* renamed from: l80.e0 */
/* loaded from: classes6.dex */
public class C22130e0 extends C16719g {

    /* renamed from: M0 */
    static long f108958M0 = System.currentTimeMillis();

    /* renamed from: D0 */
    int f108959D0;

    /* renamed from: E0 */
    int f108960E0;

    /* renamed from: F0 */
    int f108961F0;

    /* renamed from: G0 */
    int f108962G0;

    /* renamed from: H0 */
    int f108963H0;

    /* renamed from: I0 */
    Paint f108964I0;

    /* renamed from: J0 */
    Long[] f108965J0;

    /* renamed from: K0 */
    long f108966K0;

    /* renamed from: L0 */
    InterpolatorC2355k f108967L0;

    public C22130e0(Context context) {
        super(context);
        this.f108959D0 = 3;
        this.f108960E0 = AbstractC23136l9.m118742r(1.0f);
        this.f108961F0 = AbstractC23136l9.m118742r(3.0f);
        this.f108962G0 = AbstractC23136l9.m118742r(8.0f);
        this.f108966K0 = 1000L;
        try {
            this.f108963H0 = AbstractC1388a.m6961c(context, AbstractC16801x.typing_dot);
            this.f108967L0 = new InterpolatorC2355k(new PointF(0.62f, 0.28f), new PointF(0.23f, 0.99f));
            Paint paint = new Paint();
            this.f108964I0 = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f108964I0.setColor(this.f108963H0);
            this.f108964I0.setAntiAlias(true);
            this.f108965J0 = new Long[this.f108959D0];
            long j11 = 0;
            for (int i11 = 0; i11 < this.f108959D0; i11++) {
                this.f108965J0[i11] = Long.valueOf(j11);
                j11 += 80;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g1 */
    public void m115445g1(int i11) {
        this.f108963H0 = i11;
        this.f108964I0.setColor(i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029 A[Catch: Exception -> 0x0072, LOOP:0: B:9:0x0025->B:11:0x0029, LOOP_END, TryCatch #0 {Exception -> 0x0072, blocks: (B:3:0x0003, B:8:0x0020, B:9:0x0025, B:11:0x0029, B:14:0x0076, B:15:0x0079, B:19:0x0017), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0076 A[Catch: Exception -> 0x0072, TryCatch #0 {Exception -> 0x0072, blocks: (B:3:0x0003, B:8:0x0020, B:9:0x0025, B:11:0x0029, B:14:0x0076, B:15:0x0079, B:19:0x0017), top: B:2:0x0003 }] */
    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: o0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo44775o0(Canvas canvas) {
        boolean z11;
        super.mo44775o0(canvas);
        try {
            int i11 = m89106L().f84716l;
            int i12 = m89106L().f84717m;
            if (i11 == 0 && i12 == 0) {
                z11 = false;
                long currentTimeMillis = System.currentTimeMillis();
                float f11 = 0.0f;
                for (int i13 = 0; i13 < this.f108959D0; i13++) {
                    long longValue = (currentTimeMillis - f108958M0) - this.f108965J0[i13].longValue();
                    long j11 = this.f108966K0;
                    float interpolation = this.f108962G0 - (this.f108967L0.getInterpolation(1.0f - (Math.abs(0.5f - (((float) (longValue % j11)) / ((float) j11))) * 2.0f)) * this.f108962G0);
                    int i14 = this.f108961F0;
                    canvas.drawCircle((i14 / 2.0f) + f11, interpolation + (i14 / 2.0f), i14 / 2.0f, this.f108964I0);
                    f11 += this.f108961F0 + this.f108960E0;
                }
                if (z11) {
                    canvas.restore();
                }
                invalidate();
            }
            canvas.save();
            canvas.translate(i11, i12);
            z11 = true;
            long currentTimeMillis2 = System.currentTimeMillis();
            float f112 = 0.0f;
            while (i13 < this.f108959D0) {
            }
            if (z11) {
            }
            invalidate();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        int m89110N;
        int m89108M;
        super.mo44180q0(i11, i12, i13, i14);
        try {
            if (i12 != 1073741824) {
                int i15 = this.f108959D0;
                m89110N = (this.f108961F0 * i15) + (this.f108960E0 * (i15 - 1));
                if (i12 == Integer.MIN_VALUE) {
                    m89110N = Math.min(m89110N, i11);
                }
            } else {
                m89110N = m89110N();
            }
            if (i14 != 1073741824) {
                m89108M = this.f108962G0 + this.f108961F0;
                if (i14 == Integer.MIN_VALUE) {
                    m89108M = Math.min(m89108M, i13);
                }
            } else {
                m89108M = m89108M();
            }
            m89097G0(m89110N, m89108M);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
