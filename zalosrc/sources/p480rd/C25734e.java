package p480rd;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import java.util.Map;

/* renamed from: rd.e */
/* loaded from: classes3.dex */
public final class C25734e {

    /* renamed from: a */
    private final long f122862a;

    /* renamed from: b */
    private final long f122863b;

    /* renamed from: c */
    private final Map f122864c;

    /* renamed from: d */
    private final int f122865d;

    /* renamed from: e */
    private List f122866e;

    public C25734e(long j11, long j12, Map map, int i11) {
        this.f122862a = j11;
        this.f122863b = j12;
        this.f122864c = map;
        this.f122865d = i11;
    }

    /* renamed from: a */
    public final List m132843a() {
        return this.f122866e;
    }

    /* renamed from: b */
    public final Map m132844b() {
        return this.f122864c;
    }

    /* renamed from: c */
    public final int m132845c() {
        return this.f122865d;
    }

    /* renamed from: d */
    public final long m132846d() {
        return this.f122863b;
    }

    /* renamed from: e */
    public final long m132847e() {
        return this.f122862a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25734e)) {
            return false;
        }
        C25734e c25734e = (C25734e) obj;
        return this.f122862a == c25734e.f122862a && this.f122863b == c25734e.f122863b && AbstractC19074t.m100204b(this.f122864c, c25734e.f122864c) && this.f122865d == c25734e.f122865d;
    }

    /* renamed from: f */
    public final void m132848f(List list) {
        this.f122866e = list;
    }

    public int hashCode() {
        int m11521a = ((AbstractC2147g0.m11521a(this.f122862a) * 31) + AbstractC2147g0.m11521a(this.f122863b)) * 31;
        Map map = this.f122864c;
        return ((m11521a + (map == null ? 0 : map.hashCode())) * 31) + this.f122865d;
    }

    public String toString() {
        return "EventTimeRangeRequest(timeMin=" + this.f122862a + ", timeMax=" + this.f122863b + ", mapUidTimeRange=" + this.f122864c + ", source=" + this.f122865d + ")";
    }

    public /* synthetic */ C25734e(long j11, long j12, Map map, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(j11, j12, map, (i12 & 8) != 0 ? 0 : i11);
    }
}
