package p438q5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4073c;
import com.google.android.gms.common.internal.AbstractC4178f;
import com.google.android.gms.common.internal.C4175e;
import p380o4.AbstractC24010a;

/* renamed from: q5.g */
/* loaded from: classes2.dex */
public final class C25127g extends AbstractC4178f {

    /* renamed from: s */
    private final AbstractC24010a.a f120654s;

    public C25127g(Context context, Looper looper, C4175e c4175e, AbstractC24010a.a aVar, AbstractC4073c.b bVar, AbstractC4073c.c cVar) {
        super(context, looper, 68, c4175e, bVar, cVar);
        this.f120654s = new AbstractC24010a.a.C32912a(aVar == null ? AbstractC24010a.a.f116317s : aVar).m125892a(AbstractC25122b.m130215a()).m125893b();
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof InterfaceC25130j) {
            return (InterfaceC25130j) queryLocalInterface;
        }
        return new C25129i(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    protected final Bundle getGetServiceRequestExtraArgs() {
        return this.f120654s.m125891a();
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d, com.google.android.gms.common.api.C4071a.f
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
