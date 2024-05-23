package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class m22 implements gc3 {

    /* renamed from: a */
    final /* synthetic */ ju2 f24351a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m22(n22 n22Var, ju2 ju2Var) {
        this.f24351a = ju2Var;
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final void zza(Throwable th2) {
        yk0.zzg("Failed to get offline buffered ping database: ".concat(String.valueOf(th2.getMessage())));
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.f24351a.zza((SQLiteDatabase) obj);
        } catch (Exception e11) {
            yk0.zzg("Error executing function on offline buffered ping database: ".concat(String.valueOf(e11.getMessage())));
        }
    }
}
