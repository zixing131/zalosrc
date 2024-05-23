package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ho1 implements c40 {

    /* renamed from: a */
    private final p10 f21860a;

    /* renamed from: b */
    private final xo1 f21861b;

    /* renamed from: c */
    private final d04 f21862c;

    public ho1(hk1 hk1Var, vj1 vj1Var, xo1 xo1Var, d04 d04Var) {
        this.f21860a = hk1Var.m22950c(vj1Var.m27270g0());
        this.f21861b = xo1Var;
        this.f21862c = d04Var;
    }

    @Override // com.google.android.gms.internal.ads.c40
    /* renamed from: a */
    public final void mo19973a(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.f21860a.mo24791R4((e10) this.f21862c.zzb(), str);
        } catch (RemoteException e11) {
            yk0.zzk("Failed to call onCustomClick for asset " + str + ".", e11);
        }
    }

    /* renamed from: b */
    public final void m22991b() {
        if (this.f21860a == null) {
            return;
        }
        this.f21861b.m27958i("/nativeAdCustomClick", this);
    }
}
