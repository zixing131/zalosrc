package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class cg2 implements sh2, rh2 {

    /* renamed from: a */
    private final ApplicationInfo f18389a;

    /* renamed from: b */
    private final PackageInfo f18390b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cg2(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        this.f18389a = applicationInfo;
        this.f18390b = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20086a(Object obj) {
        Integer valueOf;
        Bundle bundle = (Bundle) obj;
        String str = this.f18389a.packageName;
        PackageInfo packageInfo = this.f18390b;
        String str2 = null;
        if (packageInfo == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(packageInfo.versionCode);
        }
        bundle.putString("pn", str);
        if (valueOf != null) {
            bundle.putInt("vc", valueOf.intValue());
        }
        PackageInfo packageInfo2 = this.f18390b;
        if (packageInfo2 != null) {
            str2 = packageInfo2.versionName;
        }
        if (str2 != null) {
            bundle.putString("vnm", str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 29;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return kc3.m23877i(this);
    }
}
