package p473r5;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.AbstractC4150d;
import com.google.android.gms.common.api.AbstractC4073c;
import com.google.android.gms.common.internal.AbstractC4178f;
import com.google.android.gms.common.internal.C4175e;

/* renamed from: r5.h */
/* loaded from: classes2.dex */
public final class C25659h extends AbstractC4178f {
    public C25659h(Context context, Looper looper, C4175e c4175e, AbstractC4073c.b bVar, AbstractC4073c.c cVar) {
        super(context, looper, 126, c4175e, bVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return queryLocalInterface instanceof InterfaceC25655d ? (InterfaceC25655d) queryLocalInterface : new C25656e(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d, com.google.android.gms.common.api.C4071a.f
    public final int getMinApkVersion() {
        return AbstractC4150d.f16480a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC4172d
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d
    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }
}
