package rw;

import android.os.SystemClock;

/* renamed from: rw.c */
/* loaded from: classes.dex */
public class C25982c implements InterfaceC25980a {

    /* renamed from: p */
    final C25986g f123947p;

    /* renamed from: q */
    final C25984e f123948q;

    /* renamed from: r */
    final a f123949r;

    /* renamed from: s */
    final boolean f123950s;

    /* renamed from: rw.c$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        boolean mo98562a(C25985f c25985f);
    }

    public C25982c(C25984e c25984e) {
        this(c25984e, null, false);
    }

    /* renamed from: b */
    private boolean m133818b(C25986g c25986g, C25985f c25985f, long j11) {
        c25985f.f123968h = this;
        if (this.f123950s) {
            c25985f.m133851i(true);
        }
        return c25986g.m133853b(c25985f, j11);
    }

    /* renamed from: d */
    private static C25985f m133819d(Runnable runnable) {
        C25985f m133843d = C25985f.m133843d();
        m133843d.f123969i = runnable;
        return m133843d;
    }

    /* renamed from: e */
    private static C25985f m133820e(Runnable runnable, Object obj) {
        C25985f m133843d = C25985f.m133843d();
        m133843d.f123964d = obj;
        m133843d.f123969i = runnable;
        return m133843d;
    }

    /* renamed from: f */
    private static void m133821f(C25985f c25985f) {
        c25985f.f123969i.run();
    }

    /* renamed from: a */
    public void m133822a(C25985f c25985f) {
        if (c25985f.f123969i != null) {
            m133821f(c25985f);
            return;
        }
        a aVar = this.f123949r;
        if (aVar != null && aVar.mo98562a(c25985f)) {
            return;
        }
        mo81139g(c25985f);
    }

    /* renamed from: c */
    public final C25984e m133823c() {
        return this.f123948q;
    }

    /* renamed from: g */
    public void mo81139g(C25985f c25985f) {
    }

    /* renamed from: h */
    public final C25985f m133824h(int i11) {
        return C25985f.m133844e(this, i11);
    }

    /* renamed from: i */
    public final C25985f m133825i(int i11, Object obj) {
        return C25985f.m133845f(this, i11, obj);
    }

    /* renamed from: j */
    public final boolean m133826j(Runnable runnable) {
        return m133835s(m133819d(runnable), 0L);
    }

    /* renamed from: k */
    public final boolean m133827k(Runnable runnable) {
        return m133833q(m133819d(runnable));
    }

    /* renamed from: l */
    public final boolean m133828l(Runnable runnable, Object obj, long j11) {
        return m133834r(m133820e(runnable, obj), j11);
    }

    /* renamed from: m */
    public final boolean m133829m(Runnable runnable, int i11) {
        return m133835s(m133819d(runnable), i11);
    }

    /* renamed from: n */
    public final void m133830n(Runnable runnable) {
        this.f123947p.m133858g(this, runnable, null);
    }

    /* renamed from: o */
    public final void m133831o(Object obj) {
        this.f123947p.m133856e(this, obj);
    }

    /* renamed from: p */
    public final boolean m133832p(C25985f c25985f) {
        return m133835s(c25985f, 0L);
    }

    /* renamed from: q */
    public final boolean m133833q(C25985f c25985f) {
        C25986g c25986g = this.f123947p;
        if (c25986g == null) {
            new RuntimeException(this + " sendMessageAtTime() called with no mQueue").getMessage();
            return false;
        }
        return m133818b(c25986g, c25985f, 0L);
    }

    /* renamed from: r */
    public boolean m133834r(C25985f c25985f, long j11) {
        C25986g c25986g = this.f123947p;
        if (c25986g == null) {
            new RuntimeException(this + " sendMessageAtTime() called with no mQueue").getMessage();
            return false;
        }
        return m133818b(c25986g, c25985f, j11);
    }

    @Override // rw.InterfaceC25980a
    public final void removeMessages(int i11) {
        this.f123947p.m133857f(this, i11, null);
    }

    /* renamed from: s */
    public final boolean m133835s(C25985f c25985f, long j11) {
        if (j11 < 0) {
            j11 = 0;
        }
        return m133834r(c25985f, SystemClock.elapsedRealtime() + j11);
    }

    @Override // rw.InterfaceC25980a
    public final boolean sendEmptyMessage(int i11) {
        return sendEmptyMessageDelayed(i11, 0L);
    }

    @Override // rw.InterfaceC25980a
    public final boolean sendEmptyMessageDelayed(int i11, long j11) {
        C25985f m133843d = C25985f.m133843d();
        m133843d.f123961a = i11;
        return m133835s(m133843d, j11);
    }

    public C25982c(C25984e c25984e, a aVar) {
        this(c25984e, aVar, false);
    }

    public C25982c(C25984e c25984e, a aVar, boolean z11) {
        this.f123948q = c25984e;
        this.f123947p = c25984e.f123956b;
        this.f123949r = aVar;
        this.f123950s = z11;
    }
}
