package ac;

import ac.C0692a;
import ac.C0717m0;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import com.zing.zalo.analytics.ZaloAnalytics;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;

/* renamed from: ac.f */
/* loaded from: classes3.dex */
public final class C0702f extends AbstractC0710j implements C0692a.a {

    /* renamed from: b */
    private final WeakReference f2309b;

    /* renamed from: c */
    private final String f2310c;

    /* renamed from: d */
    private final a f2311d;

    /* renamed from: e */
    private boolean f2312e;

    /* renamed from: f */
    private long f2313f;

    /* renamed from: g */
    private String f2314g;

    /* renamed from: ac.f$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final Rect f2315a = new Rect();

        /* renamed from: b */
        private boolean f2316b;

        /* renamed from: a */
        public final boolean m1061a() {
            return this.f2316b;
        }

        /* renamed from: b */
        public final boolean m1062b(View view, int i11) {
            this.f2316b = false;
            if (view == null || view.getVisibility() != 0 || view.getParent() == null || !view.isShown()) {
                return false;
            }
            this.f2315a.setEmpty();
            if (!view.getGlobalVisibleRect(this.f2315a)) {
                this.f2316b = true;
                return false;
            }
            int height = this.f2315a.height() * this.f2315a.width();
            int height2 = view.getHeight() * view.getWidth();
            if (height <= 0 || height2 <= 0 || height * 100 < i11 * height2) {
                return false;
            }
            return true;
        }
    }

    public C0702f(WeakReference weakReference, String str) {
        AbstractC19074t.m100208f(weakReference, "view");
        AbstractC19074t.m100208f(str, "viewName");
        this.f2309b = weakReference;
        this.f2310c = str;
        this.f2311d = new a();
        this.f2314g = "";
    }

    /* renamed from: f */
    private final void m1058f(boolean z11) {
        long currentTimeMillis;
        long currentTimeMillis2;
        if (this.f2312e != z11) {
            this.f2312e = z11;
            if (z11) {
                ZaloAnalytics.C7293b c7293b = ZaloAnalytics.Companion;
                if (c7293b.m37219b().m37198O().mo124314i() != 0) {
                    currentTimeMillis2 = c7293b.m37219b().m37198O().mo124314i();
                } else {
                    currentTimeMillis2 = System.currentTimeMillis();
                }
                this.f2313f = currentTimeMillis2;
                if (!c7293b.m37219b().m37194J().containsKey(this.f2310c)) {
                    this.f2314g = C0697c0.Companion.m1048b().m1038m();
                    c7293b.m37219b().m37194J().put(this.f2310c, this.f2314g);
                    return;
                } else {
                    String str = (String) c7293b.m37219b().m37194J().get(this.f2310c);
                    if (str == null) {
                        str = C0697c0.Companion.m1048b().m1038m();
                    }
                    this.f2314g = str;
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
            long j12 = j11 - this.f2313f;
            C0717m0.b bVar = C0717m0.Companion;
            if (j12 >= bVar.m1125a().m1116h()) {
                C0717m0 m1125a = bVar.m1125a();
                String str2 = this.f2310c;
                String str3 = this.f2314g;
                long j13 = this.f2313f;
                m1125a.m1123q(str2, str3, j13, j11, j11 - j13, m1077b());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m1059h(C0702f c0702f) {
        AbstractC19074t.m100208f(c0702f, "this$0");
        c0702f.mo1013a();
    }

    @Override // ac.C0692a.a
    /* renamed from: a */
    public void mo1013a() {
        View view;
        m1058f(this.f2311d.m1062b((View) this.f2309b.get(), C0717m0.Companion.m1125a().m1115g()));
        if (this.f2311d.m1061a() && (view = (View) this.f2309b.get()) != null) {
            view.postDelayed(new Runnable() { // from class: ac.e
                @Override // java.lang.Runnable
                public final void run() {
                    C0702f.m1059h(C0702f.this);
                }
            }, 50L);
        }
    }

    @Override // ac.AbstractC0710j
    /* renamed from: c */
    public void mo1017c() {
        ZaloAnalytics.Companion.m37219b().m37193D().m1012g(this);
    }

    /* renamed from: g */
    public final View m1060g() {
        return (View) this.f2309b.get();
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
