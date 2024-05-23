package p123e6;

import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.VisibleRegion;
import p151f6.InterfaceC18749d;

/* renamed from: e6.h */
/* loaded from: classes2.dex */
public final class C18258h {

    /* renamed from: a */
    private final InterfaceC18749d f92469a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C18258h(InterfaceC18749d interfaceC18749d) {
        this.f92469a = interfaceC18749d;
    }

    /* renamed from: a */
    public VisibleRegion m97046a() {
        try {
            return this.f92469a.mo98760X0();
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }
}
