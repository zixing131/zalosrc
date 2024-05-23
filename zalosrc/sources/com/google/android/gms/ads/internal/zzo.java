package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.C4793nd;
import com.google.android.gms.internal.ads.C4830od;
import com.google.android.gms.internal.ads.zzcgv;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzo implements Callable {
    final /* synthetic */ zzs zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzo(zzs zzsVar) {
        this.zza = zzsVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzcgv zzcgvVar;
        Context context;
        zzs zzsVar = this.zza;
        zzcgvVar = zzsVar.zza;
        String str = zzcgvVar.f32030p;
        context = zzsVar.zzd;
        return new C4830od(C4793nd.m24885p(str, context, false));
    }
}
