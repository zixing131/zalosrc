package com.google.firebase.perf.application;

import android.app.Activity;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.core.app.C1339g;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.Map;
import p319l9.C22152a;
import p345m9.AbstractC22960g;
import p476r9.C25699g;

/* renamed from: com.google.firebase.perf.application.d */
/* loaded from: classes3.dex */
public class C6661d {

    /* renamed from: e */
    private static final C22152a f36777e = C22152a.m115524e();

    /* renamed from: a */
    private final Activity f36778a;

    /* renamed from: b */
    private final C1339g f36779b;

    /* renamed from: c */
    private final Map f36780c;

    /* renamed from: d */
    private boolean f36781d;

    public C6661d(Activity activity) {
        this(activity, new C1339g(), new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m34022a() {
        return true;
    }

    /* renamed from: b */
    private C25699g m34023b() {
        if (!this.f36781d) {
            f36777e.m115525a("No recording has been started.");
            return C25699g.m132609a();
        }
        SparseIntArray[] m6718b = this.f36779b.m6718b();
        if (m6718b == null) {
            f36777e.m115525a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return C25699g.m132609a();
        }
        if (m6718b[0] == null) {
            f36777e.m115525a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return C25699g.m132609a();
        }
        return C25699g.m132611e(AbstractC22960g.m117687a(m6718b));
    }

    /* renamed from: c */
    public void m34024c() {
        if (this.f36781d) {
            f36777e.m115526b("FrameMetricsAggregator is already recording %s", this.f36778a.getClass().getSimpleName());
        } else {
            this.f36779b.m6717a(this.f36778a);
            this.f36781d = true;
        }
    }

    /* renamed from: d */
    public void m34025d(Fragment fragment) {
        if (!this.f36781d) {
            f36777e.m115525a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        if (this.f36780c.containsKey(fragment)) {
            f36777e.m115526b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
            return;
        }
        C25699g m34023b = m34023b();
        if (!m34023b.m132613d()) {
            f36777e.m115526b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        } else {
            this.f36780c.put(fragment, (AbstractC22960g.a) m34023b.m132612c());
        }
    }

    /* renamed from: e */
    public C25699g m34026e() {
        if (!this.f36781d) {
            f36777e.m115525a("Cannot stop because no recording was started");
            return C25699g.m132609a();
        }
        if (!this.f36780c.isEmpty()) {
            f36777e.m115525a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
            this.f36780c.clear();
        }
        C25699g m34023b = m34023b();
        try {
            this.f36779b.m6719c(this.f36778a);
        } catch (IllegalArgumentException | NullPointerException e11) {
            if ((e11 instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                throw e11;
            }
            f36777e.m115534k("View not hardware accelerated. Unable to collect FrameMetrics. %s", e11.toString());
            m34023b = C25699g.m132609a();
        }
        this.f36779b.m6720d();
        this.f36781d = false;
        return m34023b;
    }

    /* renamed from: f */
    public C25699g m34027f(Fragment fragment) {
        if (!this.f36781d) {
            f36777e.m115525a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return C25699g.m132609a();
        }
        if (!this.f36780c.containsKey(fragment)) {
            f36777e.m115526b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            return C25699g.m132609a();
        }
        AbstractC22960g.a aVar = (AbstractC22960g.a) this.f36780c.remove(fragment);
        C25699g m34023b = m34023b();
        if (!m34023b.m132613d()) {
            f36777e.m115526b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
            return C25699g.m132609a();
        }
        return C25699g.m132611e(((AbstractC22960g.a) m34023b.m132612c()).m117688a(aVar));
    }

    C6661d(Activity activity, C1339g c1339g, Map map) {
        this.f36781d = false;
        this.f36778a = activity;
        this.f36779b = c1339g;
        this.f36780c = map;
    }
}
