package p123e6;

import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import p151f6.InterfaceC18755g;

/* renamed from: e6.k */
/* loaded from: classes2.dex */
public final class C18261k {

    /* renamed from: a */
    private final InterfaceC18755g f92471a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C18261k(InterfaceC18755g interfaceC18755g) {
        this.f92471a = interfaceC18755g;
    }

    /* renamed from: a */
    public void m97047a(boolean z11) {
        try {
            this.f92471a.mo98767N2(z11);
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: b */
    public void m97048b(boolean z11) {
        try {
            this.f92471a.mo98769z1(z11);
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }

    /* renamed from: c */
    public void m97049c(boolean z11) {
        try {
            this.f92471a.mo98768e0(z11);
        } catch (RemoteException e11) {
            throw new RuntimeRemoteException(e11);
        }
    }
}
