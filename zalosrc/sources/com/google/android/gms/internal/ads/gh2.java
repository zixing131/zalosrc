package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;
import p289k5.C21472e;

/* loaded from: classes2.dex */
public final class gh2 implements sh2 {

    /* renamed from: a */
    private final uc3 f20589a;

    /* renamed from: b */
    private final Context f20590b;

    /* renamed from: c */
    private final zzcgv f20591c;

    public gh2(uc3 uc3Var, Context context, zzcgv zzcgvVar) {
        this.f20589a = uc3Var;
        this.f20590b = context;
        this.f20591c = zzcgvVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ hh2 m22439a() {
        int i11;
        boolean m111065g = C21472e.m111067a(this.f20590b).m111065g();
        zzt.zzp();
        boolean zzA = zzs.zzA(this.f20590b);
        String str = this.f20591c.f32030p;
        zzt.zzp();
        boolean zzB = zzs.zzB();
        zzt.zzp();
        ApplicationInfo applicationInfo = this.f20590b.getApplicationInfo();
        if (applicationInfo == null) {
            i11 = 0;
        } else {
            i11 = applicationInfo.targetSdkVersion;
        }
        return new hh2(m111065g, zzA, str, zzB, i11, DynamiteModule.m19919c(this.f20590b, ModuleDescriptor.MODULE_ID), DynamiteModule.m19918a(this.f20590b, ModuleDescriptor.MODULE_ID));
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 35;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return this.f20589a.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.fh2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return gh2.this.m22439a();
            }
        });
    }
}
