package p658xu;

import android.os.Build;
import android.text.TextUtils;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import on0.C24329j;
import on0.InterfaceC24327h;
import qm0.AbstractC25332a0;
import qm0.AbstractC25358n;

/* renamed from: xu.b */
/* loaded from: classes4.dex */
public final class C30206b {
    public static final b Companion = new b(null);

    /* renamed from: e */
    private static final String f140324e;

    /* renamed from: f */
    private static final String f140325f;

    /* renamed from: g */
    private static final String f140326g;

    /* renamed from: a */
    private final String f140327a;

    /* renamed from: b */
    private final String f140328b;

    /* renamed from: c */
    private final String f140329c;

    /* renamed from: d */
    private final String f140330d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xu.b$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        public static final a f140331a = new a();

        /* renamed from: b */
        private static final C24329j f140332b = new C24329j("(AppleWebKit/.*) Safari");

        /* renamed from: c */
        private static final C24329j f140333c = new C24329j("(AppleWebKit/.*)");

        /* renamed from: d */
        private static final C24329j f140334d = new C24329j("(Safari/[^ ]+) *");

        /* renamed from: e */
        private static final C24329j f140335e = new C24329j("(Build/[^ ]+) *");

        private a() {
        }

        /* renamed from: a */
        public final C24329j m148975a() {
            return f140335e;
        }

        /* renamed from: b */
        public final C24329j m148976b() {
            return f140334d;
        }

        /* renamed from: c */
        public final C24329j m148977c() {
            return f140333c;
        }

        /* renamed from: d */
        public final C24329j m148978d() {
            return f140332b;
        }
    }

    /* renamed from: xu.b$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    static {
        String str = Build.VERSION.RELEASE;
        f140324e = "Linux; Android " + str;
        f140325f = "X11; Linux " + System.getProperty("os.arch");
        f140326g = "Mozilla/5.0 (Linux; U; Android 4.0; en-us) AppleWebKit/534.13 (KHTML, like Gecko) Mobile Android " + str;
    }

    public C30206b(String str) {
        AbstractC19074t.m100208f(str, "defaultUserAgent");
        this.f140327a = str;
        this.f140330d = m148971c();
        this.f140328b = m148969a("Mozilla/5.0 (" + f140324e + "; " + m148970b() + ")", m148972d(false));
        this.f140329c = m148969a("Mozilla/5.0 (" + f140325f + "; " + m148970b() + ")", m148972d(true));
    }

    /* renamed from: a */
    private final String m148969a(String... strArr) {
        List m131353A;
        String m131214n0;
        m131353A = AbstractC25358n.m131353A(strArr);
        m131214n0 = AbstractC25332a0.m131214n0(m131353A, " ", null, null, 0, null, null, 62, null);
        return m131214n0;
    }

    /* renamed from: b */
    private final String m148970b() {
        Object m131216p0;
        InterfaceC24327h m127013c = C24329j.m127013c(a.f140331a.m148975a(), this.f140327a, 0, 2, null);
        if (m127013c == null) {
            return "";
        }
        String str = Build.MODEL;
        m131216p0 = AbstractC25332a0.m131216p0(m127013c.mo127002a());
        return str + " " + m131216p0;
    }

    /* renamed from: c */
    private final String m148971c() {
        Object m131216p0;
        InterfaceC24327h m127013c = C24329j.m127013c(a.f140331a.m148976b(), this.f140327a, 0, 2, null);
        if (m127013c != null) {
            m131216p0 = AbstractC25332a0.m131216p0(m127013c.mo127002a());
            return (String) m131216p0;
        }
        return null;
    }

    /* renamed from: d */
    private final String m148972d(boolean z11) {
        Object m131216p0;
        String m127114D;
        if (TextUtils.isEmpty(this.f140327a)) {
            return f140326g;
        }
        a aVar = a.f140331a;
        InterfaceC24327h m127013c = C24329j.m127013c(aVar.m148978d(), this.f140327a, 0, 2, null);
        if (m127013c != null || (m127013c = C24329j.m127013c(aVar.m148977c(), this.f140327a, 0, 2, null)) != null) {
            m131216p0 = AbstractC25332a0.m131216p0(m127013c.mo127002a());
            String str = (String) m131216p0;
            if (z11) {
                m127114D = AbstractC24341v.m127114D(str, " Mobile", "", false, 4, null);
                return m127114D;
            }
            return str;
        }
        return null;
    }

    /* renamed from: e */
    public final String m148973e() {
        return m148974f(false);
    }

    /* renamed from: f */
    public final String m148974f(boolean z11) {
        String str;
        boolean m127149O;
        if (z11) {
            str = this.f140329c;
        } else {
            str = this.f140328b;
        }
        String str2 = str + " " + this.f140330d;
        m127149O = AbstractC24342w.m127149O(str2, "Zalo android/", false, 2, null);
        if (!m127149O) {
            return str2 + " Zalo android/" + CoreUtility.f89236l;
        }
        return str2;
    }
}
