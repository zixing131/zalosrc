package f40;

import ag0.C0815e1;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.AbstractC23160o0;
import mm0.AbstractC23350e;
import p348mi.AbstractC23309i;
import pm.C24830a;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: f40.a */
/* loaded from: classes5.dex */
public final class C18719a {

    /* renamed from: a */
    public static final C18719a f94032a = new C18719a();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: f40.a$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: p */
        public static final a f94033p = new a("CORE_FLOW", 0);

        /* renamed from: q */
        public static final a f94034q = new a("DEBUG", 1);

        /* renamed from: r */
        public static final a f94035r = new a("SERVER", 2);

        /* renamed from: s */
        public static final a f94036s = new a("ERROR", 3);

        /* renamed from: t */
        private static final /* synthetic */ a[] f94037t;

        /* renamed from: u */
        private static final /* synthetic */ InterfaceC30165a f94038u;

        static {
            a[] m98719b = m98719b();
            f94037t = m98719b;
            f94038u = AbstractC30166b.m148796a(m98719b);
        }

        private a(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ a[] m98719b() {
            return new a[]{f94033p, f94034q, f94035r, f94036s};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f94037t.clone();
        }
    }

    private C18719a() {
    }

    /* renamed from: a */
    private final long m98708a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public static final void m98709b(Exception exc) {
        AbstractC19074t.m100208f(exc, "exception");
        m98710c("SMLTransferMsg", exc);
    }

    /* renamed from: c */
    public static final void m98710c(String str, Exception exc) {
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(exc, "exception");
        AbstractC23350e.m122776f(str, exc);
        C24830a.m129113c(exc.toString(), a.f94036s);
    }

    /* renamed from: d */
    public static final void m98711d(String str, a aVar) {
        AbstractC19074t.m100208f(str, "message");
        AbstractC19074t.m100208f(aVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        m98712e("SMLTransferMsg", str, aVar);
    }

    /* renamed from: e */
    public static final void m98712e(String str, String str2, a aVar) {
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(str2, "message");
        AbstractC19074t.m100208f(aVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        AbstractC20110a.f98889a.m104564x(str).mo104556o(8, "[" + AbstractC23160o0.m119291t0(f94032a.m98708a()) + "] " + str2, new Object[0]);
        C24830a.m129113c(str2, aVar);
    }

    /* renamed from: f */
    public static /* synthetic */ void m98713f(String str, a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar = a.f94034q;
        }
        m98711d(str, aVar);
    }

    /* renamed from: g */
    public static /* synthetic */ void m98714g(String str, String str2, a aVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            aVar = a.f94034q;
        }
        m98712e(str, str2, aVar);
    }

    /* renamed from: h */
    public static final void m98715h(String str) {
        AbstractC19074t.m100208f(str, "message");
        m98716i("SMLTransferMsg", str);
    }

    /* renamed from: i */
    public static final void m98716i(String str, String str2) {
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(str2, "message");
        C24830a.m129113c(str2, a.f94034q);
    }

    /* renamed from: j */
    public static final void m98717j(String str) {
        AbstractC19074t.m100208f(str, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        C0815e1.m2075D().m2099U(3, 0, 40, str, String.valueOf(AbstractC23309i.m120897Ec()));
    }

    /* renamed from: k */
    public static final void m98718k() {
        C0815e1.m2075D().m2099U(3, 1, 40, new String[0]);
    }
}
