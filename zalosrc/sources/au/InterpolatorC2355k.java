package au;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* renamed from: au.k */
/* loaded from: classes4.dex */
public class InterpolatorC2355k implements Interpolator {

    /* renamed from: a */
    protected PointF f9876a;

    /* renamed from: b */
    protected PointF f9877b;

    /* renamed from: c */
    protected PointF f9878c = new PointF();

    /* renamed from: d */
    protected PointF f9879d = new PointF();

    /* renamed from: e */
    protected PointF f9880e = new PointF();

    public InterpolatorC2355k(PointF pointF, PointF pointF2) {
        float f11 = pointF.x;
        if (f11 >= 0.0f && f11 <= 1.0f) {
            float f12 = pointF2.x;
            if (f12 >= 0.0f && f12 <= 1.0f) {
                this.f9876a = pointF;
                this.f9877b = pointF2;
                return;
            }
            throw new IllegalArgumentException("endX value must be in the range [0, 1]");
        }
        throw new IllegalArgumentException("startX value must be in the range [0, 1]");
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f11) {
        float f12 = f11;
        for (int i11 = 1; i11 < 14; i11++) {
            PointF pointF = this.f9880e;
            PointF pointF2 = this.f9876a;
            float f13 = pointF2.x * 3.0f;
            pointF.x = f13;
            PointF pointF3 = this.f9879d;
            float f14 = ((this.f9877b.x - pointF2.x) * 3.0f) - f13;
            pointF3.x = f14;
            PointF pointF4 = this.f9878c;
            float f15 = (1.0f - pointF.x) - f14;
            pointF4.x = f15;
            float f16 = ((pointF.x + ((pointF3.x + (f15 * f12)) * f12)) * f12) - f11;
            if (Math.abs(f16) < 0.001d) {
                break;
            }
            f12 -= f16 / (this.f9880e.x + (((this.f9879d.x * 2.0f) + ((this.f9878c.x * 3.0f) * f12)) * f12));
        }
        PointF pointF5 = this.f9880e;
        PointF pointF6 = this.f9876a;
        float f17 = pointF6.y * 3.0f;
        pointF5.y = f17;
        PointF pointF7 = this.f9879d;
        float f18 = ((this.f9877b.y - pointF6.y) * 3.0f) - f17;
        pointF7.y = f18;
        PointF pointF8 = this.f9878c;
        float f19 = (1.0f - pointF5.y) - f18;
        pointF8.y = f19;
        return f12 * (pointF5.y + ((pointF7.y + (f19 * f12)) * f12));
    }
}
