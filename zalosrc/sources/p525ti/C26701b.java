package p525ti;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: ti.b */
/* loaded from: classes3.dex */
public final class C26701b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private String f126590a;

    /* renamed from: b */
    private String f126591b;

    /* renamed from: ti.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C26701b m137270a() {
            return new C26701b("", "");
        }
    }

    public C26701b(String str, String str2) {
        AbstractC19074t.m100208f(str, "infoTime");
        AbstractC19074t.m100208f(str2, "infoDevice");
        this.f126590a = str;
        this.f126591b = str2;
    }

    /* renamed from: a */
    public static final C26701b m137265a() {
        return Companion.m137270a();
    }

    /* renamed from: b */
    public final String m137266b() {
        return this.f126591b;
    }

    /* renamed from: c */
    public final String m137267c() {
        return this.f126590a;
    }

    /* renamed from: d */
    public final void m137268d(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f126591b = str;
    }

    /* renamed from: e */
    public final void m137269e(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f126590a = str;
    }
}
