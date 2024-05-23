package com.google.firebase.perf.metrics;

import com.google.firebase.perf.session.PerfSession;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p507s9.C26194k;
import p507s9.C26196m;

/* renamed from: com.google.firebase.perf.metrics.a */
/* loaded from: classes3.dex */
public class C6694a {

    /* renamed from: a */
    private final Trace f36863a;

    public C6694a(Trace trace) {
        this.f36863a = trace;
    }

    /* renamed from: a */
    public C26196m m34176a() {
        C26196m.b m134760N = C26196m.m134738r0().m134761O(this.f36863a.m34165e()).m134759L(this.f36863a.m34167g().m34294e()).m134760N(this.f36863a.m34167g().m34293d(this.f36863a.m34164d()));
        for (Counter counter : this.f36863a.m34163c().values()) {
            m134760N.m134757H(counter.m34154b(), counter.m34153a());
        }
        List m34168h = this.f36863a.m34168h();
        if (!m34168h.isEmpty()) {
            Iterator it = m34168h.iterator();
            while (it.hasNext()) {
                m134760N.m134754D(new C6694a((Trace) it.next()).m34176a());
            }
        }
        m134760N.m134756G(this.f36863a.getAttributes());
        C26194k[] m34243b = PerfSession.m34243b(this.f36863a.m34166f());
        if (m34243b != null) {
            m134760N.m134751A(Arrays.asList(m34243b));
        }
        return (C26196m) m134760N.m35109q();
    }
}
