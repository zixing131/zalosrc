package pj0;

import android.content.Context;

/* renamed from: pj0.n */
/* loaded from: classes7.dex */
public abstract class AbstractC24788n implements InterfaceC24787m {

    /* renamed from: a */
    private InterfaceC24787m f119019a;

    @Override // pj0.InterfaceC24787m
    /* renamed from: W2 */
    public boolean mo87252W2() {
        InterfaceC24787m interfaceC24787m = this.f119019a;
        if (interfaceC24787m != null) {
            return interfaceC24787m.mo87252W2();
        }
        return false;
    }

    @Override // pj0.InterfaceC24787m
    /* renamed from: a */
    public void mo61862a(String str, String str2, boolean z11, InterfaceC24785k interfaceC24785k) {
        InterfaceC24787m interfaceC24787m = this.f119019a;
        if (interfaceC24787m != null) {
            interfaceC24787m.mo61862a(str, str2, z11, interfaceC24785k);
        }
    }

    @Override // pj0.InterfaceC24787m
    /* renamed from: b */
    public boolean mo87253b() {
        InterfaceC24787m interfaceC24787m = this.f119019a;
        if (interfaceC24787m != null) {
            return interfaceC24787m.mo87253b();
        }
        return false;
    }

    @Override // pj0.InterfaceC24787m
    /* renamed from: c */
    public Context mo92016c() {
        InterfaceC24787m interfaceC24787m = this.f119019a;
        if (interfaceC24787m != null) {
            return interfaceC24787m.mo92016c();
        }
        return null;
    }

    /* renamed from: d */
    public final void m128802d(InterfaceC24787m interfaceC24787m) {
        this.f119019a = interfaceC24787m;
    }
}
