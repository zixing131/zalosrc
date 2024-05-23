package g00;

import d00.C17687a;

/* renamed from: g00.h */
/* loaded from: classes4.dex */
public class C19195h {

    /* renamed from: a */
    private final double f95328a;

    public C19195h() {
        this(2.2d);
    }

    /* renamed from: a */
    public void m100649a(C17687a c17687a) {
        for (int i11 = 0; i11 < c17687a.f89694p; i11++) {
            for (int i12 = 0; i12 < c17687a.f89695q; i12++) {
                float[] fArr = c17687a.f89691r[i11];
                fArr[i12] = m100650b(Float.valueOf(fArr[i12])).floatValue();
            }
        }
    }

    /* renamed from: b */
    public Float m100650b(Float f11) {
        double pow;
        double d11 = this.f95328a;
        double floatValue = f11.floatValue();
        if (d11 == 0.0d) {
            pow = Math.log(floatValue);
        } else {
            pow = Math.pow(floatValue, this.f95328a);
        }
        return Float.valueOf((float) pow);
    }

    public C19195h(double d11) {
        this.f95328a = d11;
    }
}
