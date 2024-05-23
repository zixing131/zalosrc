package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;

/* loaded from: classes2.dex */
public final class vt0 implements j04 {

    /* renamed from: a */
    private final w04 f29476a;

    /* renamed from: b */
    private final w04 f29477b;

    public vt0(w04 w04Var, w04 w04Var2) {
        this.f29476a = w04Var;
        this.f29477b = w04Var2;
    }

    @Override // com.google.android.gms.internal.ads.w04
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final xf0 zzb() {
        Context m20710a = ((bt0) this.f29476a).m20710a();
        xw2 xw2Var = (xw2) this.f29477b.zzb();
        u80 m24169b = zzt.zzf().m24169b(m20710a, zzcgv.m28720t(), xw2Var);
        o80 o80Var = r80.f27138b;
        m24169b.m26871a("google.afma.request.getAdDictionary", o80Var, o80Var);
        return new wf0(m20710a, zzt.zzf().m24169b(m20710a, zzcgv.m28720t(), xw2Var).m26871a("google.afma.sdkConstants.getSdkConstants", o80Var, o80Var));
    }
}
