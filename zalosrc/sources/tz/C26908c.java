package tz;

import am.AbstractC0924m0;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import nh0.InterfaceC23792b;
import p348mi.AbstractC23306f;
import p591vz.C28677a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import uz.C27386b;

/* renamed from: tz.c */
/* loaded from: classes4.dex */
public final class C26908c {

    /* renamed from: a */
    public static final C26908c f127344a = new C26908c();

    /* renamed from: b */
    private static final InterfaceC24854k f127345b;

    /* renamed from: c */
    private static C27386b f127346c;

    /* renamed from: d */
    private static C27386b f127347d;

    /* renamed from: e */
    private static String f127348e;

    /* renamed from: f */
    private static String f127349f;

    /* renamed from: g */
    private static long f127350g;

    /* renamed from: tz.c$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f127351q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final InterfaceC23792b mo12V4() {
            InterfaceC23792b m120579F1 = AbstractC23306f.m120579F1();
            AbstractC19074t.m100207e(m120579F1, "provideTimeProvider(...)");
            return m120579F1;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f127351q);
        f127345b = m129210a;
        f127350g = -1L;
    }

    private C26908c() {
    }

    /* renamed from: c */
    public static final void m138707c(C27386b c27386b) {
        long j11;
        long min;
        AbstractC20110a.f98889a.mo104554k("Fetching metadata complete", new Object[0]);
        if (c27386b != null) {
            f127344a.m138712g(c27386b.m140308b());
            min = AbstractC26909d.f127352a;
        } else {
            long j12 = f127350g;
            j11 = AbstractC26909d.f127352a;
            if (j12 == j11) {
                min = 1000;
            } else {
                min = Math.min(f127350g * 2, 900000L);
            }
        }
        f127350g = min;
        AbstractC0924m0.m4175rj(f127344a.m138708f().mo124314i());
    }

    /* renamed from: f */
    private final InterfaceC23792b m138708f() {
        return (InterfaceC23792b) f127345b.getValue();
    }

    /* renamed from: b */
    public final void m138709b() {
        long j11;
        long m4218t2 = AbstractC0924m0.m4218t2();
        long mo124314i = m138708f().mo124314i();
        if (f127350g == -1) {
            j11 = AbstractC26909d.f127352a;
            f127350g = j11;
        }
        if (mo124314i - m4218t2 > f127350g) {
            AbstractC20110a.f98889a.mo104554k("Fetching latest model metadata", new Object[0]);
            new C28677a().m143636a(new C28677a.a() { // from class: tz.b
                @Override // p591vz.C28677a.a
                /* renamed from: a */
                public final void mo138705a(C27386b c27386b) {
                    C26908c.m138707c(c27386b);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:            if (fn0.AbstractC19074t.m100204b(r1.m140308b(), r0) == false) goto L27;     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C27386b m138710d() {
        String str = f127349f;
        if (str == null) {
            str = AbstractC0924m0.m3619Z2();
            f127349f = str;
            AbstractC19074t.m100207e(str, "also(...)");
        }
        if (str.length() > 0) {
            C27386b c27386b = f127347d;
            if (c27386b != null) {
                AbstractC19074t.m100205c(c27386b);
            }
            f127347d = C27386b.Companion.m140311a(str);
            return f127347d;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:            if (fn0.AbstractC19074t.m100204b(r1.m140308b(), r0) == false) goto L27;     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C27386b m138711e() {
        String str = f127348e;
        if (str == null) {
            str = AbstractC0924m0.m3889i3();
            f127348e = str;
            AbstractC19074t.m100207e(str, "also(...)");
        }
        if (str.length() > 0) {
            C27386b c27386b = f127346c;
            if (c27386b != null) {
                AbstractC19074t.m100205c(c27386b);
            }
            f127346c = C27386b.Companion.m140311a(str);
            return f127346c;
        }
        return null;
    }

    /* renamed from: g */
    public final void m138712g(String str) {
        AbstractC19074t.m100208f(str, "jsonStr");
        String str2 = f127349f;
        if (str2 != null && AbstractC19074t.m100204b(str2, str)) {
            return;
        }
        f127349f = str;
        AbstractC0924m0.m3578Xj(str);
    }

    /* renamed from: h */
    public final void m138713h(String str) {
        AbstractC19074t.m100208f(str, "jsonStr");
        String str2 = f127348e;
        if (str2 != null && AbstractC19074t.m100204b(str2, str)) {
            return;
        }
        f127348e = str;
        AbstractC0924m0.m3876hk(str);
    }
}
