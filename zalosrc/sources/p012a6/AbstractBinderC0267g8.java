package p012a6;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: a6.g8 */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC0267g8 extends AbstractBinderC0164b0 implements InterfaceC0287h9 {
    /* renamed from: E */
    public static InterfaceC0287h9 m727E(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
        if (queryLocalInterface instanceof InterfaceC0287h9) {
            return (InterfaceC0287h9) queryLocalInterface;
        }
        return new C0247f7(iBinder);
    }
}
