package p700z0;

import java.util.Arrays;
import p700z0.C31131b;

/* renamed from: z0.a */
/* loaded from: classes2.dex */
public class C31130a implements C31131b.a {

    /* renamed from: l */
    private static float f143406l = 0.001f;

    /* renamed from: b */
    private final C31131b f143408b;

    /* renamed from: c */
    protected final C31132c f143409c;

    /* renamed from: a */
    int f143407a = 0;

    /* renamed from: d */
    private int f143410d = 8;

    /* renamed from: e */
    private C31138i f143411e = null;

    /* renamed from: f */
    private int[] f143412f = new int[8];

    /* renamed from: g */
    private int[] f143413g = new int[8];

    /* renamed from: h */
    private float[] f143414h = new float[8];

    /* renamed from: i */
    private int f143415i = -1;

    /* renamed from: j */
    private int f143416j = -1;

    /* renamed from: k */
    private boolean f143417k = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C31130a(C31131b c31131b, C31132c c31132c) {
        this.f143408b = c31131b;
        this.f143409c = c31132c;
    }

    @Override // p700z0.C31131b.a
    /* renamed from: a */
    public boolean mo151212a(C31138i c31138i) {
        int i11 = this.f143415i;
        if (i11 == -1) {
            return false;
        }
        for (int i12 = 0; i11 != -1 && i12 < this.f143407a; i12++) {
            if (this.f143412f[i11] == c31138i.f143475r) {
                return true;
            }
            i11 = this.f143413g[i11];
        }
        return false;
    }

    @Override // p700z0.C31131b.a
    /* renamed from: b */
    public C31138i mo151213b(int i11) {
        int i12 = this.f143415i;
        for (int i13 = 0; i12 != -1 && i13 < this.f143407a; i13++) {
            if (i13 == i11) {
                return this.f143409c.f143427d[this.f143412f[i12]];
            }
            i12 = this.f143413g[i12];
        }
        return null;
    }

    @Override // p700z0.C31131b.a
    /* renamed from: c */
    public void mo151214c() {
        int i11 = this.f143415i;
        for (int i12 = 0; i11 != -1 && i12 < this.f143407a; i12++) {
            float[] fArr = this.f143414h;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f143413g[i11];
        }
    }

    @Override // p700z0.C31131b.a
    public final void clear() {
        int i11 = this.f143415i;
        for (int i12 = 0; i11 != -1 && i12 < this.f143407a; i12++) {
            C31138i c31138i = this.f143409c.f143427d[this.f143412f[i11]];
            if (c31138i != null) {
                c31138i.m151298e(this.f143408b);
            }
            i11 = this.f143413g[i11];
        }
        this.f143415i = -1;
        this.f143416j = -1;
        this.f143417k = false;
        this.f143407a = 0;
    }

    @Override // p700z0.C31131b.a
    /* renamed from: d */
    public final float mo151215d(C31138i c31138i, boolean z11) {
        if (this.f143411e == c31138i) {
            this.f143411e = null;
        }
        int i11 = this.f143415i;
        if (i11 == -1) {
            return 0.0f;
        }
        int i12 = 0;
        int i13 = -1;
        while (i11 != -1 && i12 < this.f143407a) {
            if (this.f143412f[i11] == c31138i.f143475r) {
                if (i11 == this.f143415i) {
                    this.f143415i = this.f143413g[i11];
                } else {
                    int[] iArr = this.f143413g;
                    iArr[i13] = iArr[i11];
                }
                if (z11) {
                    c31138i.m151298e(this.f143408b);
                }
                c31138i.f143468B--;
                this.f143407a--;
                this.f143412f[i11] = -1;
                if (this.f143417k) {
                    this.f143416j = i11;
                }
                return this.f143414h[i11];
            }
            i12++;
            i13 = i11;
            i11 = this.f143413g[i11];
        }
        return 0.0f;
    }

    @Override // p700z0.C31131b.a
    /* renamed from: e */
    public float mo151216e(C31131b c31131b, boolean z11) {
        float mo151219h = mo151219h(c31131b.f143418a);
        mo151215d(c31131b.f143418a, z11);
        C31131b.a aVar = c31131b.f143422e;
        int mo151217f = aVar.mo151217f();
        for (int i11 = 0; i11 < mo151217f; i11++) {
            C31138i mo151213b = aVar.mo151213b(i11);
            mo151220i(mo151213b, aVar.mo151219h(mo151213b) * mo151219h, z11);
        }
        return mo151219h;
    }

    @Override // p700z0.C31131b.a
    /* renamed from: f */
    public int mo151217f() {
        return this.f143407a;
    }

    @Override // p700z0.C31131b.a
    /* renamed from: g */
    public float mo151218g(int i11) {
        int i12 = this.f143415i;
        for (int i13 = 0; i12 != -1 && i13 < this.f143407a; i13++) {
            if (i13 == i11) {
                return this.f143414h[i12];
            }
            i12 = this.f143413g[i12];
        }
        return 0.0f;
    }

    @Override // p700z0.C31131b.a
    /* renamed from: h */
    public final float mo151219h(C31138i c31138i) {
        int i11 = this.f143415i;
        for (int i12 = 0; i11 != -1 && i12 < this.f143407a; i12++) {
            if (this.f143412f[i11] == c31138i.f143475r) {
                return this.f143414h[i11];
            }
            i11 = this.f143413g[i11];
        }
        return 0.0f;
    }

    @Override // p700z0.C31131b.a
    /* renamed from: i */
    public void mo151220i(C31138i c31138i, float f11, boolean z11) {
        float f12 = f143406l;
        if (f11 > (-f12) && f11 < f12) {
            return;
        }
        int i11 = this.f143415i;
        if (i11 == -1) {
            this.f143415i = 0;
            this.f143414h[0] = f11;
            this.f143412f[0] = c31138i.f143475r;
            this.f143413g[0] = -1;
            c31138i.f143468B++;
            c31138i.m151296b(this.f143408b);
            this.f143407a++;
            if (!this.f143417k) {
                int i12 = this.f143416j + 1;
                this.f143416j = i12;
                int[] iArr = this.f143412f;
                if (i12 >= iArr.length) {
                    this.f143417k = true;
                    this.f143416j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i13 = -1;
        for (int i14 = 0; i11 != -1 && i14 < this.f143407a; i14++) {
            int i15 = this.f143412f[i11];
            int i16 = c31138i.f143475r;
            if (i15 == i16) {
                float[] fArr = this.f143414h;
                float f13 = fArr[i11] + f11;
                float f14 = f143406l;
                if (f13 > (-f14) && f13 < f14) {
                    f13 = 0.0f;
                }
                fArr[i11] = f13;
                if (f13 == 0.0f) {
                    if (i11 == this.f143415i) {
                        this.f143415i = this.f143413g[i11];
                    } else {
                        int[] iArr2 = this.f143413g;
                        iArr2[i13] = iArr2[i11];
                    }
                    if (z11) {
                        c31138i.m151298e(this.f143408b);
                    }
                    if (this.f143417k) {
                        this.f143416j = i11;
                    }
                    c31138i.f143468B--;
                    this.f143407a--;
                    return;
                }
                return;
            }
            if (i15 < i16) {
                i13 = i11;
            }
            i11 = this.f143413g[i11];
        }
        int i17 = this.f143416j;
        int i18 = i17 + 1;
        if (this.f143417k) {
            int[] iArr3 = this.f143412f;
            if (iArr3[i17] != -1) {
                i17 = iArr3.length;
            }
        } else {
            i17 = i18;
        }
        int[] iArr4 = this.f143412f;
        if (i17 >= iArr4.length && this.f143407a < iArr4.length) {
            int i19 = 0;
            while (true) {
                int[] iArr5 = this.f143412f;
                if (i19 >= iArr5.length) {
                    break;
                }
                if (iArr5[i19] == -1) {
                    i17 = i19;
                    break;
                }
                i19++;
            }
        }
        int[] iArr6 = this.f143412f;
        if (i17 >= iArr6.length) {
            i17 = iArr6.length;
            int i21 = this.f143410d * 2;
            this.f143410d = i21;
            this.f143417k = false;
            this.f143416j = i17 - 1;
            this.f143414h = Arrays.copyOf(this.f143414h, i21);
            this.f143412f = Arrays.copyOf(this.f143412f, this.f143410d);
            this.f143413g = Arrays.copyOf(this.f143413g, this.f143410d);
        }
        this.f143412f[i17] = c31138i.f143475r;
        this.f143414h[i17] = f11;
        if (i13 != -1) {
            int[] iArr7 = this.f143413g;
            iArr7[i17] = iArr7[i13];
            iArr7[i13] = i17;
        } else {
            this.f143413g[i17] = this.f143415i;
            this.f143415i = i17;
        }
        c31138i.f143468B++;
        c31138i.m151296b(this.f143408b);
        this.f143407a++;
        if (!this.f143417k) {
            this.f143416j++;
        }
        int i22 = this.f143416j;
        int[] iArr8 = this.f143412f;
        if (i22 >= iArr8.length) {
            this.f143417k = true;
            this.f143416j = iArr8.length - 1;
        }
    }

    @Override // p700z0.C31131b.a
    /* renamed from: j */
    public final void mo151221j(C31138i c31138i, float f11) {
        if (f11 == 0.0f) {
            mo151215d(c31138i, true);
            return;
        }
        int i11 = this.f143415i;
        if (i11 == -1) {
            this.f143415i = 0;
            this.f143414h[0] = f11;
            this.f143412f[0] = c31138i.f143475r;
            this.f143413g[0] = -1;
            c31138i.f143468B++;
            c31138i.m151296b(this.f143408b);
            this.f143407a++;
            if (!this.f143417k) {
                int i12 = this.f143416j + 1;
                this.f143416j = i12;
                int[] iArr = this.f143412f;
                if (i12 >= iArr.length) {
                    this.f143417k = true;
                    this.f143416j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i13 = -1;
        for (int i14 = 0; i11 != -1 && i14 < this.f143407a; i14++) {
            int i15 = this.f143412f[i11];
            int i16 = c31138i.f143475r;
            if (i15 == i16) {
                this.f143414h[i11] = f11;
                return;
            }
            if (i15 < i16) {
                i13 = i11;
            }
            i11 = this.f143413g[i11];
        }
        int i17 = this.f143416j;
        int i18 = i17 + 1;
        if (this.f143417k) {
            int[] iArr2 = this.f143412f;
            if (iArr2[i17] != -1) {
                i17 = iArr2.length;
            }
        } else {
            i17 = i18;
        }
        int[] iArr3 = this.f143412f;
        if (i17 >= iArr3.length && this.f143407a < iArr3.length) {
            int i19 = 0;
            while (true) {
                int[] iArr4 = this.f143412f;
                if (i19 >= iArr4.length) {
                    break;
                }
                if (iArr4[i19] == -1) {
                    i17 = i19;
                    break;
                }
                i19++;
            }
        }
        int[] iArr5 = this.f143412f;
        if (i17 >= iArr5.length) {
            i17 = iArr5.length;
            int i21 = this.f143410d * 2;
            this.f143410d = i21;
            this.f143417k = false;
            this.f143416j = i17 - 1;
            this.f143414h = Arrays.copyOf(this.f143414h, i21);
            this.f143412f = Arrays.copyOf(this.f143412f, this.f143410d);
            this.f143413g = Arrays.copyOf(this.f143413g, this.f143410d);
        }
        this.f143412f[i17] = c31138i.f143475r;
        this.f143414h[i17] = f11;
        if (i13 != -1) {
            int[] iArr6 = this.f143413g;
            iArr6[i17] = iArr6[i13];
            iArr6[i13] = i17;
        } else {
            this.f143413g[i17] = this.f143415i;
            this.f143415i = i17;
        }
        c31138i.f143468B++;
        c31138i.m151296b(this.f143408b);
        int i22 = this.f143407a + 1;
        this.f143407a = i22;
        if (!this.f143417k) {
            this.f143416j++;
        }
        int[] iArr7 = this.f143412f;
        if (i22 >= iArr7.length) {
            this.f143417k = true;
        }
        if (this.f143416j >= iArr7.length) {
            this.f143417k = true;
            this.f143416j = iArr7.length - 1;
        }
    }

    @Override // p700z0.C31131b.a
    /* renamed from: k */
    public void mo151222k(float f11) {
        int i11 = this.f143415i;
        for (int i12 = 0; i11 != -1 && i12 < this.f143407a; i12++) {
            float[] fArr = this.f143414h;
            fArr[i11] = fArr[i11] / f11;
            i11 = this.f143413g[i11];
        }
    }

    public String toString() {
        int i11 = this.f143415i;
        String str = "";
        for (int i12 = 0; i11 != -1 && i12 < this.f143407a; i12++) {
            str = ((str + " -> ") + this.f143414h[i11] + " : ") + this.f143409c.f143427d[this.f143412f[i11]];
            i11 = this.f143413g[i11];
        }
        return str;
    }
}
