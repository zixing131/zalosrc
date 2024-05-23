package p416p5;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.AbstractC4150d;
import com.google.android.gms.common.api.AbstractC4073c;
import com.google.android.gms.common.internal.AbstractC4178f;
import com.google.android.gms.common.internal.C4175e;
import p380o4.AbstractC24011b;
import p380o4.AbstractC24012c;

/* renamed from: p5.b */
/* loaded from: classes2.dex */
public final class C24639b extends AbstractC4178f {

    /* renamed from: s */
    private final Bundle f118515s;

    public C24639b(Context context, Looper looper, C4175e c4175e, AbstractC24012c abstractC24012c, AbstractC4073c.b bVar, AbstractC4073c.c cVar) {
        super(context, looper, 16, c4175e, bVar, cVar);
        this.f118515s = new Bundle();
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof InterfaceC24640c) {
            return (InterfaceC24640c) queryLocalInterface;
        }
        return new C24641d(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    protected final Bundle getGetServiceRequestExtraArgs() {
        return this.f118515s;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d, com.google.android.gms.common.api.C4071a.f
    public final int getMinApkVersion() {
        return AbstractC4150d.f16480a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d, com.google.android.gms.common.api.C4071a.f
    public final boolean requiresSignIn() {
        C4175e m19665g = m19665g();
        if (!TextUtils.isEmpty(m19665g.m19648b()) && !m19665g.m19651e(AbstractC24011b.f116326c).isEmpty()) {
            return true;
        }
        return false;
    }
}
