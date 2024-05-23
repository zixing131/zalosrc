package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ft0 implements j04 {

    /* renamed from: a */
    private final w04 f20277a;

    /* renamed from: b */
    private final w04 f20278b;

    public ft0(w04 w04Var, w04 w04Var2) {
        this.f20277a = w04Var;
        this.f20278b = w04Var2;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        t02 t02Var = (t02) this.f20277a.zzb();
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21063N1)).booleanValue()) {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21374s7)).booleanValue()) {
                emptySet = Collections.singleton(new if1(t02Var, uc3Var));
                r04.m25935b(emptySet);
                return emptySet;
            }
        }
        emptySet = Collections.emptySet();
        r04.m25935b(emptySet);
        return emptySet;
    }
}
