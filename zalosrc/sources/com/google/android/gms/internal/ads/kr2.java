package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;

/* loaded from: classes2.dex */
final class kr2 implements gc3 {

    /* renamed from: a */
    final /* synthetic */ zq0 f23461a;

    /* renamed from: b */
    final /* synthetic */ ox2 f23462b;

    /* renamed from: c */
    final /* synthetic */ n22 f23463c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public kr2(zq0 zq0Var, ox2 ox2Var, n22 n22Var) {
        this.f23461a = zq0Var;
        this.f23462b = ox2Var;
        this.f23463c = n22Var;
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final void zza(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        if (!this.f23461a.mo25866b().f22334k0) {
            this.f23462b.m25355c(str, null);
            return;
        }
        long mo105913a = zzt.zzB().mo105913a();
        String str2 = this.f23461a.mo26710w().f24014b;
        int i11 = 2;
        if (!zzt.zzo().m22947v(this.f23461a.getContext())) {
            if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21362r5)).booleanValue() || !this.f23461a.mo25866b().f22306T) {
                i11 = 1;
            }
        }
        this.f23463c.m24800d(new p22(mo105913a, str2, str, i11));
    }
}
