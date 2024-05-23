package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.common.internal.AbstractC4172d;

/* loaded from: classes2.dex */
public final class af0 extends zzc {
    public af0(Context context, Looper looper, AbstractC4172d.a aVar, AbstractC4172d.b bVar) {
        super(ag0.m20113a(context), looper, 8, aVar, bVar, null);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        if (queryLocalInterface instanceof ff0) {
            return (ff0) queryLocalInterface;
        }
        return new df0(iBinder);
    }

    /* renamed from: g */
    public final ff0 m20100g() {
        return (ff0) super.getService();
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    protected final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.START";
    }
}
