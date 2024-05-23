package cf;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: cf.a */
/* loaded from: classes3.dex */
public final class C3450a {

    /* renamed from: a */
    private long f14511a;

    /* renamed from: b */
    private long f14512b;

    /* renamed from: c */
    private C3451b f14513c;

    public C3450a() {
        this(0L, 0L, null, 7, null);
    }

    /* renamed from: a */
    public final long m17365a() {
        return this.f14512b;
    }

    /* renamed from: b */
    public final long m17366b() {
        return this.f14511a;
    }

    /* renamed from: c */
    public final C3451b m17367c() {
        return this.f14513c;
    }

    /* renamed from: d */
    public final void m17368d(long j11) {
        this.f14512b = j11;
    }

    /* renamed from: e */
    public final void m17369e(long j11) {
        this.f14511a = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3450a)) {
            return false;
        }
        C3450a c3450a = (C3450a) obj;
        return this.f14511a == c3450a.f14511a && this.f14512b == c3450a.f14512b && AbstractC19074t.m100204b(this.f14513c, c3450a.f14513c);
    }

    /* renamed from: f */
    public final void m17370f(C3451b c3451b) {
        AbstractC19074t.m100208f(c3451b, "<set-?>");
        this.f14513c = c3451b;
    }

    public int hashCode() {
        return (((AbstractC2147g0.m11521a(this.f14511a) * 31) + AbstractC2147g0.m11521a(this.f14512b)) * 31) + this.f14513c.hashCode();
    }

    public String toString() {
        return "MediaEditorLogInfo(startTime=" + this.f14511a + ", endTime=" + this.f14512b + ", trimLogInfo=" + this.f14513c + ")";
    }

    public C3450a(long j11, long j12, C3451b c3451b) {
        AbstractC19074t.m100208f(c3451b, "trimLogInfo");
        this.f14511a = j11;
        this.f14512b = j12;
        this.f14513c = c3451b;
    }

    public /* synthetic */ C3450a(long j11, long j12, C3451b c3451b, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) == 0 ? j12 : 0L, (i11 & 4) != 0 ? new C3451b(0L, 0, 0, 0, 0, 0, 0, 0, false, 511, null) : c3451b);
    }
}
