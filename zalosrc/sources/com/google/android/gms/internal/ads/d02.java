package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzaz;
import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class d02 implements gc3 {

    /* renamed from: a */
    final /* synthetic */ jf0 f19050a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d02(h02 h02Var, jf0 jf0Var) {
        this.f19050a = jf0Var;
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final void zza(Throwable th2) {
        try {
            this.f19050a.mo22818n2(zzaz.zza(th2));
        } catch (RemoteException e11) {
            zze.zzb("Service can't call client", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.f19050a.mo22817O3((ParcelFileDescriptor) obj);
        } catch (RemoteException e11) {
            zze.zzb("Service can't call client", e11);
        }
    }
}
