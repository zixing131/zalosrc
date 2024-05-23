package p178g3;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.adtima.control.ZAudioControl;
import com.adtima.control.ZVideoControl;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: g3.i */
/* loaded from: classes2.dex */
public abstract class AbstractC19214i {

    /* renamed from: a */
    private static final AtomicInteger f95663a = new AtomicInteger(1);

    /* renamed from: a */
    public static int m100835a() {
        try {
            return AbstractC19211f.m100806a(17) ? View.generateViewId() : m100841g();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static void m100836b(ViewGroup viewGroup) {
        if (viewGroup != null) {
            try {
                viewGroup.destroyDrawingCache();
                viewGroup.removeAllViews();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public static void m100837c(WebView webView) {
        if (webView != null) {
            try {
                webView.loadUrl("about:blank");
                webView.clearCache(true);
                webView.destroyDrawingCache();
                webView.removeAllViews();
                webView.destroy();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static void m100838d(WebView webView, int i11) {
        try {
            webView.setBackgroundColor(i11);
            webView.setInitialScale(1);
            webView.setScrollContainer(false);
            webView.setVerticalScrollBarEnabled(false);
            webView.setHorizontalScrollBarEnabled(false);
            webView.getSettings().setCacheMode(2);
            webView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
            webView.getSettings().setLoadWithOverviewMode(true);
            webView.getSettings().setUseWideViewPort(true);
            webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            webView.getSettings().setAllowFileAccess(true);
            webView.setLayerType(2, null);
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public static void m100839e(ZAudioControl zAudioControl) {
        if (zAudioControl != null) {
            try {
                zAudioControl.m18440n();
                zAudioControl.removeAllViews();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: f */
    public static void m100840f(ZVideoControl zVideoControl) {
        if (zVideoControl != null) {
            try {
                zVideoControl.m18517x();
                zVideoControl.removeAllViews();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: g */
    private static int m100841g() {
        AtomicInteger atomicInteger;
        int i11;
        int i12;
        do {
            atomicInteger = f95663a;
            i11 = atomicInteger.get();
            i12 = i11 + 1;
            if (i12 > 16777215) {
                i12 = 1;
            }
        } while (!atomicInteger.compareAndSet(i11, i12));
        return i11;
    }
}
