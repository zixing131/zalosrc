package com.google.android.gms.common.moduleinstall.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.AbstractC4178f;
import com.google.android.gms.common.internal.C4175e;
import p504s5.AbstractC26146n;
import p704z4.InterfaceC31220c;
import p704z4.InterfaceC31228g;

/* renamed from: com.google.android.gms.common.moduleinstall.internal.d */
/* loaded from: classes2.dex */
public final class C4248d extends AbstractC4178f {
    /* JADX INFO: Access modifiers changed from: protected */
    public C4248d(Context context, Looper looper, C4175e c4175e, InterfaceC31220c interfaceC31220c, InterfaceC31228g interfaceC31228g) {
        super(context, looper, 308, c4175e, interfaceC31220c, interfaceC31228g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        if (queryLocalInterface instanceof C4245a) {
            return (C4245a) queryLocalInterface;
        }
        return new C4245a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final Feature[] getApiFeatures() {
        return AbstractC26146n.f124374b;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d, com.google.android.gms.common.api.C4071a.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    protected final String getStartServiceAction() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    protected final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final boolean usesClientTelemetry() {
        return true;
    }
}
