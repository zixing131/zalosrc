package th;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;

/* renamed from: th.g */
/* loaded from: classes3.dex */
public final class C26686g {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private boolean f126424a;

    /* renamed from: b */
    private long f126425b;

    /* renamed from: c */
    private long f126426c;

    /* renamed from: th.g$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C26686g(boolean z11, long j11, long j12) {
        this.f126424a = z11;
        this.f126425b = j11;
        this.f126426c = j12;
    }

    /* renamed from: a */
    public final long m137053a() {
        return this.f126425b;
    }

    /* renamed from: b */
    public final boolean m137054b() {
        return this.f126424a;
    }

    /* renamed from: c */
    public final long m137055c() {
        return this.f126426c / 86400;
    }

    /* renamed from: d */
    public final long m137056d() {
        return this.f126426c * 1000;
    }

    /* renamed from: e */
    public final void m137057e(long j11) {
        this.f126426c = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26686g)) {
            return false;
        }
        C26686g c26686g = (C26686g) obj;
        return this.f126424a == c26686g.f126424a && this.f126425b == c26686g.f126425b && this.f126426c == c26686g.f126426c;
    }

    /* renamed from: f */
    public final void m137058f(long j11) {
        this.f126425b = j11;
    }

    /* renamed from: g */
    public final void m137059g(boolean z11) {
        this.f126424a = z11;
    }

    public int hashCode() {
        return (((AbstractC2144f.m11520a(this.f126424a) * 31) + AbstractC2147g0.m11521a(this.f126425b)) * 31) + AbstractC2147g0.m11521a(this.f126426c);
    }

    public String toString() {
        return "FileExpirationConfig(largeFileStatusEnabled=" + this.f126424a + ", largeFileSizeBytes=" + this.f126425b + ", largeFileExpireTime=" + this.f126426c + ")";
    }

    public /* synthetic */ C26686g(boolean z11, long j11, long j12, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? 104857600L : j11, (i11 & 4) != 0 ? 604800L : j12);
    }
}
