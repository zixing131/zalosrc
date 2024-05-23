package p182g7;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: g7.e */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC19263e extends AbstractBinderC19260b implements InterfaceC19264f {
    /* renamed from: N */
    public static InterfaceC19264f m100976N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        if (queryLocalInterface instanceof InterfaceC19264f) {
            return (InterfaceC19264f) queryLocalInterface;
        }
        return new C19262d(iBinder);
    }
}
