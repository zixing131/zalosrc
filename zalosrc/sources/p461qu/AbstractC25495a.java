package p461qu;

import fn0.AbstractC19074t;
import on0.AbstractC24341v;
import p136en.C18493a;

/* renamed from: qu.a */
/* loaded from: classes4.dex */
public abstract class AbstractC25495a {
    /* renamed from: a */
    public static final String m132076a(String str) {
        if (str != null && str.length() != 0) {
            if (!m132079d(str)) {
                return "group_" + str;
            }
            return str;
        }
        return "";
    }

    /* renamed from: b */
    public static final boolean m132077b(String str) {
        if (str != null && AbstractC19074t.m100204b(str, "100617995")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m132078c(String str) {
        if (str != null && AbstractC19074t.m100204b(str, "204278670")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m132079d(String str) {
        boolean m127120J;
        if (str != null) {
            m127120J = AbstractC24341v.m127120J(str, "group_", false, 2, null);
            if (!m127120J) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m132080e(String str) {
        if (str != null && AbstractC19074t.m100204b(str, "-1000000")) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final boolean m132081f(String str) {
        if (str != null && AbstractC19074t.m100204b(str, "-8")) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static final boolean m132082g(String str) {
        boolean m127120J;
        if (str != null) {
            m127120J = AbstractC24341v.m127120J(str, "room_", false, 2, null);
            if (!m127120J) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static final boolean m132083h(String str) {
        AbstractC19074t.m100208f(str, "uid");
        for (String str2 : C18493a.f93093a.m97871a()) {
            if (AbstractC19074t.m100204b(str2, str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static final boolean m132084i(String str) {
        if (str != null && AbstractC19074t.m100204b(str, "-2")) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static final boolean m132085j(String str) {
        if (str != null && AbstractC19074t.m100204b(str, "116505517")) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static final boolean m132086k(String str) {
        if (str != null && AbstractC19074t.m100204b(str, "68386082")) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static final boolean m132087l(String str) {
        if (str != null && AbstractC19074t.m100204b(str, "-1000001")) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static final String m132088m(String str) {
        if (str != null && str.length() != 0) {
            String substring = str.substring(6);
            AbstractC19074t.m100207e(substring, "substring(...)");
            return substring;
        }
        return "";
    }

    /* renamed from: n */
    public static final String m132089n(String str) {
        if (str == null) {
            return "";
        }
        if (m132079d(str)) {
            return m132088m(str);
        }
        return str;
    }

    /* renamed from: o */
    public static final int m132090o(String str) {
        if (str != null && str.length() != 0) {
            return Integer.parseInt(m132089n(str));
        }
        return 0;
    }
}
