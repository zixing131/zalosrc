package p598w5;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: w5.c */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC28744c extends AbstractBinderC28760r implements InterfaceC28746d {
    /* renamed from: N */
    public static InterfaceC28746d m143879N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        if (queryLocalInterface instanceof InterfaceC28746d) {
            return (InterfaceC28746d) queryLocalInterface;
        }
        return new C28742b(iBinder);
    }
}
