package com.google.firebase.perf.application;

import androidx.fragment.app.AbstractC1733g;
import androidx.fragment.app.Fragment;
import com.google.firebase.perf.metrics.Trace;
import java.util.WeakHashMap;
import p319l9.C22152a;
import p345m9.AbstractC22960g;
import p441q9.C25197k;
import p476r9.AbstractC25702j;
import p476r9.C25693a;
import p476r9.C25699g;

/* renamed from: com.google.firebase.perf.application.c */
/* loaded from: classes3.dex */
public class C6660c extends AbstractC1733g.a {

    /* renamed from: f */
    private static final C22152a f36771f = C22152a.m115524e();

    /* renamed from: a */
    private final WeakHashMap f36772a = new WeakHashMap();

    /* renamed from: b */
    private final C25693a f36773b;

    /* renamed from: c */
    private final C25197k f36774c;

    /* renamed from: d */
    private final C6658a f36775d;

    /* renamed from: e */
    private final C6661d f36776e;

    public C6660c(C25693a c25693a, C25197k c25197k, C6658a c6658a, C6661d c6661d) {
        this.f36773b = c25693a;
        this.f36774c = c25197k;
        this.f36775d = c6658a;
        this.f36776e = c6661d;
    }

    @Override // androidx.fragment.app.AbstractC1733g.a
    /* renamed from: f */
    public void mo9006f(AbstractC1733g abstractC1733g, Fragment fragment) {
        super.mo9006f(abstractC1733g, fragment);
        C22152a c22152a = f36771f;
        c22152a.m115526b("FragmentMonitor %s.onFragmentPaused ", fragment.getClass().getSimpleName());
        if (!this.f36772a.containsKey(fragment)) {
            c22152a.m115534k("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = (Trace) this.f36772a.get(fragment);
        this.f36772a.remove(fragment);
        C25699g m34027f = this.f36776e.m34027f(fragment);
        if (!m34027f.m132613d()) {
            c22152a.m115534k("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
        } else {
            AbstractC25702j.m132616a(trace, (AbstractC22960g.a) m34027f.m132612c());
            trace.stop();
        }
    }

    @Override // androidx.fragment.app.AbstractC1733g.a
    /* renamed from: i */
    public void mo9009i(AbstractC1733g abstractC1733g, Fragment fragment) {
        String simpleName;
        super.mo9009i(abstractC1733g, fragment);
        f36771f.m115526b("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace(m34021o(fragment), this.f36774c, this.f36773b, this.f36775d);
        trace.start();
        if (fragment.m8890y() == null) {
            simpleName = "No parent";
        } else {
            simpleName = fragment.m8890y().getClass().getSimpleName();
        }
        trace.putAttribute("Parent_fragment", simpleName);
        if (fragment.m8852h() != null) {
            trace.putAttribute("Hosting_activity", fragment.m8852h().getClass().getSimpleName());
        }
        this.f36772a.put(fragment, trace);
        this.f36776e.m34025d(fragment);
    }

    /* renamed from: o */
    public String m34021o(Fragment fragment) {
        return "_st_" + fragment.getClass().getSimpleName();
    }
}
