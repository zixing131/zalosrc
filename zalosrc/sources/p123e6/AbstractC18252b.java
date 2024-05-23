package p123e6;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import p151f6.InterfaceC18743a;

/* renamed from: e6.b */
/* loaded from: classes2.dex */
public abstract class AbstractC18252b {

    /* renamed from: a */
    private static InterfaceC18743a f92459a;

    /* renamed from: a */
    public static C18251a m97015a(CameraPosition cameraPosition) {
        AbstractC4205o.m19723l(cameraPosition, "cameraPosition must not be null");
        try {
            return new C18251a(m97020f().mo98725B1(cameraPosition));
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: b */
    public static C18251a m97016b(LatLng latLng) {
        AbstractC4205o.m19723l(latLng, "latLng must not be null");
        try {
            return new C18251a(m97020f().mo98727h3(latLng));
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: c */
    public static C18251a m97017c(LatLng latLng, float f11) {
        AbstractC4205o.m19723l(latLng, "latLng must not be null");
        try {
            return new C18251a(m97020f().mo98728q2(latLng, f11));
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: d */
    public static C18251a m97018d(float f11) {
        try {
            return new C18251a(m97020f().mo98726f2(f11));
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: e */
    public static void m97019e(InterfaceC18743a interfaceC18743a) {
        f92459a = (InterfaceC18743a) AbstractC4205o.m19722k(interfaceC18743a);
    }

    /* renamed from: f */
    private static InterfaceC18743a m97020f() {
        return (InterfaceC18743a) AbstractC4205o.m19723l(f92459a, "CameraUpdateFactory is not initialized");
    }
}
