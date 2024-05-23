package p279jw;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: jw.b */
/* loaded from: classes4.dex */
public final class C21374b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private boolean f104249a;

    /* renamed from: b */
    private int f104250b;

    /* renamed from: c */
    private long f104251c;

    /* renamed from: d */
    private int f104252d;

    /* renamed from: jw.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C21374b(boolean z11, int i11, long j11, int i12) {
        this.f104249a = z11;
        this.f104250b = i11;
        this.f104251c = j11;
        this.f104252d = i12;
    }

    /* renamed from: a */
    public final void m110815a(C21374b c21374b) {
        AbstractC19074t.m100208f(c21374b, "other");
        this.f104249a = c21374b.f104249a;
        this.f104250b = c21374b.f104250b;
        this.f104251c = c21374b.f104251c;
        this.f104252d = c21374b.f104252d;
    }

    /* renamed from: b */
    public final boolean m110816b() {
        return this.f104249a;
    }

    /* renamed from: c */
    public final int m110817c() {
        return this.f104250b;
    }

    /* renamed from: d */
    public final long m110818d() {
        return this.f104251c;
    }

    /* renamed from: e */
    public final int m110819e() {
        return this.f104252d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21374b)) {
            return false;
        }
        C21374b c21374b = (C21374b) obj;
        return this.f104249a == c21374b.f104249a && this.f104250b == c21374b.f104250b && this.f104251c == c21374b.f104251c && this.f104252d == c21374b.f104252d;
    }

    /* renamed from: f */
    public final void m110820f(boolean z11) {
        this.f104249a = z11;
    }

    /* renamed from: g */
    public final void m110821g(int i11) {
        this.f104250b = i11;
    }

    /* renamed from: h */
    public final void m110822h(long j11) {
        this.f104251c = j11;
    }

    public int hashCode() {
        return (((((AbstractC2144f.m11520a(this.f104249a) * 31) + this.f104250b) * 31) + AbstractC2147g0.m11521a(this.f104251c)) * 31) + this.f104252d;
    }

    /* renamed from: i */
    public final void m110823i(int i11) {
        this.f104252d = i11;
    }

    public String toString() {
        return "MyCloudAutoSyncMsgConfig(enable=" + this.f104249a + ", maxMsgCount=" + this.f104250b + ", requestDelay=" + this.f104251c + ", syncedVersion=" + this.f104252d + ")";
    }

    public /* synthetic */ C21374b(boolean z11, int i11, long j11, int i12, int i13, AbstractC19060k abstractC19060k) {
        this((i13 & 1) != 0 ? false : z11, (i13 & 2) != 0 ? 10000 : i11, (i13 & 4) != 0 ? 0L : j11, (i13 & 8) != 0 ? 0 : i12);
    }
}
