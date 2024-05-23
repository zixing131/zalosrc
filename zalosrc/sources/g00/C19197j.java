package g00;

import d00.C17687a;

/* renamed from: g00.j */
/* loaded from: classes4.dex */
public class C19197j {

    /* renamed from: a */
    private final int f95329a;

    /* renamed from: b */
    private C19196i f95330b;

    public C19197j(int i11) {
        this.f95329a = i11;
    }

    /* renamed from: c */
    public static C19196i m100652c(C17687a c17687a, int i11) {
        C19197j c19197j = new C19197j(i11);
        c19197j.m100653a(c17687a);
        return c19197j.m100654b();
    }

    /* renamed from: a */
    public void m100653a(C17687a c17687a) {
        this.f95330b = new C19196i(this.f95329a);
        for (int i11 = 0; i11 < c17687a.f89694p; i11++) {
            for (int i12 = 0; i12 < c17687a.f89695q; i12++) {
                float f11 = c17687a.f89691r[i11][i12];
                int i13 = this.f95329a;
                int i14 = (int) (f11 * i13);
                if (i14 > i13 - 1) {
                    i14 = i13 - 1;
                }
                double[] dArr = (double[]) this.f95330b.f95311p;
                dArr[i14] = dArr[i14] + 1.0d;
            }
        }
    }

    /* renamed from: b */
    public C19196i m100654b() {
        return this.f95330b;
    }
}
