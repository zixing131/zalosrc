package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hk */
/* loaded from: classes2.dex */
final class C4578hk {

    /* renamed from: a */
    public final int f21793a;

    /* renamed from: b */
    public int f21794b;

    /* renamed from: c */
    public int f21795c;

    /* renamed from: d */
    public long f21796d;

    /* renamed from: e */
    private final boolean f21797e;

    /* renamed from: f */
    private final C4655jo f21798f;

    /* renamed from: g */
    private final C4655jo f21799g;

    /* renamed from: h */
    private int f21800h;

    /* renamed from: i */
    private int f21801i;

    public C4578hk(C4655jo c4655jo, C4655jo c4655jo2, boolean z11) {
        this.f21799g = c4655jo;
        this.f21798f = c4655jo2;
        this.f21797e = z11;
        c4655jo2.m23686v(12);
        this.f21793a = c4655jo2.m23673i();
        c4655jo.m23686v(12);
        this.f21801i = c4655jo.m23673i();
        AbstractC4361bo.m20614f(c4655jo.m23669e() == 1, "first_chunk must be 1");
        this.f21794b = -1;
    }

    /* renamed from: a */
    public final boolean m22925a() {
        long m23677m;
        int i11 = this.f21794b + 1;
        this.f21794b = i11;
        if (i11 == this.f21793a) {
            return false;
        }
        if (this.f21797e) {
            m23677m = this.f21798f.m23678n();
        } else {
            m23677m = this.f21798f.m23677m();
        }
        this.f21796d = m23677m;
        if (this.f21794b == this.f21800h) {
            this.f21795c = this.f21799g.m23673i();
            this.f21799g.m23687w(4);
            int i12 = -1;
            int i13 = this.f21801i - 1;
            this.f21801i = i13;
            if (i13 > 0) {
                i12 = (-1) + this.f21799g.m23673i();
            }
            this.f21800h = i12;
        }
        return true;
    }
}
