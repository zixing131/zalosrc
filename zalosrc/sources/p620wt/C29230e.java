package p620wt;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.Serializable;
import pm0.C24848g0;

/* renamed from: wt.e */
/* loaded from: classes.dex */
final class C29230e implements InterfaceC29228c, Serializable {

    /* renamed from: p */
    private InterfaceC18494a f135417p;

    /* renamed from: q */
    private volatile Object f135418q;

    /* renamed from: r */
    private final Object f135419r;

    public C29230e(InterfaceC18494a interfaceC18494a, Object obj) {
        AbstractC19074t.m100208f(interfaceC18494a, "initializer");
        this.f135417p = interfaceC18494a;
        this.f135418q = C29243r.f135432a;
        this.f135419r = obj == null ? this : obj;
    }

    @Override // p620wt.InterfaceC29228c
    /* renamed from: a */
    public void mo145981a(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "initializer");
        synchronized (this.f135419r) {
            this.f135417p = interfaceC18494a;
            this.f135418q = C29243r.f135432a;
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    @Override // pm0.InterfaceC24854k
    /* renamed from: b */
    public boolean mo9375b() {
        if (this.f135418q != C29243r.f135432a) {
            return true;
        }
        return false;
    }

    @Override // pm0.InterfaceC24854k
    public Object getValue() {
        Object obj;
        Object obj2 = this.f135418q;
        C29243r c29243r = C29243r.f135432a;
        if (obj2 != c29243r) {
            return obj2;
        }
        synchronized (this.f135419r) {
            obj = this.f135418q;
            if (obj == c29243r) {
                InterfaceC18494a interfaceC18494a = this.f135417p;
                AbstractC19074t.m100205c(interfaceC18494a);
                obj = interfaceC18494a.mo12V4();
                this.f135418q = obj;
            }
        }
        return obj;
    }

    public String toString() {
        if (mo9375b()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }

    public /* synthetic */ C29230e(InterfaceC18494a interfaceC18494a, Object obj, int i11, AbstractC19060k abstractC19060k) {
        this(interfaceC18494a, (i11 & 2) != 0 ? null : obj);
    }
}
