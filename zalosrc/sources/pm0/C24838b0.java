package pm0;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;

/* renamed from: pm0.b0 */
/* loaded from: classes7.dex */
public final class C24838b0 implements Comparable {

    /* renamed from: q */
    public static final a f119230q = new a(null);

    /* renamed from: p */
    private final long f119231p;

    /* renamed from: pm0.b0$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    private /* synthetic */ C24838b0(long j11) {
        this.f119231p = j11;
    }

    /* renamed from: b */
    public static final /* synthetic */ C24838b0 m129149b(long j11) {
        return new C24838b0(j11);
    }

    /* renamed from: c */
    public static long m129150c(long j11) {
        return j11;
    }

    /* renamed from: d */
    public static boolean m129151d(long j11, Object obj) {
        return (obj instanceof C24838b0) && j11 == ((C24838b0) obj).m129154h();
    }

    /* renamed from: e */
    public static int m129152e(long j11) {
        return AbstractC2147g0.m11521a(j11);
    }

    /* renamed from: g */
    public static String m129153g(long j11) {
        return AbstractC24852i0.m129205c(j11);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC24852i0.m129204b(m129154h(), ((C24838b0) obj).m129154h());
    }

    public boolean equals(Object obj) {
        return m129151d(this.f119231p, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ long m129154h() {
        return this.f119231p;
    }

    public int hashCode() {
        return m129152e(this.f119231p);
    }

    public String toString() {
        return m129153g(this.f119231p);
    }
}
