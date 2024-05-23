package androidx.work.impl;

import android.content.Context;
import androidx.work.AbstractC2139c0;
import androidx.work.C2138c;
import androidx.work.impl.WorkDatabase;
import en0.InterfaceC18513t;
import fn0.AbstractC19074t;
import fn0.C19071q;
import java.util.List;
import p435q2.C25075b;
import p515t2.C26463n;
import p595w2.C28697d;
import p595w2.InterfaceC28696c;
import p595w2.InterfaceExecutorC28694a;
import qm0.AbstractC25368s;

/* renamed from: androidx.work.impl.s0 */
/* loaded from: classes.dex */
public abstract class AbstractC2223s0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.s0$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class a extends C19071q implements InterfaceC18513t {

        /* renamed from: y */
        public static final a f9317y = new a();

        a() {
            super(6, AbstractC2223s0.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
        }

        @Override // en0.InterfaceC18513t
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final List mo11750Ng(Context context, C2138c c2138c, InterfaceC28696c interfaceC28696c, WorkDatabase workDatabase, C26463n c26463n, C2226u c2226u) {
            AbstractC19074t.m100208f(context, "p0");
            AbstractC19074t.m100208f(c2138c, "p1");
            AbstractC19074t.m100208f(interfaceC28696c, "p2");
            AbstractC19074t.m100208f(workDatabase, "p3");
            AbstractC19074t.m100208f(c26463n, "p4");
            AbstractC19074t.m100208f(c2226u, "p5");
            return AbstractC2223s0.m11746b(context, c2138c, interfaceC28696c, workDatabase, c26463n, c2226u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final List m11746b(Context context, C2138c c2138c, InterfaceC28696c interfaceC28696c, WorkDatabase workDatabase, C26463n c26463n, C2226u c2226u) {
        List m131505m;
        InterfaceC2233w m11850c = AbstractC2239z.m11850c(context, workDatabase, c2138c);
        AbstractC19074t.m100207e(m11850c, "createBestAvailableBackg…kDatabase, configuration)");
        m131505m = AbstractC25368s.m131505m(m11850c, new C25075b(context, c2138c, c26463n, c2226u, new C2217p0(c2226u, interfaceC28696c), interfaceC28696c));
        return m131505m;
    }

    /* renamed from: c */
    public static final C2221r0 m11747c(Context context, C2138c c2138c) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(c2138c, "configuration");
        return m11749e(context, c2138c, null, null, null, null, null, 124, null);
    }

    /* renamed from: d */
    public static final C2221r0 m11748d(Context context, C2138c c2138c, InterfaceC28696c interfaceC28696c, WorkDatabase workDatabase, C26463n c26463n, C2226u c2226u, InterfaceC18513t interfaceC18513t) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(c2138c, "configuration");
        AbstractC19074t.m100208f(interfaceC28696c, "workTaskExecutor");
        AbstractC19074t.m100208f(workDatabase, "workDatabase");
        AbstractC19074t.m100208f(c26463n, "trackers");
        AbstractC19074t.m100208f(c2226u, "processor");
        AbstractC19074t.m100208f(interfaceC18513t, "schedulersCreator");
        return new C2221r0(context.getApplicationContext(), c2138c, interfaceC28696c, workDatabase, (List) interfaceC18513t.mo11750Ng(context, c2138c, interfaceC28696c, workDatabase, c26463n, c2226u), c2226u, c26463n);
    }

    /* renamed from: e */
    public static /* synthetic */ C2221r0 m11749e(Context context, C2138c c2138c, InterfaceC28696c interfaceC28696c, WorkDatabase workDatabase, C26463n c26463n, C2226u c2226u, InterfaceC18513t interfaceC18513t, int i11, Object obj) {
        InterfaceC28696c interfaceC28696c2;
        WorkDatabase workDatabase2;
        C26463n c26463n2;
        C2226u c2226u2;
        InterfaceC18513t interfaceC18513t2;
        if ((i11 & 4) != 0) {
            interfaceC28696c2 = new C28697d(c2138c.m11482m());
        } else {
            interfaceC28696c2 = interfaceC28696c;
        }
        if ((i11 & 8) != 0) {
            WorkDatabase.C2152a c2152a = WorkDatabase.f9146o;
            Context applicationContext = context.getApplicationContext();
            AbstractC19074t.m100207e(applicationContext, "context.applicationContext");
            InterfaceExecutorC28694a mo143751c = interfaceC28696c2.mo143751c();
            AbstractC19074t.m100207e(mo143751c, "workTaskExecutor.serialTaskExecutor");
            workDatabase2 = c2152a.m11569b(applicationContext, mo143751c, c2138c.m11470a(), context.getResources().getBoolean(AbstractC2139c0.workmanager_test_configuration));
        } else {
            workDatabase2 = workDatabase;
        }
        if ((i11 & 16) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            AbstractC19074t.m100207e(applicationContext2, "context.applicationContext");
            c26463n2 = new C26463n(applicationContext2, interfaceC28696c2, null, null, null, null, 60, null);
        } else {
            c26463n2 = c26463n;
        }
        if ((i11 & 32) != 0) {
            c2226u2 = new C2226u(context.getApplicationContext(), c2138c, interfaceC28696c2, workDatabase2);
        } else {
            c2226u2 = c2226u;
        }
        if ((i11 & 64) != 0) {
            interfaceC18513t2 = a.f9317y;
        } else {
            interfaceC18513t2 = interfaceC18513t;
        }
        return m11748d(context, c2138c, interfaceC28696c2, workDatabase2, c26463n2, c2226u2, interfaceC18513t2);
    }
}
