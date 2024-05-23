package p051c7;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: c7.k */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC3316k extends AbstractBinderC3313h implements InterfaceC3317l {
    /* renamed from: N */
    public static InterfaceC3317l m16786N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        if (queryLocalInterface instanceof InterfaceC3317l) {
            return (InterfaceC3317l) queryLocalInterface;
        }
        return new C3315j(iBinder);
    }
}
