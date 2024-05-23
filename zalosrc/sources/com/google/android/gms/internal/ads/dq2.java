package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;

/* loaded from: classes2.dex */
final class dq2 implements cb2 {

    /* renamed from: a */
    final /* synthetic */ fq2 f19392a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dq2(fq2 fq2Var) {
        this.f19392a = fq2Var;
    }

    @Override // com.google.android.gms.internal.ads.cb2
    public final void zza() {
        synchronized (this.f19392a) {
            this.f19392a.f20250s = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.cb2
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        np1 np1Var;
        uq2 uq2Var;
        np1 np1Var2 = (np1) obj;
        synchronized (this.f19392a) {
            try {
                this.f19392a.f20250s = np1Var2;
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21024J2)).booleanValue()) {
                    vq2 m24971j = np1Var2.m24971j();
                    uq2Var = this.f19392a.f20249r;
                    m24971j.f29452a = uq2Var;
                }
                np1Var = this.f19392a.f20250s;
                np1Var.mo20375b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
