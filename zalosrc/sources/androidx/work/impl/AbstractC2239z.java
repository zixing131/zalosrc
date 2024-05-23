package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import androidx.work.AbstractC2253u;
import androidx.work.C2138c;
import androidx.work.InterfaceC2136b;
import androidx.work.impl.background.systemalarm.C2166h;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.C2182m;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p535u2.C26967n;
import p535u2.C26976w;
import p535u2.InterfaceC26977x;
import p565v2.AbstractC27465s;

/* renamed from: androidx.work.impl.z */
/* loaded from: classes.dex */
public abstract class AbstractC2239z {

    /* renamed from: a */
    private static final String f9435a = AbstractC2253u.m11897i("Schedulers");

    /* renamed from: c */
    public static InterfaceC2233w m11850c(Context context, WorkDatabase workDatabase, C2138c c2138c) {
        if (Build.VERSION.SDK_INT >= 23) {
            C2182m c2182m = new C2182m(context, workDatabase, c2138c);
            AbstractC27465s.m140515c(context, SystemJobService.class, true);
            AbstractC2253u.m11895e().mo11898a(f9435a, "Created SystemJobScheduler and enabled SystemJobService");
            return c2182m;
        }
        InterfaceC2233w m11856i = m11856i(context, c2138c.m11470a());
        if (m11856i == null) {
            C2166h c2166h = new C2166h(context);
            AbstractC27465s.m140515c(context, SystemAlarmService.class, true);
            AbstractC2253u.m11895e().mo11898a(f9435a, "Created SystemAlarmScheduler");
            return c2166h;
        }
        return m11856i;
    }

    /* renamed from: d */
    public static /* synthetic */ void m11851d(List list, C26967n c26967n, C2138c c2138c, WorkDatabase workDatabase) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC2233w) it.next()).mo11640a(c26967n.m138955b());
        }
        m11855h(c2138c, workDatabase, list);
    }

    /* renamed from: e */
    public static /* synthetic */ void m11852e(Executor executor, List list, C2138c c2138c, WorkDatabase workDatabase, C26967n c26967n, boolean z11) {
        executor.execute(new Runnable() { // from class: androidx.work.impl.y

            /* renamed from: p */
            public final /* synthetic */ List f9399p;

            /* renamed from: q */
            public final /* synthetic */ C26967n f9400q;

            /* renamed from: r */
            public final /* synthetic */ C2138c f9401r;

            /* renamed from: s */
            public final /* synthetic */ WorkDatabase f9402s;

            public /* synthetic */ RunnableC2237y(List list2, C26967n c26967n2, C2138c c2138c2, WorkDatabase workDatabase2) {
                r1 = list2;
                r2 = c26967n2;
                r3 = c2138c2;
                r4 = workDatabase2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC2239z.m11851d(r1, r2, r3, r4);
            }
        });
    }

    /* renamed from: f */
    private static void m11853f(InterfaceC26977x interfaceC26977x, InterfaceC2136b interfaceC2136b, List list) {
        if (list.size() > 0) {
            long mo11468a = interfaceC2136b.mo11468a();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                interfaceC26977x.mo139015q(((C26976w) it.next()).f127497a, mo11468a);
            }
        }
    }

    /* renamed from: g */
    public static void m11854g(List list, C2226u c2226u, Executor executor, WorkDatabase workDatabase, C2138c c2138c) {
        c2226u.m11764e(new InterfaceC2189f() { // from class: androidx.work.impl.x

            /* renamed from: p */
            public final /* synthetic */ Executor f9393p;

            /* renamed from: q */
            public final /* synthetic */ List f9394q;

            /* renamed from: r */
            public final /* synthetic */ C2138c f9395r;

            /* renamed from: s */
            public final /* synthetic */ WorkDatabase f9396s;

            public /* synthetic */ C2235x(Executor executor2, List list2, C2138c c2138c2, WorkDatabase workDatabase2) {
                r1 = executor2;
                r2 = list2;
                r3 = c2138c2;
                r4 = workDatabase2;
            }

            @Override // androidx.work.impl.InterfaceC2189f
            /* renamed from: e */
            public final void mo11614e(C26967n c26967n, boolean z11) {
                AbstractC2239z.m11852e(r1, r2, r3, r4, c26967n, z11);
            }
        });
    }

    /* renamed from: h */
    public static void m11855h(C2138c c2138c, WorkDatabase workDatabase, List list) {
        List list2;
        if (list != null && list.size() != 0) {
            InterfaceC26977x mo11565L = workDatabase.mo11565L();
            workDatabase.m342e();
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    list2 = mo11565L.mo138994A();
                    m11853f(mo11565L, c2138c.m11470a(), list2);
                } else {
                    list2 = null;
                }
                List mo139017s = mo11565L.mo139017s(c2138c.m11477h());
                m11853f(mo11565L, c2138c.m11470a(), mo139017s);
                if (list2 != null) {
                    mo139017s.addAll(list2);
                }
                List mo139013o = mo11565L.mo139013o(200);
                workDatabase.m339E();
                workDatabase.m347j();
                if (mo139017s.size() > 0) {
                    C26976w[] c26976wArr = (C26976w[]) mo139017s.toArray(new C26976w[mo139017s.size()]);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        InterfaceC2233w interfaceC2233w = (InterfaceC2233w) it.next();
                        if (interfaceC2233w.mo11641c()) {
                            interfaceC2233w.mo11642d(c26976wArr);
                        }
                    }
                }
                if (mo139013o.size() > 0) {
                    C26976w[] c26976wArr2 = (C26976w[]) mo139013o.toArray(new C26976w[mo139013o.size()]);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        InterfaceC2233w interfaceC2233w2 = (InterfaceC2233w) it2.next();
                        if (!interfaceC2233w2.mo11641c()) {
                            interfaceC2233w2.mo11642d(c26976wArr2);
                        }
                    }
                }
            } catch (Throwable th2) {
                workDatabase.m347j();
                throw th2;
            }
        }
    }

    /* renamed from: i */
    private static InterfaceC2233w m11856i(Context context, InterfaceC2136b interfaceC2136b) {
        try {
            InterfaceC2233w interfaceC2233w = (InterfaceC2233w) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class, InterfaceC2136b.class).newInstance(context, interfaceC2136b);
            AbstractC2253u.m11895e().mo11898a(f9435a, "Created androidx.work.impl.background.gcm.GcmScheduler");
            return interfaceC2233w;
        } catch (Throwable th2) {
            AbstractC2253u.m11895e().mo11899b(f9435a, "Unable to create GCM Scheduler", th2);
            return null;
        }
    }
}
