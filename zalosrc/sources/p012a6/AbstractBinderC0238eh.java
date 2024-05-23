package p012a6;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: a6.eh */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC0238eh extends AbstractBinderC0164b0 implements InterfaceC0257fh {
    /* renamed from: E */
    public static InterfaceC0257fh m694E(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
        if (queryLocalInterface instanceof InterfaceC0257fh) {
            return (InterfaceC0257fh) queryLocalInterface;
        }
        return new C0219dh(iBinder);
    }
}
