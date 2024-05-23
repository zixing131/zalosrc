package com.zing.zalo.shortvideo.p072ui.state;

import android.content.Context;
import androidx.core.os.AbstractC1438d;
import androidx.lifecycle.AbstractC1765e;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.InterfaceC1767f;
import androidx.lifecycle.InterfaceC1801w;
import c10.C3196a;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.shortvideo.p072ui.view.ZchBaseView;
import com.zing.zalo.zview.C17487o0;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import k20.C21455a;
import k20.C21456b;
import on0.AbstractC24341v;
import p021an.AbstractC0955d;
import p483rh.InterfaceC25792a;
import p542ub.InterfaceC27218a;
import pm0.AbstractC24866w;
import qm0.AbstractC25363p0;
import v00.C27417l;

/* loaded from: classes5.dex */
public final class StateManager {

    /* renamed from: h */
    private static StateManager f52471h;

    /* renamed from: a */
    private C21455a f52473a = new C21455a("active");

    /* renamed from: b */
    private C21455a f52474b = new C21455a("restore");

    /* renamed from: c */
    private String f52475c = "";

    /* renamed from: d */
    private long f52476d;

    /* renamed from: e */
    private ZchMasterView f52477e;

    /* renamed from: f */
    private String f52478f;

    /* renamed from: g */
    private String f52479g;
    public static final C10098a Companion = new C10098a(null);

    /* renamed from: i */
    private static final ReentrantLock f52472i = new ReentrantLock();

    /* renamed from: com.zing.zalo.shortvideo.ui.state.StateManager$a */
    /* loaded from: classes5.dex */
    public static final class C10098a {
        private C10098a() {
        }

        public /* synthetic */ C10098a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m53797a(ZchMasterView zchMasterView) {
            AbstractC19074t.m100208f(zchMasterView, "mv");
            m53801e().m53792v(zchMasterView);
        }

        /* renamed from: b */
        public final void m53798b() {
            m53801e().m53793w();
        }

        /* renamed from: c */
        public final Map m53799c() {
            Map m131407l;
            m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("create_time", Long.valueOf(m53801e().f52476d)), AbstractC24866w.m129235a("last_session_id", m53801e().f52475c));
            return m131407l;
        }

        /* renamed from: d */
        public final ZchMasterView m53800d() {
            return m53801e().f52477e;
        }

        /* renamed from: e */
        public final StateManager m53801e() {
            ReentrantLock reentrantLock = StateManager.f52472i;
            reentrantLock.lock();
            try {
                if (StateManager.f52471h == null) {
                    StateManager.f52471h = new StateManager();
                }
                StateManager stateManager = StateManager.f52471h;
                AbstractC19074t.m100205c(stateManager);
                reentrantLock.unlock();
                return stateManager;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }

        /* renamed from: f */
        public final void m53802f(ZchBaseView zchBaseView) {
            AbstractC19074t.m100208f(zchBaseView, "zv");
            m53801e().m53794x(zchBaseView);
        }

        /* renamed from: g */
        public final boolean m53803g(String str) {
            return m53801e().m53795y(str);
        }

        /* renamed from: h */
        public final void m53804h(C3196a c3196a) {
            String str;
            StateManager m53801e = m53801e();
            if (c3196a != null) {
                str = c3196a.m16268b();
            } else {
                str = null;
            }
            m53801e.f52479g = str;
        }

        /* renamed from: i */
        public final void m53805i() {
            m53801e().m53796z();
        }

        /* renamed from: j */
        public final void m53806j(String str, ZaloActivity zaloActivity) {
            String str2;
            String str3;
            Context context;
            InterfaceC25792a interfaceC25792a;
            if (str != null) {
                StateManager stateManager = StateManager.f52471h;
                if (stateManager != null) {
                    str2 = stateManager.f52478f;
                } else {
                    str2 = null;
                }
                if (AbstractC19074t.m100204b(str, str2)) {
                    StateManager stateManager2 = StateManager.f52471h;
                    if (stateManager2 != null && (str3 = stateManager2.f52479g) != null && zaloActivity != null && (context = zaloActivity.getContext()) != null && (interfaceC25792a = (InterfaceC25792a) AbstractC0955d.m4496a(context, AbstractC19061k0.m100169b(InterfaceC25792a.class))) != null) {
                        InterfaceC25792a.a.m132931a(interfaceC25792a, "action.open.outapp", 0, zaloActivity, str3, null, null, null, null, null, 496, null);
                    }
                    StateManager stateManager3 = StateManager.f52471h;
                    if (stateManager3 != null) {
                        stateManager3.m53791u();
                    }
                }
            }
        }

        /* renamed from: k */
        public final boolean m53807k(C17487o0 c17487o0) {
            return m53801e().m53770A(c17487o0);
        }

        /* renamed from: l */
        public final void m53808l() {
            m53801e().f52476d = C27417l.f129055a.m140382f().m130131a();
        }

        /* renamed from: m */
        public final void m53809m(String str) {
            AbstractC19074t.m100208f(str, "sessionId");
            m53801e().f52475c = str;
        }
    }

    /* renamed from: A */
    public final boolean m53770A(C17487o0 c17487o0) {
        if (this.f52477e == null) {
            if (c17487o0 != null) {
                c17487o0.m93069k2(ZchMasterView.class, AbstractC1438d.m7341b(AbstractC24866w.m129235a("xRestoration", Boolean.TRUE)), 0, true);
            }
            return false;
        }
        if (!this.f52473a.m111008f()) {
            return true;
        }
        return this.f52474b.m111014l(c17487o0);
    }

    /* renamed from: u */
    public final void m53791u() {
        this.f52478f = null;
        this.f52479g = null;
    }

    /* renamed from: v */
    public final void m53792v(ZchMasterView zchMasterView) {
        ZaloActivity zaloActivity;
        AbstractC1785o lifecycle;
        this.f52477e = zchMasterView;
        C17487o0 m92662fJ = zchMasterView.m92662fJ();
        if (m92662fJ != null && m92662fJ.m93018M0() == 0 && !this.f52473a.m111008f()) {
            this.f52473a.m111004b();
        }
        InterfaceC27218a m92676n2 = zchMasterView.m92676n2();
        if (m92676n2 instanceof ZaloActivity) {
            zaloActivity = (ZaloActivity) m92676n2;
        } else {
            zaloActivity = null;
        }
        if (zaloActivity != null && (lifecycle = zaloActivity.getLifecycle()) != null) {
            lifecycle.mo9335a(new InterfaceC1767f() { // from class: com.zing.zalo.shortvideo.ui.state.StateManager$internalBind$1
                public StateManager$internalBind$1() {
                }

                @Override // androidx.lifecycle.InterfaceC1767f
                /* renamed from: D5 */
                public /* synthetic */ void mo8645D5(InterfaceC1801w interfaceC1801w) {
                    AbstractC1765e.m9272a(this, interfaceC1801w);
                }

                @Override // androidx.lifecycle.InterfaceC1767f
                /* renamed from: Ro */
                public /* synthetic */ void mo8646Ro(InterfaceC1801w interfaceC1801w) {
                    AbstractC1765e.m9275d(this, interfaceC1801w);
                }

                @Override // androidx.lifecycle.InterfaceC1767f
                /* renamed from: Xy */
                public /* synthetic */ void mo8647Xy(InterfaceC1801w interfaceC1801w) {
                    AbstractC1765e.m9273b(this, interfaceC1801w);
                }

                @Override // androidx.lifecycle.InterfaceC1767f
                /* renamed from: Zv */
                public void mo8648Zv(InterfaceC1801w interfaceC1801w) {
                    AbstractC19074t.m100208f(interfaceC1801w, "owner");
                    StateManager.this.m53791u();
                    AbstractC1765e.m9277f(this, interfaceC1801w);
                }

                @Override // androidx.lifecycle.InterfaceC1767f
                /* renamed from: mr */
                public /* synthetic */ void mo8649mr(InterfaceC1801w interfaceC1801w) {
                    AbstractC1765e.m9274c(this, interfaceC1801w);
                }

                @Override // androidx.lifecycle.InterfaceC1767f
                /* renamed from: wC */
                public /* synthetic */ void mo8650wC(InterfaceC1801w interfaceC1801w) {
                    AbstractC1765e.m9276e(this, interfaceC1801w);
                }
            });
        }
        zchMasterView.getLifecycle().mo9335a(new InterfaceC1767f() { // from class: com.zing.zalo.shortvideo.ui.state.StateManager$internalBind$2

            /* renamed from: q */
            final /* synthetic */ ZchMasterView f52482q;

            public StateManager$internalBind$2(ZchMasterView zchMasterView2) {
                r2 = zchMasterView2;
            }

            @Override // androidx.lifecycle.InterfaceC1767f
            /* renamed from: D5 */
            public /* synthetic */ void mo8645D5(InterfaceC1801w interfaceC1801w) {
                AbstractC1765e.m9272a(this, interfaceC1801w);
            }

            @Override // androidx.lifecycle.InterfaceC1767f
            /* renamed from: Ro */
            public /* synthetic */ void mo8646Ro(InterfaceC1801w interfaceC1801w) {
                AbstractC1765e.m9275d(this, interfaceC1801w);
            }

            @Override // androidx.lifecycle.InterfaceC1767f
            /* renamed from: Xy */
            public void mo8647Xy(InterfaceC1801w interfaceC1801w) {
                C21455a c21455a;
                AbstractC19074t.m100208f(interfaceC1801w, "owner");
                if (AbstractC19074t.m100204b(StateManager.this.f52477e, r2)) {
                    StateManager.this.f52477e = null;
                    c21455a = StateManager.this.f52473a;
                    c21455a.m111004b();
                }
                StateManager.this.m53791u();
                AbstractC1765e.m9273b(this, interfaceC1801w);
            }

            @Override // androidx.lifecycle.InterfaceC1767f
            /* renamed from: Zv */
            public /* synthetic */ void mo8648Zv(InterfaceC1801w interfaceC1801w) {
                AbstractC1765e.m9277f(this, interfaceC1801w);
            }

            @Override // androidx.lifecycle.InterfaceC1767f
            /* renamed from: mr */
            public /* synthetic */ void mo8649mr(InterfaceC1801w interfaceC1801w) {
                AbstractC1765e.m9274c(this, interfaceC1801w);
            }

            @Override // androidx.lifecycle.InterfaceC1767f
            /* renamed from: wC */
            public /* synthetic */ void mo8650wC(InterfaceC1801w interfaceC1801w) {
                AbstractC1765e.m9276e(this, interfaceC1801w);
            }
        });
    }

    /* renamed from: w */
    public final void m53793w() {
        this.f52474b.m111004b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x */
    public final void m53794x(ZchBaseView zchBaseView) {
        C21456b c21456b;
        boolean m127128x;
        if (!(zchBaseView instanceof C21456b.c) || !zchBaseView.m55547NK()) {
            return;
        }
        String m55544LK = zchBaseView.m55544LK();
        if (m55544LK != null) {
            m127128x = AbstractC24341v.m127128x(m55544LK);
            if (!m127128x) {
                c21456b = new C21456b((C21456b.c) zchBaseView, m55544LK);
                C21456b.b m111006d = this.f52474b.m111006d(m55544LK);
                if (m111006d != null) {
                    c21456b.m111017c(m111006d);
                }
                this.f52474b.m111011i(m55544LK);
                if (this.f52479g != null && this.f52478f == null) {
                    this.f52478f = c21456b.m111016b();
                }
                this.f52473a.m111003a(c21456b);
                zchBaseView.getLifecycle().mo9335a(new InterfaceC1767f() { // from class: com.zing.zalo.shortvideo.ui.state.StateManager$internalMonitor$2

                    /* renamed from: q */
                    final /* synthetic */ C21456b f52484q;

                    public StateManager$internalMonitor$2(C21456b c21456b2) {
                        r2 = c21456b2;
                    }

                    @Override // androidx.lifecycle.InterfaceC1767f
                    /* renamed from: D5 */
                    public /* synthetic */ void mo8645D5(InterfaceC1801w interfaceC1801w) {
                        AbstractC1765e.m9272a(this, interfaceC1801w);
                    }

                    @Override // androidx.lifecycle.InterfaceC1767f
                    /* renamed from: Ro */
                    public /* synthetic */ void mo8646Ro(InterfaceC1801w interfaceC1801w) {
                        AbstractC1765e.m9275d(this, interfaceC1801w);
                    }

                    @Override // androidx.lifecycle.InterfaceC1767f
                    /* renamed from: Xy */
                    public /* synthetic */ void mo8647Xy(InterfaceC1801w interfaceC1801w) {
                        AbstractC1765e.m9273b(this, interfaceC1801w);
                    }

                    @Override // androidx.lifecycle.InterfaceC1767f
                    /* renamed from: Zv */
                    public void mo8648Zv(InterfaceC1801w interfaceC1801w) {
                        C21455a c21455a;
                        AbstractC19074t.m100208f(interfaceC1801w, "owner");
                        c21455a = StateManager.this.f52473a;
                        c21455a.m111013k(r2.m111016b());
                    }

                    @Override // androidx.lifecycle.InterfaceC1767f
                    /* renamed from: mr */
                    public /* synthetic */ void mo8649mr(InterfaceC1801w interfaceC1801w) {
                        AbstractC1765e.m9274c(this, interfaceC1801w);
                    }

                    @Override // androidx.lifecycle.InterfaceC1767f
                    /* renamed from: wC */
                    public /* synthetic */ void mo8650wC(InterfaceC1801w interfaceC1801w) {
                        AbstractC1765e.m9276e(this, interfaceC1801w);
                    }
                });
            }
        }
        c21456b2 = new C21456b((C21456b.c) zchBaseView);
        C21456b.Companion.m111021b(zchBaseView, c21456b2.m111016b());
        if (this.f52479g != null) {
            this.f52478f = c21456b2.m111016b();
        }
        this.f52473a.m111003a(c21456b2);
        zchBaseView.getLifecycle().mo9335a(new InterfaceC1767f() { // from class: com.zing.zalo.shortvideo.ui.state.StateManager$internalMonitor$2

            /* renamed from: q */
            final /* synthetic */ C21456b f52484q;

            public StateManager$internalMonitor$2(C21456b c21456b2) {
                r2 = c21456b2;
            }

            @Override // androidx.lifecycle.InterfaceC1767f
            /* renamed from: D5 */
            public /* synthetic */ void mo8645D5(InterfaceC1801w interfaceC1801w) {
                AbstractC1765e.m9272a(this, interfaceC1801w);
            }

            @Override // androidx.lifecycle.InterfaceC1767f
            /* renamed from: Ro */
            public /* synthetic */ void mo8646Ro(InterfaceC1801w interfaceC1801w) {
                AbstractC1765e.m9275d(this, interfaceC1801w);
            }

            @Override // androidx.lifecycle.InterfaceC1767f
            /* renamed from: Xy */
            public /* synthetic */ void mo8647Xy(InterfaceC1801w interfaceC1801w) {
                AbstractC1765e.m9273b(this, interfaceC1801w);
            }

            @Override // androidx.lifecycle.InterfaceC1767f
            /* renamed from: Zv */
            public void mo8648Zv(InterfaceC1801w interfaceC1801w) {
                C21455a c21455a;
                AbstractC19074t.m100208f(interfaceC1801w, "owner");
                c21455a = StateManager.this.f52473a;
                c21455a.m111013k(r2.m111016b());
            }

            @Override // androidx.lifecycle.InterfaceC1767f
            /* renamed from: mr */
            public /* synthetic */ void mo8649mr(InterfaceC1801w interfaceC1801w) {
                AbstractC1765e.m9274c(this, interfaceC1801w);
            }

            @Override // androidx.lifecycle.InterfaceC1767f
            /* renamed from: wC */
            public /* synthetic */ void mo8650wC(InterfaceC1801w interfaceC1801w) {
                AbstractC1765e.m9276e(this, interfaceC1801w);
            }
        });
    }

    /* renamed from: y */
    public final boolean m53795y(String str) {
        return this.f52473a.m111011i(str);
    }

    /* renamed from: z */
    public final void m53796z() {
        C21456b m111009g = this.f52473a.m111009g();
        if (m111009g != null) {
            m111009g.m111018d();
        }
        this.f52474b.m111005c(this.f52473a);
        this.f52473a.m111004b();
        ZchMasterView zchMasterView = this.f52477e;
        if (zchMasterView != null) {
            zchMasterView.finish();
        }
    }
}
