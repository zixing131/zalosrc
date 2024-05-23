package d60;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.util.HashMap;
import java.util.Map;
import me0.AbstractC23160o0;
import mm0.AbstractC23350e;
import p248iy.AbstractC20887g;
import pm0.AbstractC24856m;
import pm0.AbstractC24866w;
import pm0.InterfaceC24854k;
import qm0.AbstractC25363p0;

/* renamed from: d60.d */
/* loaded from: classes5.dex */
public final class C17795d {
    public static final b Companion = new b(null);

    /* renamed from: e */
    private static final InterfaceC24854k f89997e;

    /* renamed from: a */
    private final Map f89998a = new HashMap();

    /* renamed from: b */
    private final Map f89999b = new HashMap();

    /* renamed from: c */
    private final HashMap f90000c;

    /* renamed from: d */
    private final HashMap f90001d;

    /* renamed from: d60.d$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f90002q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C17795d mo12V4() {
            return c.f90003a.m93997a();
        }
    }

    /* renamed from: d60.d$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C17795d m93996a() {
            return (C17795d) C17795d.f89997e.getValue();
        }
    }

    /* renamed from: d60.d$c */
    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f90003a = new c();

        /* renamed from: b */
        private static final C17795d f90004b = new C17795d();

        private c() {
        }

        /* renamed from: a */
        public final C17795d m93997a() {
            return f90004b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f90002q);
        f89997e = m129210a;
    }

    public C17795d() {
        HashMap m131406k;
        HashMap m131406k2;
        m131406k = AbstractC25363p0.m131406k(AbstractC24866w.m129235a("LOAD_ALL_CONVERSATIONS", 20400), AbstractC24866w.m129235a("OPEN_CSC_FULL", 20401), AbstractC24866w.m129235a("OPEN_CSC_LOAD_DATA", 20403), AbstractC24866w.m129235a("OPEN_CSC_LOAD_DATA_HAS_TARGET_ITEM", 20405), AbstractC24866w.m129235a("OPEN_CSC_TILL_DATA_READY", 20407));
        this.f90000c = m131406k;
        m131406k2 = AbstractC25363p0.m131406k(AbstractC24866w.m129235a("LOAD_ALL_CONVERSATIONS", 20400), AbstractC24866w.m129235a("OPEN_CSC_FULL", 20402), AbstractC24866w.m129235a("OPEN_CSC_LOAD_DATA", 20404), AbstractC24866w.m129235a("OPEN_CSC_LOAD_DATA_HAS_TARGET_ITEM", 20406), AbstractC24866w.m129235a("OPEN_CSC_TILL_DATA_READY", 20408));
        this.f90001d = m131406k2;
    }

    /* renamed from: b */
    private final long m93983b() {
        return System.currentTimeMillis();
    }

    /* renamed from: d */
    public static /* synthetic */ void m93984d(C17795d c17795d, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        c17795d.m93993c(str, str2);
    }

    /* renamed from: e */
    private final int m93985e(String str) {
        Integer num = (Integer) this.f89999b.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* renamed from: f */
    public static final C17795d m93986f() {
        return Companion.m93996a();
    }

    /* renamed from: g */
    private final int m93987g(String str) {
        Integer num = -1;
        if (AbstractC19074t.m100204b(str, "OPEN_CSC_LOAD_DATA") || AbstractC19074t.m100204b(str, "OPEN_CSC_LOAD_DATA_HAS_TARGET_ITEM") ? !(m93985e("OPEN_CSC_LOAD_DATA") != 0 || m93985e("OPEN_CSC_LOAD_DATA_HAS_TARGET_ITEM") != 0) : m93985e(str) == 0) {
            Integer num2 = (Integer) this.f90000c.get(str);
            if (num2 != null) {
                num = num2;
            }
            return num.intValue();
        }
        Integer num3 = (Integer) this.f90001d.get(str);
        if (num3 != null) {
            num = num3;
        }
        return num.intValue();
    }

    /* renamed from: h */
    private final String m93988h(String str, String str2) {
        String str3;
        if (str2.length() > 0) {
            str3 = "_" + str2;
        } else {
            str3 = "";
        }
        return str + str3;
    }

    /* renamed from: i */
    private final boolean m93989i(String str) {
        if (m93985e(str) >= 3) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private final void m93990j(String str) {
        this.f89999b.put(str, Integer.valueOf(m93985e(str) + 1));
    }

    /* renamed from: l */
    public static /* synthetic */ void m93991l(C17795d c17795d, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        c17795d.m93994k(str, str2);
    }

    /* renamed from: m */
    private final void m93992m(String str, long j11, long j12, long j13) {
        AbstractC20110a.f98889a.m104564x("CHAT_PERFORMANCE").mo104556o(8, "Task (" + str + ") finished: Start at [" + AbstractC23160o0.m119279p0(j11) + "], duration " + j13 + " ms", new Object[0]);
        int m93987g = m93987g(str);
        if (m93987g != -1) {
            AbstractC20887g.m109247y(m93987g, j11, j12, j13);
        }
    }

    /* renamed from: c */
    public final void m93993c(String str, String str2) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, "viewId");
        try {
            if (m93989i(str)) {
                return;
            }
            Long l11 = (Long) this.f89998a.remove(m93988h(str, str2));
            if (l11 != null) {
                long longValue = l11.longValue();
                long m93983b = m93983b();
                long j11 = m93983b - longValue;
                if (j11 > 0) {
                    m93992m(str, longValue, m93983b, j11);
                    m93990j(str);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatPerfLogger", e11);
        }
    }

    /* renamed from: k */
    public final void m93994k(String str, String str2) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, "viewId");
        try {
            if (m93989i(str)) {
                return;
            }
            this.f89998a.put(m93988h(str, str2), Long.valueOf(m93983b()));
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatPerfLogger", e11);
        }
    }
}
