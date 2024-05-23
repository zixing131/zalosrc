package p700z0;

import java.util.Arrays;
import java.util.Comparator;
import p700z0.C31131b;

/* renamed from: z0.h */
/* loaded from: classes2.dex */
public class C31137h extends C31131b {

    /* renamed from: g */
    private int f143456g;

    /* renamed from: h */
    private C31138i[] f143457h;

    /* renamed from: i */
    private C31138i[] f143458i;

    /* renamed from: j */
    private int f143459j;

    /* renamed from: k */
    b f143460k;

    /* renamed from: l */
    C31132c f143461l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z0.h$a */
    /* loaded from: classes2.dex */
    public class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C31138i c31138i, C31138i c31138i2) {
            return c31138i.f143475r - c31138i2.f143475r;
        }
    }

    /* renamed from: z0.h$b */
    /* loaded from: classes2.dex */
    class b {

        /* renamed from: a */
        C31138i f143463a;

        /* renamed from: b */
        C31137h f143464b;

        public b(C31137h c31137h) {
            this.f143464b = c31137h;
        }

        /* renamed from: a */
        public boolean m151290a(C31138i c31138i, float f11) {
            boolean z11 = true;
            if (this.f143463a.f143473p) {
                for (int i11 = 0; i11 < 9; i11++) {
                    float[] fArr = this.f143463a.f143481x;
                    float f12 = fArr[i11] + (c31138i.f143481x[i11] * f11);
                    fArr[i11] = f12;
                    if (Math.abs(f12) < 1.0E-4f) {
                        this.f143463a.f143481x[i11] = 0.0f;
                    } else {
                        z11 = false;
                    }
                }
                if (z11) {
                    C31137h.this.m151288G(this.f143463a);
                }
                return false;
            }
            for (int i12 = 0; i12 < 9; i12++) {
                float f13 = c31138i.f143481x[i12];
                if (f13 != 0.0f) {
                    float f14 = f13 * f11;
                    if (Math.abs(f14) < 1.0E-4f) {
                        f14 = 0.0f;
                    }
                    this.f143463a.f143481x[i12] = f14;
                } else {
                    this.f143463a.f143481x[i12] = 0.0f;
                }
            }
            return true;
        }

        /* renamed from: b */
        public void m151291b(C31138i c31138i) {
            this.f143463a = c31138i;
        }

        /* renamed from: c */
        public final boolean m151292c() {
            for (int i11 = 8; i11 >= 0; i11--) {
                float f11 = this.f143463a.f143481x[i11];
                if (f11 > 0.0f) {
                    return false;
                }
                if (f11 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final boolean m151293d(C31138i c31138i) {
            int i11 = 8;
            while (true) {
                if (i11 < 0) {
                    break;
                }
                float f11 = c31138i.f143481x[i11];
                float f12 = this.f143463a.f143481x[i11];
                if (f12 == f11) {
                    i11--;
                } else if (f12 < f11) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        public void m151294e() {
            Arrays.fill(this.f143463a.f143481x, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f143463a != null) {
                for (int i11 = 0; i11 < 9; i11++) {
                    str = str + this.f143463a.f143481x[i11] + " ";
                }
            }
            return str + "] " + this.f143463a;
        }
    }

    public C31137h(C31132c c31132c) {
        super(c31132c);
        this.f143456g = 128;
        this.f143457h = new C31138i[128];
        this.f143458i = new C31138i[128];
        this.f143459j = 0;
        this.f143460k = new b(this);
        this.f143461l = c31132c;
    }

    /* renamed from: F */
    private final void m151287F(C31138i c31138i) {
        int i11;
        int i12 = this.f143459j + 1;
        C31138i[] c31138iArr = this.f143457h;
        if (i12 > c31138iArr.length) {
            C31138i[] c31138iArr2 = (C31138i[]) Arrays.copyOf(c31138iArr, c31138iArr.length * 2);
            this.f143457h = c31138iArr2;
            this.f143458i = (C31138i[]) Arrays.copyOf(c31138iArr2, c31138iArr2.length * 2);
        }
        C31138i[] c31138iArr3 = this.f143457h;
        int i13 = this.f143459j;
        c31138iArr3[i13] = c31138i;
        int i14 = i13 + 1;
        this.f143459j = i14;
        if (i14 > 1 && c31138iArr3[i13].f143475r > c31138i.f143475r) {
            int i15 = 0;
            while (true) {
                i11 = this.f143459j;
                if (i15 >= i11) {
                    break;
                }
                this.f143458i[i15] = this.f143457h[i15];
                i15++;
            }
            Arrays.sort(this.f143458i, 0, i11, new a());
            for (int i16 = 0; i16 < this.f143459j; i16++) {
                this.f143457h[i16] = this.f143458i[i16];
            }
        }
        c31138i.f143473p = true;
        c31138i.m151296b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public final void m151288G(C31138i c31138i) {
        int i11 = 0;
        while (i11 < this.f143459j) {
            if (this.f143457h[i11] == c31138i) {
                while (true) {
                    int i12 = this.f143459j;
                    if (i11 < i12 - 1) {
                        C31138i[] c31138iArr = this.f143457h;
                        int i13 = i11 + 1;
                        c31138iArr[i11] = c31138iArr[i13];
                        i11 = i13;
                    } else {
                        this.f143459j = i12 - 1;
                        c31138i.f143473p = false;
                        return;
                    }
                }
            } else {
                i11++;
            }
        }
    }

    @Override // p700z0.C31131b
    /* renamed from: B */
    public void mo151226B(C31133d c31133d, C31131b c31131b, boolean z11) {
        C31138i c31138i = c31131b.f143418a;
        if (c31138i == null) {
            return;
        }
        C31131b.a aVar = c31131b.f143422e;
        int mo151217f = aVar.mo151217f();
        for (int i11 = 0; i11 < mo151217f; i11++) {
            C31138i mo151213b = aVar.mo151213b(i11);
            float mo151218g = aVar.mo151218g(i11);
            this.f143460k.m151291b(mo151213b);
            if (this.f143460k.m151290a(c31138i, mo151218g)) {
                m151287F(mo151213b);
            }
            this.f143419b += c31131b.f143419b * mo151218g;
        }
        m151288G(c31138i);
    }

    @Override // p700z0.C31131b, p700z0.C31133d.a
    /* renamed from: b */
    public C31138i mo151230b(C31133d c31133d, boolean[] zArr) {
        int i11 = -1;
        for (int i12 = 0; i12 < this.f143459j; i12++) {
            C31138i c31138i = this.f143457h[i12];
            if (!zArr[c31138i.f143475r]) {
                this.f143460k.m151291b(c31138i);
                if (i11 == -1) {
                    if (!this.f143460k.m151292c()) {
                    }
                    i11 = i12;
                } else {
                    if (!this.f143460k.m151293d(this.f143457h[i11])) {
                    }
                    i11 = i12;
                }
            }
        }
        if (i11 == -1) {
            return null;
        }
        return this.f143457h[i11];
    }

    @Override // p700z0.C31131b, p700z0.C31133d.a
    /* renamed from: c */
    public void mo151231c(C31138i c31138i) {
        this.f143460k.m151291b(c31138i);
        this.f143460k.m151294e();
        c31138i.f143481x[c31138i.f143477t] = 1.0f;
        m151287F(c31138i);
    }

    @Override // p700z0.C31131b, p700z0.C31133d.a
    public void clear() {
        this.f143459j = 0;
        this.f143419b = 0.0f;
    }

    @Override // p700z0.C31131b, p700z0.C31133d.a
    public boolean isEmpty() {
        return this.f143459j == 0;
    }

    @Override // p700z0.C31131b
    public String toString() {
        String str = " goal -> (" + this.f143419b + ") : ";
        for (int i11 = 0; i11 < this.f143459j; i11++) {
            this.f143460k.m151291b(this.f143457h[i11]);
            str = str + this.f143460k + " ";
        }
        return str;
    }
}
