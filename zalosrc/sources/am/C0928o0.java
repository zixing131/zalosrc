package am;

import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import on0.AbstractC24341v;

/* renamed from: am.o0 */
/* loaded from: classes.dex */
public final class C0928o0 {

    /* renamed from: a */
    public static final C0928o0 f3431a = new C0928o0();

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: am.o0$a */
    /* loaded from: classes3.dex */
    public @interface a {
        public static final C32620a Companion = C32620a.f3432a;

        /* renamed from: am.o0$a$a */
        /* loaded from: classes3.dex */
        public static final class C32620a {

            /* renamed from: a */
            static final /* synthetic */ C32620a f3432a = new C32620a();

            /* renamed from: b */
            private static String f3433b = "EMBED_HIDDEN_DATA_KEY";

            private C32620a() {
            }

            /* renamed from: a */
            public final String m4447a() {
                return f3433b;
            }
        }
    }

    private C0928o0() {
    }

    /* renamed from: a */
    public static final boolean m4432a(String str, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(str, "key");
        return AbstractC0908e0.m2808b(f3431a.m4440i(str), z11, z12);
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m4433b(String str, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = true;
        }
        return m4432a(str, z11, z12);
    }

    /* renamed from: c */
    public static final int m4434c(String str, int i11, boolean z11) {
        AbstractC19074t.m100208f(str, "key");
        return AbstractC0908e0.m2810d(f3431a.m4440i(str), i11, z11);
    }

    /* renamed from: d */
    public static final long m4435d(String str, long j11, boolean z11) {
        AbstractC19074t.m100208f(str, "key");
        return AbstractC0908e0.m2813g(f3431a.m4440i(str), j11, z11);
    }

    /* renamed from: e */
    public static final String m4436e(String str, String str2, boolean z11) {
        AbstractC19074t.m100208f(str, "key");
        return AbstractC0908e0.m2815i(f3431a.m4440i(str), str2, z11);
    }

    /* renamed from: f */
    public static final String m4437f(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "key");
        return AbstractC0908e0.m2815i(f3431a.m4440i(str), "", z11);
    }

    /* renamed from: g */
    public static /* synthetic */ String m4438g(String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        return m4436e(str, str2, z11);
    }

    /* renamed from: h */
    public static /* synthetic */ String m4439h(String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return m4437f(str, z11);
    }

    /* renamed from: i */
    private final String m4440i(String str) {
        String m127114D;
        String str2 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str2, "currentUserUid");
        m127114D = AbstractC24341v.m127114D(str, "${UserID}", str2, false, 4, null);
        return m127114D;
    }

    /* renamed from: j */
    public static final void m4441j(String str, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC0908e0.m2818l(f3431a.m4440i(str), z11, z12);
    }

    /* renamed from: k */
    public static /* synthetic */ void m4442k(String str, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z12 = true;
        }
        m4441j(str, z11, z12);
    }

    /* renamed from: l */
    public static final void m4443l(String str, int i11, boolean z11) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC0908e0.m2820n(f3431a.m4440i(str), i11, z11);
    }

    /* renamed from: m */
    public static final void m4444m(String str, long j11, boolean z11) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC0908e0.m2823q(f3431a.m4440i(str), j11, z11);
    }

    /* renamed from: n */
    public static final void m4445n(String str, String str2, boolean z11) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC0908e0.m2825s(f3431a.m4440i(str), str2, z11);
    }

    /* renamed from: o */
    public static /* synthetic */ void m4446o(String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        m4445n(str, str2, z11);
    }
}
