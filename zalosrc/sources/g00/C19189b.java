package g00;

import d00.C17687a;
import f00.C18685a;
import java.util.ArrayDeque;

/* renamed from: g00.b */
/* loaded from: classes4.dex */
public class C19189b {

    /* renamed from: a */
    private final float f95312a;

    /* renamed from: b */
    private final float f95313b;

    /* renamed from: c */
    private final float f95314c;

    public C19189b() {
        this(0.05f, 0.25f, 5.0f);
    }

    /* renamed from: a */
    private float m100634a(C17687a c17687a) {
        C19196i m100652c = C19197j.m100652c(c17687a, 64);
        float f11 = 0.0f;
        for (int i11 = 0; i11 < 64; i11++) {
            double d11 = f11;
            if (d11 > c17687a.f89695q * 0.7d * c17687a.f89694p) {
                return i11 / 64.0f;
            }
            f11 = (float) (d11 + ((double[]) m100652c.f95311p)[i11]);
        }
        return 1.0f;
    }

    /* renamed from: c */
    private void m100635c(C17687a c17687a, C17687a c17687a2, C17687a c17687a3) {
        C17687a c17687a4 = new C17687a(c17687a2.f89695q, c17687a2.f89694p);
        C17687a m100655a = AbstractC19198k.m100655a(c17687a2, c17687a3, c17687a4);
        m100655a.m93693u();
        float f11 = this.f95312a;
        float f12 = this.f95313b;
        if (f12 < 0.0f) {
            f12 = m100634a(c17687a4);
            f11 = 0.4f * f12;
        }
        m100637e(m100655a, c17687a, f11, f12);
    }

    /* renamed from: d */
    private void m100636d(C17687a c17687a, C19194g c19194g) {
        c19194g.m100648a(c17687a);
        m100635c(c17687a, c19194g.f95325a, c19194g.f95326b);
    }

    /* renamed from: e */
    private void m100637e(C17687a c17687a, C17687a c17687a2, float f11, float f12) {
        int i11;
        int i12;
        c17687a2.m93694v();
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i13 = 0; i13 < c17687a.f89694p; i13++) {
            for (int i14 = 0; i14 < c17687a.f89695q; i14++) {
                if (c17687a.f89691r[i13][i14] >= f12 && c17687a2.f89691r[i13][i14] != 1.0f) {
                    arrayDeque.add(new C18685a(i14, i13));
                    while (!arrayDeque.isEmpty()) {
                        C18685a c18685a = (C18685a) arrayDeque.pollFirst();
                        if (c18685a != null && (i11 = c18685a.f93908p) >= 0 && i11 <= c17687a.f89695q && (i12 = c18685a.f93909q) >= 0 && i12 <= c17687a.f89694p) {
                            float[] fArr = c17687a2.f89691r[i12];
                            if (fArr[i11] != 1.0f && c17687a.f89691r[i12][i11] >= f11) {
                                fArr[i11] = 1.0f;
                                int i15 = i14 - 1;
                                int i16 = i13 - 1;
                                arrayDeque.add(new C18685a(i15, i16));
                                arrayDeque.add(new C18685a(i14, i16));
                                int i17 = i14 + 1;
                                arrayDeque.add(new C18685a(i17, i16));
                                arrayDeque.add(new C18685a(i15, i13));
                                arrayDeque.add(new C18685a(i17, i13));
                                int i18 = i13 + 1;
                                arrayDeque.add(new C18685a(i15, i18));
                                arrayDeque.add(new C18685a(i14, i18));
                                arrayDeque.add(new C18685a(i17, i18));
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void m100638b(C17687a c17687a) {
        m100636d(c17687a, new C19194g(this.f95314c));
    }

    public C19189b(float f11, float f12, float f13) {
        if (f11 < 0.0f || f11 > 1.0f) {
            throw new IllegalArgumentException("Low threshold must be between 0 and 1");
        }
        if (f12 < 0.0f || f12 > 1.0f) {
            throw new IllegalArgumentException("High threshold must be between 0 and 1");
        }
        if (f12 < f11) {
            throw new IllegalArgumentException("High threshold must be bigger than the lower threshold");
        }
        if (f13 < 0.0f) {
            throw new IllegalArgumentException("Sigma must be > 0");
        }
        this.f95312a = f11;
        this.f95313b = f12;
        this.f95314c = f13;
    }
}
