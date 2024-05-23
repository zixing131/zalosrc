package ac;

import ac.C0692a;
import ac.C0717m0;
import android.app.Activity;
import android.graphics.Rect;
import android.view.ViewGroup;
import com.zing.zalo.analytics.ZaloAnalytics;
import com.zing.zalo.uidrawing.C16719g;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;

/* renamed from: ac.c */
/* loaded from: classes3.dex */
public final class C0696c extends AbstractC0710j implements C0692a.a {

    /* renamed from: b */
    private final WeakReference f2278b;

    /* renamed from: c */
    private final String f2279c;

    /* renamed from: d */
    private final a f2280d;

    /* renamed from: e */
    private boolean f2281e;

    /* renamed from: f */
    private long f2282f;

    /* renamed from: g */
    private String f2283g;

    /* renamed from: ac.c$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final Rect f2284a = new Rect();

        /* renamed from: a */
        public final boolean m1019a(C16719g c16719g, int i11) {
            if (c16719g == null || !c16719g.isShown() || !c16719g.m89144k0()) {
                return false;
            }
            ViewGroup m89119T = c16719g.m89119T();
            this.f2284a.setEmpty();
            if (!m89119T.getGlobalVisibleRect(this.f2284a)) {
                return false;
            }
            int height = (this.f2284a.height() - (c16719g.m89098H() * 2)) * (this.f2284a.width() - (c16719g.m89096G() * 2));
            int m89112O = c16719g.m89112O() * c16719g.m89114P();
            if (m89112O <= 0 || height * 100 < i11 * m89112O) {
                return false;
            }
            return true;
        }
    }

    public C0696c(WeakReference weakReference, String str) {
        AbstractC19074t.m100208f(weakReference, "module");
        AbstractC19074t.m100208f(str, "moduleName");
        this.f2278b = weakReference;
        this.f2279c = str;
        this.f2280d = new a();
        this.f2283g = "";
    }

    /* renamed from: e */
    private final void m1016e(boolean z11) {
        long currentTimeMillis;
        long currentTimeMillis2;
        if (this.f2281e != z11) {
            this.f2281e = z11;
            if (z11) {
                ZaloAnalytics.C7293b c7293b = ZaloAnalytics.Companion;
                if (c7293b.m37219b().m37198O().mo124314i() != 0) {
                    currentTimeMillis2 = c7293b.m37219b().m37198O().mo124314i();
                } else {
                    currentTimeMillis2 = System.currentTimeMillis();
                }
                this.f2282f = currentTimeMillis2;
                if (!c7293b.m37219b().m37194J().containsKey(this.f2279c)) {
                    this.f2283g = C0697c0.Companion.m1048b().m1038m();
                    c7293b.m37219b().m37194J().put(this.f2279c, this.f2283g);
                    return;
                } else {
                    String str = (String) c7293b.m37219b().m37194J().get(this.f2279c);
                    if (str == null) {
                        str = C0697c0.Companion.m1048b().m1038m();
                    }
                    this.f2283g = str;
                    return;
                }
            }
            ZaloAnalytics.C7293b c7293b2 = ZaloAnalytics.Companion;
            if (c7293b2.m37219b().m37198O().mo124314i() != 0) {
                currentTimeMillis = c7293b2.m37219b().m37198O().mo124314i();
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            long j11 = currentTimeMillis;
            long j12 = j11 - this.f2282f;
            C0717m0.b bVar = C0717m0.Companion;
            if (j12 >= bVar.m1125a().m1116h()) {
                C0717m0 m1125a = bVar.m1125a();
                String str2 = this.f2279c;
                String str3 = this.f2283g;
                long j13 = this.f2282f;
                m1125a.m1123q(str2, str3, j13, j11, j11 - j13, m1077b());
            }
        }
    }

    @Override // ac.C0692a.a
    /* renamed from: a */
    public void mo1013a() {
        m1016e(this.f2280d.m1019a((C16719g) this.f2278b.get(), C0717m0.Companion.m1125a().m1115g()));
    }

    @Override // ac.AbstractC0710j
    /* renamed from: c */
    public void mo1017c() {
        ZaloAnalytics.Companion.m37219b().m37193D().m1012g(this);
    }

    /* renamed from: f */
    public final C16719g m1018f() {
        return (C16719g) this.f2278b.get();
    }

    @Override // ac.C0692a.a
    public void onActivityStarted(Activity activity) {
        AbstractC19074t.m100208f(activity, "activity");
    }

    @Override // ac.C0692a.a
    public void onActivityStopped(Activity activity) {
        AbstractC19074t.m100208f(activity, "activity");
    }
}
