package ag0;

import com.zing.zalo.p062db.C7956b;
import dj.C17945a0;
import eg0.AbstractC18428c;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import mg.C23288a;
import nh0.C23793c;
import p348mi.AbstractC23306f;
import pm0.C24848g0;
import xd0.C29588d;

/* renamed from: ag0.n0 */
/* loaded from: classes6.dex */
public final class C0833n0 extends Thread {

    /* renamed from: p */
    public static final C0833n0 f2934p = new C0833n0();

    /* renamed from: q */
    private static final List f2935q = new LinkedList();

    /* renamed from: r */
    private static final Object f2936r = new Object();

    /* renamed from: s */
    private static boolean f2937s;

    /* renamed from: t */
    private static long f2938t;

    private C0833n0() {
        super("Z:TTLMessagesWorker");
    }

    /* renamed from: b */
    private final void m2201b() {
        HashMap hashMap = new HashMap();
        int i11 = 0;
        long j11 = 0;
        while (true) {
            try {
                List list = f2935q;
                if (i11 >= list.size()) {
                    break;
                }
                C17945a0 c17945a0 = (C17945a0) list.get(i11);
                if (c17945a0.m95227p7()) {
                    String mo95039W2 = c17945a0.mo95039W2();
                    AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                    Object obj = hashMap.get(mo95039W2);
                    if (obj == null) {
                        obj = new ArrayList();
                        hashMap.put(mo95039W2, obj);
                    }
                    List list2 = (List) obj;
                    if (!c17945a0.m95189l8()) {
                        AbstractC0835o0.m2214b(list2, c17945a0);
                    } else {
                        C7956b m41573b = C7956b.Companion.m41573b();
                        String mo95039W22 = c17945a0.mo95039W2();
                        AbstractC19074t.m100207e(mo95039W22, "getOwnerId(...)");
                        Iterator it = m41573b.m41502C(mo95039W22).iterator();
                        while (it.hasNext()) {
                            AbstractC0835o0.m2214b(list2, (C17945a0) it.next());
                        }
                    }
                    synchronized (f2936r) {
                    }
                    i11--;
                } else if (c17945a0.m95030V4() > 0) {
                    long m2204f = m2204f(c17945a0);
                    if (j11 == 0 || j11 > m2204f) {
                        j11 = m2204f;
                    }
                }
                i11++;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        f2938t = j11;
        if (!hashMap.isEmpty()) {
            m2202d(hashMap);
        }
    }

    /* renamed from: d */
    private final void m2202d(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            final String str = (String) entry.getKey();
            final List list = (List) entry.getValue();
            AbstractC18428c.m97659b(C23288a.f113033a, str, 0, new Runnable() { // from class: ag0.m0
                @Override // java.lang.Runnable
                public final void run() {
                    C0833n0.m2203e(str, list);
                }
            }, 2, null);
        }
    }

    /* renamed from: e */
    public static final void m2203e(String str, List list) {
        AbstractC19074t.m100208f(str, "$ownerId");
        AbstractC19074t.m100208f(list, "$messages");
        AbstractC23306f.m120604O().m101508a(new C29588d.c(str, list, C29588d.b.f136555s));
    }

    /* renamed from: f */
    private final long m2204f(C17945a0 c17945a0) {
        return c17945a0.m95030V4() + c17945a0.m94974P4();
    }

    /* renamed from: h */
    public static /* synthetic */ void m2205h(C0833n0 c0833n0, C17945a0 c17945a0, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        c0833n0.m2208g(c17945a0, z11);
    }

    /* renamed from: j */
    private final void m2206j() {
        if (!f2937s) {
            synchronized (f2936r) {
                try {
                    if (!f2937s) {
                        f2937s = true;
                        f2934p.start();
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: c */
    public final void m2207c() {
        Object obj = f2936r;
        synchronized (obj) {
            f2935q.clear();
            obj.notifyAll();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: g */
    public final void m2208g(C17945a0 c17945a0, boolean z11) {
        AbstractC19074t.m100208f(c17945a0, "message");
        m2206j();
        if (!c17945a0.m94885F2()) {
            c17945a0.m95163ia(true);
            List list = f2935q;
            if (!list.contains(c17945a0)) {
                if (z11) {
                    c17945a0 = new C17945a0.w(c17945a0.m95029V3(), 0).m95359K(c17945a0.m94974P4()).m95361M(c17945a0.m95030V4()).m95377m(true).m95365a();
                }
                AbstractC19074t.m100205c(c17945a0);
                Object obj = f2936r;
                synchronized (obj) {
                    list.add(c17945a0);
                    obj.notifyAll();
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
            }
        }
    }

    /* renamed from: i */
    public final void m2209i(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "message");
        synchronized (f2936r) {
            f2935q.remove(c17945a0);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            Object obj = f2936r;
            synchronized (obj) {
                if (f2935q.isEmpty()) {
                    try {
                        obj.wait();
                    } catch (Exception e11) {
                        AbstractC20110a.f98889a.mo104552e(e11);
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
            m2201b();
            long j11 = f2938t;
            if (j11 > 0) {
                long mo124314i = j11 - C23793c.Companion.m124321a().mo124314i();
                if (mo124314i > 0) {
                    Object obj2 = f2936r;
                    synchronized (obj2) {
                        obj2.wait(Math.min(300000L, mo124314i));
                    }
                } else {
                    continue;
                }
            }
        }
    }
}
