package p181g6;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import p598w5.InterfaceC28745c0;

/* renamed from: g6.c */
/* loaded from: classes2.dex */
public abstract class AbstractC19237c {

    /* renamed from: a */
    private static InterfaceC28745c0 f95725a;

    /* renamed from: a */
    public static C19236b m100919a(Bitmap bitmap) {
        AbstractC4205o.m19723l(bitmap, "image must not be null");
        try {
            return new C19236b(m100922d().mo143871y0(bitmap));
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: b */
    public static C19236b m100920b(int i11) {
        try {
            return new C19236b(m100922d().mo143870n(i11));
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: c */
    public static void m100921c(InterfaceC28745c0 interfaceC28745c0) {
        if (f95725a != null) {
            return;
        }
        f95725a = (InterfaceC28745c0) AbstractC4205o.m19723l(interfaceC28745c0, "delegate must not be null");
    }

    /* renamed from: d */
    private static InterfaceC28745c0 m100922d() {
        return (InterfaceC28745c0) AbstractC4205o.m19723l(f95725a, "IBitmapDescriptorFactory is not initialized");
    }
}
