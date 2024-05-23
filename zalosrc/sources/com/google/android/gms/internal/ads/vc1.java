package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;

/* loaded from: classes2.dex */
public final class vc1 implements ta1 {

    /* renamed from: p */
    private int f29273p = ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21188a1)).intValue();

    /* renamed from: a */
    public final synchronized int m27207a() {
        return this.f29273p;
    }

    @Override // com.google.android.gms.internal.ads.ta1
    /* renamed from: j */
    public final synchronized void mo20718j(tq2 tq2Var) {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21198b1)).booleanValue()) {
            try {
                this.f29273p = tq2Var.f28473b.f27823b.f24015c;
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ta1
    /* renamed from: k */
    public final void mo20719k(zzcbc zzcbcVar) {
    }
}
