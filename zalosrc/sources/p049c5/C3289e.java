package p049c5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.AbstractC4178f;
import com.google.android.gms.common.internal.C4175e;
import com.google.android.gms.common.internal.C4220t;
import p504s5.AbstractC26136d;
import p704z4.InterfaceC31220c;
import p704z4.InterfaceC31228g;

/* renamed from: c5.e */
/* loaded from: classes2.dex */
public final class C3289e extends AbstractC4178f {

    /* renamed from: s */
    private final C4220t f14079s;

    public C3289e(Context context, Looper looper, C4175e c4175e, C4220t c4220t, InterfaceC31220c interfaceC31220c, InterfaceC31228g interfaceC31228g) {
        super(context, looper, 270, c4175e, interfaceC31220c, interfaceC31228g);
        this.f14079s = c4220t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof C3285a) {
            return (C3285a) queryLocalInterface;
        }
        return new C3285a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final Feature[] getApiFeatures() {
        return AbstractC26136d.f124369b;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    protected final Bundle getGetServiceRequestExtraArgs() {
        return this.f14079s.m19795b();
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d, com.google.android.gms.common.api.C4071a.f
    public final int getMinApkVersion() {
        return 203400000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    protected final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    protected final boolean getUseDynamicLookup() {
        return true;
    }
}
