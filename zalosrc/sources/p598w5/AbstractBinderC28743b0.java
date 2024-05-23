package p598w5;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: w5.b0 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC28743b0 extends AbstractBinderC28760r implements InterfaceC28745c0 {
    /* renamed from: N */
    public static InterfaceC28745c0 m143878N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        if (queryLocalInterface instanceof InterfaceC28745c0) {
            return (InterfaceC28745c0) queryLocalInterface;
        }
        return new C28741a0(iBinder);
    }
}
