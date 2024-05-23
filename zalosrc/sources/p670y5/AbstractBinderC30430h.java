package p670y5;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: y5.h */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC30430h extends AbstractBinderC30772z implements InterfaceC30449i {
    /* renamed from: E */
    public static InterfaceC30449i m149524E(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
        if (queryLocalInterface instanceof InterfaceC30449i) {
            return (InterfaceC30449i) queryLocalInterface;
        }
        return new C30411g(iBinder);
    }
}
