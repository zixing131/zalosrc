package o20;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import fn0.AbstractC19074t;

/* renamed from: o20.a */
/* loaded from: classes5.dex */
final class C23988a {

    /* renamed from: a */
    private final RectF f116090a;

    /* renamed from: b */
    private float f116091b;

    /* renamed from: c */
    private int f116092c;

    /* renamed from: d */
    private int f116093d;

    /* renamed from: e */
    private int f116094e;

    public C23988a(RectF rectF, float f11, int i11, int i12, int i13) {
        AbstractC19074t.m100208f(rectF, "rectF");
        this.f116090a = rectF;
        this.f116091b = f11;
        this.f116092c = i11;
        this.f116093d = i12;
        this.f116094e = i13;
    }

    /* renamed from: a */
    public final void m125508a(float f11, float f12) {
        int i11 = this.f116093d;
        if (f11 <= i11 * f12) {
            this.f116091b = (1 - (i11 * f12)) + f11;
        } else {
            this.f116091b = f11 - (i11 * f12);
        }
        if (this.f116091b >= 1.0f) {
            this.f116091b = (-i11) * f12;
        }
    }

    /* renamed from: b */
    public final void m125509b(Canvas canvas, Paint paint) {
        AbstractC19074t.m100208f(canvas, "canvas");
        AbstractC19074t.m100208f(paint, "paint");
        paint.setAlpha(this.f116092c);
        canvas.drawArc(this.f116090a, 0.0f, -90.0f, true, paint);
    }

    /* renamed from: c */
    public final void m125510c(int i11, int i12) {
        int i13;
        RectF rectF = this.f116090a;
        float f11 = this.f116091b;
        float f12 = i11 * f11;
        rectF.left = 0.0f - f12;
        float f13 = i12;
        rectF.top = f13 - f12;
        rectF.right = f12;
        rectF.bottom = f13 + f12;
        float f14 = (1.0f - f11) * this.f116094e;
        if (f14 <= 0.0f) {
            i13 = 0;
        } else {
            i13 = (int) f14;
        }
        this.f116092c = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23988a)) {
            return false;
        }
        C23988a c23988a = (C23988a) obj;
        return AbstractC19074t.m100204b(this.f116090a, c23988a.f116090a) && Float.compare(this.f116091b, c23988a.f116091b) == 0 && this.f116092c == c23988a.f116092c && this.f116093d == c23988a.f116093d && this.f116094e == c23988a.f116094e;
    }

    public int hashCode() {
        return (((((((this.f116090a.hashCode() * 31) + Float.floatToIntBits(this.f116091b)) * 31) + this.f116092c) * 31) + this.f116093d) * 31) + this.f116094e;
    }

    public String toString() {
        return "RenderObj(rectF=" + this.f116090a + ", scale=" + this.f116091b + ", alpha=" + this.f116092c + ", index=" + this.f116093d + ", maxAlpha=" + this.f116094e + ")";
    }
}
