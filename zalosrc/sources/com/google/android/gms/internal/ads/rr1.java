package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class rr1 implements j04 {

    /* renamed from: a */
    private final w04 f27359a;

    /* renamed from: b */
    private final w04 f27360b;

    public rr1(w04 w04Var, w04 w04Var2) {
        this.f27359a = w04Var;
        this.f27360b = w04Var2;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        js1 zzb = ((ks1) this.f27360b).zzb();
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21191a4)).booleanValue()) {
            emptySet = Collections.singleton(new if1(zzb, uc3Var));
        } else {
            emptySet = Collections.emptySet();
        }
        r04.m25935b(emptySet);
        return emptySet;
    }
}
