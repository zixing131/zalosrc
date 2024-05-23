package p480rd;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import sd.C26231b;

/* renamed from: rd.d */
/* loaded from: classes3.dex */
public final class C25733d {

    /* renamed from: a */
    private long f122858a;

    /* renamed from: b */
    private long f122859b;

    /* renamed from: c */
    private final CopyOnWriteArrayList f122860c;

    /* renamed from: d */
    private volatile boolean f122861d;

    public C25733d(long j11, long j12, CopyOnWriteArrayList copyOnWriteArrayList) {
        AbstractC19074t.m100208f(copyOnWriteArrayList, "listEventInfo");
        this.f122858a = j11;
        this.f122859b = j12;
        this.f122860c = copyOnWriteArrayList;
    }

    /* renamed from: a */
    public final CopyOnWriteArrayList m132836a() {
        return this.f122860c;
    }

    /* renamed from: b */
    public final ArrayList m132837b() {
        return C26231b.f124604a.m134868e(this.f122860c);
    }

    /* renamed from: c */
    public final long m132838c() {
        return this.f122859b;
    }

    /* renamed from: d */
    public final long m132839d() {
        return this.f122858a;
    }

    /* renamed from: e */
    public final boolean m132840e() {
        return this.f122861d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25733d)) {
            return false;
        }
        C25733d c25733d = (C25733d) obj;
        return this.f122858a == c25733d.f122858a && this.f122859b == c25733d.f122859b && AbstractC19074t.m100204b(this.f122860c, c25733d.f122860c);
    }

    /* renamed from: f */
    public final void m132841f(boolean z11) {
        this.f122861d = z11;
    }

    /* renamed from: g */
    public final void m132842g(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "finalEvents");
        this.f122860c.clear();
        this.f122860c.addAll(arrayList);
    }

    public int hashCode() {
        return (((AbstractC2147g0.m11521a(this.f122858a) * 31) + AbstractC2147g0.m11521a(this.f122859b)) * 31) + this.f122860c.hashCode();
    }

    public String toString() {
        return "EventTimeRange(timeMin=" + this.f122858a + ", timeMax=" + this.f122859b + ", listEventInfo=" + this.f122860c + ")";
    }

    public /* synthetic */ C25733d(long j11, long j12, CopyOnWriteArrayList copyOnWriteArrayList, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) == 0 ? j12 : 0L, (i11 & 4) != 0 ? new CopyOnWriteArrayList() : copyOnWriteArrayList);
    }
}
