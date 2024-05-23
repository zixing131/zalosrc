package kj0;

import com.android.billingclient.api.AbstractC3894e;
import com.android.billingclient.api.C3918k;
import com.android.billingclient.api.C3952v;
import com.android.billingclient.api.InterfaceC3937q;
import fn0.AbstractC19074t;
import java.util.List;
import kj0.InterfaceC21747d;
import lj0.C22501b;
import qm0.AbstractC25366r;

/* renamed from: kj0.e */
/* loaded from: classes7.dex */
public final class C21748e implements InterfaceC21747d, InterfaceC3937q {

    /* renamed from: a */
    private final String f105602a;

    /* renamed from: b */
    private final String f105603b;

    /* renamed from: c */
    private final AbstractC3894e f105604c;

    /* renamed from: d */
    private final C22501b f105605d;

    /* renamed from: e */
    private InterfaceC21747d.a f105606e;

    /* renamed from: f */
    private long f105607f;

    public C21748e(String str, String str2, AbstractC3894e abstractC3894e, C22501b c22501b) {
        AbstractC19074t.m100208f(str, "productId");
        AbstractC19074t.m100208f(str2, "productType");
        AbstractC19074t.m100208f(abstractC3894e, "billingClient");
        AbstractC19074t.m100208f(c22501b, "iapLogger");
        this.f105602a = str;
        this.f105603b = str2;
        this.f105604c = abstractC3894e;
        this.f105605d = c22501b;
    }

    @Override // com.android.billingclient.api.InterfaceC3937q
    /* renamed from: a */
    public void mo18684a(C3918k c3918k, List list) {
        AbstractC19074t.m100208f(c3918k, "billingResult");
        AbstractC19074t.m100208f(list, "productDetailsList");
        this.f105605d.m116345w("onProductDetailsResponse. BillingResult: " + c3918k, new Object[0]);
        if (c3918k.m18652b() == 0) {
            this.f105605d.mo104554k("Query product details with id = %s, type = %s cost %d (ms)", this.f105602a, this.f105603b, Long.valueOf(System.currentTimeMillis() - this.f105607f));
            InterfaceC21747d.a aVar = this.f105606e;
            if (aVar != null) {
                aVar.onSuccess(list);
                return;
            }
            return;
        }
        this.f105605d.m116346x(true, "Problem when query product details with id = %s, type = %s. BillingResult: " + c3918k, this.f105602a, this.f105603b);
        InterfaceC21747d.a aVar2 = this.f105606e;
        if (aVar2 != null) {
            aVar2.mo112194a(c3918k);
        }
    }

    @Override // kj0.InterfaceC21747d
    /* renamed from: b */
    public void mo112193b(InterfaceC21747d.a aVar) {
        List m131496e;
        AbstractC19074t.m100208f(aVar, "listener");
        this.f105606e = aVar;
        C3952v.a m18702a = C3952v.m18702a();
        m131496e = AbstractC25366r.m131496e(C3952v.b.m18708a().m18715c(this.f105603b).m18714b(this.f105602a).m18713a());
        C3952v m18706a = m18702a.m18707b(m131496e).m18706a();
        AbstractC19074t.m100207e(m18706a, "newBuilder()\n           …   )\n            .build()");
        this.f105607f = System.currentTimeMillis();
        this.f105604c.mo18536i(m18706a, this);
    }
}
