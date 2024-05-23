package androidx.work;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Set;
import java.util.UUID;

/* renamed from: androidx.work.h0 */
/* loaded from: classes2.dex */
public final class C2149h0 {

    /* renamed from: m */
    public static final a f9118m = new a(null);

    /* renamed from: a */
    private final UUID f9119a;

    /* renamed from: b */
    private final c f9120b;

    /* renamed from: c */
    private final Set f9121c;

    /* renamed from: d */
    private final C2148h f9122d;

    /* renamed from: e */
    private final C2148h f9123e;

    /* renamed from: f */
    private final int f9124f;

    /* renamed from: g */
    private final int f9125g;

    /* renamed from: h */
    private final C2142e f9126h;

    /* renamed from: i */
    private final long f9127i;

    /* renamed from: j */
    private final b f9128j;

    /* renamed from: k */
    private final long f9129k;

    /* renamed from: l */
    private final int f9130l;

    /* renamed from: androidx.work.h0$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: androidx.work.h0$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        private final long f9131a;

        /* renamed from: b */
        private final long f9132b;

        public b(long j11, long j12) {
            this.f9131a = j11;
            this.f9132b = j12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !AbstractC19074t.m100204b(b.class, obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            if (bVar.f9131a == this.f9131a && bVar.f9132b == this.f9132b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (AbstractC2147g0.m11521a(this.f9131a) * 31) + AbstractC2147g0.m11521a(this.f9132b);
        }

        public String toString() {
            return "PeriodicityInfo{repeatIntervalMillis=" + this.f9131a + ", flexIntervalMillis=" + this.f9132b + '}';
        }
    }

    /* renamed from: androidx.work.h0$c */
    /* loaded from: classes.dex */
    public enum c {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        /* renamed from: c */
        public final boolean m11545c() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public C2149h0(UUID uuid, c cVar, Set set, C2148h c2148h, C2148h c2148h2, int i11, int i12, C2142e c2142e, long j11, b bVar, long j12, int i13) {
        AbstractC19074t.m100208f(uuid, "id");
        AbstractC19074t.m100208f(cVar, "state");
        AbstractC19074t.m100208f(set, "tags");
        AbstractC19074t.m100208f(c2148h, "outputData");
        AbstractC19074t.m100208f(c2148h2, "progress");
        AbstractC19074t.m100208f(c2142e, "constraints");
        this.f9119a = uuid;
        this.f9120b = cVar;
        this.f9121c = set;
        this.f9122d = c2148h;
        this.f9123e = c2148h2;
        this.f9124f = i11;
        this.f9125g = i12;
        this.f9126h = c2142e;
        this.f9127i = j11;
        this.f9128j = bVar;
        this.f9129k = j12;
        this.f9130l = i13;
    }

    /* renamed from: a */
    public final C2148h m11540a() {
        return this.f9123e;
    }

    /* renamed from: b */
    public final int m11541b() {
        return this.f9124f;
    }

    /* renamed from: c */
    public final c m11542c() {
        return this.f9120b;
    }

    /* renamed from: d */
    public final int m11543d() {
        return this.f9130l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC19074t.m100204b(C2149h0.class, obj.getClass())) {
            return false;
        }
        C2149h0 c2149h0 = (C2149h0) obj;
        if (this.f9124f != c2149h0.f9124f || this.f9125g != c2149h0.f9125g || !AbstractC19074t.m100204b(this.f9119a, c2149h0.f9119a) || this.f9120b != c2149h0.f9120b || !AbstractC19074t.m100204b(this.f9122d, c2149h0.f9122d) || !AbstractC19074t.m100204b(this.f9126h, c2149h0.f9126h) || this.f9127i != c2149h0.f9127i || !AbstractC19074t.m100204b(this.f9128j, c2149h0.f9128j) || this.f9129k != c2149h0.f9129k || this.f9130l != c2149h0.f9130l || !AbstractC19074t.m100204b(this.f9121c, c2149h0.f9121c)) {
            return false;
        }
        return AbstractC19074t.m100204b(this.f9123e, c2149h0.f9123e);
    }

    public int hashCode() {
        int i11;
        int hashCode = ((((((((((((((((this.f9119a.hashCode() * 31) + this.f9120b.hashCode()) * 31) + this.f9122d.hashCode()) * 31) + this.f9121c.hashCode()) * 31) + this.f9123e.hashCode()) * 31) + this.f9124f) * 31) + this.f9125g) * 31) + this.f9126h.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f9127i)) * 31;
        b bVar = this.f9128j;
        if (bVar != null) {
            i11 = bVar.hashCode();
        } else {
            i11 = 0;
        }
        return ((((hashCode + i11) * 31) + AbstractC2147g0.m11521a(this.f9129k)) * 31) + this.f9130l;
    }

    public String toString() {
        return "WorkInfo{id='" + this.f9119a + "', state=" + this.f9120b + ", outputData=" + this.f9122d + ", tags=" + this.f9121c + ", progress=" + this.f9123e + ", runAttemptCount=" + this.f9124f + ", generation=" + this.f9125g + ", constraints=" + this.f9126h + ", initialDelayMillis=" + this.f9127i + ", periodicityInfo=" + this.f9128j + ", nextScheduleTimeMillis=" + this.f9129k + "}, stopReason=" + this.f9130l;
    }
}
