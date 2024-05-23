package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.ads.zzg;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.AbstractC4172d;
import p229i5.AbstractC20281b;

/* renamed from: com.google.android.gms.internal.ads.zr */
/* loaded from: classes2.dex */
public final class C5253zr extends zzc {
    public C5253zr(Context context, Looper looper, AbstractC4172d.a aVar, AbstractC4172d.b bVar) {
        super(ag0.m20113a(context), looper, 123, aVar, bVar, null);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        if (queryLocalInterface instanceof C4365bs) {
            return (C4365bs) queryLocalInterface;
        }
        return new C4365bs(iBinder);
    }

    /* renamed from: g */
    public final boolean m28588g() {
        Feature[] availableFeatures = getAvailableFeatures();
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20963D1)).booleanValue() && AbstractC20281b.m105900b(availableFeatures, zzg.zza)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final Feature[] getApiFeatures() {
        return zzg.zzb;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    /* renamed from: h */
    public final C4365bs m28589h() {
        return (C4365bs) super.getService();
    }
}
