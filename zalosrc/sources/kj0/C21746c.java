package kj0;

import com.android.billingclient.api.AbstractC3894e;
import com.android.billingclient.api.C3918k;
import com.android.billingclient.api.InterfaceC3902g;
import fn0.AbstractC19074t;
import kj0.InterfaceC21747d;
import lj0.C22501b;

/* renamed from: kj0.c */
/* loaded from: classes7.dex */
public final class C21746c implements InterfaceC21747d, InterfaceC3902g {

    /* renamed from: a */
    private final AbstractC3894e f105599a;

    /* renamed from: b */
    private final C22501b f105600b;

    /* renamed from: c */
    private InterfaceC21747d.a f105601c;

    public C21746c(AbstractC3894e abstractC3894e, C22501b c22501b) {
        AbstractC19074t.m100208f(abstractC3894e, "billingClient");
        AbstractC19074t.m100208f(c22501b, "iapLogger");
        this.f105599a = abstractC3894e;
        this.f105600b = c22501b;
    }

    @Override // kj0.InterfaceC21747d
    /* renamed from: b */
    public void mo112193b(InterfaceC21747d.a aVar) {
        AbstractC19074t.m100208f(aVar, "listener");
        this.f105601c = aVar;
        this.f105600b.m116345w("Establish service connection", new Object[0]);
        this.f105599a.mo18538k(this);
    }

    @Override // com.android.billingclient.api.InterfaceC3902g
    /* renamed from: c */
    public void mo18592c(C3918k c3918k) {
        AbstractC19074t.m100208f(c3918k, "br");
        this.f105600b.m116345w("onBillingSetupFinished: " + c3918k, new Object[0]);
        if (c3918k.m18652b() == 0) {
            InterfaceC21747d.a aVar = this.f105601c;
            if (aVar != null) {
                aVar.onSuccess(new Object());
                return;
            }
            return;
        }
        InterfaceC21747d.a aVar2 = this.f105601c;
        if (aVar2 != null) {
            aVar2.mo112194a(c3918k);
        }
    }

    @Override // com.android.billingclient.api.InterfaceC3902g
    /* renamed from: d */
    public void mo18593d() {
    }
}
