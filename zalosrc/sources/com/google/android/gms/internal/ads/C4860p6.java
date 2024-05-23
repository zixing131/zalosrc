package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.p6 */
/* loaded from: classes2.dex */
public final class C4860p6 implements InterfaceC4380c7 {

    /* renamed from: a */
    private final InterfaceC4823o6 f26078a;

    /* renamed from: b */
    private final x02 f26079b = new x02(32);

    /* renamed from: c */
    private int f26080c;

    /* renamed from: d */
    private int f26081d;

    /* renamed from: e */
    private boolean f26082e;

    /* renamed from: f */
    private boolean f26083f;

    public C4860p6(InterfaceC4823o6 interfaceC4823o6) {
        this.f26078a = interfaceC4823o6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4380c7
    /* renamed from: a */
    public final void mo20811a(x02 x02Var, int i11) {
        int i12;
        boolean z11;
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = x02Var.m27780k() + x02Var.m27788s();
        } else {
            i12 = -1;
        }
        if (this.f26083f) {
            if (i13 == 0) {
                return;
            }
            this.f26083f = false;
            x02Var.m27775f(i12);
            this.f26081d = 0;
        }
        while (x02Var.m27778i() > 0) {
            int i14 = this.f26081d;
            if (i14 < 3) {
                if (i14 == 0) {
                    int m27788s = x02Var.m27788s();
                    x02Var.m27775f(x02Var.m27780k() - 1);
                    if (m27788s == 255) {
                        this.f26083f = true;
                        return;
                    }
                }
                int min = Math.min(x02Var.m27778i(), 3 - this.f26081d);
                x02Var.m27771b(this.f26079b.m27777h(), this.f26081d, min);
                int i15 = this.f26081d + min;
                this.f26081d = i15;
                if (i15 == 3) {
                    this.f26079b.m27775f(0);
                    this.f26079b.m27774e(3);
                    this.f26079b.m27776g(1);
                    int m27788s2 = this.f26079b.m27788s();
                    int m27788s3 = this.f26079b.m27788s();
                    if ((m27788s2 & 128) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f26082e = z11;
                    this.f26080c = (((m27788s2 & 15) << 8) | m27788s3) + 3;
                    int m27779j = this.f26079b.m27779j();
                    int i16 = this.f26080c;
                    if (m27779j < i16) {
                        int m27779j2 = this.f26079b.m27779j();
                        this.f26079b.m27769H(Math.min(4098, Math.max(i16, m27779j2 + m27779j2)));
                    }
                }
            } else {
                int min2 = Math.min(x02Var.m27778i(), this.f26080c - i14);
                x02Var.m27771b(this.f26079b.m27777h(), this.f26081d, min2);
                int i17 = this.f26081d + min2;
                this.f26081d = i17;
                int i18 = this.f26080c;
                if (i17 != i18) {
                    continue;
                } else {
                    if (this.f26082e) {
                        if (g92.m22323Q(this.f26079b.m27777h(), 0, i18, -1) != 0) {
                            this.f26083f = true;
                            return;
                        }
                        this.f26079b.m27774e(this.f26080c - 4);
                    } else {
                        this.f26079b.m27774e(i18);
                    }
                    this.f26079b.m27775f(0);
                    this.f26078a.mo21618a(this.f26079b);
                    this.f26081d = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4380c7
    /* renamed from: b */
    public final void mo20812b(a72 a72Var, mm4 mm4Var, C4344b7 c4344b7) {
        this.f26078a.mo21619b(a72Var, mm4Var, c4344b7);
        this.f26083f = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4380c7
    public final void zzc() {
        this.f26083f = true;
    }
}
