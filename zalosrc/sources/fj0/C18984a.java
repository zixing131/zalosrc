package fj0;

import com.android.billingclient.api.C3914j;
import com.android.billingclient.api.C3918k;
import com.android.billingclient.api.C3934p;
import com.android.billingclient.api.C3940r;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: fj0.a */
/* loaded from: classes7.dex */
public final class C18984a {

    /* renamed from: a */
    private final C3914j.b.a f94771a;

    /* renamed from: b */
    private final C3914j.a f94772b;

    /* renamed from: c */
    private C3934p f94773c;

    /* renamed from: d */
    private C3940r f94774d;

    /* renamed from: e */
    private C3918k f94775e;

    public C18984a(C3914j.b.a aVar, C3914j.a aVar2, C3934p c3934p, C3940r c3940r, C3918k c3918k) {
        AbstractC19074t.m100208f(aVar, "productDetailsParamsBuilder");
        AbstractC19074t.m100208f(aVar2, "billingFlowParamsBuilder");
        AbstractC19074t.m100208f(c3918k, "launchBillingFlowResult");
        this.f94771a = aVar;
        this.f94772b = aVar2;
        this.f94773c = c3934p;
        this.f94774d = c3940r;
        this.f94775e = c3918k;
    }

    /* renamed from: a */
    public final C3914j.b.a m99641a() {
        return this.f94771a;
    }

    /* renamed from: b */
    public final C3914j.a m99642b() {
        return this.f94772b;
    }

    /* renamed from: c */
    public final C3914j.a m99643c() {
        return this.f94772b;
    }

    /* renamed from: d */
    public final C3918k m99644d() {
        return this.f94775e;
    }

    /* renamed from: e */
    public final C3934p m99645e() {
        return this.f94773c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18984a)) {
            return false;
        }
        C18984a c18984a = (C18984a) obj;
        return AbstractC19074t.m100204b(this.f94771a, c18984a.f94771a) && AbstractC19074t.m100204b(this.f94772b, c18984a.f94772b) && AbstractC19074t.m100204b(this.f94773c, c18984a.f94773c) && AbstractC19074t.m100204b(this.f94774d, c18984a.f94774d) && AbstractC19074t.m100204b(this.f94775e, c18984a.f94775e);
    }

    /* renamed from: f */
    public final C3914j.b.a m99646f() {
        return this.f94771a;
    }

    /* renamed from: g */
    public final C3940r m99647g() {
        return this.f94774d;
    }

    /* renamed from: h */
    public final void m99648h(C3918k c3918k) {
        AbstractC19074t.m100208f(c3918k, "<set-?>");
        this.f94775e = c3918k;
    }

    public int hashCode() {
        int hashCode = ((this.f94771a.hashCode() * 31) + this.f94772b.hashCode()) * 31;
        C3934p c3934p = this.f94773c;
        int hashCode2 = (hashCode + (c3934p == null ? 0 : c3934p.hashCode())) * 31;
        C3940r c3940r = this.f94774d;
        return ((hashCode2 + (c3940r != null ? c3940r.hashCode() : 0)) * 31) + this.f94775e.hashCode();
    }

    /* renamed from: i */
    public final void m99649i(C3934p c3934p) {
        this.f94773c = c3934p;
    }

    /* renamed from: j */
    public final void m99650j(C3940r c3940r) {
        this.f94774d = c3940r;
    }

    public String toString() {
        return "HandlerIntermediateResult(productDetailsParamsBuilder=" + this.f94771a + ", billingFlowParamsBuilder=" + this.f94772b + ", productDetails=" + this.f94773c + ", purchaseMatchOldPurchaseToken=" + this.f94774d + ", launchBillingFlowResult=" + this.f94775e + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C18984a(C3914j.b.a aVar, C3914j.a aVar2, C3934p c3934p, C3940r c3940r, C3918k c3918k, int i11, AbstractC19060k abstractC19060k) {
        this(aVar, aVar2, (i11 & 4) != 0 ? null : c3934p, (i11 & 8) == 0 ? c3940r : null, (i11 & 16) != 0 ? new C3918k() : c3918k);
        if ((i11 & 1) != 0) {
            aVar = C3914j.b.m18622a();
            AbstractC19074t.m100207e(aVar, "newBuilder()");
        }
        if ((i11 & 2) != 0) {
            aVar2 = C3914j.m18600a();
            AbstractC19074t.m100207e(aVar2, "newBuilder()");
        }
    }
}
