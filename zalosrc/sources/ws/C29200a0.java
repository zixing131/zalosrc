package ws;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.LinkedHashMap;
import java.util.UUID;
import mm0.AbstractC23350e;
import mx.C23476m;
import p141ex.AbstractC18628c;
import p660xw.InterfaceC30214a;
import pm0.C24848g0;

/* renamed from: ws.a0 */
/* loaded from: classes4.dex */
public final class C29200a0 extends Thread {
    public static final a Companion = new a(null);

    /* renamed from: r */
    private static final LinkedHashMap f135275r = new LinkedHashMap();

    /* renamed from: s */
    private static C29200a0 f135276s;

    /* renamed from: p */
    private volatile boolean f135277p;

    /* renamed from: q */
    private final Object f135278q;

    /* renamed from: ws.a0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m145780a() {
            AbstractC23350e.m122780j("MsgOffline  LOCK last global msg id worker", new Object[0]);
            m145782c();
            C29200a0 c29200a0 = C29200a0.f135276s;
            if (c29200a0 != null) {
                synchronized (c29200a0.f135278q) {
                    c29200a0.f135277p = true;
                    c29200a0.f135278q.notifyAll();
                    AbstractC23350e.m122780j("MsgOffline lock: %s", Boolean.valueOf(c29200a0.f135277p));
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
            }
        }

        /* renamed from: b */
        public final void m145781b(String str, InterfaceC30214a interfaceC30214a) {
            AbstractC19074t.m100208f(str, "groupId");
            AbstractC19074t.m100208f(interfaceC30214a, "dbTask");
            if (!C29210k.Companion.m145896a().m145890w()) {
                return;
            }
            m145782c();
            C29200a0 c29200a0 = C29200a0.f135276s;
            if (c29200a0 != null) {
                if (C23476m.m123248f()) {
                    Exception exc = new Exception();
                    String uuid = UUID.randomUUID().toString();
                    AbstractC19074t.m100207e(uuid, "toString(...)");
                    Object m98437a = AbstractC18628c.m98437a(interfaceC30214a, exc, uuid);
                    AbstractC19074t.m100206d(m98437a, "null cannot be cast to non-null type com.zing.zalo.perf.domain.model.database.DbTask");
                    interfaceC30214a = (InterfaceC30214a) m98437a;
                }
                synchronized (c29200a0.f135278q) {
                    C29200a0.f135275r.put(str, interfaceC30214a);
                    c29200a0.f135278q.notifyAll();
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
            }
        }

        /* renamed from: c */
        public final synchronized void m145782c() {
            try {
                if (C29200a0.f135276s == null) {
                    synchronized (C29200a0.class) {
                        try {
                            if (C29200a0.f135276s == null) {
                                C29200a0.f135276s = new C29200a0(null);
                            }
                            C24848g0 c24848g0 = C24848g0.f119245a;
                        } finally {
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        /* renamed from: d */
        public final void m145783d() {
            AbstractC23350e.m122780j("MsgOffline  UNLOCK last global msg id worker", new Object[0]);
            m145782c();
            C29200a0 c29200a0 = C29200a0.f135276s;
            if (c29200a0 != null) {
                synchronized (c29200a0.f135278q) {
                    c29200a0.f135277p = false;
                    AbstractC23350e.m122780j("MsgOffline lock: " + c29200a0.f135277p, new Object[0]);
                    c29200a0.f135278q.notifyAll();
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
            }
        }
    }

    public /* synthetic */ C29200a0(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: g */
    private final void m145779g() {
        InterfaceC30214a interfaceC30214a;
        try {
            synchronized (this.f135278q) {
                LinkedHashMap linkedHashMap = f135275r;
                if (!linkedHashMap.isEmpty()) {
                    Object next = linkedHashMap.keySet().iterator().next();
                    AbstractC19074t.m100207e(next, "next(...)");
                    interfaceC30214a = (InterfaceC30214a) linkedHashMap.remove((String) next);
                } else {
                    interfaceC30214a = null;
                }
            }
            if (interfaceC30214a != null) {
                interfaceC30214a.mo928a();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            C29200a0 c29200a0 = f135276s;
            if (c29200a0 != null) {
                synchronized (c29200a0.f135278q) {
                    if (c29200a0.f135277p || f135275r.isEmpty()) {
                        try {
                            c29200a0.f135278q.wait();
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
            }
            if (!this.f135277p) {
                m145779g();
            }
        }
    }

    private C29200a0() {
        super("Z:UpdateLastGlobalMsgIdWorker");
        this.f135278q = new Object();
        if (f135276s == null) {
            f135276s = this;
            start();
        }
    }
}
