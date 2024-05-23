package p598w5;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: w5.f */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC28748f extends AbstractBinderC28760r implements InterfaceC28749g {
    /* renamed from: N */
    public static InterfaceC28749g m143880N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        if (queryLocalInterface instanceof InterfaceC28749g) {
            return (InterfaceC28749g) queryLocalInterface;
        }
        return new C28747e(iBinder);
    }
}
