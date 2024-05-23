package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class d90 {

    /* renamed from: a */
    private final h80 f19135a;

    /* renamed from: b */
    private tc3 f19136b;

    public d90(h80 h80Var) {
        this.f19135a = h80Var;
    }

    /* renamed from: d */
    private final void m21284d() {
        if (this.f19136b == null) {
            pl0 pl0Var = new pl0();
            this.f19136b = pl0Var;
            this.f19135a.m22725b(null).m27653e(new tl0() { // from class: com.google.android.gms.internal.ads.b90
                public /* synthetic */ b90() {
                }

                @Override // com.google.android.gms.internal.ads.tl0
                public final void zza(Object obj) {
                    pl0.this.zzd((i80) obj);
                }
            }, new rl0() { // from class: com.google.android.gms.internal.ads.c90
                public /* synthetic */ c90() {
                }

                @Override // com.google.android.gms.internal.ads.rl0
                public final void zza() {
                    pl0.this.zze(new zzbtz("Cannot get Javascript Engine"));
                }
            });
        }
    }

    /* renamed from: a */
    public final g90 m21285a(String str, n80 n80Var, m80 m80Var) {
        m21284d();
        return new g90(this.f19136b, "google.afma.activeView.handleUpdate", n80Var, m80Var);
    }

    /* renamed from: b */
    public final void m21286b(String str, c40 c40Var) {
        m21284d();
        this.f19136b = kc3.m23882n(this.f19136b, new qb3() { // from class: com.google.android.gms.internal.ads.z80

            /* renamed from: a */
            public final /* synthetic */ String f31405a;

            /* renamed from: b */
            public final /* synthetic */ c40 f31406b;

            public /* synthetic */ z80(String str2, c40 c40Var2) {
                r1 = str2;
                r2 = c40Var2;
            }

            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                i80 i80Var = (i80) obj;
                i80Var.mo23138l0(r1, r2);
                return kc3.m23877i(i80Var);
            }
        }, kl0.f23368f);
    }

    /* renamed from: c */
    public final void m21287c(String str, c40 c40Var) {
        this.f19136b = kc3.m23881m(this.f19136b, new y43() { // from class: com.google.android.gms.internal.ads.a90

            /* renamed from: a */
            public final /* synthetic */ String f16977a;

            /* renamed from: b */
            public final /* synthetic */ c40 f16978b;

            public /* synthetic */ a90(String str2, c40 c40Var2) {
                r1 = str2;
                r2 = c40Var2;
            }

            @Override // com.google.android.gms.internal.ads.y43
            public final Object apply(Object obj) {
                i80 i80Var = (i80) obj;
                i80Var.mo23137j0(r1, r2);
                return i80Var;
            }
        }, kl0.f23368f);
    }
}
