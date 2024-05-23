package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
final class th0 implements gc3 {

    /* renamed from: a */
    final /* synthetic */ tc3 f28330a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public th0(uh0 uh0Var, tc3 tc3Var) {
        this.f28330a = tc3Var;
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final void zza(Throwable th2) {
        List list;
        list = uh0.f28897m;
        list.remove(this.f28330a);
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list;
        list = uh0.f28897m;
        list.remove(this.f28330a);
    }
}
