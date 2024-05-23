package kj0;

import com.android.billingclient.api.AbstractC3894e;
import com.android.billingclient.api.C3882b;
import com.android.billingclient.api.C3918k;
import com.android.billingclient.api.InterfaceC3886c;
import fn0.AbstractC19074t;
import kj0.InterfaceC21747d;

/* renamed from: kj0.a */
/* loaded from: classes7.dex */
public final class C21744a implements InterfaceC21747d, InterfaceC3886c {

    /* renamed from: a */
    private final String f105591a;

    /* renamed from: b */
    private final AbstractC3894e f105592b;

    /* renamed from: c */
    private InterfaceC21747d.a f105593c;

    public C21744a(String str, AbstractC3894e abstractC3894e) {
        AbstractC19074t.m100208f(str, "purchaseToken");
        AbstractC19074t.m100208f(abstractC3894e, "billingClient");
        this.f105591a = str;
        this.f105592b = abstractC3894e;
    }

    @Override // kj0.InterfaceC21747d
    /* renamed from: b */
    public void mo112193b(InterfaceC21747d.a aVar) {
        AbstractC19074t.m100208f(aVar, "listener");
        this.f105593c = aVar;
        C3882b m18525a = C3882b.m18522b().m18526b(this.f105591a).m18525a();
        AbstractC19074t.m100207e(m18525a, "newBuilder()\n           …ken)\n            .build()");
        this.f105592b.mo18529a(m18525a, this);
    }

    @Override // com.android.billingclient.api.InterfaceC3886c
    /* renamed from: e */
    public void mo18527e(C3918k c3918k) {
        AbstractC19074t.m100208f(c3918k, "billingResult");
        if (c3918k.m18652b() == 0) {
            InterfaceC21747d.a aVar = this.f105593c;
            if (aVar != null) {
                aVar.onSuccess(new Object());
                return;
            }
            return;
        }
        InterfaceC21747d.a aVar2 = this.f105593c;
        if (aVar2 != null) {
            aVar2.mo112194a(c3918k);
        }
    }
}
