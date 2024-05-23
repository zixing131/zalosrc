package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.AbstractC4073c;
import com.google.android.gms.common.internal.AbstractC4178f;
import com.google.android.gms.common.internal.C4175e;
import p093d6.AbstractC17773i0;
import p568v5.InterfaceC27535f;
import p568v5.InterfaceC27539j;

/* renamed from: com.google.android.gms.internal.location.j */
/* loaded from: classes2.dex */
public abstract class AbstractC5276j extends AbstractC4178f {

    /* renamed from: s */
    private final String f32201s;

    /* renamed from: t */
    protected final InterfaceC27539j f32202t;

    public AbstractC5276j(Context context, Looper looper, AbstractC4073c.b bVar, AbstractC4073c.c cVar, String str, C4175e c4175e) {
        super(context, looper, 23, c4175e, bVar, cVar);
        this.f32202t = new C5275i(this);
        this.f32201s = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof InterfaceC27535f) {
            return (InterfaceC27535f) queryLocalInterface;
        }
        return new C5268b(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final Feature[] getApiFeatures() {
        return AbstractC17773i0.f89958f;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    protected final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f32201s);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d, com.google.android.gms.common.api.C4071a.f
    public final int getMinApkVersion() {
        return 11717000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    protected final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
}
