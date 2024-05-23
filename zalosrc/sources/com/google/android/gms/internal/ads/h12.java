package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class h12 implements gc3 {

    /* renamed from: a */
    final /* synthetic */ ju2 f21499a;

    public h12(i12 i12Var, ju2 ju2Var) {
        this.f21499a = ju2Var;
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final void zza(Throwable th2) {
        yk0.zzg("Failed to get offline signal database: ".concat(String.valueOf(th2.getMessage())));
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.f21499a.zza((SQLiteDatabase) obj);
        } catch (Exception e11) {
            yk0.zzg("Error executing function on offline signal database: ".concat(String.valueOf(e11.getMessage())));
        }
    }
}
