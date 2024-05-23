package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e01 implements j04 {

    /* renamed from: a */
    private final w04 f19474a;

    /* renamed from: b */
    private final w04 f19475b;

    /* renamed from: c */
    private final w04 f19476c;

    public e01(w04 w04Var, w04 w04Var2, w04 w04Var3) {
        this.f19474a = w04Var;
        this.f19475b = w04Var2;
        this.f19476c = w04Var3;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton;
        yz0 yz0Var = (yz0) this.f19474a.zzb();
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        if (((JSONObject) this.f19476c.zzb()) == null) {
            singleton = Collections.emptySet();
        } else {
            singleton = Collections.singleton(new if1(yz0Var, uc3Var));
        }
        r04.m25935b(singleton);
        return singleton;
    }
}
