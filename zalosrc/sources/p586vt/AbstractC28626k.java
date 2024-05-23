package p586vt;

/* renamed from: vt.k */
/* loaded from: classes4.dex */
public abstract class AbstractC28626k {

    /* renamed from: a */
    private boolean f132717a;

    /* renamed from: b */
    private AbstractC28618c f132718b;

    /* renamed from: c */
    private long f132719c;

    /* renamed from: d */
    private boolean f132720d;

    /* renamed from: e */
    private boolean f132721e;

    public AbstractC28626k(boolean z11) {
        this.f132717a = z11;
    }

    /* renamed from: a */
    public final long m143168a() {
        return this.f132719c;
    }

    /* renamed from: b */
    public final AbstractC28618c m143169b() {
        return this.f132718b;
    }

    /* renamed from: c */
    public boolean mo96995c() {
        return this.f132721e;
    }

    /* renamed from: d */
    public final boolean m143170d(long j11) {
        if (System.currentTimeMillis() - this.f132719c > j11 * 1000) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m143171e() {
        return this.f132720d;
    }

    /* renamed from: f */
    public boolean m143172f() {
        return this.f132717a;
    }

    /* renamed from: g */
    public abstract String mo96996g();

    /* renamed from: h */
    public void m143173h(boolean z11) {
        this.f132721e = z11;
    }

    /* renamed from: i */
    public final void m143174i(long j11) {
        this.f132719c = j11;
    }

    /* renamed from: j */
    public final void m143175j(AbstractC28618c abstractC28618c) {
        this.f132718b = abstractC28618c;
    }

    /* renamed from: k */
    public final void m143176k(boolean z11) {
        this.f132720d = z11;
    }

    /* renamed from: l */
    public void m143177l(boolean z11) {
        this.f132717a = z11;
    }

    public String toString() {
        return "JobResult(isSuccess=" + m143172f() + ", isCanceled=" + mo96995c() + ", jobErrorData=" + this.f132718b + ")";
    }

    public AbstractC28626k(boolean z11, AbstractC28618c abstractC28618c) {
        this(z11);
        this.f132718b = abstractC28618c;
    }
}
