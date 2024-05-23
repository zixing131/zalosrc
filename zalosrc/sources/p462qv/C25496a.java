package p462qv;

import fn0.AbstractC19060k;

/* renamed from: qv.a */
/* loaded from: classes4.dex */
public final class C25496a {

    /* renamed from: a */
    private long f122130a;

    /* renamed from: b */
    private long f122131b;

    /* renamed from: c */
    private boolean f122132c;

    public C25496a() {
        this(0L, 0L, false, 7, null);
    }

    /* renamed from: a */
    public final long m132091a() {
        return this.f122130a;
    }

    /* renamed from: b */
    public final long m132092b() {
        return this.f122131b;
    }

    /* renamed from: c */
    public final boolean m132093c() {
        return this.f122132c;
    }

    /* renamed from: d */
    public final void m132094d(boolean z11) {
        this.f122132c = z11;
    }

    /* renamed from: e */
    public final void m132095e(long j11) {
        this.f122130a = j11;
    }

    /* renamed from: f */
    public final void m132096f(long j11) {
        this.f122131b = j11;
    }

    public C25496a(long j11, long j12, boolean z11) {
        this.f122130a = j11;
        this.f122131b = j12;
        this.f122132c = z11;
    }

    public /* synthetic */ C25496a(long j11, long j12, boolean z11, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) == 0 ? j12 : 0L, (i11 & 4) != 0 ? false : z11);
    }
}
