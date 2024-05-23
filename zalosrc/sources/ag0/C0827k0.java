package ag0;

import ae.C0766k;
import com.zing.zalo.p062db.C7959d;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import me0.C23055e5;
import mm0.AbstractC23350e;
import p461qu.AbstractC25495a;
import p645xh.AbstractC29633j;
import p645xh.C29628e;
import pm0.C24848g0;

/* renamed from: ag0.k0 */
/* loaded from: classes6.dex */
public final class C0827k0 extends Thread {

    /* renamed from: q */
    private static boolean f2906q;

    /* renamed from: s */
    private static volatile C0827k0 f2908s;

    /* renamed from: p */
    private final Object f2909p;
    public static final a Companion = new a(null);

    /* renamed from: r */
    private static Map f2907r = new LinkedHashMap();

    /* renamed from: ag0.k0$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: b */
        private final void m2166b(String str, long j11, boolean z11) {
            if (z11) {
                C7959d.Companion.m41850e().m41835x(str, j11);
            }
            m2167a().put(str, new b(str, j11));
        }

        /* renamed from: a */
        public final Map m2167a() {
            return C0827k0.f2907r;
        }

        /* renamed from: c */
        public final void m2168c(String str, long j11, boolean z11) {
            AbstractC19074t.m100208f(str, "ownerId");
            m2169d();
            C0827k0 c0827k0 = C0827k0.f2908s;
            if (c0827k0 != null) {
                synchronized (c0827k0.f2909p) {
                    try {
                        a aVar = C0827k0.Companion;
                        if (aVar.m2167a().containsKey(str)) {
                            b bVar = (b) aVar.m2167a().get(str);
                            if (bVar != null) {
                                if (bVar.f2911b < j11) {
                                }
                            }
                            aVar.m2166b(str, j11, z11);
                        } else {
                            aVar.m2166b(str, j11, z11);
                        }
                        c0827k0.f2909p.notifyAll();
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        /* renamed from: d */
        public final synchronized void m2169d() {
            try {
                if (C0827k0.f2908s == null) {
                    synchronized (C0827k0.class) {
                        try {
                            if (C0827k0.f2908s == null) {
                                C0827k0.f2908s = new C0827k0(null);
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
    }

    /* renamed from: ag0.k0$b */
    /* loaded from: classes6.dex */
    public static final class b {

        /* renamed from: a */
        private final String f2910a;

        /* renamed from: b */
        public final long f2911b;

        /* renamed from: c */
        private final boolean f2912c;

        /* renamed from: d */
        public final int f2913d;

        public b(String str, long j11) {
            AbstractC19074t.m100208f(str, "mOwnerId");
            this.f2910a = str;
            this.f2911b = j11;
            boolean m132079d = AbstractC25495a.m132079d(str);
            this.f2912c = m132079d;
            this.f2913d = Integer.parseInt(m132079d ? AbstractC25495a.m132088m(str) : str);
        }

        /* renamed from: a */
        public final boolean m2170a() {
            return this.f2912c;
        }

        /* renamed from: b */
        public final String m2171b() {
            return this.f2910a;
        }
    }

    public /* synthetic */ C0827k0(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: e */
    private final void m2163e() {
        if (f2906q) {
            m2165g(2000L);
            f2906q = false;
        }
        if (C23055e5.m118273h(false, 1, null)) {
            if (!C29628e.m147249E0().m93432x()) {
                if (!C29628e.m147249E0().m93433y()) {
                    AbstractC29633j.m147365n();
                    m2165g(3000L);
                }
                m2165g(3000L);
                return;
            }
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            synchronized (this) {
                try {
                    for (b bVar : f2907r.values()) {
                        if (bVar.m2170a()) {
                            linkedList2.add(bVar);
                        } else {
                            linkedList.add(bVar);
                        }
                    }
                    m2164f(linkedList, false);
                    m2164f(linkedList2, true);
                    f2907r.clear();
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            m2165g(2000L);
            return;
        }
        m2165g(5000L);
    }

    /* renamed from: f */
    private final void m2164f(List list, boolean z11) {
        try {
            if (list.isEmpty()) {
                return;
            }
            new C0766k().m1876w0(list, z11);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                C7959d.Companion.m41850e().m41740Q2(bVar.m2171b(), bVar.f2911b);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    private final void m2165g(long j11) {
        try {
            Thread.sleep(j11);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("> SleepThread(");
            sb2.append(j11);
            sb2.append(")");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            try {
                synchronized (this.f2909p) {
                    if (f2907r.isEmpty()) {
                        try {
                            this.f2909p.wait();
                        } catch (Exception e11) {
                            AbstractC23350e.m122776f("SendSeenReactionWorker", e11);
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
                m2163e();
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    private C0827k0() {
        super("Z:SendSeenReactionWorker");
        this.f2909p = new Object();
        f2907r = new HashMap();
        f2906q = true;
        start();
    }
}
