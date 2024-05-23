package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.v3 */
/* loaded from: classes2.dex */
final class C5080v3 {

    /* renamed from: a */
    public final InterfaceC4928r f29140a;

    /* renamed from: d */
    public C4635j4 f29143d;

    /* renamed from: e */
    public C4932r3 f29144e;

    /* renamed from: f */
    public int f29145f;

    /* renamed from: g */
    public int f29146g;

    /* renamed from: h */
    public int f29147h;

    /* renamed from: i */
    public int f29148i;

    /* renamed from: l */
    private boolean f29151l;

    /* renamed from: b */
    public final C4599i4 f29141b = new C4599i4();

    /* renamed from: c */
    public final x02 f29142c = new x02();

    /* renamed from: j */
    private final x02 f29149j = new x02(1);

    /* renamed from: k */
    private final x02 f29150k = new x02();

    public C5080v3(InterfaceC4928r interfaceC4928r, C4635j4 c4635j4, C4932r3 c4932r3) {
        this.f29140a = interfaceC4928r;
        this.f29143d = c4635j4;
        this.f29144e = c4932r3;
        m27142h(c4635j4, c4932r3);
    }

    /* renamed from: a */
    public final int m27136a() {
        int i11;
        if (!this.f29151l) {
            i11 = this.f29143d.f22625g[this.f29145f];
        } else if (this.f29141b.f22048j[this.f29145f]) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (m27141f() != null) {
            return i11 | 1073741824;
        }
        return i11;
    }

    /* renamed from: b */
    public final int m27137b() {
        if (!this.f29151l) {
            return this.f29143d.f22622d[this.f29145f];
        }
        return this.f29141b.f22046h[this.f29145f];
    }

    /* renamed from: c */
    public final int m27138c(int i11, int i12) {
        x02 x02Var;
        boolean z11;
        int i13;
        C4562h4 m27141f = m27141f();
        if (m27141f == null) {
            return 0;
        }
        int i14 = m27141f.f21530d;
        if (i14 != 0) {
            x02Var = this.f29141b.f22052n;
        } else {
            byte[] bArr = (byte[]) g92.m22347h(m27141f.f21531e);
            x02 x02Var2 = this.f29150k;
            int length = bArr.length;
            x02Var2.m27773d(bArr, length);
            x02Var = this.f29150k;
            i14 = length;
        }
        boolean m23123b = this.f29141b.m23123b(this.f29145f);
        if (m23123b || i12 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        x02 x02Var3 = this.f29149j;
        byte[] m27777h = x02Var3.m27777h();
        if (true != z11) {
            i13 = 0;
        } else {
            i13 = 128;
        }
        m27777h[0] = (byte) (i13 | i14);
        x02Var3.m27775f(0);
        this.f29140a.mo23299c(this.f29149j, 1, 1);
        this.f29140a.mo23299c(x02Var, i14, 1);
        if (!z11) {
            return i14 + 1;
        }
        if (!m23123b) {
            this.f29142c.m27772c(8);
            x02 x02Var4 = this.f29142c;
            byte[] m27777h2 = x02Var4.m27777h();
            m27777h2[0] = 0;
            m27777h2[1] = 1;
            m27777h2[2] = 0;
            m27777h2[3] = (byte) i12;
            m27777h2[4] = (byte) ((i11 >> 24) & 255);
            m27777h2[5] = (byte) ((i11 >> 16) & 255);
            m27777h2[6] = (byte) ((i11 >> 8) & 255);
            m27777h2[7] = (byte) (i11 & 255);
            this.f29140a.mo23299c(x02Var4, 8, 1);
            return i14 + 9;
        }
        x02 x02Var5 = this.f29141b.f22052n;
        int m27792w = x02Var5.m27792w();
        x02Var5.m27776g(-2);
        int i15 = (m27792w * 6) + 2;
        if (i12 != 0) {
            this.f29142c.m27772c(i15);
            byte[] m27777h3 = this.f29142c.m27777h();
            x02Var5.m27771b(m27777h3, 0, i15);
            int i16 = (((m27777h3[2] & 255) << 8) | (m27777h3[3] & 255)) + i12;
            m27777h3[2] = (byte) ((i16 >> 8) & 255);
            m27777h3[3] = (byte) (i16 & 255);
            x02Var5 = this.f29142c;
        }
        this.f29140a.mo23299c(x02Var5, i15, 1);
        return i14 + 1 + i15;
    }

    /* renamed from: d */
    public final long m27139d() {
        if (!this.f29151l) {
            return this.f29143d.f22621c[this.f29145f];
        }
        return this.f29141b.f22044f[this.f29147h];
    }

    /* renamed from: e */
    public final long m27140e() {
        if (!this.f29151l) {
            return this.f29143d.f22624f[this.f29145f];
        }
        C4599i4 c4599i4 = this.f29141b;
        return c4599i4.f22047i[this.f29145f];
    }

    /* renamed from: f */
    public final C4562h4 m27141f() {
        if (!this.f29151l) {
            return null;
        }
        C4599i4 c4599i4 = this.f29141b;
        C4932r3 c4932r3 = c4599i4.f22039a;
        int i11 = g92.f20474a;
        int i12 = c4932r3.f27060a;
        C4562h4 c4562h4 = c4599i4.f22051m;
        if (c4562h4 == null) {
            c4562h4 = this.f29143d.f22619a.m22277a(i12);
        }
        if (c4562h4 == null || !c4562h4.f21527a) {
            return null;
        }
        return c4562h4;
    }

    /* renamed from: h */
    public final void m27142h(C4635j4 c4635j4, C4932r3 c4932r3) {
        this.f29143d = c4635j4;
        this.f29144e = c4932r3;
        this.f29140a.mo23300d(c4635j4.f22619a.f20392f);
        m27143i();
    }

    /* renamed from: i */
    public final void m27143i() {
        C4599i4 c4599i4 = this.f29141b;
        c4599i4.f22042d = 0;
        c4599i4.f22054p = 0L;
        c4599i4.f22055q = false;
        c4599i4.f22049k = false;
        c4599i4.f22053o = false;
        c4599i4.f22051m = null;
        this.f29145f = 0;
        this.f29147h = 0;
        this.f29146g = 0;
        this.f29148i = 0;
        this.f29151l = false;
    }

    /* renamed from: k */
    public final boolean m27144k() {
        this.f29145f++;
        if (!this.f29151l) {
            return false;
        }
        int i11 = this.f29146g + 1;
        this.f29146g = i11;
        int[] iArr = this.f29141b.f22045g;
        int i12 = this.f29147h;
        if (i11 != iArr[i12]) {
            return true;
        }
        this.f29147h = i12 + 1;
        this.f29146g = 0;
        return false;
    }
}
