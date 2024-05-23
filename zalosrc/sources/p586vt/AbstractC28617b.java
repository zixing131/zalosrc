package p586vt;

import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import me0.AbstractC23244v8;

/* renamed from: vt.b */
/* loaded from: classes4.dex */
public abstract class AbstractC28617b {

    /* renamed from: a */
    public String f132691a;

    /* renamed from: b */
    public AbstractC28626k f132692b;

    /* renamed from: c */
    private boolean f132693c;

    /* renamed from: d */
    private long f132694d;

    /* renamed from: e */
    private int f132695e;

    /* renamed from: f */
    public String f132696f;

    /* renamed from: g */
    private final AtomicBoolean f132697g = new AtomicBoolean(false);

    /* renamed from: h */
    private final String f132698h = "";

    /* renamed from: i */
    private final String f132699i = "";

    /* renamed from: vt.b$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        AbstractC28617b mo96991a(String str);

        /* renamed from: b */
        AbstractC28626k mo96992b(boolean z11, boolean z12, String str);
    }

    /* renamed from: a */
    public void m143124a() {
        this.f132697g.compareAndSet(false, true);
        AbstractC20110a.f98889a.mo104548a("Set job cancel value:%s", Boolean.valueOf(this.f132697g.get()));
    }

    /* renamed from: b */
    public abstract String mo96986b();

    /* renamed from: c */
    public final String m143125c() {
        String str = this.f132691a;
        if (str != null) {
            return str;
        }
        AbstractC19074t.m100223u("jobId");
        return null;
    }

    /* renamed from: d */
    public abstract String mo96987d();

    /* renamed from: e */
    public final AbstractC28626k m143126e() {
        AbstractC28626k abstractC28626k = this.f132692b;
        if (abstractC28626k != null) {
            return abstractC28626k;
        }
        AbstractC19074t.m100223u("jobResult");
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AbstractC19074t.m100204b(getClass(), obj.getClass())) {
            return AbstractC19074t.m100204b(m143125c(), ((AbstractC28617b) obj).m143125c());
        }
        return false;
    }

    /* renamed from: f */
    public final int m143127f() {
        return this.f132695e;
    }

    /* renamed from: g */
    public final long m143128g() {
        return this.f132694d;
    }

    /* renamed from: h */
    public final String m143129h() {
        String str = this.f132696f;
        if (str != null) {
            return str;
        }
        AbstractC19074t.m100223u("userId");
        return null;
    }

    public int hashCode() {
        return Objects.hash(m143125c());
    }

    /* renamed from: i */
    public final boolean m143130i() {
        AbstractC20110a.f98889a.mo104548a("isCanceledJob: %s", Boolean.valueOf(this.f132697g.get()));
        return this.f132697g.get();
    }

    /* renamed from: j */
    public final boolean m143131j() {
        return this.f132693c;
    }

    /* renamed from: k */
    protected abstract void mo96988k();

    /* renamed from: l */
    public final AbstractC28626k m143132l() {
        mo96988k();
        return m143126e();
    }

    /* renamed from: m */
    public abstract String mo96989m();

    /* renamed from: n */
    public final void m143133n(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f132691a = str;
    }

    /* renamed from: o */
    public final void m143134o(AbstractC28626k abstractC28626k) {
        AbstractC19074t.m100208f(abstractC28626k, "<set-?>");
        this.f132692b = abstractC28626k;
    }

    /* renamed from: p */
    public final void m143135p(int i11) {
        this.f132695e = i11;
    }

    /* renamed from: q */
    public final void m143136q(boolean z11) {
        this.f132693c = z11;
    }

    /* renamed from: r */
    public final void m143137r(AbstractC28626k abstractC28626k) {
        if (abstractC28626k != null) {
            m143134o(abstractC28626k);
        }
    }

    /* renamed from: s */
    public final void m143138s(long j11) {
        this.f132694d = j11;
    }

    /* renamed from: t */
    public final void m143139t(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f132696f = str;
    }

    public String toString() {
        return "Job(jobId='" + AbstractC23244v8.m119735E(m143125c(), 20) + "', jobStatus=" + this.f132695e + ", isCanceledJob=" + this.f132697g + ")";
    }
}
