package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.x0 */
/* loaded from: classes2.dex */
final class C5152x0 extends AbstractC5114w0 {

    /* renamed from: b */
    private final x02 f30286b;

    /* renamed from: c */
    private final x02 f30287c;

    /* renamed from: d */
    private int f30288d;

    /* renamed from: e */
    private boolean f30289e;

    /* renamed from: f */
    private boolean f30290f;

    /* renamed from: g */
    private int f30291g;

    public C5152x0(InterfaceC4928r interfaceC4928r) {
        super(interfaceC4928r);
        this.f30286b = new x02(AbstractC4557h.f21470a);
        this.f30287c = new x02(4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5114w0
    /* renamed from: a */
    protected final boolean mo26217a(x02 x02Var) {
        int m27788s = x02Var.m27788s();
        int i11 = m27788s >> 4;
        int i12 = m27788s & 15;
        if (i12 == 7) {
            this.f30291g = i11;
            if (i11 != 5) {
                return true;
            }
            return false;
        }
        throw new zzabt("Video format not supported: " + i12);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5114w0
    /* renamed from: b */
    protected final boolean mo26218b(x02 x02Var, long j11) {
        int i11;
        int m27788s = x02Var.m27788s();
        long m27783n = j11 + (x02Var.m27783n() * 1000);
        if (m27788s == 0) {
            if (!this.f30289e) {
                x02 x02Var2 = new x02(new byte[x02Var.m27778i()]);
                x02Var.m27771b(x02Var2.m27777h(), 0, x02Var.m27778i());
                nl4 m24946a = nl4.m24946a(x02Var2);
                this.f30288d = m24946a.f25240b;
                C5004t1 c5004t1 = new C5004t1();
                c5004t1.m26523s("video/avc");
                c5004t1.m26508f0(m24946a.f25244f);
                c5004t1.m26528x(m24946a.f25241c);
                c5004t1.m26507f(m24946a.f25242d);
                c5004t1.m26520p(m24946a.f25243e);
                c5004t1.m26513i(m24946a.f25239a);
                this.f29649a.mo23300d(c5004t1.m26529y());
                this.f30289e = true;
                return false;
            }
        } else if (m27788s == 1 && this.f30289e) {
            if (this.f30291g == 1) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (!this.f30290f && i11 == 0) {
                return false;
            }
            byte[] m27777h = this.f30287c.m27777h();
            m27777h[0] = 0;
            m27777h[1] = 0;
            m27777h[2] = 0;
            int i12 = 4 - this.f30288d;
            int i13 = 0;
            while (x02Var.m27778i() > 0) {
                x02Var.m27771b(this.f30287c.m27777h(), i12, this.f30288d);
                this.f30287c.m27775f(0);
                int m27791v = this.f30287c.m27791v();
                this.f30286b.m27775f(0);
                this.f29649a.mo23301e(this.f30286b, 4);
                this.f29649a.mo23301e(x02Var, m27791v);
                i13 = i13 + 4 + m27791v;
            }
            this.f29649a.mo23302f(m27783n, i11, i13, 0, null);
            this.f30290f = true;
            return true;
        }
        return false;
    }
}
