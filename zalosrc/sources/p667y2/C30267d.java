package p667y2;

import android.content.Context;
import com.adtima.Adtima;
import p144f.AbstractC18681a;

/* renamed from: y2.d */
/* loaded from: classes2.dex */
public final class C30267d extends AbstractC18681a {

    /* renamed from: d */
    private static final String f140616d;

    /* renamed from: e */
    private static final String f140617e;

    /* renamed from: f */
    private static final String f140618f;

    /* renamed from: g */
    private static final String f140619g;

    /* renamed from: h */
    private static final String f140620h;

    /* renamed from: i */
    private static final String f140621i;

    /* renamed from: j */
    private static final String f140622j;

    /* renamed from: k */
    private static final String f140623k;

    /* renamed from: l */
    private static final String f140624l;

    /* renamed from: m */
    private static final String f140625m;

    /* renamed from: n */
    private static final String f140626n;

    /* renamed from: o */
    private static final String f140627o;

    /* renamed from: p */
    private static final String f140628p;

    /* renamed from: q */
    private static final String f140629q;

    /* renamed from: r */
    private static final String f140630r;

    /* renamed from: s */
    private static C30267d f140631s;

    static {
        String simpleName = C30267d.class.getSimpleName();
        f140616d = simpleName + "-FEEDBACKDATA";
        f140617e = simpleName + "-FEEDBACKEXPIRED";
        f140618f = simpleName + "-ENCUSERDATA";
        f140619g = simpleName + "-SDKVERSION";
        f140620h = simpleName + "-DEVICEID";
        f140621i = simpleName + "-ANDROIDID";
        f140622j = simpleName + "-IMEIID";
        f140623k = simpleName + "-AAIDID";
        f140624l = simpleName + "-MACID";
        f140625m = simpleName + "-SITEID";
        f140626n = simpleName + "-OLDTMPFOLDER";
        f140627o = simpleName + "-TIMEOLDTMPFOLDER";
        f140628p = simpleName + "-UUID";
        f140629q = simpleName + "-APPSET";
        f140630r = simpleName + "-ADTIMAID";
        f140631s = null;
    }

    private C30267d() {
        m98583b(Adtima.SharedContext, C30267d.class);
    }

    /* renamed from: A */
    public static C30267d m149339A() {
        if (f140631s == null) {
            f140631s = new C30267d();
        }
        return f140631s;
    }

    /* renamed from: B */
    public boolean m149340B(String str) {
        try {
            return m98585d(f140626n, str, 0L);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: C */
    public String m149341C() {
        try {
            return m98582a(f140624l);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: D */
    public boolean m149342D(String str) {
        try {
            return m98585d(f140625m, str, 0L);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: E */
    public String m149343E() {
        try {
            return m98582a(f140626n);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: F */
    public boolean m149344F(String str) {
        try {
            return m98585d(f140628p, str, 0L);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: G */
    public int m149345G() {
        try {
            String m98582a = m98582a(f140619g);
            if (m98582a != null) {
                return Integer.parseInt(m98582a);
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    /* renamed from: H */
    public long m149346H() {
        try {
            return Long.parseLong(m98582a(f140627o));
        } catch (Exception unused) {
            return 0L;
        }
    }

    /* renamed from: I */
    public String m149347I() {
        try {
            return m98582a(f140628p);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    public String m149348e(Context context) {
        String m98582a;
        try {
            m98582a = m98582a(f140625m);
        } catch (Exception unused) {
        }
        if (m98582a != null) {
            return m98582a;
        }
        if (context != null) {
            String packageName = context.getPackageName();
            if (packageName.equals("com.epi")) {
                return "465";
            }
            if (packageName.equals("com.zing.mp3")) {
                return "252";
            }
        }
        return "1000";
    }

    /* renamed from: f */
    public boolean m149349f(int i11) {
        try {
            return m98585d(f140619g, String.valueOf(i11), 0L);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: g */
    public boolean m149350g(long j11) {
        try {
            return m98585d(f140617e, String.valueOf(j11), 0L);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: h */
    public String m149351h() {
        try {
            return m98582a(f140623k);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: i */
    public boolean m149352i(long j11) {
        try {
            return m98585d(f140627o, String.valueOf(j11), 0L);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: j */
    public boolean m149353j(String str) {
        try {
            return m98585d(f140623k, str, 0L);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: k */
    public String m149354k() {
        try {
            return m98582a(f140616d);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: l */
    public boolean m149355l(String str) {
        try {
            return m98585d(f140616d, str, 0L);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: m */
    public long m149356m() {
        try {
            String m98582a = m98582a(f140617e);
            if (m98582a != null) {
                return Long.parseLong(m98582a);
            }
        } catch (Exception unused) {
        }
        return 0L;
    }

    /* renamed from: n */
    public boolean m149357n(String str) {
        try {
            if (!str.isEmpty()) {
                return m98585d(f140630r, str, 0L);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: o */
    public String m149358o() {
        try {
            return m98582a(f140630r);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: p */
    public boolean m149359p(String str) {
        try {
            return m98585d(f140621i, str, 0L);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: q */
    public String m149360q() {
        try {
            return m98582a(f140621i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: r */
    public boolean m149361r(String str) {
        try {
            return m98585d(f140629q, str, 0L);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: s */
    public String m149362s() {
        try {
            return m98582a(f140629q);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: t */
    public boolean m149363t(String str) {
        try {
            return m98585d(f140620h, str, 0L);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: u */
    public String m149364u() {
        try {
            return m98582a(f140620h);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: v */
    public boolean m149365v(String str) {
        try {
            return m98585d(f140618f, str, 86400000);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: w */
    public String m149366w() {
        try {
            return m98582a(f140618f);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: x */
    public boolean m149367x(String str) {
        try {
            return m98585d(f140622j, str, 0L);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: y */
    public String m149368y() {
        try {
            return m98582a(f140622j);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: z */
    public boolean m149369z(String str) {
        try {
            return m98585d(f140624l, str, 0L);
        } catch (Exception unused) {
            return false;
        }
    }
}
