package p565v2;

import android.os.Build;
import androidx.work.AbstractC2241j0;
import androidx.work.C2138c;
import androidx.work.C2142e;
import androidx.work.C2148h;
import androidx.work.impl.C2184c0;
import androidx.work.impl.InterfaceC2233w;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import fn0.AbstractC19074t;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p535u2.C26976w;
import qm0.AbstractC25368s;
import qm0.AbstractC25378x;

/* renamed from: v2.d */
/* loaded from: classes.dex */
public abstract class AbstractC27446d {
    /* renamed from: a */
    public static final void m140481a(WorkDatabase workDatabase, C2138c c2138c, C2184c0 c2184c0) {
        List m131506n;
        Object m131545G;
        int i11;
        AbstractC19074t.m100208f(workDatabase, "workDatabase");
        AbstractC19074t.m100208f(c2138c, "configuration");
        AbstractC19074t.m100208f(c2184c0, "continuation");
        if (Build.VERSION.SDK_INT >= 24) {
            m131506n = AbstractC25368s.m131506n(c2184c0);
            int i12 = 0;
            while (!m131506n.isEmpty()) {
                m131545G = AbstractC25378x.m131545G(m131506n);
                C2184c0 c2184c02 = (C2184c0) m131545G;
                List m11678f = c2184c02.m11678f();
                AbstractC19074t.m100207e(m11678f, "current.work");
                List list = m11678f;
                if ((list instanceof Collection) && list.isEmpty()) {
                    i11 = 0;
                } else {
                    Iterator it = list.iterator();
                    i11 = 0;
                    while (it.hasNext()) {
                        if (((AbstractC2241j0) it.next()).m11861d().f127506j.m11508e() && (i11 = i11 + 1) < 0) {
                            AbstractC25368s.m131508p();
                        }
                    }
                }
                i12 += i11;
                List m11677e = c2184c02.m11677e();
                if (m11677e != null) {
                    m131506n.addAll(m11677e);
                }
            }
            if (i12 == 0) {
                return;
            }
            int mo138997D = workDatabase.mo11565L().mo138997D();
            int m11471b = c2138c.m11471b();
            if (mo138997D + i12 <= m11471b) {
                return;
            }
            throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: " + m11471b + ";\nalready enqueued count: " + mo138997D + ";\ncurrent enqueue operation count: " + i12 + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
        }
    }

    /* renamed from: b */
    public static final C26976w m140482b(C26976w c26976w) {
        AbstractC19074t.m100208f(c26976w, "workSpec");
        C2142e c2142e = c26976w.f127506j;
        String str = c26976w.f127499c;
        if (AbstractC19074t.m100204b(str, ConstraintTrackingWorker.class.getName())) {
            return c26976w;
        }
        if (!c2142e.m11509f() && !c2142e.m11512i()) {
            return c26976w;
        }
        C2148h m11534a = new C2148h.a().m11536c(c26976w.f127501e).m11539f("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str).m11534a();
        AbstractC19074t.m100207e(m11534a, "Builder().putAll(workSpe…ame)\n            .build()");
        String name = ConstraintTrackingWorker.class.getName();
        AbstractC19074t.m100207e(name, "name");
        return C26976w.m138972e(c26976w, null, null, name, null, m11534a, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, 8388587, null);
    }

    /* renamed from: c */
    private static final boolean m140483c(List list, String str) {
        try {
            Class<?> cls = Class.forName(str);
            List list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (cls.isAssignableFrom(((InterfaceC2233w) it.next()).getClass())) {
                    return true;
                }
            }
            return false;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static final C26976w m140484d(List list, C26976w c26976w) {
        AbstractC19074t.m100208f(list, "schedulers");
        AbstractC19074t.m100208f(c26976w, "workSpec");
        int i11 = Build.VERSION.SDK_INT;
        if (23 <= i11 && i11 < 26) {
            return m140482b(c26976w);
        }
        if (i11 <= 22 && m140483c(list, "androidx.work.impl.background.gcm.GcmScheduler")) {
            return m140482b(c26976w);
        }
        return c26976w;
    }
}
