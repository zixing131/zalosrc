package qi0;

import android.text.TextUtils;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: qi0.a */
/* loaded from: classes7.dex */
public final class C25292a {

    /* renamed from: c */
    private static long f121283c;

    /* renamed from: d */
    private static boolean f121284d;

    /* renamed from: a */
    public static final C25292a f121281a = new C25292a();

    /* renamed from: b */
    private static String f121282b = "";

    /* renamed from: e */
    private static a f121285e = new a();

    /* renamed from: qi0.a$a */
    /* loaded from: classes7.dex */
    public static final class a {
        public static final C32949a Companion = new C32949a(null);

        /* renamed from: a */
        private int f121286a;

        /* renamed from: b */
        private String f121287b;

        /* renamed from: c */
        private int f121288c;

        /* renamed from: d */
        private int f121289d;

        /* renamed from: e */
        private String f121290e = "";

        /* renamed from: f */
        private String f121291f = "";

        /* renamed from: g */
        private int f121292g;

        /* renamed from: qi0.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public static final class C32949a {
            private C32949a() {
            }

            public /* synthetic */ C32949a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        /* renamed from: a */
        public final String m130876a() {
            return this.f121290e;
        }

        /* renamed from: b */
        public final int m130877b() {
            return this.f121289d;
        }

        /* renamed from: c */
        public final String m130878c() {
            return this.f121291f;
        }

        /* renamed from: d */
        public final int m130879d() {
            return this.f121292g;
        }

        /* renamed from: e */
        public final int m130880e() {
            return this.f121286a;
        }

        /* renamed from: f */
        public final String m130881f() {
            return this.f121287b;
        }

        /* renamed from: g */
        public final int m130882g() {
            return this.f121288c;
        }

        /* renamed from: h */
        public final boolean m130883h() {
            if (TextUtils.isEmpty(this.f121287b) && TextUtils.isEmpty(this.f121290e) && TextUtils.isEmpty(this.f121291f) && this.f121286a != 2) {
                return false;
            }
            return true;
        }

        /* renamed from: i */
        public final void m130884i(String str) {
            AbstractC19074t.m100208f(str, "<set-?>");
            this.f121290e = str;
        }

        /* renamed from: j */
        public final void m130885j(int i11) {
            this.f121289d = i11;
        }

        /* renamed from: k */
        public final void m130886k(String str) {
            AbstractC19074t.m100208f(str, "<set-?>");
            this.f121291f = str;
        }

        /* renamed from: l */
        public final void m130887l(int i11) {
            this.f121292g = i11;
        }

        /* renamed from: m */
        public final void m130888m(int i11) {
            this.f121286a = i11;
        }

        /* renamed from: n */
        public final void m130889n(String str) {
            this.f121287b = str;
        }

        /* renamed from: o */
        public final void m130890o(int i11) {
            this.f121288c = i11;
        }
    }

    private C25292a() {
    }

    /* renamed from: a */
    public final boolean m130868a() {
        return f121284d;
    }

    /* renamed from: b */
    public final String m130869b() {
        return f121282b;
    }

    /* renamed from: c */
    public final long m130870c() {
        return f121283c;
    }

    /* renamed from: d */
    public final a m130871d() {
        return f121285e;
    }

    /* renamed from: e */
    public final void m130872e(boolean z11) {
        f121284d = z11;
    }

    /* renamed from: f */
    public final void m130873f(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        f121282b = str;
    }

    /* renamed from: g */
    public final void m130874g(long j11) {
        f121283c = j11;
    }

    /* renamed from: h */
    public final void m130875h(a aVar) {
        f121285e = aVar;
    }
}
