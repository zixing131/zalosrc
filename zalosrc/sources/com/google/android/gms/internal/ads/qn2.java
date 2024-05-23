package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class qn2 {

    /* renamed from: a */
    private final os2 f26894a;

    /* renamed from: b */
    private final e71 f26895b;

    /* renamed from: c */
    private final Executor f26896c;

    /* renamed from: d */
    private pn2 f26897d;

    public qn2(os2 os2Var, e71 e71Var, Executor executor) {
        this.f26894a = os2Var;
        this.f26895b = e71Var;
        this.f26896c = executor;
    }

    /* renamed from: e */
    public final ys2 m25823e() {
        dr2 zzg = this.f26895b.zzg();
        return this.f26894a.mo25253c(zzg.f19398d, zzg.f19400f, zzg.f19404j);
    }

    /* renamed from: c */
    public final tc3 m25824c() {
        tc3 m23874f;
        pn2 pn2Var = this.f26897d;
        if (pn2Var == null) {
            if (!((Boolean) AbstractC4482ez.f19860a.m24091e()).booleanValue()) {
                pn2 pn2Var2 = new pn2(null, m25823e(), null);
                this.f26897d = pn2Var2;
                m23874f = kc3.m23877i(pn2Var2);
            } else {
                m23874f = kc3.m23874f(kc3.m23881m(ac3.m20071D(this.f26895b.zzb().m19992e(this.f26894a.zza())), new nn2(this), this.f26896c), zzedj.class, new mn2(this), this.f26896c);
            }
            return kc3.m23881m(m23874f, ln2.f23997a, this.f26896c);
        }
        return kc3.m23877i(pn2Var);
    }
}
