package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.common.internal.AbstractC4172d;

/* loaded from: classes2.dex */
public final class d13 extends zzc {

    /* renamed from: p */
    private final int f19056p;

    public d13(Context context, Looper looper, AbstractC4172d.a aVar, AbstractC4172d.b bVar, int i11) {
        super(context, looper, 116, aVar, bVar, null);
        this.f19056p = i11;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        if (queryLocalInterface instanceof g13) {
            return (g13) queryLocalInterface;
        }
        return new g13(iBinder);
    }

    /* renamed from: g */
    public final g13 m21248g() {
        return (g13) super.getService();
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d, com.google.android.gms.common.api.C4071a.f
    public final int getMinApkVersion() {
        return this.f19056p;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final String getServiceDescriptor() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    protected final String getStartServiceAction() {
        return "com.google.android.gms.gass.START";
    }
}
