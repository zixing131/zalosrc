package sx;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: sx.a */
/* loaded from: classes4.dex */
public final class C26399a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f125406a;

    /* renamed from: b */
    private String f125407b;

    /* renamed from: c */
    private final long f125408c;

    /* renamed from: d */
    private int f125409d;

    /* renamed from: sx.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C26399a() {
        this(0, null, 0L, 0, 15, null);
    }

    /* renamed from: a */
    public final C26399a m136118a() {
        return new C26399a(this.f125406a, this.f125407b, this.f125408c, this.f125409d);
    }

    /* renamed from: b */
    public final String m136119b() {
        return this.f125407b + "_" + this.f125408c;
    }

    /* renamed from: c */
    public final int m136120c() {
        return this.f125409d;
    }

    /* renamed from: d */
    public final void m136121d(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f125407b = str;
    }

    /* renamed from: e */
    public final void m136122e(int i11) {
        this.f125409d = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26399a)) {
            return false;
        }
        C26399a c26399a = (C26399a) obj;
        return this.f125406a == c26399a.f125406a && AbstractC19074t.m100204b(this.f125407b, c26399a.f125407b) && this.f125408c == c26399a.f125408c && this.f125409d == c26399a.f125409d;
    }

    /* renamed from: f */
    public final void m136123f(int i11) {
        this.f125406a = i11;
    }

    public int hashCode() {
        return (((((this.f125406a * 31) + this.f125407b.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f125408c)) * 31) + this.f125409d;
    }

    public String toString() {
        return "ActionShareInfo(type=" + this.f125406a + ", threadId=" + this.f125407b + ", actionTime=" + this.f125408c + ", totalMsg=" + this.f125409d + ")";
    }

    public C26399a(int i11, String str, long j11, int i12) {
        AbstractC19074t.m100208f(str, "threadId");
        this.f125406a = i11;
        this.f125407b = str;
        this.f125408c = j11;
        this.f125409d = i12;
    }

    public /* synthetic */ C26399a(int i11, String str, long j11, int i12, int i13, AbstractC19060k abstractC19060k) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? System.currentTimeMillis() : j11, (i13 & 8) != 0 ? 0 : i12);
    }
}
