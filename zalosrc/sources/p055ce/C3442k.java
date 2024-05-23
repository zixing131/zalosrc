package p055ce;

import com.zing.zalo.control.ContactProfile;
import fn0.AbstractC19074t;
import p055ce.C3443l;
import vg.C28203u6;

/* renamed from: ce.k */
/* loaded from: classes3.dex */
public final class C3442k {

    /* renamed from: a */
    public static final C3442k f14460a = new C3442k();

    private C3442k() {
    }

    /* renamed from: a */
    public final String m17296a(String str) {
        AbstractC19074t.m100208f(str, "uid");
        if (!C3432a.f14402a.m17234c()) {
            return "";
        }
        String str2 = null;
        ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, str, false, 2, null);
        if (m141800i != null) {
            str2 = m141800i.m40391V();
        }
        if (str2 == null) {
            return C3433b.Companion.m17260a();
        }
        return str2;
    }

    /* renamed from: b */
    public final boolean m17297b(String str) {
        AbstractC19074t.m100208f(str, "uid");
        C3432a c3432a = C3432a.f14402a;
        if (!c3432a.m17234c()) {
            return false;
        }
        return c3432a.m17241j().m17305d().m17320a(AbstractC3439h.m17281o(str));
    }

    /* renamed from: c */
    public final boolean m17298c(ContactProfile contactProfile) {
        C3432a c3432a = C3432a.f14402a;
        int i11 = 0;
        if (!c3432a.m17234c() || contactProfile == null) {
            return false;
        }
        C3443l.e m17305d = c3432a.m17241j().m17305d();
        C3433b m40364F = contactProfile.m40364F();
        if (m40364F != null) {
            i11 = m40364F.m17256i();
        }
        return m17305d.m17321b(i11);
    }

    /* renamed from: d */
    public final boolean m17299d(String str) {
        AbstractC19074t.m100208f(str, "uid");
        C3432a c3432a = C3432a.f14402a;
        if (!c3432a.m17234c()) {
            return false;
        }
        return c3432a.m17241j().m17305d().m17321b(AbstractC3439h.m17281o(str));
    }

    /* renamed from: e */
    public final boolean m17300e(int i11) {
        C3432a c3432a = C3432a.f14402a;
        if (!c3432a.m17234c()) {
            return false;
        }
        return c3432a.m17241j().m17305d().m17322c(i11);
    }

    /* renamed from: f */
    public final boolean m17301f(ContactProfile contactProfile) {
        C3432a c3432a = C3432a.f14402a;
        int i11 = 0;
        if (!c3432a.m17234c() || contactProfile == null) {
            return false;
        }
        C3443l.e m17305d = c3432a.m17241j().m17305d();
        C3433b m40364F = contactProfile.m40364F();
        if (m40364F != null) {
            i11 = m40364F.m17256i();
        }
        return m17305d.m17323d(i11);
    }
}
