package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class fr1 implements j04 {

    /* renamed from: a */
    private final w04 f20259a;

    /* renamed from: b */
    private final w04 f20260b;

    /* renamed from: c */
    private final w04 f20261c;

    /* renamed from: d */
    private final w04 f20262d;

    /* renamed from: e */
    private final w04 f20263e;

    public fr1(w04 w04Var, w04 w04Var2, w04 w04Var3, w04 w04Var4, w04 w04Var5) {
        this.f20259a = w04Var;
        this.f20260b = w04Var2;
        this.f20261c = w04Var3;
        this.f20262d = w04Var4;
        this.f20263e = w04Var5;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        int i11;
        Context m20710a = ((bt0) this.f20259a).m20710a();
        final String zzb = ((rx1) this.f20260b).zzb();
        zzcgv m24707a = ((mt0) this.f20261c).m24707a();
        final EnumC5180xs enumC5180xs = (EnumC5180xs) this.f20262d.zzb();
        final String str = (String) this.f20263e.zzb();
        C4808ns c4808ns = new C4808ns(new C5031ts(m20710a));
        C4923qv m26191F = C4960rv.m26191F();
        m26191F.m25901q(m24707a.f32031q);
        m26191F.m25903s(m24707a.f32032r);
        if (true != m24707a.f32033s) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        m26191F.m25902r(i11);
        final C4960rv c4960rv = (C4960rv) m26191F.m25898n();
        c4808ns.m24993b(new InterfaceC4771ms() { // from class: com.google.android.gms.internal.ads.er1
            @Override // com.google.android.gms.internal.ads.InterfaceC4771ms
            /* renamed from: a */
            public final void mo20788a(C4514fu c4514fu) {
                EnumC5180xs enumC5180xs2 = EnumC5180xs.this;
                String str2 = zzb;
                C4960rv c4960rv2 = c4960rv;
                String str3 = str;
                C5254zs c5254zs = (C5254zs) c4514fu.m22172q().m26779m();
                c5254zs.m28594q(enumC5180xs2);
                c4514fu.m22176v(c5254zs);
                C5144wt c5144wt = (C5144wt) c4514fu.m22173r().m26779m();
                c5144wt.m27713q(str2);
                c5144wt.m27714r(c4960rv2);
                c4514fu.m22178x(c5144wt);
                c4514fu.m22179y(str3);
            }
        });
        return c4808ns;
    }
}
