package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.AbstractC2252t;
import androidx.work.AbstractC2253u;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.C2221r0;
import androidx.work.impl.WorkDatabase;
import fn0.AbstractC19074t;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p535u2.InterfaceC26954c0;
import p535u2.InterfaceC26964k;
import p535u2.InterfaceC26969p;
import p535u2.InterfaceC26977x;
import p630x2.AbstractC29298e;

/* loaded from: classes2.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(workerParameters, "parameters");
    }

    @Override // androidx.work.Worker
    public AbstractC2252t.a doWork() {
        String str;
        String str2;
        String m146395d;
        String str3;
        String str4;
        String m146395d2;
        String str5;
        String str6;
        String m146395d3;
        C2221r0 m11729r = C2221r0.m11729r(getApplicationContext());
        AbstractC19074t.m100207e(m11729r, "getInstance(applicationContext)");
        WorkDatabase m11740w = m11729r.m11740w();
        AbstractC19074t.m100207e(m11740w, "workManager.workDatabase");
        InterfaceC26977x mo11565L = m11740w.mo11565L();
        InterfaceC26969p mo11563J = m11740w.mo11563J();
        InterfaceC26954c0 mo11566M = m11740w.mo11566M();
        InterfaceC26964k mo11562I = m11740w.mo11562I();
        List mo139001c = mo11565L.mo139001c(m11729r.m11735p().m11470a().mo11468a() - TimeUnit.DAYS.toMillis(1L));
        List mo139022x = mo11565L.mo139022x();
        List mo139013o = mo11565L.mo139013o(200);
        if (!mo139001c.isEmpty()) {
            AbstractC2253u m11895e = AbstractC2253u.m11895e();
            str5 = AbstractC29298e.f135737a;
            m11895e.mo11902f(str5, "Recently completed work:\n\n");
            AbstractC2253u m11895e2 = AbstractC2253u.m11895e();
            str6 = AbstractC29298e.f135737a;
            m146395d3 = AbstractC29298e.m146395d(mo11563J, mo11566M, mo11562I, mo139001c);
            m11895e2.mo11902f(str6, m146395d3);
        }
        if (!mo139022x.isEmpty()) {
            AbstractC2253u m11895e3 = AbstractC2253u.m11895e();
            str3 = AbstractC29298e.f135737a;
            m11895e3.mo11902f(str3, "Running work:\n\n");
            AbstractC2253u m11895e4 = AbstractC2253u.m11895e();
            str4 = AbstractC29298e.f135737a;
            m146395d2 = AbstractC29298e.m146395d(mo11563J, mo11566M, mo11562I, mo139022x);
            m11895e4.mo11902f(str4, m146395d2);
        }
        if (!mo139013o.isEmpty()) {
            AbstractC2253u m11895e5 = AbstractC2253u.m11895e();
            str = AbstractC29298e.f135737a;
            m11895e5.mo11902f(str, "Enqueued work:\n\n");
            AbstractC2253u m11895e6 = AbstractC2253u.m11895e();
            str2 = AbstractC29298e.f135737a;
            m146395d = AbstractC29298e.m146395d(mo11563J, mo11566M, mo11562I, mo139013o);
            m11895e6.mo11902f(str2, m146395d);
        }
        AbstractC2252t.a m11891c = AbstractC2252t.a.m11891c();
        AbstractC19074t.m100207e(m11891c, "success()");
        return m11891c;
    }
}
