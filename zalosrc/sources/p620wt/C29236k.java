package p620wt;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import pm0.C24848g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wt.k */
/* loaded from: classes.dex */
public final class C29236k implements InterfaceC29232g {

    /* renamed from: p */
    private final C29234i f135421p;

    /* renamed from: q */
    private final InterfaceC18494a f135422q;

    /* renamed from: r */
    private volatile Object f135423r;

    /* renamed from: s */
    private final Object f135424s;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wt.k$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public static final a f135425a = new a();

        private a() {
        }
    }

    public C29236k(C29234i c29234i, InterfaceC18494a interfaceC18494a, Object obj) {
        AbstractC19074t.m100208f(interfaceC18494a, "initializer");
        this.f135421p = c29234i;
        this.f135422q = interfaceC18494a;
        this.f135423r = a.f135425a;
        this.f135424s = obj == null ? this : obj;
    }

    @Override // pm0.InterfaceC24854k
    /* renamed from: b */
    public boolean mo9375b() {
        if (this.f135423r != a.f135425a) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final C29234i m145995c() {
        return this.f135421p;
    }

    @Override // pm0.InterfaceC24854k
    public Object getValue() {
        Object obj;
        Object obj2 = this.f135423r;
        a aVar = a.f135425a;
        if (obj2 != aVar) {
            return obj2;
        }
        synchronized (this.f135424s) {
            obj = this.f135423r;
            if (obj == aVar) {
                obj = this.f135422q.mo12V4();
                this.f135423r = obj;
                C29234i m145995c = m145995c();
                if (m145995c != null) {
                    m145995c.m145992a(this);
                }
            }
        }
        return obj;
    }

    @Override // p620wt.InterfaceC29232g
    public void reset() {
        synchronized (this.f135424s) {
            this.f135423r = a.f135425a;
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    public String toString() {
        if (mo9375b()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }

    public /* synthetic */ C29236k(C29234i c29234i, InterfaceC18494a interfaceC18494a, Object obj, int i11, AbstractC19060k abstractC19060k) {
        this(c29234i, interfaceC18494a, (i11 & 4) != 0 ? null : obj);
    }
}
