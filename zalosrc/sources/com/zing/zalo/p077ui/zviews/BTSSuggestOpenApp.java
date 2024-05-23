package com.zing.zalo.p077ui.zviews;

import am.AbstractC0924m0;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.zing.zalo.p077ui.zviews.BTSSuggestOpenApp;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import me0.AbstractC23152n3;
import me0.AbstractC23171p0;
import org.json.JSONObject;
import p173fz.C19172a;
import p454qn.AbstractC25384a;
import p542ub.InterfaceC27218a;

/* loaded from: classes6.dex */
public final class BTSSuggestOpenApp extends ZdsModalBottomSheet {
    public static final C14083a Companion = new C14083a(null);

    /* renamed from: com.zing.zalo.ui.zviews.BTSSuggestOpenApp$a */
    /* loaded from: classes6.dex */
    public static final class C14083a {
        private C14083a() {
        }

        public /* synthetic */ C14083a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: b */
        private final boolean m78268b(JSONObject jSONObject, JSONObject jSONObject2) {
            long j11;
            int i11;
            if (AbstractC23171p0.m119370b()) {
                return false;
            }
            if (jSONObject != null) {
                j11 = jSONObject.optLong("showedTime");
            } else {
                j11 = 0;
            }
            if (jSONObject != null) {
                i11 = jSONObject.optInt("showedCount");
            } else {
                i11 = 0;
            }
            long j12 = 604800000;
            if (jSONObject2 != null) {
                j12 = jSONObject2.optLong("distanceShowDialog", 604800000L);
            }
            int i12 = 3;
            if (jSONObject2 != null) {
                i12 = jSONObject2.optInt("maxShowDialog", 3);
            }
            if ((i11 >= i12 && i12 != -1) || System.currentTimeMillis() - j11 <= j12) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        private final void m78269e(InterfaceC27218a interfaceC27218a, String str, String str2, String str3, int i11) {
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_ZINSTANT_API_INFO", str);
            bundle.putString("EXTRA_KEY_APP_ID", str2);
            bundle.putString("EXTRA_KEY_URL", str3);
            bundle.putInt("EXTRA_KEY_SOURCE", i11);
            AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.zviews.k1

                /* renamed from: q */
                public final /* synthetic */ Bundle f80839q;

                public /* synthetic */ RunnableC15793k1(Bundle bundle2) {
                    r2 = bundle2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BTSSuggestOpenApp.C14083a.m78270f(InterfaceC27218a.this, r2);
                }
            });
        }

        /* renamed from: f */
        public static final void m78270f(InterfaceC27218a interfaceC27218a, Bundle bundle) {
            AbstractC19074t.m100208f(interfaceC27218a, "$act");
            AbstractC19074t.m100208f(bundle, "$data");
            interfaceC27218a.mo35581q(BTSSuggestOpenApp.class, bundle, -1, 1, true);
        }

        /* renamed from: c */
        public final JSONObject m78271c(String str) {
            AbstractC19074t.m100208f(str, "appId");
            JSONObject m131571b = AbstractC25384a.m131571b(AbstractC0924m0.m3862h6());
            if (m131571b != null) {
                return m131571b.optJSONObject(str);
            }
            return null;
        }

        /* renamed from: d */
        public final void m78272d(InterfaceC27218a interfaceC27218a, Bundle bundle, JSONObject jSONObject, String str, int i11) {
            String str2;
            JSONObject jSONObject2;
            JSONObject jSONObject3;
            String str3;
            String str4;
            String str5;
            AbstractC19074t.m100208f(interfaceC27218a, "act");
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            boolean z11 = false;
            if (C19172a.m100600k("open_app_suggest_dialog@enable", 0) != 1) {
                ZaloWebView.C15403a.m87157l(ZaloWebView.Companion, interfaceC27218a, bundle, null, 4, null);
                return;
            }
            if (jSONObject != null && jSONObject.optInt("forceOpenApp") == 1) {
                z11 = true;
            }
            JSONObject jSONObject4 = null;
            if (jSONObject != null) {
                str2 = jSONObject.optString("id");
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "0";
            }
            if (jSONObject != null) {
                jSONObject2 = jSONObject.optJSONObject("appInfo");
            } else {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                jSONObject3 = jSONObject2.optJSONObject("android");
            } else {
                jSONObject3 = null;
            }
            if (jSONObject3 != null) {
                str3 = jSONObject3.optString("package");
            } else {
                str3 = null;
            }
            if (jSONObject3 != null) {
                str4 = jSONObject3.optString("scheme");
            } else {
                str4 = null;
            }
            JSONObject m78271c = m78271c(str2);
            if (m78271c != null) {
                str5 = m78271c.optString("action");
            } else {
                str5 = null;
            }
            if ((z11 || AbstractC19074t.m100204b(str5, "open_app")) && AbstractC23152n3.m119071u(interfaceC27218a.getContext(), str3)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str4));
                interfaceC27218a.startActivity(intent);
            } else {
                if (m78268b(m78271c, jSONObject)) {
                    if (jSONObject != null) {
                        jSONObject4 = jSONObject.optJSONObject("ZInstantAPIInfo");
                    }
                    m78269e(interfaceC27218a, String.valueOf(jSONObject4), str2, str, i11);
                    return;
                }
                ZaloWebView.C15403a.m87157l(ZaloWebView.Companion, interfaceC27218a, bundle, null, 4, null);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: nM */
    protected BottomSheet mo45673nM() {
        SuggestOpenAppBottomSheet suggestOpenAppBottomSheet = new SuggestOpenAppBottomSheet();
        suggestOpenAppBottomSheet.mo60305zK(m92642L3());
        return suggestOpenAppBottomSheet;
    }
}
