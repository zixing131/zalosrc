package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.n5 */
/* loaded from: classes2.dex */
public final class C4785n5 implements InterfaceC4822o5 {

    /* renamed from: a */
    private final List f25027a;

    /* renamed from: b */
    private final InterfaceC4928r[] f25028b;

    /* renamed from: c */
    private boolean f25029c;

    /* renamed from: d */
    private int f25030d;

    /* renamed from: e */
    private int f25031e;

    /* renamed from: f */
    private long f25032f = -9223372036854775807L;

    public C4785n5(List list) {
        this.f25027a = list;
        this.f25028b = new InterfaceC4928r[list.size()];
    }

    /* renamed from: d */
    private final boolean m24855d(x02 x02Var, int i11) {
        if (x02Var.m27778i() == 0) {
            return false;
        }
        if (x02Var.m27788s() != i11) {
            this.f25029c = false;
        }
        this.f25030d--;
        return this.f25029c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: a */
    public final void mo20009a(x02 x02Var) {
        if (this.f25029c) {
            if (this.f25030d == 2 && !m24855d(x02Var, 32)) {
                return;
            }
            if (this.f25030d == 1 && !m24855d(x02Var, 0)) {
                return;
            }
            int m27780k = x02Var.m27780k();
            int m27778i = x02Var.m27778i();
            for (InterfaceC4928r interfaceC4928r : this.f25028b) {
                x02Var.m27775f(m27780k);
                interfaceC4928r.mo23301e(x02Var, m27778i);
            }
            this.f25031e += m27778i;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: b */
    public final void mo20010b(mm4 mm4Var, C4344b7 c4344b7) {
        for (int i11 = 0; i11 < this.f25028b.length; i11++) {
            C5195y6 c5195y6 = (C5195y6) this.f25027a.get(i11);
            c4344b7.m20420c();
            InterfaceC4928r mo21604i = mm4Var.mo21604i(c4344b7.m20418a(), 3);
            C5004t1 c5004t1 = new C5004t1();
            c5004t1.m26511h(c4344b7.m20419b());
            c5004t1.m26523s("application/dvbsubs");
            c5004t1.m26513i(Collections.singletonList(c5195y6.f30814b));
            c5004t1.m26515k(c5195y6.f30813a);
            mo21604i.mo23300d(c5004t1.m26529y());
            this.f25028b[i11] = mo21604i;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: c */
    public final void mo20011c(long j11, int i11) {
        if ((i11 & 4) == 0) {
            return;
        }
        this.f25029c = true;
        if (j11 != -9223372036854775807L) {
            this.f25032f = j11;
        }
        this.f25031e = 0;
        this.f25030d = 2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    public final void zzc() {
        if (this.f25029c) {
            if (this.f25032f != -9223372036854775807L) {
                for (InterfaceC4928r interfaceC4928r : this.f25028b) {
                    interfaceC4928r.mo23302f(this.f25032f, 1, this.f25031e, 0, null);
                }
            }
            this.f25029c = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    public final void zze() {
        this.f25029c = false;
        this.f25032f = -9223372036854775807L;
    }
}
