package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.q6 */
/* loaded from: classes2.dex */
public final class C4898q6 {

    /* renamed from: a */
    private final List f26653a;

    /* renamed from: b */
    private final InterfaceC4928r[] f26654b;

    public C4898q6(List list) {
        this.f26653a = list;
        this.f26654b = new InterfaceC4928r[list.size()];
    }

    /* renamed from: a */
    public final void m25665a(long j11, x02 x02Var) {
        vl4.m27303a(j11, x02Var, this.f26654b);
    }

    /* renamed from: b */
    public final void m25666b(mm4 mm4Var, C4344b7 c4344b7) {
        for (int i11 = 0; i11 < this.f26654b.length; i11++) {
            c4344b7.m20420c();
            InterfaceC4928r mo21604i = mm4Var.mo21604i(c4344b7.m20418a(), 3);
            C4671k3 c4671k3 = (C4671k3) this.f26653a.get(i11);
            String str = c4671k3.f23099l;
            boolean z11 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z11 = false;
            }
            v71.m27174e(z11, "Invalid closed caption mime type provided: ".concat(String.valueOf(str)));
            String str2 = c4671k3.f23088a;
            if (str2 == null) {
                str2 = c4344b7.m20419b();
            }
            C5004t1 c5004t1 = new C5004t1();
            c5004t1.m26511h(str2);
            c5004t1.m26523s(str);
            c5004t1.m26525u(c4671k3.f23091d);
            c5004t1.m26515k(c4671k3.f23090c);
            c5004t1.m26502c0(c4671k3.f23085D);
            c5004t1.m26513i(c4671k3.f23101n);
            mo21604i.mo23300d(c5004t1.m26529y());
            this.f26654b[i11] = mo21604i;
        }
    }
}
