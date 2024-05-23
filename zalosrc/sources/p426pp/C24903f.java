package p426pp;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import on0.AbstractC24341v;

/* renamed from: pp.f */
/* loaded from: classes4.dex */
public final class C24903f {

    /* renamed from: a */
    private final String f119491a;

    /* renamed from: b */
    private String f119492b;

    /* renamed from: c */
    private long f119493c;

    /* renamed from: d */
    private int f119494d;

    public C24903f(String str, String str2, long j11, int i11) {
        AbstractC19074t.m100208f(str, "idSong");
        AbstractC19074t.m100208f(str2, "streamUrl");
        this.f119491a = str;
        this.f119492b = str2;
        this.f119493c = j11;
        this.f119494d = i11;
    }

    /* renamed from: b */
    public static /* synthetic */ C24903f m129498b(C24903f c24903f, String str, String str2, long j11, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = c24903f.f119491a;
        }
        if ((i12 & 2) != 0) {
            str2 = c24903f.f119492b;
        }
        String str3 = str2;
        if ((i12 & 4) != 0) {
            j11 = c24903f.f119493c;
        }
        long j12 = j11;
        if ((i12 & 8) != 0) {
            i11 = c24903f.f119494d;
        }
        return c24903f.m129499a(str, str3, j12, i11);
    }

    /* renamed from: a */
    public final C24903f m129499a(String str, String str2, long j11, int i11) {
        AbstractC19074t.m100208f(str, "idSong");
        AbstractC19074t.m100208f(str2, "streamUrl");
        return new C24903f(str, str2, j11, i11);
    }

    /* renamed from: c */
    public final C24903f m129500c() {
        return m129498b(this, null, null, 0L, 0, 15, null);
    }

    /* renamed from: d */
    public final int m129501d() {
        return this.f119494d;
    }

    /* renamed from: e */
    public final String m129502e() {
        return this.f119491a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24903f)) {
            return false;
        }
        C24903f c24903f = (C24903f) obj;
        return AbstractC19074t.m100204b(this.f119491a, c24903f.f119491a) && AbstractC19074t.m100204b(this.f119492b, c24903f.f119492b) && this.f119493c == c24903f.f119493c && this.f119494d == c24903f.f119494d;
    }

    /* renamed from: f */
    public final String m129503f() {
        return this.f119492b;
    }

    /* renamed from: g */
    public final boolean m129504g() {
        boolean m127128x;
        if (System.currentTimeMillis() - this.f119493c < 1800000) {
            m127128x = AbstractC24341v.m127128x(this.f119492b);
            if (!m127128x) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final void m129505h(int i11) {
        this.f119494d = i11;
    }

    public int hashCode() {
        return (((((this.f119491a.hashCode() * 31) + this.f119492b.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f119493c)) * 31) + this.f119494d;
    }

    public String toString() {
        return "SongStreaming(idSong=" + this.f119491a + ", streamUrl=" + this.f119492b + ", timeStamp=" + this.f119493c + ", durationMillis=" + this.f119494d + ")";
    }

    public /* synthetic */ C24903f(String str, String str2, long j11, int i11, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) == 0 ? str2 : "", (i12 & 4) != 0 ? System.currentTimeMillis() : j11, (i12 & 8) != 0 ? 0 : i11);
    }
}
