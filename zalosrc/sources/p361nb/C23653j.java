package p361nb;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: nb.j */
/* loaded from: classes3.dex */
public final class C23653j {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private C23648e f114593a;

    /* renamed from: b */
    private AtomicLong f114594b;

    /* renamed from: nb.j$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C23653j(C23648e c23648e, long j11) {
        AbstractC19074t.m100208f(c23648e, "actionLogV2Info");
        this.f114593a = c23648e;
        AtomicLong atomicLong = new AtomicLong();
        this.f114594b = atomicLong;
        atomicLong.set(j11);
    }

    /* renamed from: a */
    public final C23648e m123965a() {
        return this.f114593a;
    }

    /* renamed from: b */
    public final int m123966b() {
        return this.f114593a.m123917j();
    }

    /* renamed from: c */
    public final long m123967c() {
        return this.f114594b.get();
    }

    /* renamed from: d */
    public final void m123968d(C23648e c23648e) {
        AbstractC19074t.m100208f(c23648e, "<set-?>");
        this.f114593a = c23648e;
    }

    /* renamed from: e */
    public final void m123969e(long j11) {
        this.f114594b.set(j11);
    }
}
