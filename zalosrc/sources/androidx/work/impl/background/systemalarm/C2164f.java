package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.AbstractC2253u;
import androidx.work.impl.C2155a0;
import androidx.work.impl.background.systemalarm.C2165g;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;
import p470r2.AbstractC25616b;
import p470r2.AbstractC25620f;
import p470r2.C25619e;
import p470r2.InterfaceC25618d;
import p515t2.C26463n;
import p535u2.C26967n;
import p535u2.C26976w;
import p565v2.AbstractC27441a0;
import p565v2.C27453g0;

/* renamed from: androidx.work.impl.background.systemalarm.f */
/* loaded from: classes2.dex */
public class C2164f implements InterfaceC25618d, C27453g0.a {

    /* renamed from: D */
    private static final String f9184D = AbstractC2253u.m11897i("DelayMetCommandHandler");

    /* renamed from: A */
    private final C2155a0 f9185A;

    /* renamed from: B */
    private final CoroutineDispatcher f9186B;

    /* renamed from: C */
    private volatile Job f9187C;

    /* renamed from: p */
    private final Context f9188p;

    /* renamed from: q */
    private final int f9189q;

    /* renamed from: r */
    private final C26967n f9190r;

    /* renamed from: s */
    private final C2165g f9191s;

    /* renamed from: t */
    private final C25619e f9192t;

    /* renamed from: u */
    private final Object f9193u;

    /* renamed from: v */
    private int f9194v;

    /* renamed from: w */
    private final Executor f9195w;

    /* renamed from: x */
    private final Executor f9196x;

    /* renamed from: y */
    private PowerManager.WakeLock f9197y;

    /* renamed from: z */
    private boolean f9198z;

    public C2164f(Context context, int i11, C2165g c2165g, C2155a0 c2155a0) {
        this.f9188p = context;
        this.f9189q = i11;
        this.f9191s = c2165g;
        this.f9190r = c2155a0.m11582a();
        this.f9185A = c2155a0;
        C26463n m11739v = c2165g.m11634g().m11739v();
        this.f9195w = c2165g.m11633f().mo143751c();
        this.f9196x = c2165g.m11633f().mo143749a();
        this.f9186B = c2165g.m11633f().mo143750b();
        this.f9192t = new C25619e(m11739v);
        this.f9198z = false;
        this.f9194v = 0;
        this.f9193u = new Object();
    }

    /* renamed from: e */
    private void m11620e() {
        synchronized (this.f9193u) {
            try {
                if (this.f9187C != null) {
                    this.f9187C.mo112734a(null);
                }
                this.f9191s.m11635h().m140492b(this.f9190r);
                PowerManager.WakeLock wakeLock = this.f9197y;
                if (wakeLock != null && wakeLock.isHeld()) {
                    AbstractC2253u.m11895e().mo11898a(f9184D, "Releasing wakelock " + this.f9197y + "for WorkSpec " + this.f9190r);
                    this.f9197y.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: h */
    public void m11621h() {
        if (this.f9194v == 0) {
            this.f9194v = 1;
            AbstractC2253u.m11895e().mo11898a(f9184D, "onAllConstraintsMet for " + this.f9190r);
            if (this.f9191s.m11632d().m11769r(this.f9185A)) {
                this.f9191s.m11635h().m140491a(this.f9190r, 600000L, this);
                return;
            } else {
                m11620e();
                return;
            }
        }
        AbstractC2253u.m11895e().mo11898a(f9184D, "Already started work for " + this.f9190r);
    }

    /* renamed from: i */
    public void m11622i() {
        String m138955b = this.f9190r.m138955b();
        if (this.f9194v < 2) {
            this.f9194v = 2;
            AbstractC2253u m11895e = AbstractC2253u.m11895e();
            String str = f9184D;
            m11895e.mo11898a(str, "Stopping work for WorkSpec " + m138955b);
            this.f9196x.execute(new C2165g.b(this.f9191s, C2160b.m11604h(this.f9188p, this.f9190r), this.f9189q));
            if (this.f9191s.m11632d().m11767k(this.f9190r.m138955b())) {
                AbstractC2253u.m11895e().mo11898a(str, "WorkSpec " + m138955b + " needs to be rescheduled");
                this.f9196x.execute(new C2165g.b(this.f9191s, C2160b.m11602f(this.f9188p, this.f9190r), this.f9189q));
                return;
            }
            AbstractC2253u.m11895e().mo11898a(str, "Processor does not have WorkSpec " + m138955b + ". No need to reschedule");
            return;
        }
        AbstractC2253u.m11895e().mo11898a(f9184D, "Already stopped work for " + m138955b);
    }

    @Override // p565v2.C27453g0.a
    /* renamed from: a */
    public void mo11623a(C26967n c26967n) {
        AbstractC2253u.m11895e().mo11898a(f9184D, "Exceeded time limits on execution for " + c26967n);
        this.f9195w.execute(new RunnableC2162d(this));
    }

    @Override // p470r2.InterfaceC25618d
    /* renamed from: b */
    public void mo11624b(C26976w c26976w, AbstractC25616b abstractC25616b) {
        if (abstractC25616b instanceof AbstractC25616b.a) {
            this.f9195w.execute(new RunnableC2163e(this));
        } else {
            this.f9195w.execute(new RunnableC2162d(this));
        }
    }

    /* renamed from: f */
    public void m11625f() {
        String m138955b = this.f9190r.m138955b();
        this.f9197y = AbstractC27441a0.m140465b(this.f9188p, m138955b + " (" + this.f9189q + ")");
        AbstractC2253u m11895e = AbstractC2253u.m11895e();
        String str = f9184D;
        m11895e.mo11898a(str, "Acquiring wakelock " + this.f9197y + "for WorkSpec " + m138955b);
        this.f9197y.acquire();
        C26976w mo139008j = this.f9191s.m11634g().m11740w().mo11565L().mo139008j(m138955b);
        if (mo139008j == null) {
            this.f9195w.execute(new RunnableC2162d(this));
            return;
        }
        boolean m138980k = mo139008j.m138980k();
        this.f9198z = m138980k;
        if (!m138980k) {
            AbstractC2253u.m11895e().mo11898a(str, "No constraints for " + m138955b);
            this.f9195w.execute(new RunnableC2163e(this));
            return;
        }
        this.f9187C = AbstractC25620f.m132310b(this.f9192t, mo139008j, this.f9186B, this);
    }

    /* renamed from: g */
    public void m11626g(boolean z11) {
        AbstractC2253u.m11895e().mo11898a(f9184D, "onExecuted " + this.f9190r + ", " + z11);
        m11620e();
        if (z11) {
            this.f9196x.execute(new C2165g.b(this.f9191s, C2160b.m11602f(this.f9188p, this.f9190r), this.f9189q));
        }
        if (this.f9198z) {
            this.f9196x.execute(new C2165g.b(this.f9191s, C2160b.m11598a(this.f9188p), this.f9189q));
        }
    }
}
