package p291k7;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: k7.l0 */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC21520l0 extends AbstractBinderC21509h1 implements InterfaceC21523m0 {
    /* renamed from: N */
    public static InterfaceC21523m0 m111174N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        if (queryLocalInterface instanceof InterfaceC21523m0) {
            return (InterfaceC21523m0) queryLocalInterface;
        }
        return new C21517k0(iBinder);
    }
}
