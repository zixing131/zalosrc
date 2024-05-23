package p356n5;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: n5.e */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC23562e extends AbstractBinderC23559b implements InterfaceC23563f {
    /* renamed from: E */
    public static InterfaceC23563f m123630E(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        if (queryLocalInterface instanceof InterfaceC23563f) {
            return (InterfaceC23563f) queryLocalInterface;
        }
        return new C23561d(iBinder);
    }
}
