package pm0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: pm0.e0 */
/* loaded from: classes7.dex */
public final class C24844e0 implements Comparable {

    /* renamed from: q */
    public static final a f119240q = new a(null);

    /* renamed from: p */
    private final short f119241p;

    /* renamed from: pm0.e0$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    private /* synthetic */ C24844e0(short s7) {
        this.f119241p = s7;
    }

    /* renamed from: b */
    public static final /* synthetic */ C24844e0 m129176b(short s7) {
        return new C24844e0(s7);
    }

    /* renamed from: c */
    public static short m129177c(short s7) {
        return s7;
    }

    /* renamed from: d */
    public static boolean m129178d(short s7, Object obj) {
        return (obj instanceof C24844e0) && s7 == ((C24844e0) obj).m129181h();
    }

    /* renamed from: e */
    public static int m129179e(short s7) {
        return s7;
    }

    /* renamed from: g */
    public static String m129180g(short s7) {
        return String.valueOf(s7 & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC19074t.m100209g(m129181h() & 65535, ((C24844e0) obj).m129181h() & 65535);
    }

    public boolean equals(Object obj) {
        return m129178d(this.f119241p, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ short m129181h() {
        return this.f119241p;
    }

    public int hashCode() {
        return m129179e(this.f119241p);
    }

    public String toString() {
        return m129180g(this.f119241p);
    }
}
