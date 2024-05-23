package com.zing.zalo.register;

import am.AbstractC0924m0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.zviews.WebBaseView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.register.H5EkycView;
import com.zing.zalo.webview.LoginInterface;
import com.zing.zalo.webview.ZWebView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.C17487o0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import org.json.JSONObject;
import pm0.C24848g0;

/* loaded from: classes4.dex */
public final class H5EkycView extends WebBaseView {
    public static final C9296a Companion = new C9296a(null);

    /* renamed from: S1 */
    private JSONObject f49296S1;

    /* renamed from: T1 */
    private String f49297T1 = "";

    /* renamed from: U1 */
    private String f49298U1 = "";

    /* renamed from: V1 */
    private String f49299V1 = "";

    /* renamed from: W1 */
    private String f49300W1 = "";

    /* renamed from: X1 */
    private boolean f49301X1 = true;

    /* renamed from: Y1 */
    private int f49302Y1;

    /* renamed from: com.zing.zalo.register.H5EkycView$a */
    /* loaded from: classes4.dex */
    public static final class C9296a {
        private C9296a() {
        }

        public /* synthetic */ C9296a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.register.H5EkycView$b */
    /* loaded from: classes4.dex */
    public static final class C9297b extends ZdsActionBar.AbstractC16987c {
        C9297b() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            if (H5EkycView.this.canGoBack()) {
                H5EkycView.this.m86811wP();
            } else {
                H5EkycView.this.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jR */
    public static final void m49855jR(final H5EkycView h5EkycView, final String str) {
        AbstractC19074t.m100208f(h5EkycView, "this$0");
        h5EkycView.mo70710wy(new Runnable() { // from class: cz.t0
            @Override // java.lang.Runnable
            public final void run() {
                H5EkycView.m49856kR(str, h5EkycView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kR */
    public static final void m49856kR(String str, H5EkycView h5EkycView) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        AbstractC19074t.m100208f(h5EkycView, "this$0");
        if (str != null) {
            try {
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (str.length() != 0) {
                JSONObject jSONObject3 = new JSONObject(str).getJSONObject("data");
                int m3331P4 = AbstractC0924m0.m3331P4();
                if (m3331P4 != 1 && m3331P4 != 2) {
                    if (m3331P4 == 4 || m3331P4 == 5) {
                        String string = jSONObject3.getString("submit_guardian_token");
                        AbstractC19074t.m100207e(string, "getString(...)");
                        h5EkycView.f49298U1 = string;
                        try {
                            jSONObject2 = new JSONObject(AbstractC0924m0.m4066o0());
                        } catch (Exception unused) {
                            jSONObject2 = new JSONObject();
                        }
                        jSONObject2.put("guardian_token", h5EkycView.f49298U1);
                        AbstractC0924m0.m3691bf(jSONObject2.toString());
                        Intent intent = new Intent();
                        intent.putExtra("EXTRA_GUARDIAN_TOKEN", h5EkycView.f49298U1);
                        C24848g0 c24848g0 = C24848g0.f119245a;
                        h5EkycView.mo50035CK(-1, intent);
                        h5EkycView.finish();
                        return;
                    }
                    return;
                }
                String string2 = jSONObject3.getString("ekyc_token");
                AbstractC19074t.m100207e(string2, "getString(...)");
                h5EkycView.f49297T1 = string2;
                h5EkycView.f49296S1 = jSONObject3.getJSONObject("ekyc_info");
                try {
                    jSONObject = new JSONObject(AbstractC0924m0.m4066o0());
                } catch (Exception unused2) {
                    jSONObject = new JSONObject();
                }
                jSONObject.put("ekyc_token", h5EkycView.f49297T1);
                jSONObject.put("ekyc_info", String.valueOf(h5EkycView.f49296S1));
                AbstractC0924m0.m3691bf(jSONObject.toString());
                h5EkycView.m49857lR();
                return;
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: lR */
    private final void m49857lR() {
        AbstractC0924m0.m2972Cm(3);
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_PHONE_NUMBER", this.f49299V1);
        bundle.putString("EXTRA_SESSION_TOKEN", this.f49300W1);
        bundle.putInt("EXTRA_RENEW_ACCOUNT", this.f49302Y1);
        if (this.f49297T1.length() > 0) {
            bundle.putString("EXTRA_E_KYC_TOKEN", this.f49297T1);
        }
        JSONObject jSONObject = this.f49296S1;
        if (jSONObject != null) {
            bundle.putString("EXTRA_E_KYC_INFO", jSONObject.toString());
        }
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(UserNamingView.class, bundle, 1, true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView, com.zing.zalo.p077ui.zviews.RotatableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            String string = m92642L3.getString("EXTRA_PHONE_NUMBER", "");
            AbstractC19074t.m100207e(string, "getString(...)");
            this.f49299V1 = string;
            this.f49302Y1 = m92642L3.getInt("EXTRA_RENEW_ACCOUNT");
            String string2 = m92642L3.getString("EXTRA_SESSION_TOKEN", "");
            AbstractC19074t.m100207e(string2, "getString(...)");
            this.f49300W1 = string2;
            this.f49301X1 = m92642L3.getBoolean("EXTRA_ALLOW_BACK", true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        View mo37483GJ = super.mo37483GJ(layoutInflater, viewGroup, bundle);
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        ZdsActionBar zdsActionBar = new ZdsActionBar(m92689tK);
        Context context = zdsActionBar.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        zdsActionBar.m91006f(context, AbstractC2814h.BlueZdsActionBar_AppType_Default);
        zdsActionBar.setId(AbstractC6918a0.zds_action_bar);
        if (this.f49301X1) {
            zdsActionBar.setLeadingType(ZdsActionBar.EnumC16988d.BACK.m91015c());
        }
        zdsActionBar.setMiddleType(ZdsActionBar.EnumC16989e.TITLE.m91017c());
        MultiStateView m86781lO = m86781lO();
        if (m86781lO != null) {
            m86781lO.setVisibility(8);
        }
        m78946bM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_in_progress), Boolean.FALSE);
        m86772gO().addView(zdsActionBar, new ViewGroup.LayoutParams(-1, -2));
        return mo37483GJ;
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: LP */
    public void mo49858LP(String str) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        super.mo49858LP(str);
        MultiStateView m86781lO = m86781lO();
        if (m86781lO != null) {
            m86781lO.setVisibility(0);
        }
        m78954jL();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setMiddleTitle(m86810wO());
            m87077NK.setMiddleSubtitle("");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.security_question_activity_title);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            m87077NK.setMiddleTitle(m118743r0);
            m87077NK.setMiddleSubtitle("");
            m87077NK.setLeadingFunctionCallback(new C9297b());
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView, com.zing.zalo.p077ui.zviews.RotatableZaloView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        ZWebView m86724FO = m86724FO();
        if (m86724FO != null) {
            m86724FO.addJavascriptInterface(new LoginInterface(new LoginInterface.InterfaceC16782a() { // from class: cz.s0
                @Override // com.zing.zalo.webview.LoginInterface.InterfaceC16782a
                /* renamed from: a */
                public final void mo87302a(String str) {
                    H5EkycView.m49855jR(H5EkycView.this, str);
                }
            }), "ZaloJavaScriptInterface");
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.WebBaseView, com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4 && !this.f49301X1) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }
}
