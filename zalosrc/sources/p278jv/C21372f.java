package p278jv;

import android.webkit.WebView;
import androidx.work.AbstractC2144f;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;

/* renamed from: jv.f */
/* loaded from: classes4.dex */
public final class C21372f implements InterfaceC21370d {

    /* renamed from: a */
    private final WeakReference f104228a;

    /* renamed from: b */
    private final boolean f104229b;

    /* renamed from: c */
    private final boolean f104230c;

    public C21372f(WeakReference weakReference) {
        boolean z11;
        WebView webView;
        WebView webView2;
        this.f104228a = weakReference;
        boolean z12 = false;
        if (weakReference != null && (webView2 = (WebView) weakReference.get()) != null) {
            z11 = webView2.canGoBack();
        } else {
            z11 = false;
        }
        this.f104229b = z11;
        if (weakReference != null && (webView = (WebView) weakReference.get()) != null) {
            z12 = webView.canGoForward();
        }
        this.f104230c = z12;
    }

    @Override // p278jv.InterfaceC21370d
    /* renamed from: a */
    public boolean mo110765a() {
        return this.f104230c;
    }

    @Override // p278jv.InterfaceC21370d
    /* renamed from: b */
    public boolean mo110766b() {
        return this.f104229b;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC19074t.m100204b(C21372f.class, cls)) {
            return false;
        }
        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.libwebview.model.state.WebViewNavigationState");
        C21372f c21372f = (C21372f) obj;
        if (mo110766b() == c21372f.mo110766b() && mo110765a() == c21372f.mo110765a()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (AbstractC2144f.m11520a(mo110766b()) * 31) + AbstractC2144f.m11520a(mo110765a());
    }

    public String toString() {
        return "WebViewNavigationState(webView=" + this.f104228a + ")";
    }
}
