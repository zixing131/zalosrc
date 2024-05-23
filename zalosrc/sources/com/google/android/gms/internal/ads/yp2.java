package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class yp2 implements cb2 {

    /* renamed from: a */
    final /* synthetic */ zp2 f31076a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public yp2(zp2 zp2Var) {
        this.f31076a = zp2Var;
    }

    @Override // com.google.android.gms.internal.ads.cb2
    public final void zza() {
        synchronized (this.f31076a) {
            this.f31076a.f31672v = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.cb2
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        np1 np1Var;
        uq2 uq2Var;
        np1 np1Var2 = (np1) obj;
        synchronized (this.f31076a) {
            try {
                this.f31076a.f31672v = np1Var2;
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21024J2)).booleanValue()) {
                    vq2 m24971j = np1Var2.m24971j();
                    uq2Var = this.f31076a.f31669s;
                    m24971j.f29452a = uq2Var;
                }
                np1Var = this.f31076a.f31672v;
                np1Var.mo20375b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
