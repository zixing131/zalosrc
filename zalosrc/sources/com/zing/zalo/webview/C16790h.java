package com.zing.zalo.webview;

import am.AbstractC0924m0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import com.zing.zalo.p077ui.WebViewMPActivity;
import com.zing.zalo.p077ui.zviews.MPWebView;
import com.zing.zalo.p077ui.zviews.MiniAppBaseView;
import com.zing.zalo.p077ui.zviews.WebBaseView;
import com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import me0.AbstractC23152n3;
import p189gv.C19609h;
import p363nh.C23744a;
import qm0.AbstractC25332a0;

/* renamed from: com.zing.zalo.webview.h */
/* loaded from: classes5.dex */
public final class C16790h extends C17487o0 {
    public static final b Companion = new b(null);

    /* renamed from: M */
    private final int f85210M;

    /* renamed from: N */
    private ArrayList f85211N;

    /* renamed from: com.zing.zalo.webview.h$a */
    /* loaded from: classes5.dex */
    public static final class a implements C17487o0.l {
        a() {
        }

        @Override // com.zing.zalo.zview.C17487o0.l
        /* renamed from: gp */
        public void mo35571gp(ZaloView zaloView) {
            if (zaloView instanceof WebBaseView) {
                Iterator it = C16790h.this.f85211N.iterator();
                while (it.hasNext()) {
                    C16800p c16800p = (C16800p) it.next();
                    if (c16800p.m89734b() == ((WebBaseView) zaloView).m86807vO()) {
                        C16790h.this.f85211N.remove(c16800p);
                        return;
                    }
                }
            }
        }

        @Override // com.zing.zalo.zview.C17487o0.l
        /* renamed from: o7 */
        public void mo35578o7(ZaloView zaloView) {
            String str;
            if (zaloView instanceof WebBaseView) {
                WebBaseView webBaseView = (WebBaseView) zaloView;
                C19609h m89686t2 = C16790h.this.m89686t2(webBaseView.m92642L3());
                if (m89686t2 != null) {
                    str = m89686t2.m102616j();
                } else {
                    str = null;
                }
                C16790h.this.f85211N.add(new C16800p(webBaseView.m86807vO(), str));
            }
        }

        @Override // com.zing.zalo.zview.C17487o0.l
        /* renamed from: r5 */
        public void mo35582r5(ZaloView zaloView) {
        }
    }

    /* renamed from: com.zing.zalo.webview.h$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final boolean m89696a(Class cls, Class cls2) {
            AbstractC19074t.m100208f(cls2, "parentView");
            try {
                AbstractC19074t.m100206d(cls, "null cannot be cast to non-null type java.lang.Class<out com.zing.zalo.zview.ZaloView>");
                if (cls.asSubclass(cls2) == null) {
                    return false;
                }
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    public C16790h(int i11) {
        this.f85210M = i11;
        m93092y(new a());
        this.f85211N = new ArrayList();
    }

    /* renamed from: r2 */
    private final boolean m89685r2(Bundle bundle) {
        C19609h m89686t2 = m89686t2(bundle);
        if (m89686t2 == null) {
            return false;
        }
        Iterator it = this.f85211N.iterator();
        while (it.hasNext()) {
            if (AbstractC19074t.m100204b(m89686t2.m102616j(), ((C16800p) it.next()).m89733a())) {
                C23744a.Companion.m124119a().m124116d(9011, m89686t2.m102620n());
                return true;
            }
        }
        return false;
    }

    /* renamed from: t2 */
    public final C19609h m89686t2(Bundle bundle) {
        if (bundle != null && bundle.containsKey("EXTRA_MINI_PROGRAM")) {
            return (C19609h) bundle.getSerializable("EXTRA_MINI_PROGRAM");
        }
        return null;
    }

    /* renamed from: u2 */
    private final void m89687u2(ZaloView zaloView) {
        if (zaloView == null) {
            return;
        }
        Bundle m92642L3 = zaloView.m92642L3();
        if (m92642L3 == null) {
            m92642L3 = new Bundle();
        }
        m92642L3.putInt("MP_TASK_ID", this.f85210M);
        m93021N0().startActivity(AbstractC23152n3.m119008M(zaloView.getClass(), m92642L3));
        Object m93021N0 = m93021N0();
        AbstractC19074t.m100206d(m93021N0, "null cannot be cast to non-null type android.app.Activity");
        ((Activity) m93021N0).overridePendingTransition(0, 0);
    }

    /* renamed from: v2 */
    private final void m89688v2(Class cls, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("MP_TASK_ID", this.f85210M);
        m93021N0().startActivity(AbstractC23152n3.m119008M(cls, bundle));
        Object m93021N0 = m93021N0();
        AbstractC19074t.m100206d(m93021N0, "null cannot be cast to non-null type android.app.Activity");
        ((Activity) m93021N0).overridePendingTransition(0, 0);
    }

    /* renamed from: w2 */
    private final void m89689w2(Bundle bundle) {
        int m4393z3 = AbstractC0924m0.m4393z3();
        bundle.putInt("SHOW_WITH_FLAGS", 134217728);
        int size = this.f85211N.size();
        if (m4393z3 == 0) {
            m4393z3 = 3;
        }
        if (size >= m4393z3) {
            bundle.putBoolean("extra.clear_below_view", true);
        }
    }

    /* renamed from: x2 */
    private final Bundle m89690x2(Class cls, Bundle bundle) {
        if (Companion.m89696a(cls, WebBaseView.class)) {
            if (AbstractC19074t.m100204b(cls, MPWebView.class) && m89685r2(bundle)) {
                return null;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            m89689w2(bundle);
        }
        return bundle;
    }

    /* renamed from: y2 */
    private final boolean m89691y2(ZaloView zaloView) {
        if (zaloView instanceof WebBaseView) {
            WebBaseView webBaseView = (WebBaseView) zaloView;
            if (m89685r2(webBaseView.m92642L3())) {
                return false;
            }
            Bundle m92642L3 = webBaseView.m92642L3();
            if (m92642L3 == null) {
                m92642L3 = new Bundle();
            }
            m89689w2(m92642L3);
            webBaseView.mo60305zK(m92642L3);
            return true;
        }
        return true;
    }

    @Override // com.zing.zalo.zview.C17487o0
    /* renamed from: g2 */
    public void mo89692g2(ZaloView zaloView, int i11, int i12, boolean z11) {
        Class<?> cls;
        Object obj;
        boolean m131196V;
        if (!(zaloView instanceof MiniAppBaseView) && !(zaloView instanceof ZdsModalBottomSheet)) {
            ArrayList m57012a = WebViewMPActivity.Companion.m57012a();
            if (zaloView != null) {
                obj = zaloView.getClass();
            } else {
                obj = "";
            }
            m131196V = AbstractC25332a0.m131196V(m57012a, obj);
            if (!m131196V) {
                m89687u2(zaloView);
                return;
            }
        }
        if (!m89691y2(zaloView)) {
            return;
        }
        super.mo89692g2(zaloView, i11, i12, z11);
        WebViewMPActivity.C10961a c10961a = WebViewMPActivity.Companion;
        Context context = m93021N0().getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        Window window = m93021N0().getWindow();
        if (zaloView != null) {
            cls = zaloView.getClass();
        } else {
            cls = null;
        }
        c10961a.m57014c(context, window, cls);
    }

    @Override // com.zing.zalo.zview.C17487o0
    /* renamed from: h2 */
    public void mo89693h2(ZaloView zaloView, String str, int i11, boolean z11) {
        Class<?> cls;
        Object obj;
        boolean m131196V;
        if (!(zaloView instanceof MiniAppBaseView) && !(zaloView instanceof ZdsModalBottomSheet)) {
            ArrayList m57012a = WebViewMPActivity.Companion.m57012a();
            if (zaloView != null) {
                obj = zaloView.getClass();
            } else {
                obj = "";
            }
            m131196V = AbstractC25332a0.m131196V(m57012a, obj);
            if (!m131196V) {
                m89687u2(zaloView);
                return;
            }
        }
        if (!m89691y2(zaloView)) {
            return;
        }
        super.mo89693h2(zaloView, str, i11, z11);
        WebViewMPActivity.C10961a c10961a = WebViewMPActivity.Companion;
        Context context = m93021N0().getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        Window window = m93021N0().getWindow();
        if (zaloView != null) {
            cls = zaloView.getClass();
        } else {
            cls = null;
        }
        c10961a.m57014c(context, window, cls);
    }

    @Override // com.zing.zalo.zview.C17487o0
    /* renamed from: j2 */
    public void mo89694j2(Class cls, Bundle bundle, int i11, String str, int i12, boolean z11) {
        boolean m131196V;
        b bVar = Companion;
        if (!bVar.m89696a(cls, MiniAppBaseView.class) && !bVar.m89696a(cls, ZdsModalBottomSheet.class)) {
            m131196V = AbstractC25332a0.m131196V(WebViewMPActivity.Companion.m57012a(), cls);
            if (!m131196V) {
                m89688v2(cls, bundle);
                return;
            }
        }
        Bundle m89690x2 = m89690x2(cls, bundle);
        if (m89690x2 == null) {
            return;
        }
        super.mo89694j2(cls, m89690x2, i11, str, i12, z11);
        WebViewMPActivity.C10961a c10961a = WebViewMPActivity.Companion;
        Context context = m93021N0().getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        c10961a.m57014c(context, m93021N0().getWindow(), cls);
    }

    /* renamed from: s2 */
    public final void m89695s2(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "maId");
        int m92990C0 = m92990C0(str, false);
        if (m92990C0 >= 0) {
            m92985A0(m92990C0 + 1);
        }
        if (z11) {
            mo92702G1(m93012K0(), 0);
        }
    }
}
