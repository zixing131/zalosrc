package ac;

import fn0.AbstractC19074t;
import java.util.HashMap;

/* renamed from: ac.o */
/* loaded from: classes3.dex */
public final class C0720o {

    /* renamed from: a */
    private final long f2385a;

    /* renamed from: b */
    private long f2386b;

    /* renamed from: d */
    private long f2388d;

    /* renamed from: e */
    private long f2389e;

    /* renamed from: c */
    private String f2387c = "";

    /* renamed from: f */
    private String f2390f = "";

    /* renamed from: g */
    private a f2391g = a.UNKNOWN;

    /* renamed from: h */
    private HashMap f2392h = new HashMap();

    /* renamed from: ac.o$a */
    /* loaded from: classes3.dex */
    public enum a {
        UNKNOWN(-1),
        NORMAL(0);


        /* renamed from: p */
        private final int f2396p;

        a(int i11) {
            this.f2396p = i11;
        }

        /* renamed from: c */
        public final int m1149c() {
            return this.f2396p;
        }
    }

    public C0720o(long j11) {
        this.f2385a = j11;
    }

    /* renamed from: a */
    public final HashMap m1134a() {
        return this.f2392h;
    }

    /* renamed from: b */
    public final a m1135b() {
        return this.f2391g;
    }

    /* renamed from: c */
    public final long m1136c() {
        return this.f2388d;
    }

    /* renamed from: d */
    public final long m1137d() {
        return this.f2386b;
    }

    /* renamed from: e */
    public final String m1138e() {
        return this.f2387c;
    }

    /* renamed from: f */
    public final long m1139f() {
        return this.f2389e;
    }

    /* renamed from: g */
    public final String m1140g() {
        return this.f2390f;
    }

    /* renamed from: h */
    public final long m1141h() {
        return this.f2385a;
    }

    /* renamed from: i */
    public final void m1142i(a aVar) {
        AbstractC19074t.m100208f(aVar, "<set-?>");
        this.f2391g = aVar;
    }

    /* renamed from: j */
    public final void m1143j(long j11) {
        this.f2388d = j11;
    }

    /* renamed from: k */
    public final void m1144k(long j11) {
        this.f2386b = j11;
    }

    /* renamed from: l */
    public final void m1145l(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f2387c = str;
    }

    /* renamed from: m */
    public final void m1146m(long j11) {
        this.f2389e = j11;
    }

    /* renamed from: n */
    public final void m1147n(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f2390f = str;
    }
}
