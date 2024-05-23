package a10;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import v00.C27417l;

/* renamed from: a10.s */
/* loaded from: classes5.dex */
public final class C0054s {

    /* renamed from: a */
    private final String f200a;

    /* renamed from: b */
    private int f201b;

    /* renamed from: c */
    private long f202c;

    public C0054s(String str, int i11, long j11) {
        AbstractC19074t.m100208f(str, "channelId");
        this.f200a = str;
        this.f201b = i11;
        this.f202c = j11;
    }

    /* renamed from: a */
    public final String m158a() {
        return this.f200a;
    }

    /* renamed from: b */
    public final long m159b() {
        return this.f202c;
    }

    /* renamed from: c */
    public final int m160c() {
        return this.f201b;
    }

    /* renamed from: d */
    public final void m161d(long j11) {
        this.f202c = j11;
    }

    /* renamed from: e */
    public final void m162e(int i11) {
        this.f201b = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0054s)) {
            return false;
        }
        C0054s c0054s = (C0054s) obj;
        return AbstractC19074t.m100204b(this.f200a, c0054s.f200a) && this.f201b == c0054s.f201b && this.f202c == c0054s.f202c;
    }

    public int hashCode() {
        return (((this.f200a.hashCode() * 31) + this.f201b) * 31) + AbstractC2147g0.m11521a(this.f202c);
    }

    public String toString() {
        return "WatchCount(channelId=" + this.f200a + ", videoCount=" + this.f201b + ", modifiedTime=" + this.f202c + ")";
    }

    public /* synthetic */ C0054s(String str, int i11, long j11, int i12, AbstractC19060k abstractC19060k) {
        this(str, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? C27417l.f129055a.m140382f().m130131a() : j11);
    }
}
