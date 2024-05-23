package p381o5;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.AbstractC4178f;
import com.google.android.gms.common.internal.C4175e;
import p355n4.AbstractC23541f;
import p704z4.InterfaceC31220c;
import p704z4.InterfaceC31228g;

/* renamed from: o5.d */
/* loaded from: classes2.dex */
public final class C24022d extends AbstractC4178f {
    /* JADX INFO: Access modifiers changed from: protected */
    public C24022d(Context context, Looper looper, C4175e c4175e, InterfaceC31220c interfaceC31220c, InterfaceC31228g interfaceC31228g) {
        super(context, looper, 300, c4175e, interfaceC31220c, interfaceC31228g);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        if (queryLocalInterface instanceof C24025g) {
            return (C24025g) queryLocalInterface;
        }
        return new C24025g(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final Feature[] getApiFeatures() {
        return AbstractC23541f.f114344b;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d, com.google.android.gms.common.api.C4071a.f
    public final int getMinApkVersion() {
        return 212800000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final String getServiceDescriptor() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    protected final String getStartServiceAction() {
        return "com.google.android.gms.appset.service.START";
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
