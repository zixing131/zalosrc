package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.AbstractC4150d;
import com.google.android.gms.common.internal.AbstractC4172d;
import p230i6.InterfaceC20314f;

/* renamed from: com.google.android.gms.measurement.internal.k3 */
/* loaded from: classes2.dex */
public final class C6038k3 extends AbstractC4172d {
    public C6038k3(Context context, Looper looper, AbstractC4172d.a aVar, AbstractC4172d.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof InterfaceC20314f) {
            return (InterfaceC20314f) queryLocalInterface;
        }
        return new C5983f3(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d, com.google.android.gms.common.api.C4071a.f
    public final int getMinApkVersion() {
        return AbstractC4150d.f16480a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final String getServiceDescriptor() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    protected final String getStartServiceAction() {
        return "com.google.android.gms.measurement.START";
    }
}
