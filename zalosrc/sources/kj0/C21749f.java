package kj0;

import com.android.billingclient.api.AbstractC3894e;
import com.android.billingclient.api.C3918k;
import com.android.billingclient.api.C3955w;
import com.android.billingclient.api.InterfaceC3946t;
import fn0.AbstractC19074t;
import java.util.List;
import kj0.InterfaceC21747d;
import lj0.C22501b;

/* renamed from: kj0.f */
/* loaded from: classes7.dex */
public final class C21749f implements InterfaceC21747d, InterfaceC3946t {

    /* renamed from: a */
    private final String f105608a;

    /* renamed from: b */
    private final AbstractC3894e f105609b;

    /* renamed from: c */
    private final C22501b f105610c;

    /* renamed from: d */
    private InterfaceC21747d.a f105611d;

    /* renamed from: e */
    private long f105612e;

    public C21749f(String str, AbstractC3894e abstractC3894e, C22501b c22501b) {
        AbstractC19074t.m100208f(str, "productType");
        AbstractC19074t.m100208f(abstractC3894e, "billingClient");
        AbstractC19074t.m100208f(c22501b, "iapLogger");
        this.f105608a = str;
        this.f105609b = abstractC3894e;
        this.f105610c = c22501b;
    }

    @Override // com.android.billingclient.api.InterfaceC3946t
    /* renamed from: a */
    public void mo18699a(C3918k c3918k, List list) {
        AbstractC19074t.m100208f(c3918k, "billingResult");
        AbstractC19074t.m100208f(list, "purchaseList");
        if (c3918k.m18652b() == 0) {
            this.f105610c.mo104554k("Query purchases for %s cost %d (ms)", this.f105608a, Long.valueOf(System.currentTimeMillis() - this.f105612e));
            InterfaceC21747d.a aVar = this.f105611d;
            if (aVar != null) {
                aVar.onSuccess(list);
                return;
            }
            return;
        }
        this.f105610c.m116346x(true, "Problem when query %s purchases. BillingResult: " + c3918k, this.f105608a);
        InterfaceC21747d.a aVar2 = this.f105611d;
        if (aVar2 != null) {
            aVar2.mo112194a(c3918k);
        }
    }

    @Override // kj0.InterfaceC21747d
    /* renamed from: b */
    public void mo112193b(InterfaceC21747d.a aVar) {
        AbstractC19074t.m100208f(aVar, "listener");
        this.f105611d = aVar;
        C3955w m18719a = C3955w.m18716a().m18720b(this.f105608a).m18719a();
        AbstractC19074t.m100207e(m18719a, "newBuilder()\n           …ype)\n            .build()");
        this.f105612e = System.currentTimeMillis();
        this.f105609b.mo18537j(m18719a, this);
    }
}
