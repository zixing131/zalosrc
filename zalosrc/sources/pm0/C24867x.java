package pm0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: pm0.x */
/* loaded from: classes7.dex */
public final class C24867x implements Comparable {

    /* renamed from: q */
    public static final a f119278q = new a(null);

    /* renamed from: p */
    private final byte f119279p;

    /* renamed from: pm0.x$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    private /* synthetic */ C24867x(byte b11) {
        this.f119279p = b11;
    }

    /* renamed from: b */
    public static final /* synthetic */ C24867x m129236b(byte b11) {
        return new C24867x(b11);
    }

    /* renamed from: c */
    public static byte m129237c(byte b11) {
        return b11;
    }

    /* renamed from: d */
    public static boolean m129238d(byte b11, Object obj) {
        return (obj instanceof C24867x) && b11 == ((C24867x) obj).m129241h();
    }

    /* renamed from: e */
    public static int m129239e(byte b11) {
        return b11;
    }

    /* renamed from: g */
    public static String m129240g(byte b11) {
        return String.valueOf(b11 & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC19074t.m100209g(m129241h() & 255, ((C24867x) obj).m129241h() & 255);
    }

    public boolean equals(Object obj) {
        return m129238d(this.f119279p, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ byte m129241h() {
        return this.f119279p;
    }

    public int hashCode() {
        return m129239e(this.f119279p);
    }

    public String toString() {
        return m129240g(this.f119279p);
    }
}
