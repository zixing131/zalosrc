package p700z0;

import java.util.Arrays;
import p700z0.C31131b;

/* renamed from: z0.j */
/* loaded from: classes2.dex */
public class C31139j implements C31131b.a {

    /* renamed from: n */
    private static float f143490n = 0.001f;

    /* renamed from: a */
    private final int f143491a = -1;

    /* renamed from: b */
    private int f143492b = 16;

    /* renamed from: c */
    private int f143493c = 16;

    /* renamed from: d */
    int[] f143494d = new int[16];

    /* renamed from: e */
    int[] f143495e = new int[16];

    /* renamed from: f */
    int[] f143496f = new int[16];

    /* renamed from: g */
    float[] f143497g = new float[16];

    /* renamed from: h */
    int[] f143498h = new int[16];

    /* renamed from: i */
    int[] f143499i = new int[16];

    /* renamed from: j */
    int f143500j = 0;

    /* renamed from: k */
    int f143501k = -1;

    /* renamed from: l */
    private final C31131b f143502l;

    /* renamed from: m */
    protected final C31132c f143503m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C31139j(C31131b c31131b, C31132c c31132c) {
        this.f143502l = c31131b;
        this.f143503m = c31132c;
        clear();
    }

    /* renamed from: l */
    private void m151303l(C31138i c31138i, int i11) {
        int[] iArr;
        int i12 = c31138i.f143475r % this.f143493c;
        int[] iArr2 = this.f143494d;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            iArr2[i12] = i11;
        } else {
            while (true) {
                iArr = this.f143495e;
                int i14 = iArr[i13];
                if (i14 == -1) {
                    break;
                } else {
                    i13 = i14;
                }
            }
            iArr[i13] = i11;
        }
        this.f143495e[i11] = -1;
    }

    /* renamed from: m */
    private void m151304m(int i11, C31138i c31138i, float f11) {
        this.f143496f[i11] = c31138i.f143475r;
        this.f143497g[i11] = f11;
        this.f143498h[i11] = -1;
        this.f143499i[i11] = -1;
        c31138i.m151296b(this.f143502l);
        c31138i.f143468B++;
        this.f143500j++;
    }

    /* renamed from: n */
    private int m151305n() {
        for (int i11 = 0; i11 < this.f143492b; i11++) {
            if (this.f143496f[i11] == -1) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: o */
    private void m151306o() {
        int i11 = this.f143492b * 2;
        this.f143496f = Arrays.copyOf(this.f143496f, i11);
        this.f143497g = Arrays.copyOf(this.f143497g, i11);
        this.f143498h = Arrays.copyOf(this.f143498h, i11);
        this.f143499i = Arrays.copyOf(this.f143499i, i11);
        this.f143495e = Arrays.copyOf(this.f143495e, i11);
        for (int i12 = this.f143492b; i12 < i11; i12++) {
            this.f143496f[i12] = -1;
            this.f143495e[i12] = -1;
        }
        this.f143492b = i11;
    }

    /* renamed from: q */
    private void m151307q(int i11, C31138i c31138i, float f11) {
        int m151305n = m151305n();
        m151304m(m151305n, c31138i, f11);
        if (i11 != -1) {
            this.f143498h[m151305n] = i11;
            int[] iArr = this.f143499i;
            iArr[m151305n] = iArr[i11];
            iArr[i11] = m151305n;
        } else {
            this.f143498h[m151305n] = -1;
            if (this.f143500j > 0) {
                this.f143499i[m151305n] = this.f143501k;
                this.f143501k = m151305n;
            } else {
                this.f143499i[m151305n] = -1;
            }
        }
        int i12 = this.f143499i[m151305n];
        if (i12 != -1) {
            this.f143498h[i12] = m151305n;
        }
        m151303l(c31138i, m151305n);
    }

    /* renamed from: r */
    private void m151308r(C31138i c31138i) {
        int[] iArr;
        int i11;
        int i12 = c31138i.f143475r;
        int i13 = i12 % this.f143493c;
        int[] iArr2 = this.f143494d;
        int i14 = iArr2[i13];
        if (i14 == -1) {
            return;
        }
        if (this.f143496f[i14] == i12) {
            int[] iArr3 = this.f143495e;
            iArr2[i13] = iArr3[i14];
            iArr3[i14] = -1;
            return;
        }
        while (true) {
            iArr = this.f143495e;
            i11 = iArr[i14];
            if (i11 == -1 || this.f143496f[i11] == i12) {
                break;
            } else {
                i14 = i11;
            }
        }
        if (i11 != -1 && this.f143496f[i11] == i12) {
            iArr[i14] = iArr[i11];
            iArr[i11] = -1;
        }
    }

    @Override // p700z0.C31131b.a
    /* renamed from: a */
    public boolean mo151212a(C31138i c31138i) {
        if (m151309p(c31138i) != -1) {
            return true;
        }
        return false;
    }

    @Override // p700z0.C31131b.a
    /* renamed from: b */
    public C31138i mo151213b(int i11) {
        int i12 = this.f143500j;
        if (i12 == 0) {
            return null;
        }
        int i13 = this.f143501k;
        for (int i14 = 0; i14 < i12; i14++) {
            if (i14 == i11 && i13 != -1) {
                return this.f143503m.f143427d[this.f143496f[i13]];
            }
            i13 = this.f143499i[i13];
            if (i13 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // p700z0.C31131b.a
    /* renamed from: c */
    public void mo151214c() {
        int i11 = this.f143500j;
        int i12 = this.f143501k;
        for (int i13 = 0; i13 < i11; i13++) {
            float[] fArr = this.f143497g;
            fArr[i12] = fArr[i12] * (-1.0f);
            i12 = this.f143499i[i12];
            if (i12 == -1) {
                return;
            }
        }
    }

    @Override // p700z0.C31131b.a
    public void clear() {
        int i11 = this.f143500j;
        for (int i12 = 0; i12 < i11; i12++) {
            C31138i mo151213b = mo151213b(i12);
            if (mo151213b != null) {
                mo151213b.m151298e(this.f143502l);
            }
        }
        for (int i13 = 0; i13 < this.f143492b; i13++) {
            this.f143496f[i13] = -1;
            this.f143495e[i13] = -1;
        }
        for (int i14 = 0; i14 < this.f143493c; i14++) {
            this.f143494d[i14] = -1;
        }
        this.f143500j = 0;
        this.f143501k = -1;
    }

    @Override // p700z0.C31131b.a
    /* renamed from: d */
    public float mo151215d(C31138i c31138i, boolean z11) {
        int m151309p = m151309p(c31138i);
        if (m151309p == -1) {
            return 0.0f;
        }
        m151308r(c31138i);
        float f11 = this.f143497g[m151309p];
        if (this.f143501k == m151309p) {
            this.f143501k = this.f143499i[m151309p];
        }
        this.f143496f[m151309p] = -1;
        int[] iArr = this.f143498h;
        int i11 = iArr[m151309p];
        if (i11 != -1) {
            int[] iArr2 = this.f143499i;
            iArr2[i11] = iArr2[m151309p];
        }
        int i12 = this.f143499i[m151309p];
        if (i12 != -1) {
            iArr[i12] = iArr[m151309p];
        }
        this.f143500j--;
        c31138i.f143468B--;
        if (z11) {
            c31138i.m151298e(this.f143502l);
        }
        return f11;
    }

    @Override // p700z0.C31131b.a
    /* renamed from: e */
    public float mo151216e(C31131b c31131b, boolean z11) {
        float mo151219h = mo151219h(c31131b.f143418a);
        mo151215d(c31131b.f143418a, z11);
        C31139j c31139j = (C31139j) c31131b.f143422e;
        int mo151217f = c31139j.mo151217f();
        int i11 = 0;
        int i12 = 0;
        while (i11 < mo151217f) {
            int i13 = c31139j.f143496f[i12];
            if (i13 != -1) {
                mo151220i(this.f143503m.f143427d[i13], c31139j.f143497g[i12] * mo151219h, z11);
                i11++;
            }
            i12++;
        }
        return mo151219h;
    }

    @Override // p700z0.C31131b.a
    /* renamed from: f */
    public int mo151217f() {
        return this.f143500j;
    }

    @Override // p700z0.C31131b.a
    /* renamed from: g */
    public float mo151218g(int i11) {
        int i12 = this.f143500j;
        int i13 = this.f143501k;
        for (int i14 = 0; i14 < i12; i14++) {
            if (i14 == i11) {
                return this.f143497g[i13];
            }
            i13 = this.f143499i[i13];
            if (i13 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // p700z0.C31131b.a
    /* renamed from: h */
    public float mo151219h(C31138i c31138i) {
        int m151309p = m151309p(c31138i);
        if (m151309p != -1) {
            return this.f143497g[m151309p];
        }
        return 0.0f;
    }

    @Override // p700z0.C31131b.a
    /* renamed from: i */
    public void mo151220i(C31138i c31138i, float f11, boolean z11) {
        float f12 = f143490n;
        if (f11 > (-f12) && f11 < f12) {
            return;
        }
        int m151309p = m151309p(c31138i);
        if (m151309p == -1) {
            mo151221j(c31138i, f11);
            return;
        }
        float[] fArr = this.f143497g;
        float f13 = fArr[m151309p] + f11;
        fArr[m151309p] = f13;
        float f14 = f143490n;
        if (f13 > (-f14) && f13 < f14) {
            fArr[m151309p] = 0.0f;
            mo151215d(c31138i, z11);
        }
    }

    @Override // p700z0.C31131b.a
    /* renamed from: j */
    public void mo151221j(C31138i c31138i, float f11) {
        float f12 = f143490n;
        if (f11 > (-f12) && f11 < f12) {
            mo151215d(c31138i, true);
            return;
        }
        if (this.f143500j == 0) {
            m151304m(0, c31138i, f11);
            m151303l(c31138i, 0);
            this.f143501k = 0;
            return;
        }
        int m151309p = m151309p(c31138i);
        if (m151309p != -1) {
            this.f143497g[m151309p] = f11;
            return;
        }
        if (this.f143500j + 1 >= this.f143492b) {
            m151306o();
        }
        int i11 = this.f143500j;
        int i12 = this.f143501k;
        int i13 = -1;
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = this.f143496f[i12];
            int i16 = c31138i.f143475r;
            if (i15 == i16) {
                this.f143497g[i12] = f11;
                return;
            }
            if (i15 < i16) {
                i13 = i12;
            }
            i12 = this.f143499i[i12];
            if (i12 == -1) {
                break;
            }
        }
        m151307q(i13, c31138i, f11);
    }

    @Override // p700z0.C31131b.a
    /* renamed from: k */
    public void mo151222k(float f11) {
        int i11 = this.f143500j;
        int i12 = this.f143501k;
        for (int i13 = 0; i13 < i11; i13++) {
            float[] fArr = this.f143497g;
            fArr[i12] = fArr[i12] / f11;
            i12 = this.f143499i[i12];
            if (i12 == -1) {
                return;
            }
        }
    }

    /* renamed from: p */
    public int m151309p(C31138i c31138i) {
        if (this.f143500j != 0 && c31138i != null) {
            int i11 = c31138i.f143475r;
            int i12 = this.f143494d[i11 % this.f143493c];
            if (i12 == -1) {
                return -1;
            }
            if (this.f143496f[i12] == i11) {
                return i12;
            }
            do {
                i12 = this.f143495e[i12];
                if (i12 == -1) {
                    break;
                }
            } while (this.f143496f[i12] != i11);
            if (i12 != -1 && this.f143496f[i12] == i11) {
                return i12;
            }
        }
        return -1;
    }

    public String toString() {
        String str;
        String str2;
        String str3 = hashCode() + " { ";
        int i11 = this.f143500j;
        for (int i12 = 0; i12 < i11; i12++) {
            C31138i mo151213b = mo151213b(i12);
            if (mo151213b != null) {
                String str4 = str3 + mo151213b + " = " + mo151218g(i12) + " ";
                int m151309p = m151309p(mo151213b);
                String str5 = str4 + "[p: ";
                if (this.f143498h[m151309p] != -1) {
                    str = str5 + this.f143503m.f143427d[this.f143496f[this.f143498h[m151309p]]];
                } else {
                    str = str5 + "none";
                }
                String str6 = str + ", n: ";
                if (this.f143499i[m151309p] != -1) {
                    str2 = str6 + this.f143503m.f143427d[this.f143496f[this.f143499i[m151309p]]];
                } else {
                    str2 = str6 + "none";
                }
                str3 = str2 + "]";
            }
        }
        return str3 + " }";
    }
}
