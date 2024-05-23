package p670y5;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: y5.mh */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC30543mh extends AbstractBinderC30772z implements InterfaceC30562nh {
    /* renamed from: E */
    public static InterfaceC30562nh m149565E(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        if (queryLocalInterface instanceof InterfaceC30562nh) {
            return (InterfaceC30562nh) queryLocalInterface;
        }
        return new C30524lh(iBinder);
    }
}
