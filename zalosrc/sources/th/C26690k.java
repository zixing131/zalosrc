package th;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;

/* renamed from: th.k */
/* loaded from: classes3.dex */
public final class C26690k {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private boolean f126453a;

    /* renamed from: b */
    private int f126454b;

    /* renamed from: c */
    private boolean f126455c;

    /* renamed from: d */
    private int f126456d;

    /* renamed from: e */
    private boolean f126457e;

    /* renamed from: th.k$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C26690k(boolean z11, int i11, boolean z12, int i12, boolean z13) {
        this.f126453a = z11;
        this.f126454b = i11;
        this.f126455c = z12;
        this.f126456d = i12;
        this.f126457e = z13;
    }

    /* renamed from: a */
    public final boolean m137118a() {
        return this.f126453a;
    }

    /* renamed from: b */
    public final boolean m137119b() {
        return this.f126457e;
    }

    /* renamed from: c */
    public final boolean m137120c() {
        return this.f126455c;
    }

    /* renamed from: d */
    public final int m137121d() {
        return this.f126456d;
    }

    /* renamed from: e */
    public final int m137122e() {
        return this.f126454b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26690k)) {
            return false;
        }
        C26690k c26690k = (C26690k) obj;
        return this.f126453a == c26690k.f126453a && this.f126454b == c26690k.f126454b && this.f126455c == c26690k.f126455c && this.f126456d == c26690k.f126456d && this.f126457e == c26690k.f126457e;
    }

    /* renamed from: f */
    public final void m137123f(boolean z11) {
        this.f126453a = z11;
    }

    /* renamed from: g */
    public final void m137124g(boolean z11) {
        this.f126457e = z11;
    }

    /* renamed from: h */
    public final void m137125h(boolean z11) {
        this.f126455c = z11;
    }

    public int hashCode() {
        return (((((((AbstractC2144f.m11520a(this.f126453a) * 31) + this.f126454b) * 31) + AbstractC2144f.m11520a(this.f126455c)) * 31) + this.f126456d) * 31) + AbstractC2144f.m11520a(this.f126457e);
    }

    /* renamed from: i */
    public final void m137126i(int i11) {
        this.f126456d = i11;
    }

    /* renamed from: j */
    public final void m137127j(int i11) {
        this.f126454b = i11;
    }

    public String toString() {
        return "PullMsgOfflineGroupConfig(enable=" + this.f126453a + ", preloadPage=" + this.f126454b + ", enablePush1991=" + this.f126455c + ", maxMembers=" + this.f126456d + ", enableLoadHttpPreview=" + this.f126457e + ")";
    }

    public /* synthetic */ C26690k(boolean z11, int i11, boolean z12, int i12, boolean z13, int i13, AbstractC19060k abstractC19060k) {
        this((i13 & 1) != 0 ? false : z11, (i13 & 2) != 0 ? 3 : i11, (i13 & 4) != 0 ? false : z12, (i13 & 8) != 0 ? 200 : i12, (i13 & 16) != 0 ? false : z13);
    }
}
