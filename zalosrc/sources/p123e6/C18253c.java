package p123e6;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.maps.model.AdvancedMarkerOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.HashMap;
import java.util.Map;
import p151f6.InterfaceC18745b;
import p181g6.C19235a;
import p181g6.C19238d;
import p598w5.InterfaceC28746d;

/* renamed from: e6.c */
/* loaded from: classes2.dex */
public class C18253c {

    /* renamed from: a */
    private final InterfaceC18745b f92460a;

    /* renamed from: b */
    private final Map f92461b = new HashMap();

    /* renamed from: c */
    private final Map f92462c = new HashMap();

    /* renamed from: d */
    private C18261k f92463d;

    /* renamed from: e6.c$a */
    /* loaded from: classes2.dex */
    public interface a {
    }

    /* renamed from: e6.c$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: a */
        void mo48054a(CameraPosition cameraPosition);
    }

    /* renamed from: e6.c$c */
    /* loaded from: classes2.dex */
    public interface c {
        /* renamed from: f */
        void mo48056f();
    }

    /* renamed from: e6.c$d */
    /* loaded from: classes2.dex */
    public interface d {
        /* renamed from: c */
        void mo48055c();
    }

    /* renamed from: e6.c$e */
    /* loaded from: classes2.dex */
    public interface e {
        /* renamed from: g */
        void mo48057g(int i11);
    }

    /* renamed from: e6.c$f */
    /* loaded from: classes2.dex */
    public interface f {
        /* renamed from: a */
        void mo47978a();
    }

    /* renamed from: e6.c$g */
    /* loaded from: classes2.dex */
    public interface g {
        /* renamed from: e */
        boolean mo48026e(C19238d c19238d);
    }

    /* renamed from: e6.c$h */
    /* loaded from: classes2.dex */
    public interface h {
        /* renamed from: d */
        void mo48025d(Location location);
    }

    /* renamed from: e6.c$i */
    /* loaded from: classes2.dex */
    public interface i {
        /* renamed from: a */
        void mo47980a(Bitmap bitmap);
    }

    public C18253c(InterfaceC18745b interfaceC18745b) {
        this.f92460a = (InterfaceC18745b) AbstractC4205o.m19722k(interfaceC18745b);
    }

    /* renamed from: a */
    public final C19238d m97021a(MarkerOptions markerOptions) {
        if (markerOptions instanceof AdvancedMarkerOptions) {
            markerOptions.m30724L0(1);
        }
        try {
            AbstractC4205o.m19723l(markerOptions, "MarkerOptions must not be null.");
            InterfaceC28746d mo98752w2 = this.f92460a.mo98752w2(markerOptions);
            if (mo98752w2 != null) {
                if (markerOptions.m30723K0() == 1) {
                    return new C19235a(mo98752w2);
                }
                return new C19238d(mo98752w2);
            }
            return null;
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: b */
    public final void m97022b(C18251a c18251a, int i11, a aVar) {
        BinderC18263m binderC18263m;
        try {
            AbstractC4205o.m19723l(c18251a, "CameraUpdate must not be null.");
            InterfaceC18745b interfaceC18745b = this.f92460a;
            InterfaceC4271b m97014a = c18251a.m97014a();
            if (aVar == null) {
                binderC18263m = null;
            } else {
                binderC18263m = new BinderC18263m(aVar);
            }
            interfaceC18745b.mo98746n4(m97014a, i11, binderC18263m);
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: c */
    public final void m97023c() {
        try {
            this.f92460a.clear();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: d */
    public final CameraPosition m97024d() {
        try {
            return this.f92460a.mo98736M0();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: e */
    public final Location m97025e() {
        try {
            return this.f92460a.mo98739S4();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: f */
    public final C18258h m97026f() {
        try {
            return new C18258h(this.f92460a.mo98740U1());
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: g */
    public final C18261k m97027g() {
        try {
            if (this.f92463d == null) {
                this.f92463d = new C18261k(this.f92460a.mo98742g4());
            }
            return this.f92463d;
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: h */
    public final boolean m97028h() {
        try {
            return this.f92460a.mo98751w0();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: i */
    public final void m97029i(C18251a c18251a) {
        try {
            AbstractC4205o.m19723l(c18251a, "CameraUpdate must not be null.");
            this.f92460a.mo98745m3(c18251a.m97014a());
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: j */
    public boolean m97030j(MapStyleOptions mapStyleOptions) {
        try {
            return this.f92460a.mo98747q3(mapStyleOptions);
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: k */
    public final void m97031k(int i11) {
        try {
            this.f92460a.mo98743k1(i11);
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: l */
    public final void m97032l(boolean z11) {
        try {
            this.f92460a.mo98733E4(z11);
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: m */
    public final void m97033m(b bVar) {
        try {
            if (bVar == null) {
                this.f92460a.mo98744k3(null);
            } else {
                this.f92460a.mo98744k3(new BinderC18267q(this, bVar));
            }
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: n */
    public final void m97034n(c cVar) {
        try {
            if (cVar == null) {
                this.f92460a.mo98735L3(null);
            } else {
                this.f92460a.mo98735L3(new BinderC18270t(this, cVar));
            }
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: o */
    public final void m97035o(d dVar) {
        try {
            if (dVar == null) {
                this.f92460a.mo98748s0(null);
            } else {
                this.f92460a.mo98748s0(new BinderC18269s(this, dVar));
            }
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: p */
    public final void m97036p(e eVar) {
        try {
            if (eVar == null) {
                this.f92460a.mo98750u3(null);
            } else {
                this.f92460a.mo98750u3(new BinderC18268r(this, eVar));
            }
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: q */
    public void m97037q(f fVar) {
        try {
            if (fVar == null) {
                this.f92460a.mo98734L1(null);
            } else {
                this.f92460a.mo98734L1(new BinderC18265o(this, fVar));
            }
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: r */
    public final void m97038r(g gVar) {
        try {
            if (gVar == null) {
                this.f92460a.mo98738O2(null);
            } else {
                this.f92460a.mo98738O2(new BinderC18262l(this, gVar));
            }
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: s */
    public final void m97039s(h hVar) {
        try {
            if (hVar == null) {
                this.f92460a.mo98749t1(null);
            } else {
                this.f92460a.mo98749t1(new BinderC18264n(this, hVar));
            }
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: t */
    public final void m97040t(int i11, int i12, int i13, int i14) {
        try {
            this.f92460a.mo98741e3(i11, i12, i13, i14);
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: u */
    public final void m97041u(i iVar) {
        AbstractC4205o.m19723l(iVar, "Callback must not be null.");
        m97042v(iVar, null);
    }

    /* renamed from: v */
    public final void m97042v(i iVar, Bitmap bitmap) {
        InterfaceC4271b interfaceC4271b;
        AbstractC4205o.m19723l(iVar, "Callback must not be null.");
        if (bitmap != null) {
            interfaceC4271b = BinderC4273d.m19913I3(bitmap);
        } else {
            interfaceC4271b = null;
        }
        try {
            this.f92460a.mo98737M4(new BinderC18266p(this, iVar), (BinderC4273d) interfaceC4271b);
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }
}
