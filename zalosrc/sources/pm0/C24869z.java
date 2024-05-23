package pm0;

import fn0.AbstractC19060k;

/* renamed from: pm0.z */
/* loaded from: classes7.dex */
public final class C24869z implements Comparable {

    /* renamed from: q */
    public static final a f119283q = new a(null);

    /* renamed from: p */
    private final int f119284p;

    /* renamed from: pm0.z$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    private /* synthetic */ C24869z(int i11) {
        this.f119284p = i11;
    }

    /* renamed from: b */
    public static final /* synthetic */ C24869z m129259b(int i11) {
        return new C24869z(i11);
    }

    /* renamed from: c */
    public static int m129260c(int i11) {
        return i11;
    }

    /* renamed from: d */
    public static boolean m129261d(int i11, Object obj) {
        return (obj instanceof C24869z) && i11 == ((C24869z) obj).m129264h();
    }

    /* renamed from: e */
    public static int m129262e(int i11) {
        return i11;
    }

    /* renamed from: g */
    public static String m129263g(int i11) {
        return String.valueOf(i11 & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC24852i0.m129203a(m129264h(), ((C24869z) obj).m129264h());
    }

    public boolean equals(Object obj) {
        return m129261d(this.f119284p, obj);
    }

    /* renamed from: h */
    public final /* synthetic */ int m129264h() {
        return this.f119284p;
    }

    public int hashCode() {
        return m129262e(this.f119284p);
    }

    public String toString() {
        return m129263g(this.f119284p);
    }
}
