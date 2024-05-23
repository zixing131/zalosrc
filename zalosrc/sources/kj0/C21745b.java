package kj0;

import com.android.billingclient.api.AbstractC3894e;
import com.android.billingclient.api.C3918k;
import com.android.billingclient.api.C3922l;
import com.android.billingclient.api.InterfaceC3925m;
import fn0.AbstractC19074t;
import kj0.InterfaceC21747d;
import lj0.C22501b;

/* renamed from: kj0.b */
/* loaded from: classes7.dex */
public final class C21745b implements InterfaceC21747d, InterfaceC3925m {

    /* renamed from: a */
    private final String f105594a;

    /* renamed from: b */
    private final AbstractC3894e f105595b;

    /* renamed from: c */
    private final C22501b f105596c;

    /* renamed from: d */
    private InterfaceC21747d.a f105597d;

    /* renamed from: e */
    private long f105598e;

    public C21745b(String str, AbstractC3894e abstractC3894e, C22501b c22501b) {
        AbstractC19074t.m100208f(str, "purchaseToken");
        AbstractC19074t.m100208f(abstractC3894e, "billingClient");
        AbstractC19074t.m100208f(c22501b, "iapLogger");
        this.f105594a = str;
        this.f105595b = abstractC3894e;
        this.f105596c = c22501b;
    }

    @Override // kj0.InterfaceC21747d
    /* renamed from: b */
    public void mo112193b(InterfaceC21747d.a aVar) {
        AbstractC19074t.m100208f(aVar, "listener");
        this.f105597d = aVar;
        C3922l m18659a = C3922l.m18656b().m18660b(this.f105594a).m18659a();
        AbstractC19074t.m100207e(m18659a, "newBuilder()\n           …ken)\n            .build()");
        this.f105598e = System.currentTimeMillis();
        this.f105595b.mo18530b(m18659a, this);
    }

    @Override // com.android.billingclient.api.InterfaceC3925m
    /* renamed from: f */
    public void mo18661f(C3918k c3918k, String str) {
        AbstractC19074t.m100208f(c3918k, "billingResult");
        AbstractC19074t.m100208f(str, "purchaseToken");
        if (c3918k.m18652b() == 0) {
            this.f105596c.mo104554k("Consume purchase cost %d (ms)", Long.valueOf(System.currentTimeMillis() - this.f105598e));
            InterfaceC21747d.a aVar = this.f105597d;
            if (aVar != null) {
                aVar.onSuccess(str);
                return;
            }
            return;
        }
        this.f105596c.mo104554k("Consume purchase fail. BillingResult: " + c3918k, new Object[0]);
        InterfaceC21747d.a aVar2 = this.f105597d;
        if (aVar2 != null) {
            aVar2.mo112194a(c3918k);
        }
    }
}
