package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class dg0 extends AbstractC4759mg implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public dg0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    /* renamed from: E */
    public final void m21384E(cg0 cg0Var, String str, String str2) {
        Parcel zza = zza();
        AbstractC4871pg.m25460g(zza, cg0Var);
        zza.writeString(str);
        zza.writeString(str2);
        zzbl(2, zza);
    }
}
