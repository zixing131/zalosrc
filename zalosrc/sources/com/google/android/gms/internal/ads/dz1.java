package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;

/* loaded from: classes2.dex */
public final class dz1 implements fz1 {

    /* renamed from: a */
    private final Map f19452a;

    /* renamed from: b */
    private final uc3 f19453b;

    /* renamed from: c */
    private final ra1 f19454c;

    public dz1(Map map, uc3 uc3Var, ra1 ra1Var) {
        this.f19452a = map;
        this.f19453b = uc3Var;
        this.f19454c = ra1Var;
    }

    @Override // com.google.android.gms.internal.ads.fz1
    /* renamed from: a */
    public final tc3 mo21571a(final zzcbc zzcbcVar) {
        this.f19454c.mo20719k(zzcbcVar);
        tc3 m23876h = kc3.m23876h(new zzebh(3));
        for (String str : ((String) zzay.zzc().m21823b(AbstractC4554gx.f21204b7)).split(",")) {
            final w04 w04Var = (w04) this.f19452a.get(str.trim());
            if (w04Var != null) {
                m23876h = kc3.m23875g(m23876h, zzebh.class, new qb3() { // from class: com.google.android.gms.internal.ads.bz1
                    @Override // com.google.android.gms.internal.ads.qb3
                    public final tc3 zza(Object obj) {
                        w04 w04Var2 = w04.this;
                        return ((fz1) w04Var2.zzb()).mo21571a(zzcbcVar);
                    }
                }, this.f19453b);
            }
        }
        kc3.m23886r(m23876h, new cz1(this), kl0.f23368f);
        return m23876h;
    }
}
