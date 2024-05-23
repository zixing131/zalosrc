package p416p5;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: p5.j */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC24647j extends AbstractBinderC24644g implements InterfaceC24646i {
    /* renamed from: E */
    public static InterfaceC24646i m128188E(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
        if (queryLocalInterface instanceof InterfaceC24646i) {
            return (InterfaceC24646i) queryLocalInterface;
        }
        return new C24648k(iBinder);
    }
}
