package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class ei2 implements sh2 {

    /* renamed from: a */
    private final uc3 f19643a;

    /* renamed from: b */
    private final Context f19644b;

    public ei2(uc3 uc3Var, Context context) {
        this.f19643a = uc3Var;
        this.f19644b = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ ci2 m21722a() {
        int i11;
        boolean z11;
        int i12;
        TelephonyManager telephonyManager = (TelephonyManager) this.f19644b.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        zzt.zzp();
        int i13 = -1;
        if (zzs.zzx(this.f19644b, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f19644b.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i11 = type;
                i13 = ordinal;
            } else {
                i11 = -1;
            }
            z11 = connectivityManager.isActiveNetworkMetered();
            i12 = i13;
        } else {
            i11 = -2;
            z11 = false;
            i12 = -1;
        }
        return new ci2(networkOperator, i11, zzt.zzq().zzl(this.f19644b), phoneType, z11, i12);
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 39;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return this.f19643a.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.di2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ei2.this.m21722a();
            }
        });
    }
}
