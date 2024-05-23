package p093d6;

import android.os.IBinder;
import android.os.IInterface;
import p568v5.AbstractBinderC27537h;

/* renamed from: d6.o */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC17780o extends AbstractBinderC27537h implements InterfaceC17781p {
    /* renamed from: N */
    public static InterfaceC17781p m93916N(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        if (queryLocalInterface instanceof InterfaceC17781p) {
            return (InterfaceC17781p) queryLocalInterface;
        }
        return new C17779n(iBinder);
    }
}
