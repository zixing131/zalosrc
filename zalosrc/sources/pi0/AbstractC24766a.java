package pi0;

import fn0.AbstractC19074t;

/* renamed from: pi0.a */
/* loaded from: classes7.dex */
public abstract class AbstractC24766a {

    /* renamed from: a */
    private boolean f118951a;

    /* renamed from: d */
    private int f118954d;

    /* renamed from: b */
    private int f118952b = a.NORMAL.m128744c();

    /* renamed from: c */
    private String f118953c = "";

    /* renamed from: e */
    private boolean f118955e = true;

    /* renamed from: f */
    private int f118956f = -1;

    /* renamed from: pi0.a$a */
    /* loaded from: classes7.dex */
    public enum a {
        EMPTY(-1),
        NORMAL(0),
        CHIP(1),
        CUSTOM(2);


        /* renamed from: p */
        private final int f118962p;

        a(int i11) {
            this.f118962p = i11;
        }

        /* renamed from: c */
        public final int m128744c() {
            return this.f118962p;
        }
    }

    /* renamed from: a */
    public final int m128733a() {
        return this.f118954d;
    }

    /* renamed from: b */
    public final boolean m128734b() {
        return this.f118955e;
    }

    /* renamed from: c */
    public final String m128735c() {
        return this.f118953c;
    }

    /* renamed from: d */
    public final int m128736d() {
        return this.f118952b;
    }

    /* renamed from: e */
    public final int m128737e() {
        return this.f118956f;
    }

    /* renamed from: f */
    public final boolean m128738f() {
        return this.f118951a;
    }

    /* renamed from: g */
    public final void m128739g(boolean z11) {
        this.f118951a = z11;
    }

    /* renamed from: h */
    public final void m128740h(int i11) {
        this.f118954d = i11;
    }

    /* renamed from: i */
    public final void m128741i(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f118953c = str;
    }

    /* renamed from: j */
    public final void m128742j(int i11) {
        this.f118952b = i11;
    }
}
