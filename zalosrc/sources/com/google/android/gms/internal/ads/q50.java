package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.common.internal.AbstractC4172d;

/* loaded from: classes2.dex */
public final class q50 extends zzc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public q50(Context context, Looper looper, AbstractC4172d.a aVar, AbstractC4172d.b bVar) {
        super(ag0.m20113a(context), looper, 166, aVar, bVar, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        if (queryLocalInterface instanceof v50) {
            return (v50) queryLocalInterface;
        }
        return new v50(iBinder);
    }

    /* renamed from: g */
    public final v50 m25662g() {
        return (v50) super.getService();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.HTTP";
    }
}
