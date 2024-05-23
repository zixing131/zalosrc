package p181g6;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import p598w5.InterfaceC28746d;

/* renamed from: g6.d */
/* loaded from: classes2.dex */
public class C19238d {

    /* renamed from: a */
    protected final InterfaceC28746d f95726a;

    public C19238d(InterfaceC28746d interfaceC28746d) {
        this.f95726a = (InterfaceC28746d) AbstractC4205o.m19722k(interfaceC28746d);
    }

    /* renamed from: a */
    public LatLng m100923a() {
        try {
            return this.f95726a.zzj();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: b */
    public Object m100924b() {
        try {
            return BinderC4273d.m19914Q(this.f95726a.zzi());
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: c */
    public boolean m100925c() {
        try {
            return this.f95726a.mo143875m();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: d */
    public void m100926d() {
        try {
            this.f95726a.zzo();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: e */
    public void m100927e(C19236b c19236b) {
        try {
            if (c19236b == null) {
                this.f95726a.mo143876p2(null);
            } else {
                this.f95726a.mo143876p2(c19236b.m100918a());
            }
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C19238d)) {
            return false;
        }
        try {
            return this.f95726a.mo143872D0(((C19238d) obj).f95726a);
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: f */
    public void m100928f(LatLng latLng) {
        if (latLng != null) {
            try {
                this.f95726a.mo143877r0(latLng);
                return;
            } catch (RemoteException e11) {
                throw new RuntimeRemoteException(e11);
            }
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    /* renamed from: g */
    public void m100929g(Object obj) {
        try {
            this.f95726a.mo143873K(BinderC4273d.m19913I3(obj));
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: h */
    public void m100930h(boolean z11) {
        try {
            this.f95726a.zzB(z11);
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    public int hashCode() {
        try {
            return this.f95726a.zzg();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: i */
    public void m100931i(float f11) {
        try {
            this.f95726a.mo143874d0(f11);
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }
}
