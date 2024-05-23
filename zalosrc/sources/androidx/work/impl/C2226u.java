package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.core.content.AbstractC1388a;
import androidx.work.AbstractC2253u;
import androidx.work.C2138c;
import androidx.work.C2244l;
import androidx.work.impl.foreground.C2197b;
import androidx.work.impl.foreground.InterfaceC2196a;
import com.google.common.util.concurrent.InterfaceFutureC6534a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import p535u2.C26967n;
import p535u2.C26976w;
import p565v2.AbstractC27441a0;
import p595w2.InterfaceC28696c;

/* renamed from: androidx.work.impl.u */
/* loaded from: classes.dex */
public class C2226u implements InterfaceC2196a {

    /* renamed from: l */
    private static final String f9322l = AbstractC2253u.m11897i("Processor");

    /* renamed from: b */
    private Context f9324b;

    /* renamed from: c */
    private C2138c f9325c;

    /* renamed from: d */
    private InterfaceC28696c f9326d;

    /* renamed from: e */
    private WorkDatabase f9327e;

    /* renamed from: g */
    private Map f9329g = new HashMap();

    /* renamed from: f */
    private Map f9328f = new HashMap();

    /* renamed from: i */
    private Set f9331i = new HashSet();

    /* renamed from: j */
    private final List f9332j = new ArrayList();

    /* renamed from: a */
    private PowerManager.WakeLock f9323a = null;

    /* renamed from: k */
    private final Object f9333k = new Object();

    /* renamed from: h */
    private Map f9330h = new HashMap();

    public C2226u(Context context, C2138c c2138c, InterfaceC28696c interfaceC28696c, WorkDatabase workDatabase) {
        this.f9324b = context;
        this.f9325c = c2138c;
        this.f9326d = interfaceC28696c;
        this.f9327e = workDatabase;
    }

    /* renamed from: f */
    private RunnableC2238y0 m11755f(String str) {
        boolean z11;
        RunnableC2238y0 runnableC2238y0 = (RunnableC2238y0) this.f9328f.remove(str);
        if (runnableC2238y0 != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            runnableC2238y0 = (RunnableC2238y0) this.f9329g.remove(str);
        }
        this.f9330h.remove(str);
        if (z11) {
            m11763u();
        }
        return runnableC2238y0;
    }

    /* renamed from: h */
    private RunnableC2238y0 m11756h(String str) {
        RunnableC2238y0 runnableC2238y0 = (RunnableC2238y0) this.f9328f.get(str);
        if (runnableC2238y0 == null) {
            return (RunnableC2238y0) this.f9329g.get(str);
        }
        return runnableC2238y0;
    }

    /* renamed from: i */
    private static boolean m11757i(String str, RunnableC2238y0 runnableC2238y0, int i11) {
        if (runnableC2238y0 != null) {
            runnableC2238y0.m11842g(i11);
            AbstractC2253u.m11895e().mo11898a(f9322l, "WorkerWrapper interrupted for " + str);
            return true;
        }
        AbstractC2253u.m11895e().mo11898a(f9322l, "WorkerWrapper could not be found for " + str);
        return false;
    }

    /* renamed from: l */
    public /* synthetic */ void m11758l(C26967n c26967n, boolean z11) {
        synchronized (this.f9333k) {
            try {
                Iterator it = this.f9332j.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2189f) it.next()).mo11614e(c26967n, z11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: m */
    public /* synthetic */ C26976w m11759m(ArrayList arrayList, String str) {
        arrayList.addAll(this.f9327e.mo11566M().mo138913a(str));
        return this.f9327e.mo11565L().mo139008j(str);
    }

    /* renamed from: n */
    public /* synthetic */ void m11760n(InterfaceFutureC6534a interfaceFutureC6534a, RunnableC2238y0 runnableC2238y0) {
        boolean z11;
        try {
            z11 = ((Boolean) interfaceFutureC6534a.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            z11 = true;
        }
        m11761o(runnableC2238y0, z11);
    }

    /* renamed from: o */
    private void m11761o(RunnableC2238y0 runnableC2238y0, boolean z11) {
        synchronized (this.f9333k) {
            try {
                C26967n m11840d = runnableC2238y0.m11840d();
                String m138955b = m11840d.m138955b();
                if (m11756h(m138955b) == runnableC2238y0) {
                    m11755f(m138955b);
                }
                AbstractC2253u.m11895e().mo11898a(f9322l, getClass().getSimpleName() + " " + m138955b + " executed; reschedule = " + z11);
                Iterator it = this.f9332j.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2189f) it.next()).mo11614e(m11840d, z11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: q */
    private void m11762q(C26967n c26967n, boolean z11) {
        this.f9326d.mo143749a().execute(new Runnable() { // from class: androidx.work.impl.t

            /* renamed from: q */
            public final /* synthetic */ C26967n f9319q;

            /* renamed from: r */
            public final /* synthetic */ boolean f9320r;

            public /* synthetic */ RunnableC2224t(C26967n c26967n2, boolean z112) {
                r2 = c26967n2;
                r3 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2226u.this.m11758l(r2, r3);
            }
        });
    }

    /* renamed from: u */
    private void m11763u() {
        synchronized (this.f9333k) {
            try {
                if (!(!this.f9328f.isEmpty())) {
                    try {
                        this.f9324b.startService(C2197b.m11706g(this.f9324b));
                    } catch (Throwable th2) {
                        AbstractC2253u.m11895e().mo11901d(f9322l, "Unable to stop foreground service", th2);
                    }
                    PowerManager.WakeLock wakeLock = this.f9323a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f9323a = null;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.work.impl.foreground.InterfaceC2196a
    /* renamed from: a */
    public void mo11701a(String str, C2244l c2244l) {
        synchronized (this.f9333k) {
            try {
                AbstractC2253u.m11895e().mo11902f(f9322l, "Moving WorkSpec (" + str + ") to the foreground");
                RunnableC2238y0 runnableC2238y0 = (RunnableC2238y0) this.f9329g.remove(str);
                if (runnableC2238y0 != null) {
                    if (this.f9323a == null) {
                        PowerManager.WakeLock m140465b = AbstractC27441a0.m140465b(this.f9324b, "ProcessorForegroundLck");
                        this.f9323a = m140465b;
                        m140465b.acquire();
                    }
                    this.f9328f.put(str, runnableC2238y0);
                    AbstractC1388a.m6975q(this.f9324b, C2197b.m11705f(this.f9324b, runnableC2238y0.m11840d(), c2244l));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public void m11764e(InterfaceC2189f interfaceC2189f) {
        synchronized (this.f9333k) {
            this.f9332j.add(interfaceC2189f);
        }
    }

    /* renamed from: g */
    public C26976w m11765g(String str) {
        synchronized (this.f9333k) {
            try {
                RunnableC2238y0 m11756h = m11756h(str);
                if (m11756h != null) {
                    return m11756h.m11841e();
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: j */
    public boolean m11766j(String str) {
        boolean contains;
        synchronized (this.f9333k) {
            contains = this.f9331i.contains(str);
        }
        return contains;
    }

    /* renamed from: k */
    public boolean m11767k(String str) {
        boolean z11;
        synchronized (this.f9333k) {
            if (m11756h(str) != null) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        return z11;
    }

    /* renamed from: p */
    public void m11768p(InterfaceC2189f interfaceC2189f) {
        synchronized (this.f9333k) {
            this.f9332j.remove(interfaceC2189f);
        }
    }

    /* renamed from: r */
    public boolean m11769r(C2155a0 c2155a0) {
        return m11770s(c2155a0, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: androidx.work.impl.r.<init>(androidx.work.impl.u, java.util.ArrayList, java.lang.String):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: s */
    public boolean m11770s(androidx.work.impl.C2155a0 r13, androidx.work.WorkerParameters.C2133a r14) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.C2226u.m11770s(androidx.work.impl.a0, androidx.work.WorkerParameters$a):boolean");
    }

    /* renamed from: t */
    public boolean m11771t(String str, int i11) {
        RunnableC2238y0 m11755f;
        synchronized (this.f9333k) {
            AbstractC2253u.m11895e().mo11898a(f9322l, "Processor cancelling " + str);
            this.f9331i.add(str);
            m11755f = m11755f(str);
        }
        return m11757i(str, m11755f, i11);
    }

    /* renamed from: v */
    public boolean m11772v(C2155a0 c2155a0, int i11) {
        RunnableC2238y0 m11755f;
        String m138955b = c2155a0.m11582a().m138955b();
        synchronized (this.f9333k) {
            m11755f = m11755f(m138955b);
        }
        return m11757i(m138955b, m11755f, i11);
    }

    /* renamed from: w */
    public boolean m11773w(C2155a0 c2155a0, int i11) {
        String m138955b = c2155a0.m11582a().m138955b();
        synchronized (this.f9333k) {
            try {
                if (this.f9328f.get(m138955b) != null) {
                    AbstractC2253u.m11895e().mo11898a(f9322l, "Ignored stopWork. WorkerWrapper " + m138955b + " is in foreground");
                    return false;
                }
                Set set = (Set) this.f9330h.get(m138955b);
                if (set != null && set.contains(c2155a0)) {
                    return m11757i(m138955b, m11755f(m138955b), i11);
                }
                return false;
            } finally {
            }
        }
    }
}
