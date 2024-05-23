package oi0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;
import pm0.C24848g0;

/* renamed from: oi0.b */
/* loaded from: classes7.dex */
public final class C24274b {
    public static final b Companion = new b(null);

    /* renamed from: f */
    private static C24274b f117225f;

    /* renamed from: c */
    private c f117228c;

    /* renamed from: d */
    private c f117229d;

    /* renamed from: e */
    private Queue f117230e = new LinkedList();

    /* renamed from: a */
    private Object f117226a = new Object();

    /* renamed from: b */
    private Handler f117227b = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: oi0.a
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            boolean m126742b;
            m126742b = C24274b.m126742b(C24274b.this, message);
            return m126742b;
        }
    });

    /* renamed from: oi0.b$a */
    /* loaded from: classes7.dex */
    public interface a {
        /* renamed from: a */
        void mo90671a();

        /* renamed from: b */
        void mo90672b(int i11);
    }

    /* renamed from: oi0.b$b */
    /* loaded from: classes7.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C24274b m126757a() {
            if (C24274b.f117225f == null) {
                C24274b.f117225f = new C24274b();
            }
            C24274b c24274b = C24274b.f117225f;
            AbstractC19074t.m100205c(c24274b);
            return c24274b;
        }
    }

    /* renamed from: oi0.b$c */
    /* loaded from: classes7.dex */
    public static final class c {

        /* renamed from: a */
        private final WeakReference f117231a;

        /* renamed from: b */
        private int f117232b;

        /* renamed from: c */
        private boolean f117233c;

        public c(int i11, a aVar) {
            AbstractC19074t.m100208f(aVar, "callback");
            this.f117231a = new WeakReference(aVar);
            this.f117232b = i11;
        }

        /* renamed from: a */
        public final WeakReference m126758a() {
            return this.f117231a;
        }

        /* renamed from: b */
        public final int m126759b() {
            return this.f117232b;
        }

        /* renamed from: c */
        public final boolean m126760c() {
            return this.f117233c;
        }

        /* renamed from: d */
        public final boolean m126761d(a aVar) {
            if (aVar != null && AbstractC19074t.m100204b(this.f117231a.get(), aVar)) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public final void m126762e(int i11) {
            this.f117232b = i11;
        }

        /* renamed from: f */
        public final void m126763f(boolean z11) {
            this.f117233c = z11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m126742b(C24274b c24274b, Message message) {
        AbstractC19074t.m100208f(c24274b, "this$0");
        AbstractC19074t.m100208f(message, "message");
        if (message.what == 0) {
            Object obj = message.obj;
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.zdesign.component.snackbar.SnackbarManager.SnackbarRecord");
            c24274b.m126745g((c) obj);
            return false;
        }
        return false;
    }

    /* renamed from: g */
    private final void m126745g(c cVar) {
        Object obj = this.f117226a;
        AbstractC19074t.m100205c(obj);
        synchronized (obj) {
            try {
                if (this.f117228c != cVar) {
                    if (this.f117229d == cVar) {
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
                m126748e(cVar, 2);
                C24848g0 c24848g02 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: j */
    private final boolean m126746j(a aVar) {
        c cVar = this.f117228c;
        if (cVar != null) {
            AbstractC19074t.m100205c(cVar);
            if (cVar.m126761d(aVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    private final boolean m126747k(a aVar) {
        c cVar = this.f117229d;
        if (cVar != null) {
            AbstractC19074t.m100205c(cVar);
            if (cVar.m126761d(aVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m126748e(c cVar, int i11) {
        AbstractC19074t.m100205c(cVar);
        a aVar = (a) cVar.m126758a().get();
        if (aVar != null) {
            aVar.mo90672b(i11);
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void m126749f(a aVar, int i11) {
        Object obj = this.f117226a;
        AbstractC19074t.m100205c(obj);
        synchronized (obj) {
            try {
                if (m126746j(aVar)) {
                    m126748e(this.f117228c, i11);
                } else if (m126747k(aVar)) {
                    m126748e(this.f117229d, i11);
                } else {
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: h */
    public final boolean m126750h(a aVar) {
        boolean m126746j;
        Object obj = this.f117226a;
        AbstractC19074t.m100205c(obj);
        synchronized (obj) {
            m126746j = m126746j(aVar);
        }
        return m126746j;
    }

    /* renamed from: i */
    public final boolean m126751i(a aVar) {
        boolean z11;
        Object obj = this.f117226a;
        AbstractC19074t.m100205c(obj);
        synchronized (obj) {
            if (!m126746j(aVar)) {
                if (!m126747k(aVar)) {
                    z11 = false;
                }
            }
            z11 = true;
        }
        return z11;
    }

    /* renamed from: l */
    public final void m126752l(a aVar) {
        Object obj = this.f117226a;
        AbstractC19074t.m100205c(obj);
        synchronized (obj) {
            try {
                if (m126746j(aVar)) {
                    this.f117228c = null;
                    if (this.f117229d != null) {
                        while (true) {
                            c cVar = this.f117229d;
                            AbstractC19074t.m100205c(cVar);
                            if (cVar.m126760c() || this.f117230e.size() == 0) {
                                break;
                            } else {
                                this.f117229d = (c) this.f117230e.poll();
                            }
                        }
                        if (this.f117229d != null) {
                            m126756p();
                        }
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: m */
    public final void m126753m(a aVar) {
        Object obj = this.f117226a;
        AbstractC19074t.m100205c(obj);
        synchronized (obj) {
            try {
                if (m126746j(aVar)) {
                    m126754n(this.f117228c);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: n */
    public final void m126754n(c cVar) {
        int i11;
        AbstractC19074t.m100205c(cVar);
        if (cVar.m126759b() == -2) {
            return;
        }
        if (cVar.m126759b() > 0) {
            i11 = cVar.m126759b();
        } else if (cVar.m126759b() == -1) {
            i11 = ZAbstractBase.ZVU_PROCESS_FLUSH;
        } else {
            i11 = 4000;
        }
        Handler handler = this.f117227b;
        AbstractC19074t.m100205c(handler);
        handler.removeCallbacksAndMessages(cVar);
        Handler handler2 = this.f117227b;
        AbstractC19074t.m100205c(handler2);
        handler2.sendMessageDelayed(Message.obtain(this.f117227b, 0, cVar), i11);
    }

    /* renamed from: o */
    public final void m126755o(int i11, a aVar, boolean z11) {
        c cVar;
        AbstractC19074t.m100208f(aVar, "callback");
        Object obj = this.f117226a;
        AbstractC19074t.m100205c(obj);
        synchronized (obj) {
            if (m126746j(aVar)) {
                c cVar2 = this.f117228c;
                AbstractC19074t.m100205c(cVar2);
                cVar2.m126762e(i11);
                Handler handler = this.f117227b;
                AbstractC19074t.m100205c(handler);
                handler.removeCallbacksAndMessages(this.f117228c);
                m126754n(this.f117228c);
                return;
            }
            if (m126747k(aVar)) {
                c cVar3 = this.f117229d;
                if (cVar3 != null) {
                    cVar3.m126762e(i11);
                }
            } else {
                c cVar4 = new c(i11, aVar);
                cVar4.m126763f(z11);
                this.f117230e.add(cVar4);
                if (this.f117229d == null) {
                    this.f117229d = (c) this.f117230e.poll();
                }
            }
            c cVar5 = this.f117228c;
            if ((cVar5 == null || !cVar5.m126760c()) && ((cVar = this.f117228c) == null || !m126748e(cVar, 4))) {
                this.f117228c = null;
                m126756p();
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: p */
    public final void m126756p() {
        c cVar = this.f117229d;
        if (cVar != null) {
            this.f117228c = cVar;
            this.f117229d = (c) this.f117230e.poll();
            c cVar2 = this.f117228c;
            AbstractC19074t.m100205c(cVar2);
            a aVar = (a) cVar2.m126758a().get();
            if (aVar != null) {
                aVar.mo90671a();
            } else {
                this.f117228c = null;
            }
        }
    }
}
