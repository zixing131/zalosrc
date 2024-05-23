package p304ks;

import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.AbstractC23160o0;
import mm0.AbstractC23350e;

/* renamed from: ks.i */
/* loaded from: classes.dex */
public final class C21923i {

    /* renamed from: a */
    public static final C21923i f107768a = new C21923i();

    private C21923i() {
    }

    /* renamed from: a */
    public static final void m114289a(Exception exc) {
        AbstractC19074t.m100208f(exc, "exception");
        m114290b("ZFriend", exc);
    }

    /* renamed from: b */
    public static final void m114290b(String str, Exception exc) {
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(exc, "exception");
        AbstractC23350e.m122776f(str, exc);
    }

    /* renamed from: c */
    public static final void m114291c(String str) {
        AbstractC19074t.m100208f(str, "message");
        m114292d("ZFriend", str);
    }

    /* renamed from: d */
    public static final void m114292d(String str, String str2) {
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(str2, "message");
        AbstractC20110a.f98889a.m104564x(str).mo104556o(8, "[" + AbstractC23160o0.m119279p0(System.currentTimeMillis()) + "] " + str2, new Object[0]);
    }
}
