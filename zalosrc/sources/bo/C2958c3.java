package bo;

import fn0.AbstractC19060k;

/* renamed from: bo.c3 */
/* loaded from: classes4.dex */
public final class C2958c3 {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final int f11668a;

    /* renamed from: b */
    private boolean f11669b;

    /* renamed from: c */
    private int f11670c;

    /* renamed from: bo.c3$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C2958c3 m14009a() {
            return new C2958c3(3);
        }
    }

    public C2958c3(int i11) {
        this.f11668a = i11;
    }

    /* renamed from: a */
    public static final C2958c3 m14004a() {
        return Companion.m14009a();
    }

    /* renamed from: b */
    public final int m14005b() {
        return this.f11670c;
    }

    /* renamed from: c */
    public final boolean m14006c() {
        return this.f11669b;
    }

    /* renamed from: d */
    public final int m14007d() {
        return this.f11668a;
    }

    /* renamed from: e */
    public final void m14008e(int i11) {
        this.f11670c = i11;
        this.f11669b = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2958c3) && this.f11668a == ((C2958c3) obj).f11668a;
    }

    public int hashCode() {
        return this.f11668a;
    }

    public String toString() {
        return "SkeletonLoadingData(typeLoading=" + this.f11668a + ")";
    }
}
