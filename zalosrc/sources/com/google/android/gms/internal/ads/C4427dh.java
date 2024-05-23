package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.dh */
/* loaded from: classes2.dex */
public final class C4427dh {

    /* renamed from: a */
    public final InterfaceC4543gm f19215a;

    /* renamed from: b */
    public final Object f19216b;

    /* renamed from: c */
    public final int f19217c;

    /* renamed from: d */
    public final InterfaceC4951rm[] f19218d;

    /* renamed from: e */
    public final boolean[] f19219e;

    /* renamed from: f */
    public final long f19220f;

    /* renamed from: g */
    public int f19221g;

    /* renamed from: h */
    public long f19222h;

    /* renamed from: i */
    public boolean f19223i;

    /* renamed from: j */
    public boolean f19224j;

    /* renamed from: k */
    public boolean f19225k;

    /* renamed from: l */
    public C4427dh f19226l;

    /* renamed from: m */
    public C4691kn f19227m;

    /* renamed from: n */
    private final InterfaceC4760mh[] f19228n;

    /* renamed from: o */
    private final InterfaceC4797nh[] f19229o;

    /* renamed from: p */
    private final AbstractC4654jn f19230p;

    /* renamed from: q */
    private final InterfaceC4617im f19231q;

    /* renamed from: r */
    private C4691kn f19232r;

    /* renamed from: s */
    private final co0 f19233s;

    public C4427dh(InterfaceC4760mh[] interfaceC4760mhArr, InterfaceC4797nh[] interfaceC4797nhArr, long j11, AbstractC4654jn abstractC4654jn, co0 co0Var, InterfaceC4617im interfaceC4617im, Object obj, int i11, int i12, boolean z11, long j12, byte[] bArr) {
        this.f19228n = interfaceC4760mhArr;
        this.f19229o = interfaceC4797nhArr;
        this.f19220f = j11;
        this.f19230p = abstractC4654jn;
        this.f19233s = co0Var;
        this.f19231q = interfaceC4617im;
        obj.getClass();
        this.f19216b = obj;
        this.f19217c = i11;
        this.f19221g = i12;
        this.f19223i = z11;
        this.f19222h = j12;
        this.f19218d = new InterfaceC4951rm[2];
        this.f19219e = new boolean[2];
        this.f19215a = interfaceC4617im.mo21747a(i12, co0Var.m20976l());
    }

    /* renamed from: a */
    public final long m21386a(long j11, boolean z11) {
        return m21387b(j11, false, new boolean[2]);
    }

    /* renamed from: b */
    public final long m21387b(long j11, boolean z11, boolean[] zArr) {
        boolean z12;
        boolean z13;
        C4581hn c4581hn = this.f19227m.f23389b;
        int i11 = 0;
        while (true) {
            boolean z14 = true;
            if (i11 >= 2) {
                break;
            }
            boolean[] zArr2 = this.f19219e;
            if (z11 || !this.f19227m.m23968a(this.f19232r, i11)) {
                z14 = false;
            }
            zArr2[i11] = z14;
            i11++;
        }
        long mo20588c = this.f19215a.mo20588c(c4581hn.m22978b(), this.f19219e, this.f19218d, zArr, j11);
        this.f19232r = this.f19227m;
        this.f19225k = false;
        int i12 = 0;
        while (true) {
            InterfaceC4951rm[] interfaceC4951rmArr = this.f19218d;
            if (i12 < 2) {
                if (interfaceC4951rmArr[i12] != null) {
                    if (c4581hn.m22977a(i12) != null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    AbstractC4361bo.m20613e(z13);
                    this.f19225k = true;
                } else {
                    if (c4581hn.m22977a(i12) == null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    AbstractC4361bo.m20613e(z12);
                }
                i12++;
            } else {
                this.f19233s.m20968d(this.f19228n, this.f19227m.f23388a, c4581hn);
                return mo20588c;
            }
        }
    }

    /* renamed from: c */
    public final void m21388c() {
        try {
            this.f19231q.mo21750d(this.f19215a);
        } catch (RuntimeException unused) {
        }
    }

    /* renamed from: d */
    public final boolean m21389d() {
        if (!this.f19224j) {
            return false;
        }
        if (this.f19225k && this.f19215a.zzg() != Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean m21390e() {
        C4691kn mo22086a = this.f19230p.mo22086a(this.f19229o, this.f19215a.zzn());
        C4691kn c4691kn = this.f19232r;
        if (c4691kn != null) {
            for (int i11 = 0; i11 < 2; i11++) {
                if (mo22086a.m23968a(c4691kn, i11)) {
                }
            }
            return false;
        }
        this.f19227m = mo22086a;
        return true;
    }
}
