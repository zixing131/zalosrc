package p620wt;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: wt.p */
/* loaded from: classes4.dex */
final class C29241p implements InterfaceC29240o {

    /* renamed from: p */
    private final long f135426p;

    /* renamed from: q */
    private final InterfaceC18494a f135427q;

    /* renamed from: r */
    private volatile Object f135428r;

    /* renamed from: s */
    private volatile long f135429s;

    /* renamed from: t */
    private final Object f135430t;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wt.p$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        public static final a f135431a = new a();

        private a() {
        }
    }

    public C29241p(long j11, InterfaceC18494a interfaceC18494a, Object obj) {
        AbstractC19074t.m100208f(interfaceC18494a, "initializer");
        this.f135426p = j11;
        this.f135427q = interfaceC18494a;
        this.f135428r = a.f135431a;
        this.f135429s = -1L;
        this.f135430t = obj == null ? this : obj;
    }

    @Override // pm0.InterfaceC24854k
    /* renamed from: b */
    public boolean mo9375b() {
        if (this.f135428r != a.f135431a) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final long m146003c() {
        return this.f135426p;
    }

    @Override // pm0.InterfaceC24854k
    public Object getValue() {
        Object obj;
        Object obj2 = this.f135428r;
        a aVar = a.f135431a;
        if (obj2 != aVar && System.currentTimeMillis() - this.f135429s < this.f135426p) {
            return obj2;
        }
        synchronized (this.f135430t) {
            try {
                obj = this.f135428r;
                if (obj == aVar || System.currentTimeMillis() - this.f135429s >= m146003c()) {
                    obj = this.f135427q.mo12V4();
                    this.f135428r = obj;
                    this.f135429s = System.currentTimeMillis();
                }
            } finally {
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

    public /* synthetic */ C29241p(long j11, InterfaceC18494a interfaceC18494a, Object obj, int i11, AbstractC19060k abstractC19060k) {
        this(j11, interfaceC18494a, (i11 & 4) != 0 ? null : obj);
    }
}
