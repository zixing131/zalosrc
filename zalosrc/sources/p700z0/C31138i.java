package p700z0;

import java.util.Arrays;
import java.util.HashSet;

/* renamed from: z0.i */
/* loaded from: classes2.dex */
public class C31138i implements Comparable {

    /* renamed from: G */
    private static int f143466G = 1;

    /* renamed from: p */
    public boolean f143473p;

    /* renamed from: q */
    private String f143474q;

    /* renamed from: u */
    public float f143478u;

    /* renamed from: y */
    a f143482y;

    /* renamed from: r */
    public int f143475r = -1;

    /* renamed from: s */
    int f143476s = -1;

    /* renamed from: t */
    public int f143477t = 0;

    /* renamed from: v */
    public boolean f143479v = false;

    /* renamed from: w */
    float[] f143480w = new float[9];

    /* renamed from: x */
    float[] f143481x = new float[9];

    /* renamed from: z */
    C31131b[] f143483z = new C31131b[16];

    /* renamed from: A */
    int f143467A = 0;

    /* renamed from: B */
    public int f143468B = 0;

    /* renamed from: C */
    boolean f143469C = false;

    /* renamed from: D */
    int f143470D = -1;

    /* renamed from: E */
    float f143471E = 0.0f;

    /* renamed from: F */
    HashSet f143472F = null;

    /* renamed from: z0.i$a */
    /* loaded from: classes2.dex */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C31138i(a aVar, String str) {
        this.f143482y = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m151295d() {
        f143466G++;
    }

    /* renamed from: b */
    public final void m151296b(C31131b c31131b) {
        int i11 = 0;
        while (true) {
            int i12 = this.f143467A;
            if (i11 < i12) {
                if (this.f143483z[i11] == c31131b) {
                    return;
                } else {
                    i11++;
                }
            } else {
                C31131b[] c31131bArr = this.f143483z;
                if (i12 >= c31131bArr.length) {
                    this.f143483z = (C31131b[]) Arrays.copyOf(c31131bArr, c31131bArr.length * 2);
                }
                C31131b[] c31131bArr2 = this.f143483z;
                int i13 = this.f143467A;
                c31131bArr2[i13] = c31131b;
                this.f143467A = i13 + 1;
                return;
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(C31138i c31138i) {
        return this.f143475r - c31138i.f143475r;
    }

    /* renamed from: e */
    public final void m151298e(C31131b c31131b) {
        int i11 = this.f143467A;
        int i12 = 0;
        while (i12 < i11) {
            if (this.f143483z[i12] == c31131b) {
                while (i12 < i11 - 1) {
                    C31131b[] c31131bArr = this.f143483z;
                    int i13 = i12 + 1;
                    c31131bArr[i12] = c31131bArr[i13];
                    i12 = i13;
                }
                this.f143467A--;
                return;
            }
            i12++;
        }
    }

    /* renamed from: g */
    public void m151299g() {
        this.f143474q = null;
        this.f143482y = a.UNKNOWN;
        this.f143477t = 0;
        this.f143475r = -1;
        this.f143476s = -1;
        this.f143478u = 0.0f;
        this.f143479v = false;
        this.f143469C = false;
        this.f143470D = -1;
        this.f143471E = 0.0f;
        int i11 = this.f143467A;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f143483z[i12] = null;
        }
        this.f143467A = 0;
        this.f143468B = 0;
        this.f143473p = false;
        Arrays.fill(this.f143481x, 0.0f);
    }

    /* renamed from: h */
    public void m151300h(C31133d c31133d, float f11) {
        this.f143478u = f11;
        this.f143479v = true;
        this.f143469C = false;
        this.f143470D = -1;
        this.f143471E = 0.0f;
        int i11 = this.f143467A;
        this.f143476s = -1;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f143483z[i12].m151225A(c31133d, this, false);
        }
        this.f143467A = 0;
    }

    /* renamed from: i */
    public void m151301i(a aVar, String str) {
        this.f143482y = aVar;
    }

    /* renamed from: j */
    public final void m151302j(C31133d c31133d, C31131b c31131b) {
        int i11 = this.f143467A;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f143483z[i12].mo151226B(c31133d, c31131b, false);
        }
        this.f143467A = 0;
    }

    public String toString() {
        if (this.f143474q != null) {
            return "" + this.f143474q;
        }
        return "" + this.f143475r;
    }
}
