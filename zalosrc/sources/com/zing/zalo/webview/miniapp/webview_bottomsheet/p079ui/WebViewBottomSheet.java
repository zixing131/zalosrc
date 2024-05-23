package com.zing.zalo.webview.miniapp.webview_bottomsheet.p079ui;

import android.os.Bundle;
import com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet;
import com.zing.zalo.webview.miniapp.webview_bottomsheet.p079ui.WebViewBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.C17487o0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import org.json.JSONObject;
import p454qn.AbstractC25384a;
import p483rh.InterfaceC25792a;
import vg.AbstractC28207v1;

/* loaded from: classes5.dex */
public final class WebViewBottomSheet extends ZdsModalBottomSheet {
    public static final C16797a Companion = new C16797a(null);

    /* renamed from: com.zing.zalo.webview.miniapp.webview_bottomsheet.ui.WebViewBottomSheet$a */
    /* loaded from: classes5.dex */
    public static final class C16797a {
        private C16797a() {
        }

        public /* synthetic */ C16797a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m89724c(C17487o0 c17487o0, Bundle bundle) {
            AbstractC19074t.m100208f(c17487o0, "$zaloViewManager");
            AbstractC19074t.m100208f(bundle, "$bundle");
            c17487o0.mo89694j2(WebViewBottomSheet.class, bundle, 0, "WebViewBottomSheet", 2, true);
        }

        /* renamed from: b */
        public final void m89725b(final C17487o0 c17487o0, final Bundle bundle) {
            AbstractC19074t.m100208f(c17487o0, "zaloViewManager");
            AbstractC19074t.m100208f(bundle, "bundle");
            AbstractC19444a.m101697e(new Runnable() { // from class: tf0.b
                @Override // java.lang.Runnable
                public final void run() {
                    WebViewBottomSheet.C16797a.m89724c(C17487o0.this, bundle);
                }
            });
        }

        /* renamed from: d */
        public final Bundle m89726d(String str, Bundle bundle, InterfaceC25792a.c cVar) {
            String str2;
            JSONObject jSONObject;
            String str3;
            if (str == null) {
                return null;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            JSONObject m131571b = AbstractC25384a.m131571b(str);
            if (m131571b != null) {
                str2 = m131571b.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            } else {
                str2 = null;
            }
            if (str2 != null && str2.length() != 0) {
                bundle.putString("EXTRA_WEB_URL", str2);
            } else if (cVar != null) {
                cVar.mo39930a(AbstractC28207v1.m141899N0(-1, "The url is null or empty", "action.open.inapp"), "");
            }
            if (m131571b != null) {
                jSONObject = m131571b.optJSONObject("style");
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                str3 = jSONObject.optString("modal_style");
            } else {
                str3 = null;
            }
            if (AbstractC19074t.m100204b(str3, "normal")) {
                return null;
            }
            if (jSONObject != null) {
                bundle.putString("BUNDLE_EXTRA_CONFIG", jSONObject.toString());
            }
            return bundle;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: nM */
    protected BottomSheet mo45673nM() {
        WebViewBS webViewBS = new WebViewBS();
        webViewBS.mo60305zK(m92642L3());
        return webViewBS;
    }
}
