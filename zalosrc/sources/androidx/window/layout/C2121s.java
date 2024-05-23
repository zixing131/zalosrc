package androidx.window.layout;

import androidx.window.layout.InterfaceC2120r;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p378o2.C23981b;

/* renamed from: androidx.window.layout.s */
/* loaded from: classes2.dex */
public final class C2121s implements InterfaceC2120r {

    /* renamed from: d */
    public static final a f8995d = new a(null);

    /* renamed from: a */
    private final C23981b f8996a;

    /* renamed from: b */
    private final b f8997b;

    /* renamed from: c */
    private final InterfaceC2120r.a f8998c;

    /* renamed from: androidx.window.layout.s$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m11371a(C23981b c23981b) {
            AbstractC19074t.m100208f(c23981b, "bounds");
            if (c23981b.m125489d() == 0 && c23981b.m125486a() == 0) {
                throw new IllegalArgumentException("Bounds must be non zero".toString());
            }
            if (c23981b.m125487b() != 0 && c23981b.m125488c() != 0) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
            }
        }
    }

    /* renamed from: androidx.window.layout.s$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: b */
        public static final a f8999b = new a(null);

        /* renamed from: c */
        private static final b f9000c = new b("FOLD");

        /* renamed from: d */
        private static final b f9001d = new b("HINGE");

        /* renamed from: a */
        private final String f9002a;

        /* renamed from: androidx.window.layout.s$b$a */
        /* loaded from: classes2.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final b m11374a() {
                return b.f9000c;
            }

            /* renamed from: b */
            public final b m11375b() {
                return b.f9001d;
            }
        }

        private b(String str) {
            this.f9002a = str;
        }

        public String toString() {
            return this.f9002a;
        }
    }

    public C2121s(C23981b c23981b, b bVar, InterfaceC2120r.a aVar) {
        AbstractC19074t.m100208f(c23981b, "featureBounds");
        AbstractC19074t.m100208f(bVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        AbstractC19074t.m100208f(aVar, "state");
        this.f8996a = c23981b;
        this.f8997b = bVar;
        this.f8998c = aVar;
        f8995d.m11371a(c23981b);
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        if (!AbstractC19074t.m100204b(C2121s.class, cls)) {
            return false;
        }
        if (obj != null) {
            C2121s c2121s = (C2121s) obj;
            if (AbstractC19074t.m100204b(this.f8996a, c2121s.f8996a) && AbstractC19074t.m100204b(this.f8997b, c2121s.f8997b) && AbstractC19074t.m100204b(getState(), c2121s.getState())) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
    }

    @Override // androidx.window.layout.InterfaceC2120r
    public InterfaceC2120r.a getState() {
        return this.f8998c;
    }

    public int hashCode() {
        return (((this.f8996a.hashCode() * 31) + this.f8997b.hashCode()) * 31) + getState().hashCode();
    }

    public String toString() {
        return ((Object) C2121s.class.getSimpleName()) + " { " + this.f8996a + ", type=" + this.f8997b + ", state=" + getState() + " }";
    }
}
