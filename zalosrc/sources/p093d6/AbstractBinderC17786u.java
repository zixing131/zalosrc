package p093d6;

import android.os.IBinder;
import android.os.IInterface;
import p568v5.AbstractBinderC27537h;

/* renamed from: d6.u */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC17786u extends AbstractBinderC27537h implements InterfaceC17787v {
    /* renamed from: N */
    public static InterfaceC17787v m93919N(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        if (queryLocalInterface instanceof InterfaceC17787v) {
            return (InterfaceC17787v) queryLocalInterface;
        }
        return new C17785t(iBinder);
    }
}
