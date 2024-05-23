package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class gn2 implements un2 {

    /* renamed from: a */
    private final os2 f20768a;

    /* renamed from: b */
    private final Executor f20769b;

    /* renamed from: c */
    private final gc3 f20770c = new en2(this);

    public gn2(os2 os2Var, Executor executor) {
        this.f20768a = os2Var;
        this.f20769b = executor;
    }

    @Override // com.google.android.gms.internal.ads.un2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ tc3 mo20182a(wn2 wn2Var, tn2 tn2Var, Object obj) {
        return m22485c(wn2Var, tn2Var, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ tc3 m22484b(e71 e71Var, pn2 pn2Var) {
        ws2 ws2Var;
        ys2 ys2Var = pn2Var.f26263b;
        zzcbc zzcbcVar = pn2Var.f26262a;
        if (ys2Var != null) {
            ws2Var = this.f20768a.mo25254d(ys2Var);
        } else {
            ws2Var = null;
        }
        if (ys2Var == null) {
            return kc3.m23877i(null);
        }
        if (ws2Var != null && zzcbcVar != null) {
            kc3.m23886r(e71Var.zzb().m19994g(zzcbcVar), this.f20770c, this.f20769b);
        }
        return kc3.m23877i(new fn2(ys2Var, zzcbcVar, ws2Var));
    }

    /* renamed from: c */
    public final tc3 m22485c(wn2 wn2Var, tn2 tn2Var, final e71 e71Var) {
        return kc3.m23874f(kc3.m23882n(ac3.m20071D(new qn2(this.f20768a, e71Var, this.f20769b).m25824c()), new qb3() { // from class: com.google.android.gms.internal.ads.cn2
            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return gn2.this.m22484b(e71Var, (pn2) obj);
            }
        }, this.f20769b), Exception.class, new dn2(this), this.f20769b);
    }

    @Override // com.google.android.gms.internal.ads.un2
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
