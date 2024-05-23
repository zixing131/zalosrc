package ln0;

import fn0.AbstractC19060k;

/* renamed from: ln0.f */
/* loaded from: classes.dex */
public final class C22537f extends C22535d {

    /* renamed from: t */
    public static final a f110307t = new a(null);

    /* renamed from: u */
    private static final C22537f f110308u = new C22537f(1, 0);

    /* renamed from: ln0.f$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C22537f m116557a() {
            return C22537f.f110308u;
        }
    }

    public C22537f(int i11, int i12) {
        super(i11, i12, 1);
    }

    @Override // ln0.C22535d
    public boolean equals(Object obj) {
        if (obj instanceof C22537f) {
            if (!isEmpty() || !((C22537f) obj).isEmpty()) {
                C22537f c22537f = (C22537f) obj;
                if (m116547d() != c22537f.m116547d() || m116548e() != c22537f.m116548e()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // ln0.C22535d
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m116547d() * 31) + m116548e();
    }

    @Override // ln0.C22535d
    public boolean isEmpty() {
        if (m116547d() > m116548e()) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean m116554l(int i11) {
        if (m116547d() <= i11 && i11 <= m116548e()) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public Integer m116555m() {
        return Integer.valueOf(m116548e());
    }

    /* renamed from: n */
    public Integer m116556n() {
        return Integer.valueOf(m116547d());
    }

    @Override // ln0.C22535d
    public String toString() {
        return m116547d() + ".." + m116548e();
    }
}
