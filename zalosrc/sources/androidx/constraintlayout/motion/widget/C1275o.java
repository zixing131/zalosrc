package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.widget.C1293a;
import androidx.constraintlayout.widget.C1295c;
import java.util.Arrays;
import java.util.LinkedHashMap;
import p007a1.C0022c;

/* renamed from: androidx.constraintlayout.motion.widget.o */
/* loaded from: classes2.dex */
public class C1275o implements Comparable {

    /* renamed from: I */
    static String[] f5182I = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: A */
    int f5183A;

    /* renamed from: B */
    float f5184B;

    /* renamed from: C */
    C1273m f5185C;

    /* renamed from: D */
    LinkedHashMap f5186D;

    /* renamed from: E */
    int f5187E;

    /* renamed from: F */
    int f5188F;

    /* renamed from: G */
    double[] f5189G;

    /* renamed from: H */
    double[] f5190H;

    /* renamed from: p */
    C0022c f5191p;

    /* renamed from: r */
    float f5193r;

    /* renamed from: s */
    float f5194s;

    /* renamed from: t */
    float f5195t;

    /* renamed from: u */
    float f5196u;

    /* renamed from: v */
    float f5197v;

    /* renamed from: w */
    float f5198w;

    /* renamed from: z */
    int f5201z;

    /* renamed from: q */
    int f5192q = 0;

    /* renamed from: x */
    float f5199x = Float.NaN;

    /* renamed from: y */
    float f5200y = Float.NaN;

    public C1275o() {
        int i11 = AbstractC1264d.f5073f;
        this.f5201z = i11;
        this.f5183A = i11;
        this.f5184B = Float.NaN;
        this.f5185C = null;
        this.f5186D = new LinkedHashMap();
        this.f5187E = 0;
        this.f5189G = new double[18];
        this.f5190H = new double[18];
    }

    /* renamed from: d */
    private boolean m6162d(float f11, float f12) {
        if (!Float.isNaN(f11) && !Float.isNaN(f12)) {
            if (Math.abs(f11 - f12) <= 1.0E-6f) {
                return false;
            }
            return true;
        }
        if (Float.isNaN(f11) == Float.isNaN(f12)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void m6163b(C1295c.a aVar) {
        this.f5191p = C0022c.m59c(aVar.f5642d.f5733d);
        C1295c.c cVar = aVar.f5642d;
        this.f5201z = cVar.f5734e;
        this.f5183A = cVar.f5731b;
        this.f5199x = cVar.f5738i;
        this.f5192q = cVar.f5735f;
        this.f5188F = cVar.f5732c;
        this.f5200y = aVar.f5641c.f5748e;
        this.f5184B = aVar.f5643e.f5663D;
        for (String str : aVar.f5645g.keySet()) {
            C1293a c1293a = (C1293a) aVar.f5645g.get(str);
            if (c1293a != null && c1293a.m6409f()) {
                this.f5186D.put(str, c1293a);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public int compareTo(C1275o c1275o) {
        return Float.compare(this.f5194s, c1275o.f5194s);
    }

    /* renamed from: e */
    public void m6165e(C1275o c1275o, boolean[] zArr, String[] strArr, boolean z11) {
        boolean m6162d = m6162d(this.f5195t, c1275o.f5195t);
        boolean m6162d2 = m6162d(this.f5196u, c1275o.f5196u);
        zArr[0] = zArr[0] | m6162d(this.f5194s, c1275o.f5194s);
        boolean z12 = m6162d | m6162d2 | z11;
        zArr[1] = zArr[1] | z12;
        zArr[2] = z12 | zArr[2];
        zArr[3] = zArr[3] | m6162d(this.f5197v, c1275o.f5197v);
        zArr[4] = m6162d(this.f5198w, c1275o.f5198w) | zArr[4];
    }

    /* renamed from: g */
    public void m6166g(double[] dArr, int[] iArr) {
        float[] fArr = {this.f5194s, this.f5195t, this.f5196u, this.f5197v, this.f5198w, this.f5199x};
        int i11 = 0;
        for (int i12 : iArr) {
            if (i12 < 6) {
                dArr[i11] = fArr[r4];
                i11++;
            }
        }
    }

    /* renamed from: h */
    public void m6167h(double d11, int[] iArr, double[] dArr, float[] fArr, int i11) {
        float f11 = this.f5195t;
        float f12 = this.f5196u;
        float f13 = this.f5197v;
        float f14 = this.f5198w;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            float f15 = (float) dArr[i12];
            int i13 = iArr[i12];
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 == 4) {
                            f14 = f15;
                        }
                    } else {
                        f13 = f15;
                    }
                } else {
                    f12 = f15;
                }
            } else {
                f11 = f15;
            }
        }
        C1273m c1273m = this.f5185C;
        if (c1273m != null) {
            float[] fArr2 = new float[2];
            c1273m.m6148i(d11, fArr2, new float[2]);
            float f16 = fArr2[0];
            float f17 = fArr2[1];
            double d12 = f16;
            double d13 = f11;
            double d14 = f12;
            f11 = (float) ((d12 + (Math.sin(d14) * d13)) - (f13 / 2.0f));
            f12 = (float) ((f17 - (d13 * Math.cos(d14))) - (f14 / 2.0f));
        }
        fArr[i11] = f11 + (f13 / 2.0f) + 0.0f;
        fArr[i11 + 1] = f12 + (f14 / 2.0f) + 0.0f;
    }

    /* renamed from: i */
    public void m6168i(double d11, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f11;
        float f12 = this.f5195t;
        float f13 = this.f5196u;
        float f14 = this.f5197v;
        float f15 = this.f5198w;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f21 = (float) dArr[i11];
            float f22 = (float) dArr2[i11];
            int i12 = iArr[i11];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            f15 = f21;
                            f19 = f22;
                        }
                    } else {
                        f14 = f21;
                        f17 = f22;
                    }
                } else {
                    f13 = f21;
                    f18 = f22;
                }
            } else {
                f12 = f21;
                f16 = f22;
            }
        }
        float f23 = 2.0f;
        float f24 = (f17 / 2.0f) + f16;
        float f25 = (f19 / 2.0f) + f18;
        C1273m c1273m = this.f5185C;
        if (c1273m != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            c1273m.m6148i(d11, fArr3, fArr4);
            float f26 = fArr3[0];
            float f27 = fArr3[1];
            float f28 = fArr4[0];
            float f29 = fArr4[1];
            double d12 = f12;
            double d13 = f13;
            f11 = f14;
            float sin = (float) ((f26 + (Math.sin(d13) * d12)) - (f14 / 2.0f));
            float cos = (float) ((f27 - (d12 * Math.cos(d13))) - (f15 / 2.0f));
            double d14 = f16;
            double d15 = f18;
            float sin2 = (float) (f28 + (Math.sin(d13) * d14) + (Math.cos(d13) * d15));
            f25 = (float) ((f29 - (d14 * Math.cos(d13))) + (Math.sin(d13) * d15));
            f24 = sin2;
            f12 = sin;
            f13 = cos;
            f23 = 2.0f;
        } else {
            f11 = f14;
        }
        fArr[0] = f12 + (f11 / f23) + 0.0f;
        fArr[1] = f13 + (f15 / f23) + 0.0f;
        fArr2[0] = f24;
        fArr2[1] = f25;
    }

    /* renamed from: j */
    public int m6169j(String str, double[] dArr, int i11) {
        C1293a c1293a = (C1293a) this.f5186D.get(str);
        int i12 = 0;
        if (c1293a == null) {
            return 0;
        }
        if (c1293a.m6410g() == 1) {
            dArr[i11] = c1293a.m6407d();
            return 1;
        }
        int m6410g = c1293a.m6410g();
        c1293a.m6408e(new float[m6410g]);
        while (i12 < m6410g) {
            dArr[i11] = r2[i12];
            i12++;
            i11++;
        }
        return m6410g;
    }

    /* renamed from: m */
    public int m6170m(String str) {
        C1293a c1293a = (C1293a) this.f5186D.get(str);
        if (c1293a == null) {
            return 0;
        }
        return c1293a.m6410g();
    }

    /* renamed from: q */
    public void m6171q(int[] iArr, double[] dArr, float[] fArr, int i11) {
        float f11 = this.f5195t;
        float f12 = this.f5196u;
        float f13 = this.f5197v;
        float f14 = this.f5198w;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            float f15 = (float) dArr[i12];
            int i13 = iArr[i12];
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 == 4) {
                            f14 = f15;
                        }
                    } else {
                        f13 = f15;
                    }
                } else {
                    f12 = f15;
                }
            } else {
                f11 = f15;
            }
        }
        C1273m c1273m = this.f5185C;
        if (c1273m != null) {
            float m6149j = c1273m.m6149j();
            float m6150k = this.f5185C.m6150k();
            double d11 = f11;
            double d12 = f12;
            float sin = (float) ((m6149j + (Math.sin(d12) * d11)) - (f13 / 2.0f));
            f12 = (float) ((m6150k - (d11 * Math.cos(d12))) - (f14 / 2.0f));
            f11 = sin;
        }
        float f16 = f13 + f11;
        float f17 = f14 + f12;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        fArr[i11] = f11 + 0.0f;
        fArr[i11 + 1] = f12 + 0.0f;
        fArr[i11 + 2] = f16 + 0.0f;
        fArr[i11 + 3] = f12 + 0.0f;
        fArr[i11 + 4] = f16 + 0.0f;
        fArr[i11 + 5] = f17 + 0.0f;
        fArr[i11 + 6] = f11 + 0.0f;
        fArr[i11 + 7] = f17 + 0.0f;
    }

    /* renamed from: r */
    public boolean m6172r(String str) {
        return this.f5186D.containsKey(str);
    }

    /* renamed from: s */
    void m6173s(C1268h c1268h, C1275o c1275o, C1275o c1275o2) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15 = c1268h.f5074a / 100.0f;
        this.f5193r = f15;
        this.f5192q = c1268h.f5101j;
        if (Float.isNaN(c1268h.f5102k)) {
            f11 = f15;
        } else {
            f11 = c1268h.f5102k;
        }
        if (Float.isNaN(c1268h.f5103l)) {
            f12 = f15;
        } else {
            f12 = c1268h.f5103l;
        }
        float f16 = c1275o2.f5197v;
        float f17 = c1275o.f5197v;
        float f18 = c1275o2.f5198w;
        float f19 = c1275o.f5198w;
        this.f5194s = this.f5193r;
        float f21 = c1275o.f5195t;
        float f22 = c1275o.f5196u;
        float f23 = (c1275o2.f5195t + (f16 / 2.0f)) - ((f17 / 2.0f) + f21);
        float f24 = (c1275o2.f5196u + (f18 / 2.0f)) - (f22 + (f19 / 2.0f));
        float f25 = ((f16 - f17) * f11) / 2.0f;
        this.f5195t = (int) ((f21 + (f23 * f15)) - f25);
        float f26 = ((f18 - f19) * f12) / 2.0f;
        this.f5196u = (int) ((f22 + (f24 * f15)) - f26);
        this.f5197v = (int) (f17 + r9);
        this.f5198w = (int) (f19 + r12);
        if (Float.isNaN(c1268h.f5104m)) {
            f13 = f15;
        } else {
            f13 = c1268h.f5104m;
        }
        float f27 = 0.0f;
        if (Float.isNaN(c1268h.f5107p)) {
            f14 = 0.0f;
        } else {
            f14 = c1268h.f5107p;
        }
        if (!Float.isNaN(c1268h.f5105n)) {
            f15 = c1268h.f5105n;
        }
        if (!Float.isNaN(c1268h.f5106o)) {
            f27 = c1268h.f5106o;
        }
        this.f5187E = 0;
        this.f5195t = (int) (((c1275o.f5195t + (f13 * f23)) + (f27 * f24)) - f25);
        this.f5196u = (int) (((c1275o.f5196u + (f23 * f14)) + (f24 * f15)) - f26);
        this.f5191p = C0022c.m59c(c1268h.f5099h);
        this.f5201z = c1268h.f5100i;
    }

    /* renamed from: t */
    void m6174t(C1268h c1268h, C1275o c1275o, C1275o c1275o2) {
        float f11;
        float f12;
        float f13;
        float f14 = c1268h.f5074a / 100.0f;
        this.f5193r = f14;
        this.f5192q = c1268h.f5101j;
        if (Float.isNaN(c1268h.f5102k)) {
            f11 = f14;
        } else {
            f11 = c1268h.f5102k;
        }
        if (Float.isNaN(c1268h.f5103l)) {
            f12 = f14;
        } else {
            f12 = c1268h.f5103l;
        }
        float f15 = c1275o2.f5197v - c1275o.f5197v;
        float f16 = c1275o2.f5198w - c1275o.f5198w;
        this.f5194s = this.f5193r;
        if (!Float.isNaN(c1268h.f5104m)) {
            f14 = c1268h.f5104m;
        }
        float f17 = c1275o.f5195t;
        float f18 = c1275o.f5197v;
        float f19 = c1275o.f5196u;
        float f21 = c1275o.f5198w;
        float f22 = (c1275o2.f5195t + (c1275o2.f5197v / 2.0f)) - ((f18 / 2.0f) + f17);
        float f23 = (c1275o2.f5196u + (c1275o2.f5198w / 2.0f)) - ((f21 / 2.0f) + f19);
        float f24 = f22 * f14;
        float f25 = (f15 * f11) / 2.0f;
        this.f5195t = (int) ((f17 + f24) - f25);
        float f26 = f14 * f23;
        float f27 = (f16 * f12) / 2.0f;
        this.f5196u = (int) ((f19 + f26) - f27);
        this.f5197v = (int) (f18 + r7);
        this.f5198w = (int) (f21 + r8);
        if (Float.isNaN(c1268h.f5105n)) {
            f13 = 0.0f;
        } else {
            f13 = c1268h.f5105n;
        }
        this.f5187E = 1;
        float f28 = (int) ((c1275o.f5195t + f24) - f25);
        float f29 = (int) ((c1275o.f5196u + f26) - f27);
        this.f5195t = f28 + ((-f23) * f13);
        this.f5196u = f29 + (f22 * f13);
        this.f5183A = this.f5183A;
        this.f5191p = C0022c.m59c(c1268h.f5099h);
        this.f5201z = c1268h.f5100i;
    }

    /* renamed from: u */
    void m6175u(int i11, int i12, C1268h c1268h, C1275o c1275o, C1275o c1275o2) {
        float f11;
        float f12;
        float f13;
        float min;
        float f14;
        float f15;
        float f16 = c1268h.f5074a / 100.0f;
        this.f5193r = f16;
        this.f5192q = c1268h.f5101j;
        this.f5187E = c1268h.f5108q;
        if (Float.isNaN(c1268h.f5102k)) {
            f11 = f16;
        } else {
            f11 = c1268h.f5102k;
        }
        if (Float.isNaN(c1268h.f5103l)) {
            f12 = f16;
        } else {
            f12 = c1268h.f5103l;
        }
        float f17 = c1275o2.f5197v;
        float f18 = c1275o.f5197v;
        float f19 = c1275o2.f5198w;
        float f21 = c1275o.f5198w;
        this.f5194s = this.f5193r;
        this.f5197v = (int) (f18 + ((f17 - f18) * f11));
        this.f5198w = (int) (f21 + ((f19 - f21) * f12));
        int i13 = c1268h.f5108q;
        if (i13 != 1) {
            if (i13 != 2) {
                if (Float.isNaN(c1268h.f5104m)) {
                    f15 = f16;
                } else {
                    f15 = c1268h.f5104m;
                }
                float f22 = c1275o2.f5195t;
                float f23 = c1275o.f5195t;
                this.f5195t = (f15 * (f22 - f23)) + f23;
                if (!Float.isNaN(c1268h.f5105n)) {
                    f16 = c1268h.f5105n;
                }
                float f24 = c1275o2.f5196u;
                float f25 = c1275o.f5196u;
                this.f5196u = (f16 * (f24 - f25)) + f25;
            } else {
                if (Float.isNaN(c1268h.f5104m)) {
                    float f26 = c1275o2.f5195t;
                    float f27 = c1275o.f5195t;
                    min = ((f26 - f27) * f16) + f27;
                } else {
                    min = Math.min(f12, f11) * c1268h.f5104m;
                }
                this.f5195t = min;
                if (Float.isNaN(c1268h.f5105n)) {
                    float f28 = c1275o2.f5196u;
                    float f29 = c1275o.f5196u;
                    f14 = (f16 * (f28 - f29)) + f29;
                } else {
                    f14 = c1268h.f5105n;
                }
                this.f5196u = f14;
            }
        } else {
            if (Float.isNaN(c1268h.f5104m)) {
                f13 = f16;
            } else {
                f13 = c1268h.f5104m;
            }
            float f31 = c1275o2.f5195t;
            float f32 = c1275o.f5195t;
            this.f5195t = (f13 * (f31 - f32)) + f32;
            if (!Float.isNaN(c1268h.f5105n)) {
                f16 = c1268h.f5105n;
            }
            float f33 = c1275o2.f5196u;
            float f34 = c1275o.f5196u;
            this.f5196u = (f16 * (f33 - f34)) + f34;
        }
        this.f5183A = c1275o.f5183A;
        this.f5191p = C0022c.m59c(c1268h.f5099h);
        this.f5201z = c1268h.f5100i;
    }

    /* renamed from: v */
    void m6176v(int i11, int i12, C1268h c1268h, C1275o c1275o, C1275o c1275o2) {
        float f11;
        float f12;
        float f13 = c1268h.f5074a / 100.0f;
        this.f5193r = f13;
        this.f5192q = c1268h.f5101j;
        if (Float.isNaN(c1268h.f5102k)) {
            f11 = f13;
        } else {
            f11 = c1268h.f5102k;
        }
        if (Float.isNaN(c1268h.f5103l)) {
            f12 = f13;
        } else {
            f12 = c1268h.f5103l;
        }
        float f14 = c1275o2.f5197v;
        float f15 = c1275o.f5197v;
        float f16 = c1275o2.f5198w;
        float f17 = c1275o.f5198w;
        this.f5194s = this.f5193r;
        float f18 = c1275o.f5195t;
        float f19 = c1275o.f5196u;
        float f21 = c1275o2.f5195t + (f14 / 2.0f);
        float f22 = c1275o2.f5196u + (f16 / 2.0f);
        float f23 = (f14 - f15) * f11;
        this.f5195t = (int) ((f18 + ((f21 - ((f15 / 2.0f) + f18)) * f13)) - (f23 / 2.0f));
        float f24 = (f16 - f17) * f12;
        this.f5196u = (int) ((f19 + ((f22 - (f19 + (f17 / 2.0f))) * f13)) - (f24 / 2.0f));
        this.f5197v = (int) (f15 + f23);
        this.f5198w = (int) (f17 + f24);
        this.f5187E = 2;
        if (!Float.isNaN(c1268h.f5104m)) {
            this.f5195t = (int) (c1268h.f5104m * ((int) (i11 - this.f5197v)));
        }
        if (!Float.isNaN(c1268h.f5105n)) {
            this.f5196u = (int) (c1268h.f5105n * ((int) (i12 - this.f5198w)));
        }
        this.f5183A = this.f5183A;
        this.f5191p = C0022c.m59c(c1268h.f5099h);
        this.f5201z = c1268h.f5100i;
    }

    /* renamed from: w */
    public void m6177w(float f11, float f12, float f13, float f14) {
        this.f5195t = f11;
        this.f5196u = f12;
        this.f5197v = f13;
        this.f5198w = f14;
    }

    /* renamed from: x */
    public void m6178x(float f11, float f12, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f17 = (float) dArr[i11];
            double d11 = dArr2[i11];
            int i12 = iArr[i11];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            f16 = f17;
                        }
                    } else {
                        f14 = f17;
                    }
                } else {
                    f15 = f17;
                }
            } else {
                f13 = f17;
            }
        }
        float f18 = f13 - ((0.0f * f14) / 2.0f);
        float f19 = f15 - ((0.0f * f16) / 2.0f);
        fArr[0] = (f18 * (1.0f - f11)) + (((f14 * 1.0f) + f18) * f11) + 0.0f;
        fArr[1] = (f19 * (1.0f - f12)) + (((f16 * 1.0f) + f19) * f12) + 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    public void m6179y(float f11, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z11) {
        float f12;
        float f13;
        float f14 = this.f5195t;
        float f15 = this.f5196u;
        float f16 = this.f5197v;
        float f17 = this.f5198w;
        if (iArr.length != 0 && this.f5189G.length <= iArr[iArr.length - 1]) {
            int i11 = iArr[iArr.length - 1] + 1;
            this.f5189G = new double[i11];
            this.f5190H = new double[i11];
        }
        Arrays.fill(this.f5189G, Double.NaN);
        for (int i12 = 0; i12 < iArr.length; i12++) {
            double[] dArr4 = this.f5189G;
            int i13 = iArr[i12];
            dArr4[i13] = dArr[i12];
            this.f5190H[i13] = dArr2[i12];
        }
        float f18 = Float.NaN;
        int i14 = 0;
        float f19 = 0.0f;
        float f21 = 0.0f;
        float f22 = 0.0f;
        float f23 = 0.0f;
        while (true) {
            double[] dArr5 = this.f5189G;
            if (i14 >= dArr5.length) {
                break;
            }
            double d11 = 0.0d;
            if (Double.isNaN(dArr5[i14]) && (dArr3 == null || dArr3[i14] == 0.0d)) {
                f13 = f18;
            } else {
                if (dArr3 != null) {
                    d11 = dArr3[i14];
                }
                if (!Double.isNaN(this.f5189G[i14])) {
                    d11 = this.f5189G[i14] + d11;
                }
                f13 = f18;
                float f24 = (float) d11;
                float f25 = (float) this.f5190H[i14];
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            if (i14 != 4) {
                                if (i14 == 5) {
                                    f18 = f24;
                                }
                            } else {
                                f18 = f13;
                                f23 = f25;
                                f17 = f24;
                            }
                        } else {
                            f18 = f13;
                            f22 = f25;
                            f16 = f24;
                        }
                    } else {
                        f18 = f13;
                        f21 = f25;
                        f15 = f24;
                    }
                } else {
                    f18 = f13;
                    f19 = f25;
                    f14 = f24;
                }
                i14++;
            }
            f18 = f13;
            i14++;
        }
        float f26 = f18;
        C1273m c1273m = this.f5185C;
        if (c1273m != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            c1273m.m6148i(f11, fArr, fArr2);
            float f27 = fArr[0];
            float f28 = fArr[1];
            float f29 = fArr2[0];
            float f31 = fArr2[1];
            double d12 = f14;
            double d13 = f15;
            float sin = (float) ((f27 + (Math.sin(d13) * d12)) - (f16 / 2.0f));
            f12 = f17;
            float cos = (float) ((f28 - (Math.cos(d13) * d12)) - (f17 / 2.0f));
            double d14 = f19;
            double d15 = f21;
            float sin2 = (float) (f29 + (Math.sin(d13) * d14) + (Math.cos(d13) * d12 * d15));
            float cos2 = (float) ((f31 - (d14 * Math.cos(d13))) + (d12 * Math.sin(d13) * d15));
            if (dArr2.length >= 2) {
                dArr2[0] = sin2;
                dArr2[1] = cos2;
            }
            if (!Float.isNaN(f26)) {
                view.setRotation((float) (f26 + Math.toDegrees(Math.atan2(cos2, sin2))));
            }
            f14 = sin;
            f15 = cos;
        } else {
            f12 = f17;
            if (!Float.isNaN(f26)) {
                view.setRotation((float) (0.0f + f26 + Math.toDegrees(Math.atan2(f21 + (f23 / 2.0f), f19 + (f22 / 2.0f)))));
            }
        }
        if (view instanceof InterfaceC1263c) {
            ((InterfaceC1263c) view).mo6063a(f14, f15, f16 + f14, f15 + f12);
            return;
        }
        float f32 = f14 + 0.5f;
        int i15 = (int) f32;
        float f33 = f15 + 0.5f;
        int i16 = (int) f33;
        int i17 = (int) (f32 + f16);
        int i18 = (int) (f33 + f12);
        int i19 = i17 - i15;
        int i21 = i18 - i16;
        if (i19 != view.getMeasuredWidth() || i21 != view.getMeasuredHeight() || z11) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(i21, 1073741824));
        }
        view.layout(i15, i16, i17, i18);
    }

    /* renamed from: z */
    public void m6180z(C1273m c1273m, C1275o c1275o) {
        double d11 = ((this.f5195t + (this.f5197v / 2.0f)) - c1275o.f5195t) - (c1275o.f5197v / 2.0f);
        double d12 = ((this.f5196u + (this.f5198w / 2.0f)) - c1275o.f5196u) - (c1275o.f5198w / 2.0f);
        this.f5185C = c1273m;
        this.f5195t = (float) Math.hypot(d12, d11);
        if (Float.isNaN(this.f5184B)) {
            this.f5196u = (float) (Math.atan2(d12, d11) + 1.5707963267948966d);
        } else {
            this.f5196u = (float) Math.toRadians(this.f5184B);
        }
    }

    public C1275o(int i11, int i12, C1268h c1268h, C1275o c1275o, C1275o c1275o2) {
        int i13 = AbstractC1264d.f5073f;
        this.f5201z = i13;
        this.f5183A = i13;
        this.f5184B = Float.NaN;
        this.f5185C = null;
        this.f5186D = new LinkedHashMap();
        this.f5187E = 0;
        this.f5189G = new double[18];
        this.f5190H = new double[18];
        if (c1275o.f5183A != AbstractC1264d.f5073f) {
            m6175u(i11, i12, c1268h, c1275o, c1275o2);
            return;
        }
        int i14 = c1268h.f5108q;
        if (i14 == 1) {
            m6174t(c1268h, c1275o, c1275o2);
        } else if (i14 != 2) {
            m6173s(c1268h, c1275o, c1275o2);
        } else {
            m6176v(i11, i12, c1268h, c1275o, c1275o2);
        }
    }
}
