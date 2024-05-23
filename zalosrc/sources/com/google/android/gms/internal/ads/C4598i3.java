package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.i3 */
/* loaded from: classes2.dex */
final class C4598i3 {

    /* renamed from: a */
    public final int f22024a;

    /* renamed from: b */
    public int f22025b;

    /* renamed from: c */
    public int f22026c;

    /* renamed from: d */
    public long f22027d;

    /* renamed from: e */
    private final boolean f22028e;

    /* renamed from: f */
    private final x02 f22029f;

    /* renamed from: g */
    private final x02 f22030g;

    /* renamed from: h */
    private int f22031h;

    /* renamed from: i */
    private int f22032i;

    public C4598i3(x02 x02Var, x02 x02Var2, boolean z11) {
        this.f22030g = x02Var;
        this.f22029f = x02Var2;
        this.f22028e = z11;
        x02Var2.m27775f(12);
        this.f22024a = x02Var2.m27791v();
        x02Var.m27775f(12);
        this.f22032i = x02Var.m27791v();
        nm4.m24964b(x02Var.m27782m() == 1, "first_chunk must be 1");
        this.f22025b = -1;
    }

    /* renamed from: a */
    public final boolean m23118a() {
        long m27762A;
        int i11 = this.f22025b + 1;
        this.f22025b = i11;
        if (i11 == this.f22024a) {
            return false;
        }
        if (this.f22028e) {
            m27762A = this.f22029f.m27763B();
        } else {
            m27762A = this.f22029f.m27762A();
        }
        this.f22027d = m27762A;
        if (this.f22025b == this.f22031h) {
            this.f22026c = this.f22030g.m27791v();
            this.f22030g.m27776g(4);
            int i12 = -1;
            int i13 = this.f22032i - 1;
            this.f22032i = i13;
            if (i13 > 0) {
                i12 = (-1) + this.f22030g.m27791v();
            }
            this.f22031h = i12;
        }
        return true;
    }
}
